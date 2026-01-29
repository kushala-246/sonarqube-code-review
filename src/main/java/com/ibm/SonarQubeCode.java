package com.ibm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SonarQubeCode {
    private static final Logger logger = LoggerFactory.getLogger(SonarQubeCode.class);
    public static final String MESSAGE = "SonarCloud Java test";


    public static String getMessage() {
        return MESSAGE;
    }

    public static void main(String[] args) {
        logger.info(getMessage());
    }
}
