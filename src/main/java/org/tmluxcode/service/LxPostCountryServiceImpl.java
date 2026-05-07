package org.tmluxcode.service;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import org.tmluxcode.entity.LxPostCountry;
import org.tmluxcode.repository.LxPostCountryRepository;
import org.tmluxcode.response.LxPostCountryResponse;

@Service
@RequiredArgsConstructor
public class LxPostCountryServiceImpl implements LxPostCountryService {

    private final LxPostCountryRepository lxPostCountryRepository;

    @Override
    public List<LxPostCountryResponse> getAllCountries() {
        return lxPostCountryRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    private LxPostCountryResponse mapToResponse(LxPostCountry country) {
        return LxPostCountryResponse.builder()
                .id(country.getId())
                .name(country.getName())
                .build();
    }
}
