package com.randhir.practice;

public class IsPerfectNumber {
	
	public boolean isPerfectNumber(int number) {
		int temp=0;
		for (int i = 1; i<=number/2; i++) {
			if(number % i== 0) {
				System.out.println("i-----"+i);
				temp=temp+i;
				System.out.println(temp);
				
			}				
		}
		if(number==temp) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsPerfectNumber i=new IsPerfectNumber();
		boolean b=i.isPerfectNumber(27);
		System.out.println(b);
		

	}

}
