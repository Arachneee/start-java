import java.util.Arrays;

public class chapter5 {

	public static void main(String[] args) {
		int[] score = new int[5];
		for (int i = 0; i<5;i++) {
			score[i] = i*i;
		}
		
		System.out.println(Arrays.toString(score));
		
		int[] score2 = {1,2,3,4,5};
		for (int j = 0; j < score2.length;j++) {
			System.out.print(score2[j] + ",");
		}
		
		System.out.println();
		System.arraycopy(score, 0, score2, 0, score.length);
		System.out.println(Arrays.toString(score2));
		System.out.println(Arrays.toString(score));
		score[0] = 100;
		System.out.println(Arrays.toString(score2));
		System.out.println(Arrays.toString(score));
		score2 = score;
		System.out.println(Arrays.toString(score2));
		System.out.println(Arrays.toString(score));
		
		score[0] = 101;
		System.out.println(Arrays.toString(score2));
		System.out.println(Arrays.toString(score));
		
		for (int k = 0; k<10;k++) {
			System.out.println((int)(Math.random()*-10));
		}
		
		String[] name = new String [5];
		name[0] = new String ("KIM");
		System.out.println(name[0]);
		
		char[] abc = {'a', 'b', 'c'};
		System.out.println("char" + abc);
		System.out.println("new String : " + new String(abc));
		
		char[] fullName = "HogeonJeon".toCharArray();
		
		for (int o=0; o < fullName.length;o++) {
			System.out.println(fullName[o]);
		}
		
		
		
		
	}

}
