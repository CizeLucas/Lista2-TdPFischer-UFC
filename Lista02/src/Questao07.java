import java.util.Scanner;
import java.lang.Math;
public class Questao07 {

	public static void main(String[] args) {
	
		//   1   2   3   4   5   6   7
		
		int numPrimo=2;		int i; 
		
		for(numPrimo=2; numPrimo<=1000 ;numPrimo++) {
			
			if(numPrimo%2!=0 || numPrimo==2)
				if(numPrimo%3!=0 || numPrimo==3)
					if(numPrimo%5!=0 || numPrimo==5)
						if(numPrimo%7!=0 || numPrimo==7)
							if(numPrimo%11!=0 || numPrimo==11)
								System.out.print(numPrimo + "  ");
			
		
			
		}
	}

}
