package org.tmluxcode.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.tmluxcode.request.LxPostCityAddRequest;
import org.tmluxcode.request.LxPostCountryAddRequest;
import org.tmluxcode.response.LxPostCityResponse;
import org.tmluxcode.response.LxPostCountryResponse;


public interface LxPostCityService {

    LxPostCityResponse createCity(LxPostCityAddRequest request);

    LxPostCityResponse getCityByCityId(Long cityId);

    Page<LxPostCityResponse> getCitiesByCountry(Long countryId, Pageable pageable);
}
