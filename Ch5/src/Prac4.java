//2���� �迭 arr�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷�
public class Prac4 {
	public static void main(String[] args) {
		int[][] arr = {
				{5, 5, 5, 5, 5}, 
				{10, 10, 10, 10, 10}, 
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};//Prac3�� ����������, ������ �ʱ�ȭ���� {�տ� ���� new int[][]�� ������.
		  //�� �����, 4�� 5���� ������ �迭�� ������.
		
		int total=0;//����
		float average=0;//���
		
		for(int i=0;i<arr.length;i++) {//arr.length==4. �� ���� ������ ����. 
			for(int j=0;j<arr[i].length;j++) {//arr[i].length==5. �� �� �ϳ��� ���� ������ ����.
				total+=arr[i][j];
			}
		}
		average=total/(float)(arr.length * arr[0].length);//4*5 ��� arr.length * arr[0].length. ����/������ �����ε� average�� �ƹ����� �Ǽ��� ��Ȯ���״� float�� ����ȯ.
	
		System.out.println("total="+total);
		System.out.println("average="+average);
	}
}
