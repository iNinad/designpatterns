package designpatterns.structural.adapter;

public class AdapterPatternDemo {
	public static void main(String[] args){
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "On my way.mp3");
		audioPlayer.play("vlc", "Getting to know you.vlc");
		audioPlayer.play("mp4", "Here we go.mp4");
		audioPlayer.play("avi", "This is fun.avi");
	}
}
