package pokemon;

public class pokeBlastoise extends Pokemon{
private String [] Blastoisestats={"Blastoise", "79", "83", "100", "85", "105", "78", "water", null};
	
	public pokeBlastoise(String [] Blastoisestats){
		super(Blastoisestats);
		list.add(Blastoise);
	}
	Pokemon Blastoise=new Pokemon(Blastoisestats);
}
