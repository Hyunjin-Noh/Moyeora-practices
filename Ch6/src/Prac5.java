class Prac5 {
	public static void main(String[] args) {
		Student2 s = new Student2("ȫ�浿", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());
	}
}

class Student2 {//���� ��Ű�� �ȿ� ���� Ŭ���� ������ �ȵǴµ� Prac4�� �̹� Student Ŭ������ �־ Student2�� �̸� ������.
	//�ν��Ͻ� ����
	String name;//�л��̸�
	int ban;//��
	int no;//��ȣ
	int kor;//��������
	int eng;//��������
	int math;//��������
	
	//�ν��Ͻ� �޼���
	//�� ������
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
		
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {//�Ҽ��� ��° �ڸ� �ݿø��� �������� ����ϴ� ���
		return (int)(((getTotal()/3f)*10)+0.5)/10f;
	}
	String info() {//������ ����� public�� �ٿ���.. ����?
		/* ���� �� ���
		 * return name+","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
		 */
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal()
				+","+getAverage();
	}
}