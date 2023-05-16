public class chapter2 {

	public static void main(String[] args) {
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		float fMax = (float) (3.4*Math.pow(10,38)-1);
		
		System.out.println("sMin = " + sMin);
		
		sMin -= 1; 
		
		System.out.println("sMin-1 = " + sMin);
		
		System.out.println(fMax);
		
		fMax += 1;
		
		System.out.println(fMax);
		System.out.println(Card.width);
	}
}
