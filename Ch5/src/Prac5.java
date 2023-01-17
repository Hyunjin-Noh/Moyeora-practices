//1과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램
public class Prac5 {
	public static void main(String[] args) {
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];

		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i=0;i<ballArr.length;i++) {
			//Math클래스는 최상위 클래스인 Object 클래스 안에 있으므로 굳이 따로 import시켜주지 않아도 된다. 
			//Math.random()은 0.0이상 1.0미만(0.9999...)의 값을 출력해낸다. 1부터 100까지 뽑아내고 싶다면 Math.random()*100을 하면 0.0~99.999...의 값을 출력해내니, int로 타입캐스팅해주면 된다.
			int j=(int)(Math.random()*ballArr.length);
			int tmp=0;
		
			tmp=ballArr[i];
			ballArr[i]=ballArr[j];
			ballArr[j]=tmp;
		}

		//배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다. 
		System.arraycopy(ballArr, 0, ball3, 0, 3);//ballArr[0]부터 시작해서 3개의 데이터를 ball3[0]으로 복사한다. 
		
		//배열 ball3 출력
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
	}
}
