package first_Project;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String arg[]) {
		int sum=0;
		//		int i,num;
//		Scanner ao=new Scanner(System.in);
//		System.out.println("Enter The Number:- ");
//		num=ao.nextInt();
//		boolean isprime=true;
//		if(num<=1) {
//			isprime=false;
//		}
//		else {
//			for(i=2;i<=num/2;i++) {
//				if(num%i==0) {
//					isprime=false;
//					break;
//				}
//			}
//		}
//		if(isprime) {
//			System.out.println("Number Is Prime Number"+num);
//		}
//		else {
//			System.out.println("Number Is Not Prime Number"+num);
//		}
		for(int i=2;i<=50;i++) {
			boolean isprime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isprime=false;
					break;
				}
			}
			if(isprime) {
				System.out.println(i);
//				sum=sum+i;
			}
			}
//		System.out.println(sum);
	}
}
