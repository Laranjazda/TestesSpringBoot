package com.HSOB.TestesSpringBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.swing.text.Document;
import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket HSOBApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.HSOB.TestesSpringBoot"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());

    }

    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "H.S.O.B API Rest",
                "Projeto de estudos API Rest com SpringBoot.",
                "1.0",
                "Terms of Service",
                new Contact("Laranjazda", "https://hsob.com", "laranja@zda.com.br"),
                "Fulano Beliscão",
                "https://hsob.com",
                new ArrayList<>()
        );
        return apiInfo;
    }
}
