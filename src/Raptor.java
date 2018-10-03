
public class Raptor {
	String Favoritemeal;
	String Home;
	
	void eat() {
		System.out.println("The raptor is getting hungry...");
		System.out.println("Nom Nom Nom, There go your toes.");
	}
	
	void run() {
		System.out.println("The raptor did a waddle");
	}
	Raptor(String Favoritemeal, String Home){
		this.Favoritemeal = Favoritemeal;
		this.Home = Home;
	}
}
