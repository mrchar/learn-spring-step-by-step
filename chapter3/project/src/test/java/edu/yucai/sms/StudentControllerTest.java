package edu.yucai.sms;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(OrderAnnotation.class)
class StudentControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    @Order(1)
    void getStudents() throws Exception {
        mockMvc.perform(get("/students"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$").isEmpty());
    }

    @Test
    @Order(2)
    void getStudent() throws Exception {
        mockMvc.perform(get("/students/0"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").isMap())
                .andExpect(jsonPath("$.name").isString())
                .andExpect(jsonPath("$.gender").isString())
                .andExpect(jsonPath("$.age").isNumber());
    }

    @Test
    @Order(2)
    void addStudent() throws Exception {
        mockMvc.perform(post("/students")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                                {"name": "王刚", "gender": "男", "age": 12}
                                """))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isMap())
                .andExpect(jsonPath("$.name").value("王刚"))
                .andExpect(jsonPath("$.gender").value("男"))
                .andExpect(jsonPath("$.age").value(12));
    }

    @Test
    @Order(4)
    void updateStudent() throws Exception {
        mockMvc.perform(put("/students/0")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("""
                                {"name": "李华", "gender": "男", "age": 12}
                                """))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isMap())
                .andExpect(jsonPath("$.name").value("李华"))
                .andExpect(jsonPath("$.gender").value("男"))
                .andExpect(jsonPath("$.age").value(12));
    }

    @Test
    @Order(5)
    void deleteStudent() throws Exception {
        mockMvc.perform(delete("/students/0"))
                .andExpect(status().isOk());
    }
}