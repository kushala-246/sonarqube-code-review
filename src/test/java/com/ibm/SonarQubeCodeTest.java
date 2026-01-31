package com.ibm;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SonarQubeCodeTest {

    @Test
    void testGetMessage() {
        // when
        String message = SonarQubeCode.getMessage();

        // then
        assertEquals("SonarCloud Java test", message);
    }

    @Test
    void testMainMethod() {
        // This ensures main() is covered
        SonarQubeCode.main(new String[]{});
    }
}
