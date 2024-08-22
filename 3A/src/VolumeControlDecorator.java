
public class VolumeControlDecorator extends MusicDecorator {

	public VolumeControlDecorator(MusicSource musicSource) {
		super(musicSource);
		// TODO Auto-generated constructor stub
	}
	 public void play() {
	        super.play();
	        adjustVolume();
	    }

	    private void adjustVolume() {
	        System.out.println("Adjusting volume level.");
	    }
}
