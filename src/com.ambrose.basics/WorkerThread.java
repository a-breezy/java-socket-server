package com.ambrose.basics;


public class WorkerThread extends Thread  {		// EXTENDS core class java.lang.Thread

	private String id;
	
	private int count;
	
	private int wait;
	
	public WorkerThread() {
	   	
			// just for yucks give our thread an id, and a variable wait time
		double d = Math.random();
		
		id = Double.toString(d).substring(2,5);	// grab e.g. 717 from the double 0.7178473638etc
	
		wait = Integer.parseInt(id);	
	}
	
	@Override
    public void run() { 	// This overrides the run() method in class Thread. For reasons quite unclear, the start() method 
							// automagically fires up run()
   	
    	System.out.println("starting " + id);
    	
    	while (true) {
    		
    		++count;
    		
    		System.out.println("thread " + id + " " + count);
    		
	        try {
	        	Thread.sleep(wait);		//sleep is in milliseconds - so sleep(1000) would sleep for a second
	        }
	        catch (InterruptedException ie) {
	        	ie.printStackTrace();
	        } 
	        
	        if (count > 3)
	        	break;
    	}
    }
}
