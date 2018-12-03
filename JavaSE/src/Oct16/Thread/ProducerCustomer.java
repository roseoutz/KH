package Oct16.Thread;

public class ProducerCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		Producer producer = new Producer(c);
		Thread tProducer = new Thread(producer);
		Customer customer = new Customer(c);
		Thread tCustomer = new Thread(customer);
		tProducer.start();
		tCustomer.start();

	}

}
