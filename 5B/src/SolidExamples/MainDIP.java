package SolidExamples;

public class MainDIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageService emailService = new EmailService();
        MyApplication app1 = new MyApplication(emailService);
        app1.processMessage("Hello via Email!");

        MessageService smsService = new SMSService();
        MyApplication app2 = new MyApplication(smsService);
        app2.processMessage("Hello via SMS!");
	}

}
