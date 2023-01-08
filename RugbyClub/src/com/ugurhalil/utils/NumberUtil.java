package com.ugurhalil.utils;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author halilugur
 */
public class NumberUtil {

    private static final AtomicInteger AI = new AtomicInteger(1);
    private static final Random RANDOM = new Random();

    /**
     * get an Id and Increment it automatic
     * 
     * @return Incremented id
     */
    public static Integer id() {
        return AI.getAndIncrement();
    }

    /**
     * get random uuid by library of UUID library
     * 
     * @return string id
     */
    public static String stringId() {
        return UUID.randomUUID()
                .toString()
                .replace("-", "")
                .toUpperCase();
    }

    /**
     * Created random integer by min and max values.
     * 
     * @param min minimum of range
     * @param max maximum of range
     * @return random a number
     */
    public static Integer random(int min, int max) {
        return RANDOM.nextInt(max - min) + min;
    }
}
