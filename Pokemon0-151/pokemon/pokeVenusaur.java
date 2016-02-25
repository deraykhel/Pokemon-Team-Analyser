package pokemon;

public class pokeVenusaur extends Pokemon{
private String [] Venusaurstats={"Venusaur", "80", "82", "83", "100", "100", "80", "grass", "poison"};
	
	public pokeVenusaur(String [] Venusaurstats){
		super(Venusaurstats);
		list.add(Venusaur);
	}
	Pokemon Venusaur=new Pokemon(Venusaurstats);
}
