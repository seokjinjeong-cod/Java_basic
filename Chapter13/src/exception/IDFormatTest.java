package exception;

public class IDFormatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		
		if(userID == null) {
			throw new IDFormatException("���̵�� null �ϼ� �����ϴ�.");
		} 
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("���̵�� 8�ڸ� �̻� 20�ڸ� ���Ϸ� �Է��ϼ���.");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		
		String myId = null;
		try {
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		myId = "532234";
		try {
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
	}

}
