package com.neoteric;

import java.util.Random;

public class Generate_UTR {

    public static String generateUTR() {

        Random random = new Random();
        return "BOB" + (100000 + random.nextInt(900000));

    }
}

