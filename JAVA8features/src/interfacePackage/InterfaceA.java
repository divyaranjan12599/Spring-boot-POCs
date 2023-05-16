package interfacePackage;

@FunctionalInterface
public interface InterfaceA {
	void something() ;
	default public String something1(){
		return "InterfaceA";
	}
}
