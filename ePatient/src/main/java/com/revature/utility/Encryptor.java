package com.revature.utility;

public class Encryptor {

	/*
	 * rot-13 encryption, code taken from https://introcs.cs.princeton.edu/java/31datatype/Rot13.java.html
	 * encryption algorithm could be anything, this is just more of a proof of concept
	 */
	public static String encrypt(String s) {
		String newString = "";
		for(int i=0; i < s.length(); i++) {
			char c = s.charAt(i);
			if       (c >= 'a' && c <= 'm') c += 13;
            else if  (c >= 'A' && c <= 'M') c += 13;
            else if  (c >= 'n' && c <= 'z') c -= 13;
            else if  (c >= 'N' && c <= 'Z') c -= 13;
			newString+=c;
		}
		return newString;
	}
	
}
