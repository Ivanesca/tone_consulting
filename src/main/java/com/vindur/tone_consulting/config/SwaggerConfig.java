package com.vindur.tone_consulting.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "T-1 Consulting Test Task API",
                version = "V1"
        )
)
public class SwaggerConfig {
}
