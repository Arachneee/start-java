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
		
		System.out.printf("%b%n", 'A' >= 'B');
		
		String str = new String("abcde");
		String str1 = "abc";
		System.out.printf("%b%n",str.substring(0,3).equals(str1));
		
		int x1 = 4, y1 = 2;
		
		System.out.printf("%s%n", toBinaryString(x1<<3+1 | y1));
		
		int result;
		System.out.println(result = (x1<y1) ? x1*10 : x1*5);
		System.out.println(result+1);
		
	}
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero+ Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}

}
