package bablu;

import java.util.Scanner;

public class pytha {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the value of hypotenus a : =");
		a= sc.nextInt();
		System.out.println("Enetr the value of perpendicular b : = ");
		b= sc.nextInt();
		System.out.println("Enter the value of base c : = ");
		c = sc.nextInt();
	if(a*a + b*b ==c*c || a*a + c*c == b*b || b*b + c*c == a*a)
	{
		System.out.println("Given numbers are pythagoreaus");
	}
	else
	{
		System.out.println("default");
	}

	}

}
