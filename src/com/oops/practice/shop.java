package com.oops.practice;
class payment {
	public void pay() {
	System.out.println("make payement");
}
}

class upi extends payment{
	@Override
	public void pay() {
		System.out.println("Payment through UPI");
	}	
	
}
class card extends payment{
	@Override
	public void pay() {
		System.out.println("payment through card");
	}
}
class cash extends payment{
	@Override
	public void pay() {
		System.out.println("payment through cash");
	}
}
class PaymentService {
    public void processPayment(payment p) {
        p.pay();
    }
}
public class shop {
	public static void main(String args[]) {
		PaymentService service = new PaymentService();

		service.processPayment(new upi());
	    service.processPayment(new card());
	    service.processPayment(new cash());
		
	}

}
