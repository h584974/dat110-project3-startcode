package no.hvl.dat110.util;

/**
 * project 3
 * @author tdoy
 *
 */

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash { 
	
	private static BigInteger hashint; 
	
	public static BigInteger hashOf(String entity) {		
		
		// Task: Hash a given string using MD5 and return the result as a BigInteger.
		
		// we use MD5 with 128 bits digest
		
		// compute the hash of the input 'entity'
		
		// convert the hash into hex format
		
		// convert the hex into BigInteger
		
		// return the BigInteger
		
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(entity.getBytes());
			byte[] digest = md.digest();
			String hex = toHex(digest);
			BigInteger bi = new BigInteger(hex, 16);
			
			hashint = bi;
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return hashint;
	}
	
	public static BigInteger addressSize() {
		
		// Task: compute the address size of MD5
		
		// get the digest length
		
		// compute the number of bits = digest length * 8
		
		// compute the address size = 2 ^ number of bits
		
		// return the address size
		
		BigInteger addressSize = null;
		
		try {
			int length = MessageDigest.getInstance("MD5").getDigestLength();
			int numberOfBits = length * 8;
			BigInteger two = new BigInteger("2");
			addressSize = two.pow(numberOfBits);
			
		
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return addressSize;
	}
	
	public static int bitSize() {
		
		// find the digest length
		
		int digestlen = 0;
		
		try {
			digestlen = MessageDigest.getInstance("MD5").getDigestLength();
		} catch (NoSuchAlgorithmException e) {
			
			e.printStackTrace();
		}
		return digestlen*8;
	}
	
	public static String toHex(byte[] digest) {
		StringBuilder strbuilder = new StringBuilder();
		for(byte b : digest) {
			strbuilder.append(String.format("%02x", b&0xff));
		}
		return strbuilder.toString();
	}

}
