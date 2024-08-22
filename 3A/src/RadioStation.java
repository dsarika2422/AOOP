
public class RadioStation implements MusicSource {
	private String stationName;

    public RadioStation(String stationName) {
        this.stationName = stationName;
    }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing radio station: " + stationName);
	}

}
