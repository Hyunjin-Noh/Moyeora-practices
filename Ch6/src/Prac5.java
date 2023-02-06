class Prac5 {
	public static void main(String[] args) {
		Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());
	}
}

class Student2 {//같은 패키지 안에 같은 클래스 있으면 안되는데 Prac4에 이미 Student 클래스가 있어서 Student2라 이름 지었음.
	//인스턴스 변수
	String name;//학생이름
	int ban;//반
	int no;//번호
	int kor;//국어점수
	int eng;//영어점수
	int math;//수학점수
	
	//인스턴스 메서드
	//중 생성자
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
	float getAverage() {//소숫점 둘째 자리 반올림을 수식으로 계산하는 방법
		return (int)(((getTotal()/3f)*10)+0.5)/10f;
	}
	String info() {//답지는 여기다 public을 붙였네.. 왜지?
		/* 내가 쓴 방법
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