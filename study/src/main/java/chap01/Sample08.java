package chap01;

class ComputerPart{};
class Graphics extends ComputerPart{};
class Memory extends ComputerPart{};
class Monitor{};
class Computer<T extends ComputerPart>{
	private T component;
	public void toInfo() {
		System.out.println(component.getClass().getName());
	}
	public Computer(T component) {
		this.component = component;
	}
	public Computer() {}
	
	public void setComponent(T component) {
		this.component = component;
	}
	
}
public class Sample08 {
	public static void main(String[] args) {
		Computer<ComputerPart> vga = new Computer<>();
		vga.setComponent(new Graphics());
		vga.toInfo();
//		vga.setComponent(new Monitor());
		vga.setComponent(new Memory());
		vga.toInfo();
	}
}
