package com.product.inventory.inventory.api.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * La clase ApiLayerConfig define la configuración para las rutas de la API.
 * Utiliza la anotación @Configuration de Spring para indicar que esta clase proporciona
 * la configuración de bean definida por el programador.
 * <p>
 * La anotación @ConfigurationProperties permite que esta clase se vincule y sea validada por
 * las propiedades de configuración en application.yml o application.properties.
 * <p>
 * La anotación @Slf4j proporciona un logger para esta clase.
 */
@Slf4j
@Configuration(proxyBeanMethods = false)
@ConfigurationProperties(prefix = "app.custom.properties")
public class ApiLayerConfig {

    /**
     * BASE_PATH es la ruta base para todas las APIs de los productos.
     */
    public static final String BASE_PATH = "/products/v1";

    /**
     * POST es la ruta específica para obtener el último precio de un producto.
     */
    public static final String POST = "/priceLast";

    /**
     * El constructor de ApiLayerConfig. Imprime un mensaje de depuración
     * cuando la configuración de la API se carga.
     */
    public ApiLayerConfig() {
        log.debug("ApiLayerConfig loaded");
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Test and exercise for Akkodis")
                        .version("0.1")
                        .description("In the company's e-commerce database we have the PRICES table that reflects the final price (pvp) and the rate that applies to a product in a chain between certain dates")
                        .termsOfService("http://swagger.io/terms/")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}

