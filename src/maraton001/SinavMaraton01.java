package maraton001;

public class SinavMaraton01 {

	public static void main(String[] args) {
	SinavMaraton01.yildizPiramit();

	}
	
	public static void yildizPiramit() {
		String s = "*";
		for (int i=0; i<10 ; i++) {
			if (i<6) {
			System.out.println(s);
			s = s + " *";
			}else {
			System.out.println(s);	
			}
		}
	}

}
