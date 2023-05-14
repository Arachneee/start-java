public class VarEx1 {

	public static void main(String[] args) {
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
		

	}

}
