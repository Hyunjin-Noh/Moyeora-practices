class MyPoint {
	//인스턴스 변수
	int x;
	int y;
	
	//생성자
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {//두 점 (x, y)와 (x1, y1)간의 거리 구하는 함수                                                                                                                                    
		return Math.sqrt(Math.pow(x1-x, 2)+Math.pow(y1-y, 2));//x, y는 인스턴스 변수라 static 함수로 선언 불가
	}
}

class Prac7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		//점(1, 1)과 점(2, 2)의 거리를 구한다. 
		System.out.println(p.getDistance(2, 2));

	}

}
