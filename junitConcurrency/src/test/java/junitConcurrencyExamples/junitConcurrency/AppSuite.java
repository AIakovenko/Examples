/**
 * 
 */
package junitConcurrencyExamples.junitConcurrency;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.mycila.junit.concurrent.ConcurrentSuiteRunner;

/**
 * Jul 18, 2016
 * @author Alex Iakovenko
 * @email aleks.iakovenko@gmail.com
 */
@RunWith(ConcurrentSuiteRunner.class)
@SuiteClasses({ AppTest.class })
public class AppSuite {

}
