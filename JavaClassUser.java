package Review;

public class JavaClassUser {

	//User类的构造方法---有参数的构造方法
	//用户ID  用户名称  可借数量  在借数量
	public JavaClassUser(String userID,	String userName,int totalBorrowNumber,int nowBorrowNumber) {
		// TODO Auto-generated constructor stub
		this.userID=userID;
		this.userName=userName;
		this.totalBorrowNumber=totalBorrowNumber;
		this.nowBorrowNumber=nowBorrowNumber;
	}
	
	//User类的构造方法---无参数的构造方法
	//用户ID  用户名称  可借数量  在借数量
	public JavaClassUser() {
			// TODO Auto-generated constructor stub
		this.userID="0000000000000";
		this.userName="XXX";
		this.totalBorrowNumber=10;
		this.nowBorrowNumber=0;
		
		
		
	}
	
	//get方法
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
	
	
	//set方法
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
