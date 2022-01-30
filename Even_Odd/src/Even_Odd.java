//5. Write a java program to check whether a given number is even or odd?
import java.util.*;
public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("enter no");
		int a = scan.nextInt();
		if(a % 2 == 0)
			System.out.println("no is even");
		else
			System.out.println("no is odd");

	}

}
