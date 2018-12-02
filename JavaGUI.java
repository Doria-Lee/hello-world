package Review;
import java.awt.*;
import javax.swing.*;

public class JavaGUI {

	public  static void main(String[] args) { 
		// TODO Auto-generated constructor stub
		
		/*面板*/
		Frame  myFirstFrame = new Frame();
		myFirstFrame.setSize(300, 300);//窗口大小
		myFirstFrame.setLocation(1000, 300);//窗口位置
		
		/*
		 * ----布局管理器-----
		FlowLayout(流式布局管理器)，
		BorderLayout(边界布局管理器)，
		GridLayout(网格布局管理器)，
		CardLayout(卡片布局管理器)和
		GridBagLayout(网格包布局管理器)，
		----Frame 默认的布局管理器是BorderLayout,默认占整个页面--------
		*/
	
		/*单按钮*/
		JButton b1 = new JButton("单按钮");
		myFirstFrame.add(b1);
		myFirstFrame.setLayout(new FlowLayout());
		
		/*复选框*/
		JCheckBox fxk = new JCheckBox("这是一个复选框");
		
		
		/*
		 * JAVA中的事件类
		 * 1、动作事件类
		 * 2、调整事件类
		 * 3、焦点事件类
		 * 4、项目事件类
		 * 5、键盘事件类
		 * 6、鼠标事件类
		 * 7、窗口事件类
		 * 
		 */
		
		
		myFirstFrame.setVisible(true);//设置可见窗口
	}

}
