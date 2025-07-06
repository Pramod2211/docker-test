package com.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private static final Logger logger = LoggerFactory.getLogger(CalculatorService.class);

    public int add(int a, int b) {
        logger.trace("Entering add() method with parameters: a={}, b={}", a, b);
        int result = a + b;
        logger.trace("Exiting add() method with result: {}", result);
        return result;
    }
}
