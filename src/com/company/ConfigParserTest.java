package com.company;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;


class ConfigParserTest {

    /**
     * This test for prodcution Environment
     * @throws FileNotFoundException this test for prodcution
     */
    @Test
    void getTestProduction() throws FileNotFoundException {
        ConfigParser config = new ConfigParser();                               // prodcution
        assertEquals("production", config.get("mode"));
    }

    /**
     * Test staging Environment
     * @throws FileNotFoundException
     */
    @Test
    void getTestStaging() throws FileNotFoundException {
        ConfigParser config = new ConfigParser("staging");
        assertEquals("127.0.0.1", config.get("host"));
    }

    /**
     * This test for development environment.
     * @throws FileNotFoundException
     */
    @Test
    void getTestDevelopment() throws FileNotFoundException {
        ConfigParser config = new ConfigParser("development");
        assertEquals("fast-development", config.get("pipeline"));
    }
}