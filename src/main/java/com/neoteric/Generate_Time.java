package com.neoteric;

import java.time.LocalTime;

public class Generate_Time {

    public static String generateTime() {
        return LocalTime.now().withNano(0).toString();
    }
}

