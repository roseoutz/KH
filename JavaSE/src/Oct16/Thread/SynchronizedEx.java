package Oct16.Thread;

class ATM implements Runnable{
	private long depositeMoney = 10000;
	public void run() {
		synchronized(this) {
			for(int i=0;i<10;i++) {
				try {
					Thread.sleep(100);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				if(getDepositeMoney() <=0)
					break;
				withDraw(500);
			}
		}
	}
	public void withDraw(long howmuch) {
		if(getDepositeMoney()>0) {
			depositeMoney-=howmuch;
			System.out.print(Thread.currentThread().getName()+"," );
			System.out.printf("DepositeMoney = : %d won, %n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.println("More DepositeMoney");
		}
			
		}
	public long getDepositeMoney() {
		return depositeMoney;
	}
}





public class SynchronizedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ATM atm = new ATM();
	Thread mom = new Thread(atm,"mom");
	Thread son = new Thread(atm,"Son");
	mom.start();
	son.start();
	}

}
