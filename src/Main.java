
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Add(2,4);
		Add(2,5,8);
		Add(3,8,4,9);
		

	}
	
	public static void Add(int num1,int num2) {
		
		System.out.println(num1+num2);
		
	}
	public static void Add(int num1, int num2, int num3) {
		System.out.println("the sum is "+ (num1+num2+num3));
	}
	public static void Add(int num1, int num2, int num3,int num4) {
		System.out.println("the sum  of four number is "+(num1+num2+num3+num4));
	}


}
