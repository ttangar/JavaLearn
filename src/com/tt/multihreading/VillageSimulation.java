package com.tt.multihreading;

import java.util.concurrent.locks.ReentrantLock;

public class VillageSimulation {
	
	static class Village implements Runnable{
		private ReentrantLock bridgeLock = new ReentrantLock();
		private String threadName;
		
		public Village(ReentrantLock lock, String villageName){
			this.bridgeLock = lock;
			this.threadName = villageName;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=0; i< 5; i++){
				if(bridgeLock.tryLock()){
					try{
						Thread.sleep(10);
						System.out.println("Vehicle Number: "+i+" passing through Bridge from Village: "+threadName);
						bridgeLock.unlock();
						//notifyAll();
					}
					catch(InterruptedException e){
						System.out.println("Interrupt occurred!!");
					}	
				}
				else{
					synchronized(bridgeLock.getClass()){
						try {
					
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
					System.out.println("Waiting for bridge to be clear!!");
					
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantLock lock = new ReentrantLock();
		Thread t1 = new Thread(new Village(lock, "VillageEast"));
		Thread t2 = new Thread(new Village(lock, "VillageWest"));
		t1.start();
		t2.start();
	}

}
