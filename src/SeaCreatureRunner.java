
public class SeaCreatureRunner {
	
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("spongebob");
		SeaCreature patrick = new SeaCreature("patrick");
		SeaCreature squidward = new SeaCreature("squidward");
		action(spongebob);
		action(patrick);
		action(squidward);
		
	}
	
	static void action(SeaCreature creature) {
		System.out.println(creature.getName());
		creature.eat();
		creature.laugh();
		
	}
}
