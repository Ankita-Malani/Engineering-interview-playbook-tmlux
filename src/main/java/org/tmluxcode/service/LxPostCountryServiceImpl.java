package org.tmluxcode.service;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import org.tmluxcode.repository.LxPostCountryRepository;
import org.tmluxcode.response.LxPostCountryResponse;

@Service
@RequiredArgsConstructor
public class LxPostCountryServiceImpl implements LxPostCountryService {

    private final LxPostCountryRepository lxPostCountryRepositoryitory;

    public List<LxPostCountryResponse> getAllCountries() {
        return lxPostCountryRepositoryitory.findAll()
                .stream()
                .map(country -> LxPostCountryResponse.builder()
                        .id(country.getId())
                        .name(country.getName())
                        .build())
                .toList();
    }
}
