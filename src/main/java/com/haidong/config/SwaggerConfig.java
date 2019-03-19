package com.haidong.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() { 
    	//添加head参数start
//    	ParameterBuilder tokenPar = new ParameterBuilder();
//    	List<Parameter> pars = new ArrayList<Parameter>();
//    	tokenPar.name("locale").description("令牌").modelRef(new ModelRef("string")).parameterType("header").required(false).build();
//    	pars.add(tokenPar.build());
    	//添加head参数end

        return new Docket(DocumentationType.SWAGGER_2) 
          .apiInfo(apiInfo())
          .select()                                  
          .apis(RequestHandlerSelectors.any())
          .paths(PathSelectors.any())
          .build();
    }

    @Bean
    public SecurityConfiguration security() {
        return new SecurityConfiguration(
                null,
                null,
                null, // realm Needed for authenticate button to work
                null, // appName Needed for authenticate button to work
                "",// apiKeyValue
                ApiKeyVehicle.HEADER,
                "access_token", //apiKeyName
                null);
    }
    
	  //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
	    private ApiInfo apiInfo() {
	        return new ApiInfoBuilder()
	                //页面标题
	                .title("mvc RESTful API")
	                //创建人
	                .contact(new Contact("don", "http://www.baidu.com", ""))
	                //版本号
	                .version("1.0")
	                //描述
	                .description("springmvc demo")
	                .build();
	    }

}
