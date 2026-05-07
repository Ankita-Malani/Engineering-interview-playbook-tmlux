package org.tmluxcode.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.tmluxcode.entity.LxPostCity;
import org.tmluxcode.entity.LxPostCountry;
import org.tmluxcode.exception.ResourceNotFoundException;
import org.tmluxcode.repository.LxPostCityRepository;
import org.tmluxcode.repository.LxPostCountryRepository;
import org.tmluxcode.request.LxPostCityAddRequest;
import org.tmluxcode.response.LxPostCityResponse;

@Service
@Slf4j
@RequiredArgsConstructor
public class LxPostCityServiceImpl implements LxPostCityService {

    private final LxPostCityRepository lxPostCityRepository;
    private final LxPostCountryRepository lxPostCountryRepository;

    @Override
    public LxPostCityResponse createCity(LxPostCityAddRequest request) {

        LxPostCountry country = lxPostCountryRepository.findById(request.getCountryId())
                .orElseThrow(() ->
                        new ResourceNotFoundException("Country not found with id: " + request.getCountryId())
                );

        LxPostCity lxPostCity = LxPostCity.builder()
                .name(request.getName())
                .population(request.getPopulation())
                .zipCode(request.getZipCode())
                .description(request.getDescription())
                .country(country)
                .build();

        LxPostCity saved = lxPostCityRepository.save(lxPostCity);
        return mapToResponse(saved);
    }

    @Override
    public LxPostCityResponse getCityByCityId(Long cityId) {
        LxPostCity city = lxPostCityRepository.findById(cityId)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "CityId not found :: cityId :: " + cityId
                        )
                );
        return mapToResponse(city);
    }

    @Override
    public Page<LxPostCityResponse> getCitiesByCountry(Long countryId, Pageable pageable) {
        validateCountry(countryId);
        return lxPostCityRepository.findByCountry_Id(countryId, pageable)
                .map(this::mapToResponse);
    }

    private void validateCountry(Long countryId) {
        if (!lxPostCountryRepository.existsById(countryId)) {
            throw new ResourceNotFoundException("CountryId not found : " + countryId);
        }
    }

    private LxPostCityResponse mapToResponse(LxPostCity city) {
        return LxPostCityResponse.builder()
                .id(city.getId())
                .name(city.getName())
                .countryId(city.getCountry().getId())
                .countryName(city.getCountry().getName())
                .population(city.getPopulation())
                .zipCode(city.getZipCode())
                .description(city.getDescription())
                .build();
    }
}
