
class Prac2 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard {
	//인스턴스 변수
	int num;//카드 숫자. 1~10 사이 정수
	boolean isKwang;//광이면 true, 아니면 false
	
	//인스턴스 메서드
	/* 내가 처음 썼던 답안
	String info(SutdaCard c) {
		String result;
		if(c.isKwang==true) {result=c.num+"K";}
		else {result=c.num+"";}
		return result;
	}*/
	String info() {
		String result;
		if(isKwang==true) {result=num+"K";}
		else {result=num+"";}
		return result;
		//이 모든 코드가 return num + (isKwang? "K" : "");로 해결된다..
	}
	
	//생성자
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	SutdaCard(){
		this(1, true);
	};
}
