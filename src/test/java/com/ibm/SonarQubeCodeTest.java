package com.ibm;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SonarQubeCodeTest {

    @Test
    void shouldReturnExpectedMessage() {
        // Explicitly executes executable code
        assertEquals("SonarCloud Java test", SonarQubeCode.getMessage());
    }

    @Test
    void mainShouldRunWithoutException() {
        // Covers main method
        assertDoesNotThrow(() -> SonarQubeCode.main(new String[]{}));
    }
}
