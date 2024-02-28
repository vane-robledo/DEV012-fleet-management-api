package com.fleetmanagment.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TrajectoriesTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private TrajectoriesRepository trajectoriesRepository;

    @Test
    @DisplayName("Testing endpoint trayectorias")
    void trajectoriesTest() throws Exception {
        mockMvc.perform(get("/api/trajectories")
                        .param("page", "1")
                        .param("size", "10")
                        .param("date", "2008-02-02")
                        .param("taxiId", "6418"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content").isArray());
    }

}
