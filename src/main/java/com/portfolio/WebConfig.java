/**
 * La clase WebConfig implementa la interfaz WebMvcConfigurer y anotada con @Configuration. 
 * Esta clase contiene el método addCorsMappings que se utiliza para agregar configuraciones de CORS 
 * (Cross-Origin Resource Sharing) al registro de CORS. En este caso, la configuración registry.addMapping("/**") 
 * permite el acceso CORS a cualquier URL.
 **/
package com.portfolio;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer{
     @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**");
    }
}
