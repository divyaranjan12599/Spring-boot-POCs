package interfacePackage;

public class Demo implements InterfaceA,InterfaceB{

	@Override
	public void something() {
		
	}

	//important
	@Override
	public String something1() {
		return InterfaceA.super.something1();
	}
	
}
