package Review;
import java.util.*;

public class JavaIO {

	public JavaIO() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*---了解-----
            
                      字节流--传输过程中，传输数据的最基本单位是字节的流。

                      字符流--传输过程中，传输数据的最基本单位是字符的流。
                      
		 */
		
	    Scanner xx = new Scanner( System.in );
        System.out.print("enter a number: ");//println换行；print不换行
        int number = xx.nextInt();//数据类型为int
        int number2 = 2 * number;
        System.out.println( "number = " + number );
        System.out.println( "number2 = " + number2 );

	}

}
