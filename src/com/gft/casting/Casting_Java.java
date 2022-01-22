package com.gft.casting;

public class Casting_Java {

	public static void main(String[] args) {
		
		//Downcast
		byte b1;
		short sh1 = 1000;
		b1 = (byte) sh1;
		System.out.println(b1);
		
		//Upcast
		long lg1;
		int i1 = 10;
		lg1 = i1;
		System.out.println(lg1);
		
	}

}
