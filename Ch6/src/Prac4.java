class Prac4 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸�:"+s.name);
		System.out.println("����"+s.getTotal());
		System.out.println("�̸�:"+s.getAverage());
	}
}

class Student {
	//�ν��Ͻ� ����
	String name;//�л��̸�
	int ban;//��
	int no;//��ȣ
	int kor;//��������
	int eng;//��������
	int math;//��������
	
	//�ν��Ͻ� �޼���
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		/*���� ��� ���: �ݿø��� ��� ����.. printf���� �Ǵµ� �׷��� float�� ��ȯ���� ���� ���� ���µ�..)
		return getTotal()/3f;//3f�� ������� float�� ���� �� ����.*/
		return (int)(((getTotal()/3f)*10)+0.5)/10f;//�Ҽ��� ��° �ڸ� �ݿø��� �������� ����ϴ� ���
	}                           
}
