
public class MusicSourceAdapter implements MusicSource  {
	private MusicSource musicSource;

    public MusicSourceAdapter(MusicSource musicSource) {
        this.musicSource = musicSource;
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		 musicSource.play();
	}

}
