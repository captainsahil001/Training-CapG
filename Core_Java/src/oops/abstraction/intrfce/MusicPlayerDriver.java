package oops.abstraction.intrfce;

public class MusicPlayerDriver {
	public static void main(String[] args) {
		SpotifyPlayer sp = new SpotifyPlayer();
		sp.play();
		sp.pause();
		sp.stop();
		
		System.out.println("-------------");
		
		YoutubeMusicPlayer yp = new YoutubeMusicPlayer();
		yp.play();
		yp.pause();
		yp.stop();
	}

}
