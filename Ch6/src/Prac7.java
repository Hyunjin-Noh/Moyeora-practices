class MyPoint {
	//�ν��Ͻ� ����
	int x;
	int y;
	
	//������
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {//�� �� (x, y)�� (x1, y1)���� �Ÿ� ���ϴ� �Լ�                                                                                                                                    
		return Math.sqrt(Math.pow(x1-x, 2)+Math.pow(y1-y, 2));//x, y�� �ν��Ͻ� ������ static �Լ��� ���� �Ұ�
	}
}

class Prac7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		//��(1, 1)�� ��(2, 2)�� �Ÿ��� ���Ѵ�. 
		System.out.println(p.getDistance(2, 2));

	}

}
