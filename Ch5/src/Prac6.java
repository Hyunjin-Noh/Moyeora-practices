//�Ž������� ������ �� ���� ���� �������� �Ž��� �ִ� ����
public class Prac6 {
	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		int[] coinCount = new int[coinUnit.length];//���������� �� ������µ� ���� �׳� �������. ��길 �� ���� �� �迭�� �޸� ���������, ���� ���� ���� ������ �� ����
		
		//�Ž������� ������ ���
		int money=2680;
		System.out.println("money="+money+"��");
		
		//���� ��¥���� �� ���� �ʿ����� ���
		for(int i=0;i<coinUnit.length;i++) {
			coinCount[i]=money/coinUnit[i];
			System.out.println(coinUnit[i]+"��: "+coinCount[i]+"��");
			money=money%coinUnit[i];	
		}
	}
}
