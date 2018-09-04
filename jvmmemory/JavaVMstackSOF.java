package jvm;

public class JavaVMstackSOF {
	private int i=0;
	void stackLeak() {
		i++;
		stackLeak();
	}
	public static void main(String[] args) {
		JavaVMstackSOF leak=new JavaVMstackSOF();
		try {
			leak.stackLeak();
		}catch(Throwable e) {
			System.out.println("stack length: "+leak.i);
			throw e;
		}
	}
}
