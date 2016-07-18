package junitConcurrencyExamples.junitConcurrency;

/**
 * Hello world!
 *
 */
public class App {
    
	public static void main( String[] args ) throws Exception{
		System.out.println("Start");
		
		App app = new App();
    	app.kickStart("Tread 1");
    	app.kickStart("Tread 2");
    	
    	Thread.sleep(50_000);
    	System.out.println("Finish");
    }
    
    public void kickStart(String threadName) throws Exception{
    	
    	Thread t1 = new Thread(new Runner());
    	t1.setName(threadName);
    	t1.setDaemon(true);
    	t1.start();
    	
    }
}
