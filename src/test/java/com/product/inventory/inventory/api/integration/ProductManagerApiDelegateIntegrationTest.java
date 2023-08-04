package com.product.inventory.inventory.api.integration;



import com.product.inventory.inventory.api.config.ApiLayerConfig;
import com.product.inventory.inventory.core.domain.model.ProductsPriceLast;
import com.product.inventory.inventory.core.domain.model.ProductsPriceLastResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.Objects;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Integration test class for ProductManagerApiDelegate. These tests make HTTP requests
 * to the API endpoints and verify the responses.
 *
 * The tests are run with a random server port and use TestRestTemplate to make the requests.
 * This class tests various scenarios for getting the last price of a product.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductManagerApiDelegateIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    /**
     * Test 1: Makes a request for the last price of product 35455 for brand 1 (ZARA)
     * at 10:00 on day 14 and verifies the response.
     */
    @Test
    @DisplayName("Test 1: request at 10:00 on day 14 of product 35455 for brand 1 (ZARA)")
    void testGetPriceLastOK() {
        ProductsPriceLast productsPriceLast = new ProductsPriceLast();
        productsPriceLast.setProductId(35455L);
        productsPriceLast.setBrandId(1L);
        productsPriceLast.setAppDate(LocalDateTime.parse("2020-06-14T10:00:00"));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<ProductsPriceLast> requestEntity = new HttpEntity<>(productsPriceLast, headers);


        ResponseEntity<ProductsPriceLastResponse> responseEntity = restTemplate.exchange(
                ApiLayerConfig.BASE_PATH + ApiLayerConfig.POST,
                HttpMethod.POST,
                requestEntity,
                ProductsPriceLastResponse.class);


        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        ProductsPriceLastResponse response = responseEntity.getBody();
        assertNotNull(Objects.requireNonNull(response));
    }


    @Test
    @DisplayName("Test 2: request at 4:00 p.m. on day 14 of product 35455 for brand 1 (ZARA)")
    void testGetPriceLastTest2() {
        ProductsPriceLast productsPriceLast = new ProductsPriceLast();
        productsPriceLast.setProductId(35455L);
        productsPriceLast.setBrandId(1L);
        productsPriceLast.setAppDate(LocalDateTime.parse("2020-06-14T04:00:00"));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<ProductsPriceLast> requestEntity = new HttpEntity<>(productsPriceLast, headers);


        ResponseEntity<ProductsPriceLastResponse> responseEntity = restTemplate.exchange(
                ApiLayerConfig.BASE_PATH + ApiLayerConfig.POST,
                HttpMethod.POST,
                requestEntity,
                ProductsPriceLastResponse.class);


        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        ProductsPriceLastResponse response = responseEntity.getBody();
        assertNotNull(Objects.requireNonNull(response));
    }

    @Test
    @DisplayName("Test 3: request at 9:00 p.m. on day 14 of product 35455 for brand 1 (ZARA)")
    void testGetPriceLastTest3() {
        ProductsPriceLast productsPriceLast = new ProductsPriceLast();
        productsPriceLast.setProductId(35455L);
        productsPriceLast.setBrandId(1L);
        productsPriceLast.setAppDate(LocalDateTime.parse("2020-06-14T09:00:00"));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<ProductsPriceLast> requestEntity = new HttpEntity<>(productsPriceLast, headers);


        ResponseEntity<ProductsPriceLastResponse> responseEntity = restTemplate.exchange(
                ApiLayerConfig.BASE_PATH + ApiLayerConfig.POST,
                HttpMethod.POST,
                requestEntity,
                ProductsPriceLastResponse.class);


        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        ProductsPriceLastResponse response = responseEntity.getBody();
        assertNotNull(Objects.requireNonNull(response));
    }

    @Test
    @DisplayName("Test 4: request at 10:00 on day 15 of product 35455 for brand 1 (ZARA)")
    void testGetPriceLastTest4() {
        ProductsPriceLast productsPriceLast = new ProductsPriceLast();
        productsPriceLast.setProductId(35455L);
        productsPriceLast.setBrandId(1L);
        productsPriceLast.setAppDate(LocalDateTime.parse("2020-06-15T10:00:00"));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<ProductsPriceLast> requestEntity = new HttpEntity<>(productsPriceLast, headers);


        ResponseEntity<ProductsPriceLastResponse> responseEntity = restTemplate.exchange(
                ApiLayerConfig.BASE_PATH + ApiLayerConfig.POST,
                HttpMethod.POST,
                requestEntity,
                ProductsPriceLastResponse.class);


        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        ProductsPriceLastResponse response = responseEntity.getBody();
        assertNotNull(Objects.requireNonNull(response));
    }

    @Test
    @DisplayName("Test 5: request at 9:00 p.m. on day 16 of product 35455 for brand 1 (ZARA)")
    void testGetPriceLastTest5() {
        ProductsPriceLast productsPriceLast = new ProductsPriceLast();
        productsPriceLast.setProductId(35455L);
        productsPriceLast.setBrandId(1L);
        productsPriceLast.setAppDate(LocalDateTime.parse("2020-06-16T09:00:00"));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<ProductsPriceLast> requestEntity = new HttpEntity<>(productsPriceLast, headers);


        ResponseEntity<ProductsPriceLastResponse> responseEntity = restTemplate.exchange(
                ApiLayerConfig.BASE_PATH + ApiLayerConfig.POST,
                HttpMethod.POST,
                requestEntity,
                ProductsPriceLastResponse.class);


        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        ProductsPriceLastResponse response = responseEntity.getBody();
        assertNotNull(Objects.requireNonNull(response));
    }
}
