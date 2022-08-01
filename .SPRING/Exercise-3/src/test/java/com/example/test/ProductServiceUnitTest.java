package com.example.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.model.Product;
import com.example.repo.ProductRepo;
import com.example.service.ProductService;

@SpringBootTest
public class ProductServiceUnitTest
{
	@Autowired
	private ProductService service;
	
	@MockBean
	private ProductRepo repo;
	
	@Test
	void testCreate()
	{
		//GIVEN -- testing data - final local variables
		final Product TEST_PRODUCT = new Product(null, "TV", "LG");
		final Product TEST_SAVED_PRODUCT = new Product(1L, "TV", "LG");
		//WHEN
		Mockito.when(this.repo.save(TEST_PRODUCT)).thenReturn(TEST_SAVED_PRODUCT);
		//THEN
		Assertions.assertThat(this.service.addProd(TEST_PRODUCT)).isEqualTo(TEST_SAVED_PRODUCT);
	}
}
