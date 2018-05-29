
public class SmurfRunner {
	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy");
		Smurf papa = new Smurf("Papa");
		Smurf ette = new Smurf("Smurfette");
		action(handy);
		action(papa);
		action(ette);
		
	}
	
	static void action(Smurf smurf) {
		smurf.eat();
		System.out.println(smurf.getName());
		System.out.println(smurf.getHatColor());
		System.out.println(smurf.isGirlOrBoy());
	}
}
