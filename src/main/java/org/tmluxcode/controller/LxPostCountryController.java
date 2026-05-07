package org.tmluxcode.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import org.tmluxcode.request.LxPostCountryAddRequest;
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

    @PostMapping
    @Operation(summary = "Create a new country")
    public LxPostCountryResponse createCountry(@RequestBody @Valid LxPostCountryAddRequest request) {
        return lxPostCountryService.createCountry(request);
    }
}
