
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleFactory vehicleFactory = new CarFactory();
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.ride();

        PaymentFactory paymentFactory = new CreditCardFactory();
        PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
        paymentMethod.pay();

        UserAuthentication auth = UserAuthentication.getInstance();
        auth.authenticate("user1", "password123");
	}

}
