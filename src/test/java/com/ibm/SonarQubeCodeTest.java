package com.ibm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SonarQubeCodeTest {

    @Test
    void testGetMessage() {
        String result = SonarQubeCode.getMessage();
        assertEquals("SonarCloud Java test", result);
    }
}