import java.io.PrintStream;
import java.util.Scanner;

class Calcu {
	public static void main(String[] args) {
		PrintStream ps = new PrintStream(System.out);
		Scanner sc = new Scanner(System.in);
		int a,b,opt;
		ps.println(" 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Remainder");
		ps.println("Enter Option [1-5]");
		opt=sc.nextInt();
		ps.println("Enter Two numbers ");
		a=sc.nextInt();
		b=sc.nextInt();
		if (opt==1) {
			ps.println("Addition : "+(a+b));
		}
		else if (opt==2) {
			ps.println("Subtraction : "+(a-b));
		}
		else if (opt==3) {
			ps.println("Multiplication : "+(a*b));
		}
		else if (opt==4) {
			ps.println("Division : "+(a/b));
		}
		else if (opt==5) {
			ps.println("Remainder : "+(a%b));
		}
		else {
			ps.println("check your option ");
		}
	}
}