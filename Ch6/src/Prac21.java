class MyTV {
	//�ν��Ͻ� ����
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	//�ν��Ͻ� �޼���
	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}
	void volumeUp() {
		if(volume < MAX_VOLUME) volume++;
	}
	void volumeDown() {
		if(volume > MIN_VOLUME) volume--;
	}
	void channelUp() {
		if(channel==MAX_CHANNEL) channel = MIN_CHANNEL;
		else channel++;//���� else ǥ�� ���ߴµ� �ؼ����� ǥ����. �Ƹ� volumeUp(), volumeDown()ó�� if�� ���� �ʾƼ� �� ��.
	}
	void channelDown() {
		if(channel==MIN_CHANNEL) channel = MAX_CHANNEL;
		else channel--;//���� else ǥ�� ���ߴµ� �ؼ����� ǥ����. �Ƹ� volumeUp(), volumeDown()ó�� if�� ���� �ʾƼ� �� ��.
	}
}

class Prac21 {
	public static void main(String[] args) {
		MyTV t = new MyTV();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);// 100, 0
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);//99, 0
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);//100, 100
	}
}
