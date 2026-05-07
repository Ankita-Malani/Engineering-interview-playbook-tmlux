package org.tmluxcode.service;

import org.springframework.stereotype.Service;
import org.tmluxcode.request.LxPostCountryAddRequest;
import org.tmluxcode.response.LxPostCountryResponse;

import java.util.List;

public interface LxPostCountryService {
    LxPostCountryResponse createCountry(LxPostCountryAddRequest request);

    List<LxPostCountryResponse> getAllCountries();
}
