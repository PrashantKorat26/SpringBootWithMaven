package org.edu.controller;

import org.edu.controller.Information;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InformationTest {

    @Test
    void welcome() {

        Information info = new Information();
        String result = info.getInfo();

        assertEquals("Hi! I am Prashant and this is my first Project", result);

    }

}