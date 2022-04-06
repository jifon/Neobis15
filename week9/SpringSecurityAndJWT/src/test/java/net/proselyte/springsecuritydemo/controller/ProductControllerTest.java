package net.proselyte.springsecuritydemo.controller;

import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import net.proselyte.springsecuritydemo.entity.Category;
import net.proselyte.springsecuritydemo.entity.Order;
import net.proselyte.springsecuritydemo.entity.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;;



@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class ProductControllerTest {


    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper;

    public ProductControllerTest(){
        mapper = new ObjectMapper();
    }


    @Test
    void listAllProductsTest() throws Exception{
        mockMvc.perform( get("/api/product/all"))
                .andDo(print())
                .andExpect(status().isOk());
    }


    @Test
    void createProductTest() throws Exception{

        Product product = new Product();
        product.setId(3L);
        product.setName("new");
        product.setPrice(123.43);
        product.setExpiryDate(new Date(2022,04,04));
        product.setExpiryDate(new Date(2022,07,03));
        product.setCategory(new Category(3,"newCategiruName"));


        String jsonRequest = mapper.writeValueAsString(product);//преобразует параметр body в JSON с помощью Jackson ObjectMapper

        mockMvc.perform( post("/api/product")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonRequest))
                .andDo(print())
                .andExpect(status().isOk());
    }




    @Test
    void getProductByIdTest() throws  Exception{
        this.mockMvc.perform(get("/api/product/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }




    @Test
    void updateProductTest()  throws Exception{

        Product product = new Product();
        product.setId(1l);
        product.setName("update");
        product.setPrice(123.43);
        product.setExpiryDate(new Date(2022,04,04));
        product.setExpiryDate(new Date(2022,07,03));
        product.setCategory(new Category(2,"Construction material"));
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
        String requestJson=ow.writeValueAsString(product);
        mockMvc.perform(put("/api/product/1").contentType(APPLICATION_JSON_UTF8)
                        .content(requestJson))
                .andExpect(status().isOk());
    }

    @Test
    void deleteProductTest() throws  Exception{

        this.mockMvc.perform(delete("/api/product/1"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}