//2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램
public class Prac4 {
	public static void main(String[] args) {
		int[][] arr = {
				{5, 5, 5, 5, 5}, 
				{10, 10, 10, 10, 10}, 
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};//Prac3과 마찬가지로, 생성과 초기화에서 {앞에 들어가는 new int[][]를 생략함.
		  //이 모양대로, 4행 5열의 다차원 배열이 생성됨.
		
		int total=0;//총합
		float average=0;//평균
		
		for(int i=0;i<arr.length;i++) {//arr.length==4. 즉 행의 개수를 말함. 
			for(int j=0;j<arr[i].length;j++) {//arr[i].length==5. 즉 행 하나당 열의 개수를 말함.
				total+=arr[i][j];
			}
		}
		average=total/(float)(arr.length * arr[0].length);//4*5 대신 arr.length * arr[0].length. 정수/정수는 정수인데 average는 아무래도 실수가 정확할테니 float로 형변환.
	
		System.out.println("total="+total);
		System.out.println("average="+average);
	}
}
