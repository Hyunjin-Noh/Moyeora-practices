//"Ŀ�ǵ����"���κ��� �Ž������� �Է¹޾� ���. 
//������ ���� ������ �Ž����� ���� �����ָ� '�Ž������� �����մϴ�.'��� ����ϰ� ����, ������ ����� ���� ����, ���� ���� ���� ���
public class Prac7 {
	public static void main(String[] args) {
		//Ŀ�ǵ�������κ��� �Էµ� ���ڿ��� String�迭�� ��ܼ� main�Լ��� �ִ� Ŭ������, main�޼����� �Ű�����(args)�� ���޵ȴ�. �������� ���еǰ�, ������ ���ڿ��� ����ȴ�.
		//Ŀ�ǵ�������κ��� �Է��� ������ ũ�Ⱑ 0�� �迭�� �����Ǿ� args.length�� ���� 0�� �ȴ�. 
		if(args.length!=1) {//Ŀ�ǵ�������� �Էµ� ���� 1���� �ƴϸ�
			System.out.println("USAGE: java Prac7 3120");
			System.exit(0);
		}
		//Ŀ�ǵ�������κ��� �Է¹��� ���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻�
		//Integer Ŭ������ parseInt �Լ�. �ش� ���� 10������ integer������ �ٲ��ش�.
		int money = Integer.parseInt(args[0]);
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10};//������ ����
		int[] coinRemain = {5, 5, 5, 5};//������ (�����ִ�) ������ ����
		int[] coinCount = new int[coinUnit.length];//�Ž����� �������� ȯ���� ��� ���� ����
		
		for(int i=0;i<coinUnit.length;i++) {
			coinCount[i]=money/coinUnit[i];	
			System.out.println(coinUnit[i]+"��: "+coinCount[i]+"��");
			money=money%coinUnit[i];
			coinRemain[i]-=coinCount[i];
			money-=coinUnit[i]*coinCount[i];
		}
		if(money>0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0);
		}
		//���� ���� ���� ���
		System.out.println("=���� ������ ����=");
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"��:"+coinRemain[i]);
		}
	}
}
