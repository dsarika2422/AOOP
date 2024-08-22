
public class LocalMusic implements MusicSource {
	private String filePath;

    public LocalMusic(String filePath) {
        this.filePath = filePath;
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing local music from: " + filePath);
	}

}
