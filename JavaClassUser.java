package Review;

public class JavaClassUser {

	//User��Ĺ��췽��---�в����Ĺ��췽��
	//�û�ID  �û�����  �ɽ�����  �ڽ�����
	public JavaClassUser(String userID,	String userName,int totalBorrowNumber,int nowBorrowNumber) {
		// TODO Auto-generated constructor stub
		this.userID=userID;
		this.userName=userName;
		this.totalBorrowNumber=totalBorrowNumber;
		this.nowBorrowNumber=nowBorrowNumber;
	}
	
	//User��Ĺ��췽��---�޲����Ĺ��췽��
	//�û�ID  �û�����  �ɽ�����  �ڽ�����
	public JavaClassUser() {
			// TODO Auto-generated constructor stub
		this.userID="0000000000000";
		this.userName="XXX";
		this.totalBorrowNumber=10;
		this.nowBorrowNumber=0;
		
		
		
	}
	
	//get����
	public String getUserID()
	{
		return userID;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public int getTotalBorrowNumber()
	{
		return totalBorrowNumber;
	}
	
	public int getNowBorrowNumber()
	{
		return nowBorrowNumber;
	}
	
	
	//set����
	public void setUserID(String userID)
	{
		this.userID=userID;
	}
	
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	
	public void setTotalBorrowNumber(int totalBorrowNumber)
	{
		this.totalBorrowNumber=totalBorrowNumber;
	}
	
	public void setNowBorrowNumber(int nowBorrowNumber)
	{
		this.nowBorrowNumber=nowBorrowNumber;
	}
	
	
	private String userID;
	private String userName;
	private int totalBorrowNumber;
	private int nowBorrowNumber;

}
