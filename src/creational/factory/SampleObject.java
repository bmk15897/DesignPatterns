package creational.factory;

public abstract class SampleObject {
	
	private String type;
	
	public SampleObject() {
		this.createObject();
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public abstract void createObject();
}