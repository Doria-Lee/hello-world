package Review;

public class JavaString {

	public JavaString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "��String�������ַ���";//���󴴽�
		String anotherStr = "��String�������ַ���";
		str.length();//�ַ�������
		str.compareTo(anotherStr);//�ַ����ıȽ�
		str.equals(anotherStr);
		str.charAt(4);//�ַ��ķ��������
		String lastStr = str + anotherStr;
		System.out.println(lastStr);//�ַ���������
		str.indexOf('a'); //�Ӵ��ַ��Ĳ���
		str.indexOf("sss");
		
		                                        
		StringBuffer strbuff = new  StringBuffer();  //����Ĵ���
		strbuff.append("�ַ��������� ������");  
		System.out.println(strbuff.toString());//StringBuffer��String���໥ת��
		

	}

}
