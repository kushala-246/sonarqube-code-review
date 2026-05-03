package com.ibm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SonarQubeCode {

    static final String MESSAGE = "SonarCloud Java test";

    private final Logger logger;

    public SonarQubeCode(Logger logger) {
        this.logger = logger;
    }

    public String getMessage() {
        return MESSAGE;

    }

    public void logMessage() {
        logger.info(getMessage());
    }

    public static void main(String[] args) {
        new SonarQubeCode(LoggerFactory.getLogger(SonarQubeCode.class))
                .logMessage();
    }
}
