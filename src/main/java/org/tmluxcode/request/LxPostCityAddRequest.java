package org.tmluxcode.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LxPostCityAddRequest {

    @NotBlank(message = "City name is required")
    private String name;

    @NotNull
    private Long population;

    private String zipCode;

    private String description;

    @NotNull
    private Long countryId;
}
