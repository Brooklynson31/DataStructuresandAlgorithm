
public class Recursive1 {
	public static int myRecursiveMethod(int aVariable) {
		System.out.println(aVariable);
		aVariable--;
		if (aVariable == 0)
		return 0;
		return myRecursiveMethod(aVariable);
		}
	
	public static int FibonacciSequence(int num1, int num2){
		int c;
		c = num1 + num2;
		num1 = num2;
		num2 = c;
		System.out.println(c);
		if (c>100){
			System.out.println("Done");
			return c;}
		return FibonacciSequence(num1, num2);
	}
		


 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSequence(0,1);
		
	}

}
