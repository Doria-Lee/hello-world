package Review;

/*
 * Java��ϰ 2018.11.16
//һ��Java���ԵĻ���֪ʶ
 1����������:byte short int long float double char boolean
 2�������볣���������ĸ��ֱ�ʾ��ʽ�������Ķ���ͳ�ʼ��
 3�����������ֵ�������������ݼ�����ϵ���߼������ϡ�λ���㡢���������
 4�����ʽ�����ʽ����ɹ��򣬱��ʽ�����е�����ת�������ȼ��ͽ����
 
 1��if���
 2��switch���
 3��for��while��do-while��ѭ�����
 4��break��continue���
*/

public class BasicKnowledge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//�������ݣ�char byte boolean
		char ch = 'B';
		boolean b1 = true;
		boolean b2 = true;
		  //byte�ֽ��ͣ�int�����ͣ�byte��8bit��int��32bit
          //byte����ת��Ϊint����intתbyte���ܻᱨ����Ϊ�������⣬���ܻᳬ���Ͻ�
		  //charҲ��תint����תint�Ĺ�ϵ��btye����
		byte bt = 3;
		System.out.println(bt);
		
		//������������߼����㡢λ���㡢���������
		  //�߼��������&(������������ִ��)  |  !
		int a=1;
		int b=2;
		int c=0;
		c = a & b;System.out.println("�߼�������1&2��ֵΪ��"+c);
		c = a | b;System.out.println("�߼�������1|2��ֵΪ��"+c);
		b2 = !b1;System.out.println("�߼�������!true��ֵΪ��"+b2);
		  
		  //��ϵ�������&&(ֻ����һ������) || ! 
		  //���������
		a=1;b=2;
		c=(a>b?a:b);
		System.out.println("�����������ϰ��c = "+c);
		
		
		//����/ѭ�����
		if(ch == 'B')
		{
			
		}
		
		switch(ch)
		{//switch���һ��ƥ�䵽break����ֱ�����н���������䣬����Ҫ��break��������
		case 'a':  ;
		case 'B':System.out.println("switch��临ϰ�ɹ�");break;
		default:System.out.println("switch���default���");break;
		}
		
		for(int i = 0;i < bt; i++)
		{
			
			//continue����һ��ѭ��
			if(i == 1)continue;
		}
		
		while(b1 == true)
		{
			
		}
		
		do{
			
		}while(b2 == true);
	

	}

}
