
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSource localMusic = new LocalMusic("song.mp3");
        MusicSourceAdapter localAdapter = new MusicSourceAdapter(localMusic);
        localAdapter.play();

        // Online Streaming
        MusicSource onlineMusic = new OnlineStreaming("http://example.com/stream");
        MusicSourceAdapter onlineAdapter = new MusicSourceAdapter(onlineMusic);
        onlineAdapter.play();

        // Radio Station
        MusicSource radio = new RadioStation("Cool FM");
        MusicSourceAdapter radioAdapter = new MusicSourceAdapter(radio);
        radioAdapter.play();

        // Adding Decorators
        MusicSource decoratedMusic = new EqualizerDecorator(new VolumeControlDecorator(localMusic));
        decoratedMusic.play();
	}

}
