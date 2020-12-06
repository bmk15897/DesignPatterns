package creational.singleton;

public class SingletonPatternPSVM {

	public static void main(String[] args) {
		SingletonPatternSample instance = SingletonPatternSample.getInstance();
		System.out.println(instance);
		SingletonPatternSample anotherInstance = SingletonPatternSample.getInstance();
		System.out.println(anotherInstance);
		if(instance==anotherInstance) {
			System.out.println("Both instances are the same.");
		}
	}
}
