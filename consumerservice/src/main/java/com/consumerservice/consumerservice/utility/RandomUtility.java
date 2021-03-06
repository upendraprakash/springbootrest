package com.consumerservice.consumerservice.utility;

import java.util.Random;

public class RandomUtility {
	private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";

	public static String generateString(int length) {
	    Random random = new Random();
	    StringBuilder builder = new StringBuilder(length);

	    for (int i = 0; i < length; i++) {
	        builder.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
	    }

	    return builder.toString();
	}
}
