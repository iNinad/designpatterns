package designpatterns.structural.adapter;

public class AudioPlayer implements MediaPlayer{
	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName){
		// Inbuilt support to play mp3 files
		if (audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file. Name : "+fileName);
		}
		// Use of MediaAdapter to provide support for other files.
		else if ((audioType.equalsIgnoreCase("vlc"))||(audioType.equalsIgnoreCase("mp4"))){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else {
			System.out.println("Invalid media. "+audioType+" media not supported");
		}
	}
}
