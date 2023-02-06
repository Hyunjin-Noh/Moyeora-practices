//"커맨드라인"으로부터 거스름돈을 입력받아 계산. 
//보유한 동전 개수로 거스름돈 지불 못해주면 '거스름돈이 부족합니다.'라고 출력하고 종료, 있으면 사용한 동전 개수, 남은 동전 개수 출력
public class Prac7 {
	public static void main(String[] args) {
		//커맨드라인으로부터 입력된 문자열은 String배열에 담겨서 main함수가 있는 클래스의, main메서드의 매개변수(args)로 전달된다. 공백으로 구분되고, 무조건 문자열로 저장된다.
		//커맨드라인으로부터 입력이 없으면 크기가 0인 배열이 생성되어 args.length의 값이 0이 된다. 
		if(args.length!=1) {//커맨드라인으로 입력된 값이 1개가 아니면
			System.out.println("USAGE: java Prac7");
			System.exit(0);
		}
		//커맨드라인으로부터 입력받은 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생
		//Integer 클래스의 parseInt 함수. 해당 값을 10진수의 integer형으로 바꿔준다.
		int money = Integer.parseInt(args[0]);//어차피 숫자 하나만 저장하므로
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10};//동전의 단위
		int[] coinRemain = {5, 5, 5, 5};//단위별 (남아있는) 동전의 개수. 왜 이런 조건을 추가했냐? 사용하는 동전 수 제한하기 위해
		int[] coinCount = new int[coinUnit.length];//거스름돈 동전으로 환산한 결과 동전 개수 배열 선언, 생성. 초기화는 기본값으로 됨. 
		
		for(int i=0;i<coinUnit.length;i++) {
			coinCount[i]=money/coinUnit[i];//나눈 몫 저장
			coinRemain[i]-=coinCount[i];//남은 돈 갱신
			money-=(coinUnit[i]*coinCount[i]);//조건때문에 이렇게 하긴 했는데 그냥 money=money%coinUnit[i]; 하면 안되나?
			System.out.println(coinUnit[i]+"원: "+coinCount[i]+"개");
		}
		if(money>0) {//다 안 거슬러졌다면
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
		//남은 동전 개수 출력
		System.out.println("=남은 동전의 개수=");
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원:"+coinRemain[i]);
		}
	}
}