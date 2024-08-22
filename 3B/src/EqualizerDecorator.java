
public class EqualizerDecorator extends MusicDecorator {

	public EqualizerDecorator(MusicSource musicSource) {
		super(musicSource);
		// TODO Auto-generated constructor stub
	}
	public void play() {
        super.play();
        setEqualizer();
    }

    private void setEqualizer() {
        System.out.println("Applying equalizer settings.");
    }
}
