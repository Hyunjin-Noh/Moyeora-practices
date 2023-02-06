class Prac20 {
	static int[] shuffle(int[] arr) {//해설에는 public도 썼음. static은 잘 알겠는데 public은 아직 언제 써야할 지 정확히 모르겠다. 
		if(arr==null||arr.length==0) return arr;//여긴 내가 작성 못 한 부분. 매개변수의 유효성 검사
		for(int i=0;i<arr.length;i++) {
			//Math클래스는 최상위 클래스인 Object 클래스 안에 있으므로 굳이 따로 import시켜주지 않아도 된다. 
			//Math.random()은 0.0이상 1.0미만(0.9999...)의 값을 출력해낸다. 1부터 100까지 뽑아내고 싶다면 Math.random()*100을 하면 0.0~99.999...의 값을 출력해내니, int로 타입캐스팅해주면 된다.
			int j=(int)(Math.random()*arr.length);
			int tmp=0;
		
			tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
