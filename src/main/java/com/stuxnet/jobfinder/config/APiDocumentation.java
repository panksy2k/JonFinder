package com.stuxnet.jobfinder.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

public class APiDocumentation {

    @Bean
    public Docket apiDocumentation() {
        return
                new Docket(DocumentationType.SWAGGER_2)
                        .select()
                        .apis(RequestHandlerSelectors.basePackage("com.stuxnet.jobfinder"))
                        .paths(PathSelectors.any())
                        .build()
                        .globalResponseMessage(RequestMethod.GET, Collections.emptyList())
                        .apiInfo(
                                new ApiInfoBuilder()
                                        .contact(new Contact("Pankaj Pardasani", "www.pankajpardasani.co.uk", "pankaj.d.p@gmail.com"))
                                        .description("Job Search Web Application")
                                        .build());

    }
}
