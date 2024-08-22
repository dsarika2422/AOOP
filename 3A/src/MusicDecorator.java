
public abstract class MusicDecorator implements MusicSource  {
	protected MusicSource musicSource;

    public MusicDecorator(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void play() {
        musicSource.play();
    }
}
