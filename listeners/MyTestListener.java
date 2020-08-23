package listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IAnnotationTransformer3;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.IListenersAnnotation;
import org.testng.annotations.ITestAnnotation;

import cucumber.api.java.lu.an;

public class MyTestListener implements IRetryAnalyzer, IAnnotationTransformer{

	int retryTimes = 0;

	@Override
	public boolean retry(ITestResult result) {
		boolean success = result.isSuccess();
		if (!success && retryTimes < 2) {
			retryTimes++;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void transform(
			ITestAnnotation annotation,
			Class testClass,
			Constructor testConstructor, 
			Method testMethod) {

		annotation.setRetryAnalyzer(this.getClass());
		System.out.println(this.getClass().getName());
		System.out.println(testMethod.getName());
	}
}
