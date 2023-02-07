package lesson006;

public class Question45 {

	public static void main(String[] args) {
		String[][] matris1 = { { "Bilge", "Advanced" }, { "Postgre", "Data" } }; 
		String[][] matris2 = { { "Adam", "Java" }, { "SQL", "Base" } };
		
		//BilgeAdam
		//AdvancedJava
		System.out.print(matris1[0][0]);
		System.out.println(matris2[0][0]);
		System.out.print(matris1[0][1]);
		System.out.print(matris2[0][1]);
		
		System.out.println("\n\n************\n\n");
		
		//for döngüsü
		
		for (int i=0; i<matris1.length; i++ ) {
			for(int j=0; j<matris1[i].length; j++) { //matris 2 length de olur burada
				System.out.print(matris1[i][j] + matris2[i][j]);
				System.out.println();
			}
		}

	}

}
