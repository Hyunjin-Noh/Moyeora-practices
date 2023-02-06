class Prac4 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:"+s.name);
		System.out.println("총점"+s.getTotal());
		System.out.println("이름:"+s.getAverage());
	}
}

class Student {
	//인스턴스 변수
	String name;//학생이름
	int ban;//반
	int no;//번호
	int kor;//국어점수
	int eng;//영어점수
	int math;//수학점수
	
	//인스턴스 메서드
	int getTotal() {
		return kor + eng + math;
	}
	float getAverage() {
		/*내가 썼던 답안: 반올림은 어떻게 하지.. printf쓰면 되는데 그러면 float로 반환형을 맞출 수가 없는데..)
		return getTotal()/3f;//3f로 나누어야 float를 얻을 수 있음.*/
		return (int)(((getTotal()/3f)*10)+0.5)/10f;//소숫점 둘째 자리 반올림을 수식으로 계산하는 방법
	}                           
}
