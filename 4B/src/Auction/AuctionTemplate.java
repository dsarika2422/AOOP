package Auction;

public abstract class AuctionTemplate {
	public final void conductAuction() {
        setupAuction();
        startBidding();
        endBidding();
    }

    protected abstract void setupAuction();
    protected abstract void startBidding();
    protected abstract void endBidding();
}
