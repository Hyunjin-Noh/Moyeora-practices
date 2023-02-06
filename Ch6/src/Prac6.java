class Prac6 {
	static double getDistance(int x, int y, int x1, int y1) {//두 점 (x, y)와 (x1, y1)간의 거리 구하는 함수                                                                                                                                    
		return Math.sqrt(Math.pow(x1-x, 2)+Math.pow(y1-y, 2));//x, y는 지역변수
	}
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	}
}
