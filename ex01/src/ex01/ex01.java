package ex01;
import java.util.*;

class ex01 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n1   = 0;
		int n2   = 0;
		int soma = 0;
		
		System.out.print("n1: ");
		n1 = sc.nextInt();
		System.out.print("n2: ");
		n2 = sc.nextInt();
		soma = n1 + n2;
		
		System.out.println("Soma: "+ soma);		
	}
}