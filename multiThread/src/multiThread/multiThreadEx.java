package multiThread;
/*
 * create thread: one, extends Thread class
 * 1. create subclass extend Thread class
 * 2. override Thread class run() method
 * 3. create object of Thread's subclass
 * 4. invoke start() by this object
 * example: iterate even number within 100
 */

//create subclass extend Thread class
class myThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<100; i++) {
			if(i%2==0) {
				System.out.println(Thread.currentThread().getName()+ ":"+ i);
			}
		}
	}
}

public class multiThreadEx{
	public static void main(String[] args) {
		myThread t1 = new myThread();
		//问题一：不能通过直接调用run（）方式启动线程
		//t1.run();
		//问题二：不能让已经start（）的线程去执行，报错：illegalThread
		t1.start();
		
		
		for(int i = 0; i<100; i++) {
			if(i%2==0) {
				System.out.println(Thread.currentThread().getName()+ ":"+ i+"main");
			}
		}
	}
}
