package org.tmluxcode.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.tmluxcode.response.LxPostCityResponse;


public interface LxPostCityService {

    LxPostCityResponse getCityByCityId(Long cityId);

    Page<LxPostCityResponse> getCitiesByCountry(Long countryId, Pageable pageable);
}
