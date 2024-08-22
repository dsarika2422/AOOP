package Auction;

public class StandardAuction extends AuctionTemplate {
	private Auction auction;

    public StandardAuction(Auction auction) {
        this.auction = auction;
    }

	@Override
	protected void setupAuction() {
		// TODO Auto-generated method stub
		auction.itemAvailable();
	}

	@Override
	protected void startBidding() {
		// TODO Auto-generated method stub
		auction.startBidding();
	}

	@Override
	protected void endBidding() {
		// TODO Auto-generated method stub
		auction.endBidding();
	}

}
