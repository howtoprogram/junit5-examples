package xyz.howtoprogram.junit5.timeout;

public class OrderService {

	public void doPayment() {
		try {
			Thread.sleep(10000);// 10 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void printShippingLabel() {
		try {
			Thread.sleep(20000);// 20 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
