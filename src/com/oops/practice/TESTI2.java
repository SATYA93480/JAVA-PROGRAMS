package com.oops.practice;
interface camera{
	void takephotos();
}
interface applemusic{
	void listenmusic();
}
interface siri{
	void talkWithSiri();
}
class Iphone implements camera,applemusic,siri{
	public void takephotos() {
		System.out.println("click a photo in portrait mode");
	}
	public void listenmusic() {
		System.out.println("lets hear a song ");
	}
	public void talkWithSiri() {
		System.out.println("hey siri");
	}
}
public class TESTI2 {
	public static void main(String[] args) {
		camera c=new Iphone();
		c.takephotos();
		applemusic am=new Iphone();
		am.listenmusic();
		siri s=new Iphone();
		s.talkWithSiri();
	}

}
