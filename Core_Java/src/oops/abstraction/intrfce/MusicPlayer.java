package oops.abstraction.intrfce;

public interface MusicPlayer {
	void play();
	void pause();
	void stop();
}

class SpotifyPlayer implements MusicPlayer{
	
	public void play() {
		System.out.println("Spotify plays");
	}
	public void pause() {
		System.out.println("Spotify pause");
	}
	public void stop() {
		System.out.println("Spotify stops");
	}
}

class YoutubeMusicPlayer implements MusicPlayer{
	public void play() {
		System.out.println("Youtube plays");
	}
	public void pause() {
		System.out.println("Youtube pause");
	}
	public void stop() {
		System.out.println("Youtube stops");
	}
}
