class Prac20 {
	static int[] shuffle(int[] arr) {//�ؼ����� public�� ����. static�� �� �˰ڴµ� public�� ���� ���� ����� �� ��Ȯ�� �𸣰ڴ�. 
		if(arr==null||arr.length==0) return arr;//���� ���� �ۼ� �� �� �κ�. �Ű������� ��ȿ�� �˻�
		for(int i=0;i<arr.length;i++) {
			//MathŬ������ �ֻ��� Ŭ������ Object Ŭ���� �ȿ� �����Ƿ� ���� ���� import�������� �ʾƵ� �ȴ�. 
			//Math.random()�� 0.0�̻� 1.0�̸�(0.9999...)�� ���� ����س���. 1���� 100���� �̾Ƴ��� �ʹٸ� Math.random()*100�� �ϸ� 0.0~99.999...�� ���� ����س���, int�� Ÿ��ĳ�������ָ� �ȴ�.
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
