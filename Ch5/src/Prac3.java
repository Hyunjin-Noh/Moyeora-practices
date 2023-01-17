//배열 arr에 담긴 모든 값을 더하는 프로그램
public class Prac3 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};//생성과 초기화 new int[]{10, 20, 30, 40, 50}에서 new int[]생략함
		int sum = 0;
		for(int i=0;i<arr.length;i++) {//i<5라고 하는 것 보다 i<arr.length로 하는 것이 유지보수에 좋음.
			sum+=arr[i];
		}
		System.out.println("sum="+sum);
	}
}
