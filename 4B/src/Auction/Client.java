package Auction;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auction auction = new Auction("Antique Vase");

        // Create bidders
        Bidder bidder1 = new Bidder("kavs");
        Bidder bidder2 = new Bidder("ravi");

        // Subscribe bidders to auction
        auction.subscribe(bidder1);
        auction.subscribe(bidder2);

        // Conduct a standard auction
        AuctionTemplate standardAuction = new StandardAuction(auction);
        standardAuction.conductAuction();

        // Conduct a reserve auction
        AuctionTemplate reserveAuction = new ReserveAuction(auction);
        reserveAuction.conductAuction();
	}

}
