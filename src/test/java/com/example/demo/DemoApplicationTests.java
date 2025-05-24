package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        assertTrue(true, "Le contexte Spring Boot se charge correctement");
    }

    @Test
    void simpleTest() {
        int result = 2 + 2;
        assertTrue(result == 4, "2 + 2 devrait être égal à 4");
    }
} 