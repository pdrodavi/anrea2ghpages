package br.com.pedrodavi.anrea2ghpages;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Anrea2ghpagesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Anrea2ghpagesApplication.class, args);
	}

	@Bean
	public Docket personApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("spring-swagger-api")
				.apiInfo(apiInfo())
				.select()
				.paths(regex ("/api.*"))
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Anrea2GhPages")
				.description("Clique em anrea-controller > Método post > Clique em Try it out, cole seu conteúdo angular.json, clique em execute e no response abaixo clique em download")
				.version("1.0")
				.build();
	}

}
