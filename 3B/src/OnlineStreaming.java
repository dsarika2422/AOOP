
public class OnlineStreaming implements MusicSource {
	private String url;

    public OnlineStreaming(String url) {
        this.url = url;
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Streaming music from: " + url);
	}

}
