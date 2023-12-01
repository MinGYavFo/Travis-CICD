package com.example.travisci;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TravisCiApplicationTests.class)
@RunWith(SpringRunner.class)
class TravisCiApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSay() throws Exception {
        mockMvc.perform(get("/say")).andExpect(status().isOk());
    }
    @Test
    public void testSayFailure() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().isOk());
    }

}
