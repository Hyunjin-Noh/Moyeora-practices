class MyTV {
	//인스턴스 변수
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	//인스턴스 메서드
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
		else channel++;//나는 else 표현 안했는데 해설에선 표현함. 아마 volumeUp(), volumeDown()처럼 if만 있지 않아서 인 듯.
	}
	void channelDown() {
		if(channel==MIN_CHANNEL) channel = MAX_CHANNEL;
		else channel--;//나는 else 표현 안했는데 해설에선 표현함. 아마 volumeUp(), volumeDown()처럼 if만 있지 않아서 인 듯.
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
