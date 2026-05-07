package org.tmluxcode.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Schema(description = "City details response")
public class LxPostCityResponse {

    private Long id;
    private String name;
    private Long countryId;
    private String countryName;
    private Long population;
    private String zipCode;
    private String description;
}
