package Review;
/*
 * Java��ϰ 2018.11.16
//�������û����㷨�����Դ�����
   �쳣����
   1���쳣�ĸ���
   2���쳣�Ĳ�׽�봦��try-catch-finally���
   3���쳣���׳���throw��throws���
*/


public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//�쳣�Ļ�����ʽ
		try{
			System.out.println("try����ִ��");
			System.out.println("throw�׳��쳣");
			throw(new Exception("�׳�Exception�쳣ʵ����"));
		}
		catch(Exception e){
			System.out.println("catch����ִ�У������쳣������");
			System.out.println("toString()\n"+e.toString());
		}
		finally {
			System.out.println("finally����ִ��");
		}
		

	}

}
