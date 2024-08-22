package Auction;

public interface Subject {
	void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(String message);
}
