public class chapter3 {

	public static void main(String[] args) {
		int i = 5;
		System.out.println(i);
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		
		int j = i++;
		System.out.println("i = "+i);
		int k = ++i;
		
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		System.out.println("k = "+k);
		boolean bo = true;
		if (bo && (i==9)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		float y = 1__0.1000_000_01F;
		System.out.println(y);
		
		double pi = 3.141592;
		double shortpi = (int)(pi * 1000 + 0.5) / 1000.0;
		System.out.println(shortpi);
		
		System.out.printf("%b%n","ABC" == "ABC");
	}

}
