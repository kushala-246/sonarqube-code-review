package com.ibm;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class SonarQubeCodeTest {

    @Test
    void shouldReturnMessage() {
        Logger mockLogger = mock(Logger.class);
        SonarQubeCode code = new SonarQubeCode(mockLogger);

        assertEquals("SonarCloud Java test", code.getMessage());
    }

    @Test
    void shouldLogMessage() {
        Logger mockLogger = mock(Logger.class);
        SonarQubeCode code = new SonarQubeCode(mockLogger);

        code.logMessage();

        verify(mockLogger).info("SonarCloud Java test");
    }

    @Test
    void mainShouldRunWithoutError() {
        // optional: replace global logger with mock if you want
        SonarQubeCode.main(new String[]{});
    }

}
