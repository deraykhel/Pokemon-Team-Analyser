package pokemon;

public class pokeCharizard extends Pokemon{
	private static String [] CharizardstatsA={"Charizard", "78", "84", "78", "109", "85", "100", "fire", "flying"};
	
	Pokemon CharizardA=new pokeCharizard(CharizardstatsA);
	
	public pokeCharizard(String [] Charizardstats){
		super(CharizardstatsA);
		list.add(CharizardA);
	}
}
