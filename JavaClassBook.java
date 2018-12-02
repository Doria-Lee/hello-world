package Review;
import java.util.Calendar;


public class JavaClassBook {

	//有参数的构造方法
	//书籍ID  索书号  书籍名称  借阅日期  应还日期  书籍状态
	public JavaClassBook(String bookID,String bookNumber,String bookName,
			    int borrowDate,int returnDate,String bookState) {
		// TODO Auto-generated constructor stub
		this.bookID = bookID;
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.bookState = bookState;
		
		
		
	}
	
	
	//无参数的构造方法
	//书籍ID  索书号  书籍名称  借阅日期  应还日期  书籍状态
	public JavaClassBook() {
		// TODO Auto-generated constructor stub
		this.bookID = "书籍ID";
		this.bookNumber = "索书号";
		this.bookName = "书籍名称";
		this.borrowDate = 88888888;
		this.returnDate = 88888888;
		this.bookState = "书籍状态";
		this.userID="8888888888888";
	}
	

	public String getBookID()
	{
		return bookID;
	}
	
	public String getBookNumber()
	{
		return bookNumber;
	}
	
	public String getBookName()
	{
		return bookName;
	}
	
	public int getBorrowDate()
	{
		return borrowDate;
	}
	
	public int getReturnDate()
	{
		return returnDate;
	}
	
	public String getBookState()
	{
		return bookState;
	}
	
	public String getUserID()
	{
		return userID;
	}
	
	
	//SET方法
	public void setBookID(String bookID)
	{
		this.bookID=bookID;
	}
	
	public void setBookNumber(String bookNumber)
	{
		this.bookNumber=bookNumber;
	}
	
	public void setBookName(String bookName)
	{
		this.bookName=bookName;
	}
	
	public void setBorrowDate(int borrowDate)
	{
		this.borrowDate=borrowDate;
	}
	
	public void setReturnDate(int returnDate)
	{
		this.returnDate=returnDate;
	}
	
	public void setBookState(String bookState)
	{
		this.bookState=bookState;
	}
	
	public void setUserID(String userID)
	{
		this.userID=userID;
	}
	
	
	//核心功能----借书
	public void borrowBook(String userID)
	{
		//使用calendar类 获取今日的时间（借书的时间）
        Calendar cal = Calendar.getInstance();
        day=cal.get(Calendar.DATE);
        month=cal.get(Calendar.MONTH) + 1;
        year=cal.get(Calendar.YEAR);
		borrowDate=year*10000+month*100+day;
		
		//计算  书籍的 应还日期
		if(month<=11)month=month+1;
		else {year=year+1;month=1;}
		returnDate=year*10000+month*100+day;
		
		bookState="已借出";
		this.userID=userID;
	}
	
	//核心功能----续借
	public void lastBorrow()
	{
		year = returnDate / 10000;
		month = (returnDate - year*10000)/100;
		day = returnDate % 100;
		
		//续借的操作，可以续借一个月
		if(month<=11)month=month+1;
		else {year=year+1;month=1;}
		
		returnDate=year*10000+month*100+day;
		//System.out.println("续借后应归还日期为：");
		//System.out.println(returnDate);
	}
	
	//核心功能----还书
	public void returnBook()
	{
		bookState="未借出";
		borrowDate=88888888;
		returnDate=88888888;
		userID="8888888888888";
	}

	
	
	
	private String bookID;
	private String bookNumber;
	private String bookName;
	private int borrowDate;
	private int returnDate;
	private String bookState;
	private int year;
	private int month;
	private int day;
	private String userID;

}
