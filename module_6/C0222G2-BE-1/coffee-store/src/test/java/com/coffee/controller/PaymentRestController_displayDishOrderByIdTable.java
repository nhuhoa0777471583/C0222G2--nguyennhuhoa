package com.coffee.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PaymentRestController_displayDishOrderByIdTable {
    @Autowired
    private MockMvc mockMvc;

    /**
     * Create HoaNN
     * test check order list is null
     * @throws Exception
     */
    @Test
    public void displayDishOrderByIdTable_id_7() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/payment/list/null").header("authorization",
                "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtYW5hZ2VyIiwiZXhwIjoxNjYxMzE2MTE1LCJpYXQiOjE2NjExMzYxMTV9.F1Vp9fGsVsitdbGum_PiZzh9a7tyjKwrmG5gr9dr32KvAOI7Vh54C6b1mCg3LxywlBivrFUfFj3rnjYoU5i_dg"))
                .andDo(print()).andExpect(status().is4xxClientError());
    }
    /**
     * Create HoaNN
     * check order list is empty ,
     * @throws Exception
     */
    @Test
    public void displayDishOrderByIdTable_id_8() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/payment/list/' '").header("authorization",
                "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtYW5hZ2VyIiwiZXhwIjoxNjYxMzE2MTE1LCJpYXQiOjE2NjExMzYxMTV9.F1Vp9fGsVsitdbGum_PiZzh9a7tyjKwrmG5gr9dr32KvAOI7Vh54C6b1mCg3LxywlBivrFUfFj3rnjYoU5i_dg"))
                .andDo(print()).andExpect(status().is4xxClientError());
    }
    /**
     * Create HoaNN

     * dcheck order list is in the list

     * @throws Exception
     */
    @Test
    public void displayDishOrderByIdTable_id_9() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/payment/list/100").header("authorization",
                "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtYW5hZ2VyIiwiZXhwIjoxNjYxMzE2MTE1LCJpYXQiOjE2NjExMzYxMTV9.F1Vp9fGsVsitdbGum_PiZzh9a7tyjKwrmG5gr9dr32KvAOI7Vh54C6b1mCg3LxywlBivrFUfFj3rnjYoU5i_dg"))
                .andDo(print()).andExpect(status().is4xxClientError());
    }
    /**
     * Create HoaNN
     * id does not exist in database
     * @throws Exception
     */
    @Test
    public void displayDishOrderByIdTable_id_10() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/payment/list").header("authorization",
                "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtYW5hZ2VyIiwiZXhwIjoxNjYxMzE2MTE1LCJpYXQiOjE2NjExMzYxMTV9.F1Vp9fGsVsitdbGum_PiZzh9a7tyjKwrmG5gr9dr32KvAOI7Vh54C6b1mCg3LxywlBivrFUfFj3rnjYoU5i_dg"))
                .andDo(print()).andExpect(status().is4xxClientError());
    }

    /**
     * Create HoaNN
     * id have in list
     * @throws Exception
     */
    @Test
    public void displayDishOrderByIdTable_id_11() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/payment/list/1").header("authorization",
                "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtYW5hZ2VyIiwiZXhwIjoxNjYxMzE2MTE1LCJpYXQiOjE2NjExMzYxMTV9.F1Vp9fGsVsitdbGum_PiZzh9a7tyjKwrmG5gr9dr32KvAOI7Vh54C6b1mCg3LxywlBivrFUfFj3rnjYoU5i_dg"))
                .andDo(print()).andExpect(status().is2xxSuccessful());
    }

    /**
     * Create HoaNN
     * id have in list
     * @throws Exception
     */
    @Test
    public void displayDishOrderByIdTable_id_11_1() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/payment/list/1").header("authorization",
                "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtYW5hZ2VyIiwiZXhwIjoxNjYxMzE2MTE1LCJpYXQiOjE2NjExMzYxMTV9.F1Vp9fGsVsitdbGum_PiZzh9a7tyjKwrmG5gr9dr32KvAOI7Vh54C6b1mCg3LxywlBivrFUfFj3rnjYoU5i_dg"))
                .andDo(print()).andExpect(status().is2xxSuccessful())
                .andExpect(jsonPath("content[0].code").value("table1"))
                .andExpect(jsonPath("content[0].name").value("Trà sữa"))
                .andExpect(jsonPath("content[0].price").value(15000))
                .andExpect(jsonPath("content[0].quantity").value(1));
    }
}
