package util;

import java.util.Random;

public class Dice {

	private static Random rand = new Random();
	
	public static int d4() {
		return dN(4);
	}
	
	public static int d4(int n) {
		return dN(4,n);
	}
	
	public static int d6() {
		return dN(6);
	}
	
	public static int d6(int n) {
		return dN(6,n);
	}
	
	public static int d8() {
		return dN(8);
	}
	
	public static int d8(int n) {
		return dN(8,n);
	}
	
	public static int d10() {
		return dN(10);
	}
	
	public static int d10(int n) {
		return dN(10,n);
	}
	
	public static int d12() {
		return dN(12);
	}
	
	public static int d12(int n) {
		return dN(12,n);
	}
	
	public static int d20() {
		return dN(20);
	}
	
	public static int d20(int n) {
		return dN(20,n);
	}
	
	
	public static int dN(int N) {
		return rand.nextInt(N)+1;
	}
	
	public static int dN(int N,int n) {
		int sum=0;
		for (int i = 0; i < n; i++) {
			sum+=dN(N);
		}
		return sum;
	}
	
}
