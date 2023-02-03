package lesson5;

public class HomeworkDizi2 {

	public static void main(String[] args) {
		
		//İkinci en buyuk sayıyı dısarı cıkart
		int nums[] = {1,13,13,13,2,5,13,1};
		int enBuyuk=0;
		int ikinciBuyuk = 0;
		for (int i=0;i<nums.length ;i++) {
			if (nums[i] >enBuyuk) {
				ikinciBuyuk=enBuyuk;
				enBuyuk=nums[i];
			}else if (nums[i]<enBuyuk) {
				if (nums[i]>ikinciBuyuk) {
				ikinciBuyuk = nums[i];
				
					
				
			}
			
		}
		
		
		
		

	}
		System.out.println(ikinciBuyuk + " ikinci büyük sayıdır.");
	

}
	}
