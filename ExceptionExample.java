package Review;
/*
 * Java复习 2018.11.16
//三、常用基本算法和语言处理类
   异常处理
   1、异常的概念
   2、异常的捕捉与处理；try-catch-finally语句
   3、异常的抛出：throw，throws语句
*/


public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//异常的基本样式
		try{
			System.out.println("try语句的执行");
			System.out.println("throw抛出异常");
			throw(new Exception("抛出Exception异常实例！"));
		}
		catch(Exception e){
			System.out.println("catch语句的执行，捕获异常并处理");
			System.out.println("toString()\n"+e.toString());
		}
		finally {
			System.out.println("finally语句的执行");
		}
		

	}

}
