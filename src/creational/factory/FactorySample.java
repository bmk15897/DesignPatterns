package creational.factory;

public class FactorySample {
	public static SampleObject getFactorySampleObject(String objectType) {
		if (objectType=="type1") {
			return new Type1Object();
		} else if (objectType=="type2") {
			return new Type2Object();
		} else {
			return null;
		}
	}
}
