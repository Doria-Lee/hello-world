package Review;

/*
 * Java复习 2018.11.16
//一、Java语言的基本知识
 1、基本数据:byte short int long float double char boolean
 2、变量与常量：常量的各种表示形式，变量的定义和初始化
 3、运算符：赋值、算术、递增递减、关系、逻辑、复合、位运算、条件运算符
 4、表达式：表达式的组成规则，表达式运算中的类型转换，优先级和结合型
 
 1、if语句
 2、switch语句
 3、for、while、do-while等循环语句
 4、break、continue语句
*/

public class BasicKnowledge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//基本数据：char byte boolean
		char ch = 'B';
		boolean b1 = true;
		boolean b2 = true;
		  //byte字节型，int是整型，byte是8bit，int是32bit
          //byte可以转换为int，但int转byte可能会报错，因为精度问题，可能会超过上界
		  //char也可转int，互转int的关系和btye类似
		byte bt = 3;
		System.out.println(bt);
		
		//算数运算符：逻辑运算、位运算、条件运算符
		  //逻辑运算符：&(两个条件都会执行)  |  !
		int a=1;
		int b=2;
		int c=0;
		c = a & b;System.out.println("逻辑与运算1&2的值为："+c);
		c = a | b;System.out.println("逻辑或运算1|2的值为："+c);
		b2 = !b1;System.out.println("逻辑非运算!true的值为："+b2);
		  
		  //关系运算符：&&(只计算一个条件) || ! 
		  //条件运算符
		a=1;b=2;
		c=(a>b?a:b);
		System.out.println("条件运算符复习：c = "+c);
		
		
		//控制/循环语句
		if(ch == 'B')
		{
			
		}
		
		switch(ch)
		{//switch语句一旦匹配到break将会直接运行接下来的语句，所以要用break进行跳出
		case 'a':  ;
		case 'B':System.out.println("switch语句复习成功");break;
		default:System.out.println("switch语句default语句");break;
		}
		
		for(int i = 0;i < bt; i++)
		{
			
			//continue跳出一次循环
			if(i == 1)continue;
		}
		
		while(b1 == true)
		{
			
		}
		
		do{
			
		}while(b2 == true);
	

	}

}
