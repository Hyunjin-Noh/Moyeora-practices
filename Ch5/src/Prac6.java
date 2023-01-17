//거스름돈을 가능한 한 적은 수의 동전으로 거슬러 주는 문제
public class Prac6 {
	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		int[] coinCount = new int[coinUnit.length];//답지에서는 안 만들었는데 나는 그냥 만들었음. 계산만 할 때는 이 배열이 메모리 낭비겠지만, 남은 동전 수를 관리할 땐 졸음
		
		//거스름돈이 얼마인지 출력
		int money=2680;
		System.out.println("money="+money+"원");
		
		//동전 얼마짜리가 몇 개씩 필요한지 출력
		for(int i=0;i<coinUnit.length;i++) {
			coinCount[i]=money/coinUnit[i];
			System.out.println(coinUnit[i]+"원: "+coinCount[i]+"개");
			money=money%coinUnit[i];	
		}
	}
}
