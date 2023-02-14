package lesson007;

public class Question55 {

	public static void main(String[] args) {
		// Verilen en büyük ve en küçük değerleri bulan program
		String[] array = { "5", "2", "3", "4", "99", "85" };
		int max =Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			if(Integer.parseInt(array[i])<min) {
				min=Integer.parseInt(array[i]);
			}
			if(Integer.parseInt(array[i]) > max) {
				max=Integer.parseInt(array[i]);
			}
			
		}
		System.out.println(min + " " + max);

	}

}
