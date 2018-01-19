package com.samples;

import java.util.*;

public class RandomDice {

	public static void main(String[] arguments) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int value = generator.nextInt();
		System.out.println("The random number is "
		+ value);
	}

}
