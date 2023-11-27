package com.example;

import com.example.package3.Class3;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 *
 */
public class App
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        try {
            Class3 class3 = new Class3();

            class3.testMultiplicacao();

            logger.info("Main success");
        }catch (Exception e) {
            logger.error("Main error", e);
        }
    }
}
