package creational.factory;

public class FactoryPSVM {
	public static void main(String[] args) {
		SampleObject type1Object = FactorySample.getFactorySampleObject("type1");
		SampleObject type2Object = FactorySample.getFactorySampleObject("type2");
		System.out.println(type1Object.getType());
		System.out.println(type2Object.getType());
	}
}
