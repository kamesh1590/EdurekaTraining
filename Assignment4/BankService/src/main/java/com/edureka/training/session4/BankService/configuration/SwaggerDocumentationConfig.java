package com.edureka.training.session4.BankService.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerDocumentationConfig {
    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Hotel Service")
                .description("This API is used to retrieve or add a hotel to the database")
                .version("1.0.0")
                .build();
    }

    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.edureka.training.session4.BankService.api"))
                .build()
                .apiInfo(apiInfo());
    }
}
