/**
 * 
 */
package junitConcurrencyExamples.junitConcurrency;

import java.util.Random;

/**
 * Jul 18, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
public class Runner implements Runnable{
	private int counter;
	private Random rnd = new Random();
	public void run() {
		while(true){
			try{
				Thread.sleep(rnd.nextInt(10) * 1_000);
				System.out.println("Thread:" + Thread.currentThread().getName() +": "+ counter++);
			} catch (InterruptedException e){
				throw new RuntimeException(e.getMessage());
			}
		}
		
	}

}
