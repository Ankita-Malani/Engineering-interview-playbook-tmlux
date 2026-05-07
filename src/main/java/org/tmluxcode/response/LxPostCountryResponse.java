package org.tmluxcode.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Schema(description = "Country response")
public class LxPostCountryResponse {

    private Long id;
    private String name;
}
