package lesson021;

public enum EErrorType {
	
	OUT_OF_BOUNDS(1001, "Sınırlarının dısında"),
	SEAT_ALREADY_OCCUPIED(1002,"seçilen yer dolu");
	
	private String message;
	private int code;
	
	
	
	
	private EErrorType() {
	}


	private EErrorType(int code ,String message) {
		this.message = message;
		this.code = code;
	}


	public String getMessage() {
		return message;
	}




	public int getCode() {
		return code;
	}


	
	
	
	

}
