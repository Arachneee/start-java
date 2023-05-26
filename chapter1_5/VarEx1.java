package chapter1_5;

import java.util.*;

public class VarEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int BIRTDAY = 19970227;
		
		int year = 0;
		int age = 14;
		int temp = 0;
		
		System.out.println("year = " + year);
		System.out.println("age = " + age);
		
		year = age + 2000;
		age = age + 1;
		
		System.out.println("year = " + year);
		System.out.println("age = " + age);
		
		temp = year;
		year = age;
		age = temp;
		System.out.println("year = " + year);
		System.out.println("age = " + age);

		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;
		
		System.out.println(octNum + "\n" + hexNum+ "\n" + binNum);
		System.out.println(octNum + hexNum);
		
		long longNum = 100000000000L;
		float pi = 3.141592f;
		
		String makestr = age + "";
		
		String name = "Ja";
		char na = 'A';
		System.out.println(longNum);
		
		System.out.printf("%.2s%n", makestr);
		
		
		System.out.println(name + "va" + "8.0");
		System.out.println("nana");
		System.out.printf("%.2e%n",pi);
		System.out.printf("%d%n", (int)na);
		System.out.printf("%-6.4s%n", makestr);
		
		System.out.print("숫자를 입력해라 : ");
		
		String input = scanner.nextLine();
		
		int number = Integer.parseInt(input);
		System.out.println("number : " + (number+1));
		System.out.println("input : " + (input+1));
	}

}
