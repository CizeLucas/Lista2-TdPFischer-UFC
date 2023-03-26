import java.util.ArrayList;

public class Questao08 {

	public static void main(String[] args) {
		
		boolean isPrimo = true;
		int numLimite = 1000;
		
		ArrayList<Integer> numCheck = new ArrayList<Integer>();
		ArrayList<Integer> numPrimos = new ArrayList<Integer>();
		
		for(int i = 2; i*i<=numLimite; i++) {
			numCheck.add(i);
		}
		
		//System.out.println(numCheck.toString());
		
		for(int i=0; i<numCheck.size(); i++) {
			//System.out.println(numCheck.toString());
		
			for(int j=0; j<numCheck.size(); j++) {
				if(numCheck.get(j)%numCheck.get(i)==0 && numCheck.get(j)!=numCheck.get(i)) {
					//System.out.printf("%d pct %d = %d   ", numCheck.get(j), numCheck.get(i), numCheck.get(j)%numCheck.get(i) );
					//System.out.println("Removendo: "+numCheck.get(j));
					numCheck.remove(j);
				}
			}
			
		}
		
		System.out.println(numCheck.toString());
			
		for(int i=2; i<=numLimite; i++)
			numPrimos.add(i);
		
		for(int i=0;  i<numCheck.size(); i++) {
			for(int j=0; j<numPrimos.size(); j++){
				if(numPrimos.get(j)%numCheck.get(i)==0 && numPrimos.get(j)!=numCheck.get(i)) {
					numPrimos.remove(j);
				}
			}
		}
		
		for(int i=0; i<numPrimos.size(); i++) {
			System.out.print(numPrimos.get(i)+ " ");
		}
		//System.out.println(numPrimos.size());
	}

}
