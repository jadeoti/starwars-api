package io.github.jadeoti.starwars.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author adedeji.adeoti on 8/31/2019
 * @project starwars-api
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Value("${star-wars-api.app-version:1.0}")
    public String apiVersion;

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("star-wars-api")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("io.github.jadeoti.starwars"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Star Wars API")
                .description("Documentation for Star Wars API")
                .termsOfServiceUrl("")
                .contact(new Contact("Developer Relations", "","adedejiadeoti@gmail.com"))
                .license("")
                .licenseUrl("")
                .version(apiVersion)
                .build();
    }

}