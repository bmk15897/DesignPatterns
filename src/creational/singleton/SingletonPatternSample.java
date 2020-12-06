/**
 * 
 */
package creational.singleton;

/**
 * @author Bharati Kulkarni
 *
 */
public class SingletonPatternSample {

	private static SingletonPatternSample instance = new SingletonPatternSample();
	
	private SingletonPatternSample() {}
	
	public static SingletonPatternSample getInstance() {
		return instance;
	}
}
