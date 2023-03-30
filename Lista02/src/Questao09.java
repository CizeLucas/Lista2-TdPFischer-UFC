import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite quantas letras voce quer inserir: ");
		int numChars = Integer.parseInt(scan.nextLine());
		
		char inputChar[] = new char[numChars];
		
		for(int i=0; i<numChars; i++) {
			inputChar[i] = scan.nextLine().toUpperCase().charAt(0);
		}
		int numCharsFact = numChars;
		
		for(int i=numChars; i>1; i--) {
			numCharsFact = numCharsFact * (i-1);
		}
		System.out.println(numCharsFact);

		
//PERMUTACAO:  0 1 2	0 2 1	1 0 2	1 2 0	2 0 1	2 1 0		
		
	}
}	
