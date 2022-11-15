package week3.day3Assignments;

public class Automation extends MutipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		Automation at=new Automation();
		at.java();
		at.selenium();
		at.ruby();
		at.python();
	}

	public void selenium() {
		System.out.println("This is Selenium method implemented in Automation class");
		
	}

	public void java() {
		System.out.println("This is Java method implemented in Automation class");
		
	}

	@Override
	public void ruby() {
		System.out.println("This is Ruby method implemented in Automation class");
		
	}

}
