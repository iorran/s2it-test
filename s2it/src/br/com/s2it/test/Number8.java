package br.com.s2it.test;

import java.lang.Math;

import javax.swing.JOptionPane;

class Number8 {
	public static void main(String[] args) {
		final String numberA = readNumber(" Digite o numero A: ");
		final String numberB = readNumber(" Digite o numero B: ");

		if (validateNumbers(numberA, numberB)) { 
			System.out.println("Generated C: " + createC(numberA, numberB));
		}
	}

	private static String readNumber(String message) {
		return JOptionPane.showInputDialog(message);
	}

	public static int createC(String a, String b) {
		StringBuilder c = new StringBuilder();
		int maxSize = Math.max(a.length(), b.length());
		for (int i = 0; i <= maxSize; i++) {
			if (i < a.length()) {
				c.append(a.charAt(i));
			}
			if (i < b.length()) {
				c.append(b.charAt(i));
			}
		}
		return c.length() > 6 ? -1 : Integer.valueOf(c.toString());
	}

	private static boolean validateNumbers(String numberA, String numberB) {
		return !isNull(numberA, numberB) && isInteger(numberA, numberB);
	}

	private static boolean isInteger(String numberA, String numberB) {
		try {
			Integer.parseInt(numberA);  
			Integer.parseInt(numberB);   
			return true;
		} catch (NumberFormatException nfe) {
			System.out.println("Numbers should be integers");
			return false;
		} 
	}

	private static boolean isNull(String numberA, String numberB) {
		if (numberA == null || numberB == null) {
			System.out.println("Numbers shouldn't be null");
			return true;
		}
		return false;
	}
}