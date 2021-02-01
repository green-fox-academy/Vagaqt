package com.example.demo.controller;

import com.example.demo.model.ErrorMessage;
import com.example.demo.service.GuardianService;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ErrorMessage mockErrorMessage = new ErrorMessage("I am Groot!");
    private ErrorMessage mockErrorMessageYondu = new ErrorMessage("Please provide values");

    @MockBean
    private GuardianService guardianService;

    @Test
    public void statusCodeIsOk() throws Exception{
        mockMvc.perform(get("/groot").param("message","somemessage"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("translated",is("I am Groot!")))
                .andDo(print());
    }

    @Test
    public void messageIsNull() throws Exception{
        when(guardianService.error("I am Groot!")).thenReturn(mockErrorMessage);
        mockMvc.perform(get("/groot"))
                .andExpect(jsonPath("error", is("I am Groot!")))
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    public void yondusArrowIsOk() throws Exception{
        mockMvc.perform(get("/yondu")
                .param("distance", String.valueOf(100.0))
                .param("time", String.valueOf(10.0)))
                .andExpect(jsonPath("speed",is(10.0)))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void yondusValuesAreMissing() throws Exception{
        when(guardianService.error("Please provide values")).thenReturn(mockErrorMessageYondu);
        mockMvc.perform(get("/yondu"))
                .andExpect(jsonPath("error", is("Please provide values")))
                .andExpect(status().isBadRequest())
                .andDo(print());
    }
}
