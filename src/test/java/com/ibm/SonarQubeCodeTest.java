package com.ibm;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class SonarQubeCodeTest {

    @Test
    void shouldLogMessage() {
        Logger logger = mock(Logger.class);
        SonarQubeCode code = new SonarQubeCode(logger);

        code.logMessage();

        verify(logger).info("SonarCloud Java test");
    }
}
