package Review;
import java.awt.*;
import javax.swing.*;

public class JavaGUI {

	public  static void main(String[] args) { 
		// TODO Auto-generated constructor stub
		
		/*���*/
		Frame  myFirstFrame = new Frame();
		myFirstFrame.setSize(300, 300);//���ڴ�С
		myFirstFrame.setLocation(1000, 300);//����λ��
		
		/*
		 * ----���ֹ�����-----
		FlowLayout(��ʽ���ֹ�����)��
		BorderLayout(�߽粼�ֹ�����)��
		GridLayout(���񲼾ֹ�����)��
		CardLayout(��Ƭ���ֹ�����)��
		GridBagLayout(��������ֹ�����)��
		----Frame Ĭ�ϵĲ��ֹ�������BorderLayout,Ĭ��ռ����ҳ��--------
		*/
	
		/*����ť*/
		JButton b1 = new JButton("����ť");
		myFirstFrame.add(b1);
		myFirstFrame.setLayout(new FlowLayout());
		
		/*��ѡ��*/
		JCheckBox fxk = new JCheckBox("����һ����ѡ��");
		
		
		/*
		 * JAVA�е��¼���
		 * 1�������¼���
		 * 2�������¼���
		 * 3�������¼���
		 * 4����Ŀ�¼���
		 * 5�������¼���
		 * 6������¼���
		 * 7�������¼���
		 * 
		 */
		
		
		myFirstFrame.setVisible(true);//���ÿɼ�����
	}

}
