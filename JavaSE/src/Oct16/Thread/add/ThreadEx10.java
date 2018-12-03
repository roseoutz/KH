package Oct16.Thread.add;

public class ThreadEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ThreadGroup main = Thread.currentThread().getThreadGroup();
	ThreadGroup grp1 = new ThreadGroup("Group1");
	ThreadGroup grp2 = new ThreadGroup("Group2");
	
	ThreadGroup subgrp1 = new ThreadGroup(grp1,"SubGroup1");
	
	grp1.setMaxPriority(3);
	
	Thread th1 = new Thread(grp1, "th1");
	Thread th2 = new Thread(subgrp1 , "th2");
	Thread th3 = new Thread(grp2, "th3");
	
	th1.start();
	th2.start();
	th3.start();
	
	System.out.println(main.getName()+","+main.activeCount()+","+main.activeGroupCount());
	main.list();
	}

}
