
class Prac2 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard {
	//�ν��Ͻ� ����
	int num;//ī�� ����. 1~10 ���� ����
	boolean isKwang;//���̸� true, �ƴϸ� false
	
	//�ν��Ͻ� �޼���
	/* ���� ó�� ��� ���
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
		//�� ��� �ڵ尡 return num + (isKwang? "K" : "");�� �ذ�ȴ�..
	}
	
	//������
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	SutdaCard(){
		this(1, true);
	};
}
