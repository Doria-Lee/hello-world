package Review;
import java.util.Calendar;


public class JavaClassBook {

	//�в����Ĺ��췽��
	//�鼮ID  �����  �鼮����  ��������  Ӧ������  �鼮״̬
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
	
	
	//�޲����Ĺ��췽��
	//�鼮ID  �����  �鼮����  ��������  Ӧ������  �鼮״̬
	public JavaClassBook() {
		// TODO Auto-generated constructor stub
		this.bookID = "�鼮ID";
		this.bookNumber = "�����";
		this.bookName = "�鼮����";
		this.borrowDate = 88888888;
		this.returnDate = 88888888;
		this.bookState = "�鼮״̬";
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
	
	
	//SET����
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
	
	
	//���Ĺ���----����
	public void borrowBook(String userID)
	{
		//ʹ��calendar�� ��ȡ���յ�ʱ�䣨�����ʱ�䣩
        Calendar cal = Calendar.getInstance();
        day=cal.get(Calendar.DATE);
        month=cal.get(Calendar.MONTH) + 1;
        year=cal.get(Calendar.YEAR);
		borrowDate=year*10000+month*100+day;
		
		//����  �鼮�� Ӧ������
		if(month<=11)month=month+1;
		else {year=year+1;month=1;}
		returnDate=year*10000+month*100+day;
		
		bookState="�ѽ��";
		this.userID=userID;
	}
	
	//���Ĺ���----����
	public void lastBorrow()
	{
		year = returnDate / 10000;
		month = (returnDate - year*10000)/100;
		day = returnDate % 100;
		
		//����Ĳ�������������һ����
		if(month<=11)month=month+1;
		else {year=year+1;month=1;}
		
		returnDate=year*10000+month*100+day;
		//System.out.println("�����Ӧ�黹����Ϊ��");
		//System.out.println(returnDate);
	}
	
	//���Ĺ���----����
	public void returnBook()
	{
		bookState="δ���";
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
