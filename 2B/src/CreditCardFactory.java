
public class CreditCardFactory extends PaymentFactory{

	@Override
	public PaymentMethod createPaymentMethod() {
		// TODO Auto-generated method stub
		return new CreditCard();
	}

}
