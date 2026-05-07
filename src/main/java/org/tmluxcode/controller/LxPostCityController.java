package org.tmluxcode.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import org.tmluxcode.request.LxPostCityAddRequest;
import org.tmluxcode.response.LxPostCityResponse;
import org.tmluxcode.service.LxPostCityService;

@RestController
@RequestMapping("lxPost/api")
@RequiredArgsConstructor
public class LxPostCityController {

    private final LxPostCityService lxPostCityService;

    @PostMapping("/addCities")
    public LxPostCityResponse createCity(
            @RequestBody @Valid LxPostCityAddRequest request) {
        return lxPostCityService.createCity(request);
    }

    @GetMapping("/getCitiesById/{cityId}")
    public LxPostCityResponse getCityById(@PathVariable Long cityId) {
        return lxPostCityService.getCityByCityId(cityId);
    }

    @GetMapping("/getCitiesByCountryId/{countryId}")
    public Page<LxPostCityResponse> getCitiesByCountry(
            @PathVariable Long countryId,
            @PageableDefault(sort = "id") Pageable pageable) {
        return lxPostCityService.getCitiesByCountry(countryId, pageable);
    }
}
