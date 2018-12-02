package Review;
/*
 * Java复习 2018.11.16
//一、Java语言的基本知识
  1、一维数组的定义与应用
  2、二维数组的定义与应用
*/

public class JavaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//     数据类型  数组名[]=null;
		//     数组名=new 数据类型[长度];
		
		int row = 5;
		int col = 5;

		
		int arr1[] = null;
		arr1 = new int[row];
		
		for(int i = 0;i<row;i++)
		{
			arr1[i]=i;
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		
		int arr2[][] = null;int k = 0;
		arr2 = new int[row][col];
		for(int i = 0;i<col;i++)
		{
			for(int j = 0;j<row;j++)
			{
				arr2[i][j] = k++;
				System.out.print(arr2[i][j]+"　");
			}
			System.out.println();
		}
		
		

	}

}
