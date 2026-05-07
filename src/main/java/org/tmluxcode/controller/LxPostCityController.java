package org.tmluxcode.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tmluxcode.response.LxPostCityResponse;
import org.tmluxcode.service.LxPostCityService;

@RestController
@RequestMapping("luxPost/api/city")
@RequiredArgsConstructor
public class LxPostCityController {

    private final LxPostCityService lxPostCityService;

    @GetMapping("/cities/{cityId}")
    public LxPostCityResponse getCityById(@PathVariable Long cityId) {
        return lxPostCityService.getCityByCityId(cityId);
    }
}
