package interfacePackage;

public interface InterfaceB {
	default public String something1(){
		return "InterfaceB";
	}
	static void something2() {
		System.out.println("static method in iterface...");
	}
}
