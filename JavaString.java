package Review;

public class JavaString {

	public JavaString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "由String创建的字符串";//对象创建
		String anotherStr = "由String创建的字符串";
		str.length();//字符串长度
		str.compareTo(anotherStr);//字符串的比较
		str.equals(anotherStr);
		str.charAt(4);//字符的访问与查找
		String lastStr = str + anotherStr;
		System.out.println(lastStr);//字符串的连接
		str.indexOf('a'); //子串字符的查找
		str.indexOf("sss");
		
		                                        
		StringBuffer strbuff = new  StringBuffer();  //对象的创建
		strbuff.append("字符串缓存区 的内容");  
		System.out.println(strbuff.toString());//StringBuffer与String的相互转化
		

	}

}
