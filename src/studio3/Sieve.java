package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Pick a whole number (n): ");
		int n = in.nextInt(); 
		
		if (n < 2) {
			System.out.println("No primes available");
			
		}
		
		boolean[] Prime = new boolean[n+1];
		
		for (int i = 2; i <= n; i++) {
			Prime[i] = true; 
				
	        }
		
		for (int i = 2; i * i <= n; i++) {
			if (Prime[i]) { 
				for(int j = i * i; j<=n; j += i) {
					Prime[j] = false; 
				}
			}
        }
		for (int i = 2; i<= n; i++) {
			if (Prime[i] == true) {
				System.out.print(i + ", ");
			}
			
		}	
		
		           
	}
	}

