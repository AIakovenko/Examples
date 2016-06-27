package example.velocity_examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App {
    public static void main( String[] args ) throws IOException{
    	System.out.println("===== Sample Html ====");
    	Sample sample = new SampleHtml();
    	SampleStrategy strategy = new SampleStrategy(sample);
    	String content = strategy.getContent();
        System.out.println(content);
        
        System.out.println("===== Sample Objects ====");
        sample = new SampleObject();
        strategy = new SampleStrategy(sample);
        content = strategy.getContent();
        System.out.println(content);
        Writer out = new FileWriter(new File("/home/alex/sampleObject.html"));
        out.write(content);
        out.close();
        
        System.out.println("===== Sample Objects using Properties====");
        sample = new SampleObject();
        strategy = new SampleStrategy(sample);
        content = strategy.getContent();
        System.out.println(content);
        out = new FileWriter(new File("/home/alex/sampleObjectProp.html"));
        out.write(content);
        out.close();
        
    }
}
