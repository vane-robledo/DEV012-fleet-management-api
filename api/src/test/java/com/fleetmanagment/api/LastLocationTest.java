package com.fleetmanagment.api;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class LastLocationTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private LastLocationRepository lastLocationRepository;

    @Test
    @DisplayName("Testing last location endpoint")
    void LastLocation() throws Exception {
        mockMvc.perform(get("/api/lastLocation")
                .param("page","1")
                .param("size","10"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray());
    }

}
