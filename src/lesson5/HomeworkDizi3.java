package lesson5;

public class HomeworkDizi3 {

	public static void main(String[] args) {
		//bir dizide  eğer 13 var ise hem 13 ü hemde bir sonraki indexitoplama işlemine almayacak
		//dizideki elemanların toplamı
		//1 + 5 + 7 output
		
		int nums[] = {1,13,5,13,13,13,2,5,7,1,13};
		int toplam=0;
		for (int i=0 ; i<nums.length; i++) { 
			
			if(i==nums.length-1 && nums[i]==13)
				break;
		
			{
		
			if(nums[i]==13) {
				if (nums[i+1] !=13) {
					i++;
				}
				
				else if (nums[i+1] ==13) {
					i=i+2;
				}
			}
			
			else {
				toplam = toplam + nums[i];
			}
		}
		}
		System.out.println("toplam: " + toplam);
		

	}
}
