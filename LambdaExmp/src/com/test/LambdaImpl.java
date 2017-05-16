package com.test;

public class LambdaImpl {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println(Thread.currentThread().getName());
			}
		};
	
		Thread t1 = new Thread(r);
		t1.start();
	
//		Runnable r2 = () -> { System.out.println("thread 2 is running"); };
//		
//		new Thread(r2).start();
	
	}
}
