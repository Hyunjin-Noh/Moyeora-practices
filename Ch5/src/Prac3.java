//�迭 arr�� ��� ��� ���� ���ϴ� ���α׷�
public class Prac3 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};//������ �ʱ�ȭ new int[]{10, 20, 30, 40, 50}���� new int[]������
		int sum = 0;
		for(int i=0;i<arr.length;i++) {//i<5��� �ϴ� �� ���� i<arr.length�� �ϴ� ���� ���������� ����.
			sum+=arr[i];
		}
		System.out.println("sum="+sum);
	}
}
