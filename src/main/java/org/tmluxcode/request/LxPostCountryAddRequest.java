package org.tmluxcode.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LxPostCountryAddRequest {

    @NotBlank(message = "Country name is required")
    private String name;
}
