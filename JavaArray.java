package Review;
/*
 * Java��ϰ 2018.11.16
//һ��Java���ԵĻ���֪ʶ
  1��һά����Ķ�����Ӧ��
  2����ά����Ķ�����Ӧ��
*/

public class JavaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//     ��������  ������[]=null;
		//     ������=new ��������[����];
		
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
				System.out.print(arr2[i][j]+"��");
			}
			System.out.println();
		}
		
		

	}

}
