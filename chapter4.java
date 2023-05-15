public class chapter4 {

	public static void main(String[] args) {
		for(int i = 0;i<=10;i++) {
			if (i %2 == 0) {
				System.out.println(i);
			} else {
				System.out.println("Not odd");
			}

		}
		
		int[] arr = {10,20,30,40};
		for (int tmp:arr) {
			System.out.printf("%d ",tmp);
		}
		
		System.out.println();
		
		String[] str_list = {"helow", "hi", "hogeon"};
		for (String str: str_list) {
			System.out.println(str);
		}
		
		char[] ch_list = {'a','b','c'};
		for (char c:ch_list) {
			System.out.println(c);
		}
		
		String chartostring = String.valueOf(ch_list);
		System.out.println(chartostring);
		
		for (char c:chartostring.toCharArray()) {
			System.out.println(c);
		}
		
		char[] arr_char = chartostring.toCharArray();
		
		for(int j = 0; j<=arr_char.length;j++) {
			System.out.println(arr_char[j]);
		}
		System.out.println("---------------------");
		
		Loop1 : for (int k=2;k<=9;k++) {
			for(int h=1;h<=9;h++) {
				if(h==5) {
					break Loop1;
					break;
					continue Loop1;
					continue;
					
				}
			}
				
					
		}
	}

}
