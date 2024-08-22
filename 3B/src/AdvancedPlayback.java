
public class AdvancedPlayback implements MusicPlayback {

	@Override
	public void playMusic(MusicSource source) {
		// TODO Auto-generated method stub
		System.out.println("Advanced playback features enabled.");
        source.play();
	}

}
