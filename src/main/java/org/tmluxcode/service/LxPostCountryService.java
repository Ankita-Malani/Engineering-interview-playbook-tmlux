package org.tmluxcode.service;

import org.springframework.stereotype.Service;
import org.tmluxcode.response.LxPostCountryResponse;

import java.util.List;

public interface LxPostCountryService {
    List<LxPostCountryResponse> getAllCountries();
}
