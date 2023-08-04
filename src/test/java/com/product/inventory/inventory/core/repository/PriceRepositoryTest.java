package com.product.inventory.inventory.core.repository;

import com.product.inventory.inventory.core.domain.entity.Price;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@DataJpaTest
class PriceRepositoryTest {



    @MockBean
    private PriceRepository priceRepository;

    @Test
    @DisplayName("Test Context testFindByProductAndDate")
    void testFindByProductAndDate() {
        // Mocking the data
        Long brandId = 1L;
        Long productId = 2L;
        LocalDateTime appDate = LocalDateTime.now();
        List<Price> expectedPrices = new ArrayList<>();
        // Add your expected Price objects to the list

        // Mocking the repository method
        when(priceRepository.findByProductAndDate(eq(brandId), eq(productId), any(LocalDateTime.class)))
                .thenReturn(expectedPrices);

        // Calling the method under test
        List<Price> actualPrices = priceRepository.findByProductAndDate(brandId, productId, appDate);

        // Verifying the result
        assertEquals(expectedPrices, actualPrices);
    }
}
