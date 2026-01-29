package com.ibm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SonarQubeCodeTest {
    private static final Logger logger = LoggerFactory.getLogger(SonarQubeCodeTest.class);


    @Test
    void testMessageConstant() {
        // Check the constant value
        assertEquals("SonarCloud Java test", SonarQubeCode.MESSAGE);
        logger.info("testMessageConstant passed: MESSAGE = {}", SonarQubeCode.MESSAGE);
    }

    @Test
    void testMainDoesNotThrow() {
        // Ensure main method runs without exception
        assertDoesNotThrow(() -> SonarQubeCode.main(new String[]{}));
        logger.info("testMainDoesNotThrow passed: main() executed successfully");
    }
}
