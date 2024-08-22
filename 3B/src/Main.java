
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MusicSource localMusic = new LocalMusic("song.mp3");
	        MusicSource onlineMusic = new OnlineStreaming("http://example.com/stream");
	        MusicSource radio = new RadioStation("Cool FM");
	        
	        MusicSourceAdapter localAdapter = new MusicSourceAdapter(localMusic);
	        MusicSourceAdapter onlineAdapter = new MusicSourceAdapter(onlineMusic);
	        MusicSourceAdapter radioAdapter = new MusicSourceAdapter(radio);

	        MusicPlayback simplePlayback = new SimplePlayback();
	        MusicPlayback advancedPlayback = new AdvancedPlayback();

	        System.out.println("Simple Playback:");
	        simplePlayback.playMusic(localAdapter);
	        simplePlayback.playMusic(onlineAdapter);
	        simplePlayback.playMusic(radioAdapter);

	        System.out.println("\nAdvanced Playback:");
	        advancedPlayback.playMusic(localAdapter);
	        advancedPlayback.playMusic(onlineAdapter);
	        advancedPlayback.playMusic(radioAdapter);

	        MusicSource decoratedMusic = new EqualizerDecorator(new VolumeControlDecorator(localMusic));
	        System.out.println("\nDecorated Playback:");
	        decoratedMusic.play();
	}

}
