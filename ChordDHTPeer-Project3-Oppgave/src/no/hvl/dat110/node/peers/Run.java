package no.hvl.dat110.node.peers;

import no.hvl.dat110.middleware.NodeServer;

public class Run {

	public static void main(String[] args) {
		
		try {
			
			Thread p1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}     
					new NodeServer("process1", 9091); 
				}
				
			});
			
			Thread p2 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {}     
					new NodeServer("process2", 9092); 
				}
				
			});
			
			Thread p3 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {}     
					new NodeServer("process3", 9093);
				}
				
			});
			
			Thread p4 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {}     
					new NodeServer("process4", 9094);
				}
				
			});
			
			Thread p5 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {}     
					new NodeServer("process5", 9095); 
				}
				
			});
			
			p1.start();
			Thread.sleep(4000);
			p2.start();
			Thread.sleep(4000);
			p3.start();
			Thread.sleep(4000);
			p4.start();
			Thread.sleep(4000);
			p5.start();
			Thread.sleep(4000);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
