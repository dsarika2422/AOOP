package Auction;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
	private List<Observer> bidders = new ArrayList<>();
    private String itemName;

    public Auction(String itemName) {
        this.itemName = itemName;
    }

	@Override
	public void subscribe(Observer observer) {
		// TODO Auto-generated method stub
		 bidders.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		// TODO Auto-generated method stub
		bidders.remove(observer);
	}

	@Override
	public void notifyObservers(String message) {
		// TODO Auto-generated method stub
		for (Observer bidder : bidders) {
            bidder.update(message);
	}

}
	public void startBidding() {
        notifyObservers("Bidding started for item: " + itemName);
    }

    public void endBidding() {
        notifyObservers("Bidding ended for item: " + itemName);
    }

    public void itemAvailable() {
        notifyObservers("Item available for bidding: " + itemName);
    }
}
