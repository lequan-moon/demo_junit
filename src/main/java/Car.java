
public class Car {
	private String model;
	
	public Car(String model){
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String goLeft(){
		return "Go left";
	}
	public String goRight(){
		return "Go right";
	}
	public String goBackward(){
		return "Go back";
	}
	public String goForward(){
		return "Go forward";
	}
}
