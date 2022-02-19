package com.daolycodebuffer.Springboot.tutorial;

import com.daolycodebuffer.Springboot.tutorial.model.Product;
import com.daolycodebuffer.Springboot.tutorial.model.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.annotation.Before;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.runner.WebApplicationContextRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class SpringBootTutorialApplicationTests {                  //тестовый пример для доступа к контроллеру

//	@Test
//	void contextLoads() {
//	}

	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext context;

	ObjectMapper om = new ObjectMapper();

	@Before("")
	private void setUp(){
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void addProductTest() throws Exception {
		Product product = new Product();
		product.setCost(23.545);
		product.setDateOfManifacture("2022-11-22");
		product.setExpiryDate("2022-11-23");
		String jsonRequest = om.writeValueAsString(product);
		MvcResult result = mockMvc.perform(post("api/products").content(jsonRequest).content(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk()).andReturn();
		String resultContent = result.getResponse().getContentAsString();
		com.daolycodebuffer.Springboot.tutorial.model.Response response = om.readValue(resultContent, com.daolycodebuffer.Springboot.tutorial.model.Response.class);
		org.junit.Assert.assertTrue(response.isStatus() == Boolean.TRUE);

	}

	@Test
	public void getProductsTest() throws Exception {
		MvcResult result = mockMvc
				.perform(get("/api/products").content(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk()).andReturn();
		String resultContent = result.getResponse().getContentAsString();
		com.daolycodebuffer.Springboot.tutorial.model.Response response = om.readValue(resultContent, Response.class);
		org.junit.Assert.assertTrue(response.isStatus() == Boolean.TRUE);

	}

}
