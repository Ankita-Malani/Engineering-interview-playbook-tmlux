package org.tmluxcode.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import org.tmluxcode.response.LxPostCountryResponse;
import org.tmluxcode.service.LxPostCountryService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lxPost/api/country")
public class LxPostCountryController {

    private final LxPostCountryService lxPostCountryService;

    @GetMapping
    public List<LxPostCountryResponse> getCountries() {
        return lxPostCountryService.getAllCountries();
    }
}
