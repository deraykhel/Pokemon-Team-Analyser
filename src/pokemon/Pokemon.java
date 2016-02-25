package pokemon;

import java.util.ArrayList;

public class Pokemon {
	private String [] stats=new String [9];
	public ArrayList <Pokemon> list=new ArrayList<Pokemon>();
	public Pokemon(String [] S){
			for (int counter=0; counter<9; counter++){
				stats[counter]=S[counter];
			}
	}
	
	public Pokemon(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
			stats[0]=string; stats[1]=string2; stats[2]=string3; stats[3]=string4; stats[4]=string5; stats[5]=string6; stats[6]=string7; stats[7]=string8; stats[8]=string9;
	}

	public void setup(){ //http://bulbapedia.bulbagarden.net/wiki/List_of_Pok%C3%A9mon_by_base_stats_(Generation_VI-present)
		Pokemon blank=new Pokemon(" ","0","0","0","0","0","0","0","0"); list.add(blank);
		Pokemon Abomasnow=new Pokemon("Abomasnow", "90", "92", "75", "92", "85", "60", "grass", "ice"); list.add(Abomasnow);
		Pokemon MegaAbomasnow=new Pokemon("Abomasnow-M", "90", "132","105","132","105","30", "grass","ice");
		Pokemon Abra=new Pokemon("Abra", "25", "20", "15", "105", "55", "90", "psychic", null); list.add(Abra);
		Pokemon Absol=new Pokemon("Absol", "65", "130", "60", "75", "60", "75", "dark", null); list.add(Absol);
		Pokemon MegaAbsol=new Pokemon("Absol-M", "65", "150", "60", "115", "60", "115", "dark", null); 
		Pokemon Accelgor=new Pokemon("Accelgor", "80", "70", "40", "100", "60","145", "bug", null); list.add(Accelgor);
		Pokemon AegislashBlade=new Pokemon("Aegislash [Blade]", "60", "150", "50", "150", "50", "60", "ghost", "steel"); //list.add(AegislashBlade);
		Pokemon Aegislash=new Pokemon("Aegislash", "60", "50", "150", "50", "150", "60", "ghost", "steel"); list.add(Aegislash);
		Pokemon Aerodactyl=new Pokemon("Aerodactyl", "80", "105", "65", "60", "75", "130", "flying", "rock"); list.add(Aerodactyl);
		Pokemon MegaAerodactyl=new Pokemon("Aerodactyl-M","80","135", "85","70","95","150", "flying", "rock");
		Pokemon Aggron=new Pokemon("Aggron", "70", "110","180","60", "60", "50", "rock", "steel"); list.add(Aggron);
		Pokemon MegaAggron=new Pokemon("Aggron-M", "70", "140","230","60", "80", "50", "rock", "steel");
		Pokemon Aipom=new Pokemon("Aipom", "55","70","55","40","55","85","normal",null); list.add(Aipom);
		Pokemon Alakazam=new Pokemon("Alakazam", "55", "50", "45", "135", "95", "120", "psychic",null); list.add(Alakazam);
		Pokemon MegaAlakazam=new Pokemon("Alakazam-M", "55", "50", "65", "175","95","150", "psychic", null);
		Pokemon Alomomola=new Pokemon ("Alomomola", "165", "75", "80", "40", "45", "65", "water", null); list.add(Alomomola);
		Pokemon Altaria=new Pokemon("Altaria","75","70","90","70","105","80","flying","dragon"); list.add(Altaria);
		
		Pokemon Amaura=new Pokemon("Amaura","77","59","50","67","63","46","ice","rock"); list.add(Amaura);
		Pokemon Ambipom=new Pokemon("Ambipom", "75","100","66","60","66","115","normal",null); list.add(Ambipom);
		Pokemon Amoonguss=new Pokemon("Amoonguss", "114", "85", "70", "85", "80", "30", "grass","poison"); list.add(Amoonguss);
		Pokemon Ampharos=new Pokemon ("Ampharos", "90", "75", "85", "115","90","55","electric",null); list.add(Ampharos);
		Pokemon MegaAmpharos=new Pokemon ("Ampharos-M", "90", "95", "105", "165","110","55","electric",null);
		Pokemon Anorith=new Pokemon ("Anorith","45","95","50", "40", "50", "75","rock","bug"); list.add(Anorith);
		Pokemon Arbok=new Pokemon ("Arbok", "60", "85", "69", "65", "79", "80", "poison", null); list.add(Arbok);
		Pokemon Arcanine=new Pokemon ("Arcanine", "90", "110", "80", "100", "80", "95", "fire", null); list.add(Arcanine);
		Pokemon Arceus=new Pokemon("Arceus", "120", "120", "120","120","120","120","normal",null);list.add(Arceus);
		Pokemon Archen=new Pokemon ("Archen", "55" ,"112", "45", "74", "45" ,"70", "rock","flying"); list.add(Archen);
		Pokemon Archeops=new Pokemon ("Archeops", "75", "140", "65", "112", "65", "110", "rock", "flying"); list.add(Archeops);
		Pokemon Ariados=new Pokemon("Ariados", "70", "90", "70", "60", "60", "40", "bug", "posion"); list.add(Ariados);
		Pokemon Armaldo=new Pokemon ("Armaldo","75", "125", "100" ,"70"	,"80", "45", "rock", "bug" ); list.add(Armaldo);
		Pokemon Aromatisse=new Pokemon ("Aromatisse", "101", "72", "72", "99", "89", "29", "fairy", null); list.add(Aromatisse);
		Pokemon Aron=new Pokemon("Aron","50","70","100","40","40","30","rock","steel"); list.add(Aron);
		Pokemon Articuno=new Pokemon("Articuno","90","85","100","95","125","85","flying","ice"); list.add(Articuno);
		Pokemon Audino=new Pokemon("Audino","103","60","86","60","86","50","fairy","normal"); list.add(Audino);
		
		Pokemon Aurorus=new Pokemon("Aurorus","123","77","72","99","92","58","rock","ice"); list.add(Aurorus);
		Pokemon Avalugg=new Pokemon("Avalugg","95","117","184","44","46","28","ice",null); list.add(Avalugg);
		Pokemon Axew=new Pokemon ("Axew","46","87","60","30","40","57","dragon",null); list.add(Axew);
		Pokemon Azelf=new Pokemon ("Azelf", "75", "125", "70", "125", "70", "115", "psychic", null); list.add(Azelf);
		Pokemon Azumarill=new Pokemon ("Azumarill", "100", "50", "80", "60", "80", "50", "water", "fairy"); list.add(Azumarill);
		Pokemon Azurill=new Pokemon ("Azurill", "50", "20", "40", "20", "40", "20", "normal", "fairy"); list.add(Azurill);
		Pokemon Bagon= new Pokemon ("Bagon", "45", "75", "60", "40", "30", "50", "dragon", null); list.add(Bagon);
		Pokemon Baltoy=new Pokemon ("Baltoy", "40", "40", "55", "40", "70", "55", "ground", "psychic"); list.add(Baltoy);
		Pokemon Banette=new Pokemon ("Banette", "64", "115", "65", "83", "63", "65", "ghost", null); list.add(Banette);
		Pokemon MegaBanette=new Pokemon ("Banette-M", "64", "165", "75", "93", "83", "75", "ghost", null);
		Pokemon Barbaracle=new Pokemon("Barbaracle", "72", "105", "115", "54", "86", "68", "water", "rock"); list.add(Barbaracle);
		Pokemon Barboach=new Pokemon("Barboach", "50", "48", "43", "46", "41", "60", "water", "ground"); list.add(Barboach);
		Pokemon Basculin=new Pokemon("Basculin", "70", "92", "65", "80", "55", "98", "water", null); list.add(Basculin);
		Pokemon Bastiodon=new Pokemon("Bastiodon", "60", "52", "168", "47", "138", "30", "rock", "steel"); list.add(Bastiodon);
		Pokemon Bayleef=new Pokemon("Bayleef", "60", "62", "80", "63", "80", "60", "grass", null); list.add(Bayleef);
		Pokemon Beartic=new Pokemon("Beartic", "95", "110", "80", "70", "80", "50", "ice", null); list.add(Beartic);
		Pokemon Beautifly=new Pokemon("Beautifly", "60", "70", "50", "100", "50", "65", "bug", "flying"); list.add(Beautifly);
		Pokemon Beedrill=new Pokemon("Beedrill", "65", "90", "40", "45", "80", "75", "bug", "poison"); list.add(Beedrill);
		
		Pokemon Beheeyem=new Pokemon("Beheeyem", "75", "75", "75", "125", "95", "40", "psychic", null); list.add(Beheeyem);
		Pokemon Beldum=new Pokemon("Beldum", "40", "55", "80", "35", "60", "30", "steel", "psychic"); list.add(Beldum);
		Pokemon Bellossom=new Pokemon("Bellossom", "75", "80", "95", "90", "100", "50", "grass", null); list.add(Bellossom);
		Pokemon Bellsprout=new Pokemon("Bellsprout", "50", "75", "35", "70", "30", "40", "grass", "poison"); list.add(Bellsprout);
		Pokemon Bergmite=new Pokemon("Bergmite", "55", "69", "85", "32", "35", "28", "ice", null); list.add(Bergmite);
		Pokemon Bibarel=new Pokemon("Bibarel", "79", "85", "60", "55", "60", "71", "water", "normal"); list.add(Bibarel);
		Pokemon Bidoof=new Pokemon("Bidoof", "59", "45", "40", "35", "40", "31", "normal", null); list.add(Bidoof);
		Pokemon Binacle=new Pokemon("Binacle", "42", "52", "67", "39", "40", "31", "water", "rock"); list.add(Binacle);
		Pokemon Bisharp=new Pokemon("Bisharp", "65", "125", "100", "60", "70", "70", "dark", "steel"); list.add(Bisharp);
		Pokemon Blastoise=new Pokemon("Blastoise", "79", "83", "100", "85", "105", "78", "water", null); list.add(Blastoise);
		
		Pokemon Blaziken=new Pokemon("Blaziken", "80", "120", "70", "110", "70", "80", "fire", "fighting"); list.add(Blaziken);
		
		Pokemon Blissey=new Pokemon("Blissey", "225", "10", "10", "75", "135", "55", "normal", null); list.add(Blissey);
		Pokemon Blitzle=new Pokemon("Blitzle", "45", "60", "32", "50", "32", "76", "electric", null); list.add(Blitzle);
		Pokemon Boldore=new Pokemon("Boldore", "70", "105", "105", "50", "40", "20", "rock", "ground"); list.add(Boldore);
		Pokemon Bonsly=new Pokemon("Bonsly", "50", "80", "95", "10", "45", "10", "rock", null); list.add(Bonsly);
		Pokemon Bouffalant=new Pokemon("Bouffalant", "95", "110", "95", "40", "95", "55", "normal", null); list.add(Bouffalant);
		Pokemon Braixen=new Pokemon("Braixen", "59", "59", "58", "90", "70", "73", "fire", null); list.add(Braixen);
		Pokemon Braviary=new Pokemon("Braviary", "100", "123", "75", "57", "75", "80", "flying", "normal"); list.add(Braviary);
		Pokemon Breloom=new Pokemon("Breloom", "60", "130", "80", "60", "60", "70", "glass", "fighting"); list.add(Breloom);
		Pokemon Bronzong=new Pokemon("Bronzong", "67", "89", "116", "79", "116", "33", "steel", "psychic"); list.add(Bronzong);
		Pokemon Bronzor=new Pokemon("Bronzor", "57", "24", "86", "24", "86", "23", "steel", "psychic"); list.add(Bronzor);
		Pokemon Budew=new Pokemon("Budew", "40", "30", "35", "50", "70", "55", "grass", "psychic"); list.add(Budew);
		Pokemon Buizel=new Pokemon("Buizel", "55", "65", "35", "60", "30", "85", "water", null); list.add(Buizel);
		Pokemon Bulbasaur=new Pokemon("Bulbasaur", "45", "49", "49", "65", "65", "45", "grass", "poison"); list.add(Bulbasaur);
		Pokemon Buneary=new Pokemon("Buneary", "55", "66", "44", "44", "56", "85", "normal", null); list.add(Buneary);
		Pokemon Bunnelby=new Pokemon("Bunnelby", "38", "36", "38", "32", "36", "57", "normal", null); list.add(Bunnelby);
		Pokemon Burmy=new Pokemon("Burmy", "40", "29", "45", "29", "45", "36", "bug", null); list.add(Burmy);
		Pokemon Butterfree=new Pokemon("Butterfree", "60", "45", "50", "90", "80", "70", "bug", "flying"); list.add(Butterfree);
		Pokemon Cacnea=new Pokemon("Cacnea", "50", "85", "40", "85", "40", "35", "grass", null); list.add(Cacnea);
		Pokemon Cacturne=new Pokemon("Cacturne", "70", "115", "60", "115", "60", "55", "grass", "dark"); list.add(Cacturne);
		Pokemon Camerupt=new Pokemon("Camerupt", "70", "100", "70", "105", "75", "40", "fire", "ground"); list.add(Camerupt);
		
		Pokemon Carbink=new Pokemon("Carbink", "50", "50", "150", "50", "150", "5-", "rock", "fairy"); list.add(Carbink);
		Pokemon Carnivine=new Pokemon("Carnivine", "74", "100", "72", "90", "72", "46", "grass", null); list.add(Carnivine);
		Pokemon Carracosta=new Pokemon("Carracosta", "74", "108", "133", "83", "65", "32", "water", "rock"); list.add(Carracosta);
		Pokemon Carvanha=new Pokemon("Carvanha", "45", "90", "20", "65", "20", "65", "water", "dark"); list.add(Carvanha);
		Pokemon Cascoon=new Pokemon("Cascoon", "50", "35", "55", "25", "25", "15", "bug", null); list.add(Cascoon);
		Pokemon Castform=new Pokemon("Castform", "70", "70", "70", "70", "70", "70", "normal", null); list.add(Castform);
		Pokemon Caterpie=new Pokemon("Caterpie", "45", "30", "35", "20", "20", "45", "bug", null); list.add(Caterpie);
		Pokemon Celebi=new Pokemon("Celebi", "100", "100", "100", "100", "100", "100", "grass", "psychic"); list.add(Celebi);
		Pokemon Chandelure=new Pokemon("Chandelure", "60", "55", "90", "145", "90", "80", "ghost", "fire"); list.add(Chandelure);
		Pokemon Chansey=new Pokemon("Chansey", "250", "5", "5", "35", "105", "50", "normal", null); list.add(Chansey);
		Pokemon Charizard=new Pokemon("Charizard", "78", "84", "78", "109", "85", "100", "fire", "flying"); list.add(Charizard);
		
		
		Pokemon Charmander=new Pokemon("Charmander", "39", "52", "43", "60", "50", "65", "fire", null); list.add(Charmander);
		Pokemon Charmeleon=new Pokemon("Charmeleon", "58", "64", "58", "80", "65", "80", "fire", null); list.add(Charmeleon);
		Pokemon Chatot=new Pokemon("Chatot", "76", "65", "45", "92", "42", "91", "flying", "normal"); list.add(Chatot);
		Pokemon Cherrim=new Pokemon("Cherrim", "70", "60", "70", "87", "78", "42", "grass", null); list.add(Cherrim);
		Pokemon Cherubi=new Pokemon("Cherubi", "45", "35", "45", "62", "53", "35", "grass", null); list.add(Cherubi);
		Pokemon Chesnaught=new Pokemon("Chesnaught", "88", "107", "122", "74", "75", "64", "grass", "fighting"); list.add(Chesnaught);
		Pokemon Chespin=new Pokemon("Chespin", "56", "61", "65", "48", "45", "38", "grass", null); list.add(Chespin);
		Pokemon Chikorita=new Pokemon("Chikorita", "45", "49", "65", "49", "65", "45", "grass", null); list.add(Chikorita);
		Pokemon Chimchar=new Pokemon("Chimchar", "44", "58", "44", "58", "44", "61", "fire", null); list.add(Chimchar);
		Pokemon Chimecho=new Pokemon("Chimecho", "65", "50", "70", "95", "80", "65", "psychic", null); list.add(Chimecho);
		Pokemon Chinchou=new Pokemon("Chinchou", "75", "38", "38", "56", "56", "67", "water", "electric"); list.add(Chinchou);
		Pokemon Chingling=new Pokemon("Chingling", "45", "30", "50", "65", "50", "45", "psychic", null); list.add(Chingling);
		Pokemon Cinccino=new Pokemon("Cinccino", "75", "95", "60", "65", "60", "115", "normal", null); list.add(Cinccino);
		Pokemon Clamperl=new Pokemon("Clamperl", "35", "64", "85", "74", "55", "32", "water", null); list.add(Clamperl);
		Pokemon Clauncher=new Pokemon("Clauncher", "50", "53", "62", "58", "63", "44", "water", null); list.add(Clauncher);
		Pokemon Clawitzer=new Pokemon("Clawitzer", "71", "73", "88", "120", "89", "59", "water", null); list.add(Clawitzer);
		Pokemon Claydol=new Pokemon("Claydol", "60", "70", "105", "70", "120", "75", "psychic", "ground"); list.add(Claydol);
		Pokemon Clefable=new Pokemon("Clefable", "95", "70", "73", "95", "90", "60", "fairy", null); list.add(Clefable);
		Pokemon Clefairy=new Pokemon("Clefairy", "70", "45", "48", "60", "65", "35", "fairy", null); list.add(Clefairy);
		Pokemon Cleffa=new Pokemon("Cleffa", "50", "25", "28", "45", "55", "15", "fairy", null); list.add(Cleffa);
		Pokemon Cloyster=new Pokemon("Cloyster", "50", "95", "180", "85", "45", "70", "ice", "water"); list.add(Cloyster);
		Pokemon Cobalion=new Pokemon("Cobalion", "91", "90", "129", "90", "72", "108", "steel", "fighting"); list.add(Cobalion);
		Pokemon Cofagrigus=new Pokemon("Cofagrigus", "58", "50", "145", "95", "105", "30", "ghost", null); list.add(Cofagrigus);
		Pokemon Combee=new Pokemon("Combee", "30", "30", "42", "30", "42", "7-", "bug", "flying"); list.add(Combee);
		Pokemon Combusken=new Pokemon("Combusken", "60", "85", "60", "85", "60", "55", "fire", "fighting"); list.add(Combusken);
		Pokemon Conkeldurr=new Pokemon("Conkeldurr", "105", "140", "95", "55", "65", "45", "fighting", null); list.add(Conkeldurr);
		Pokemon Corphish=new Pokemon("Corphish", "43", "80", "65", "50", "35", "35", "water", null); list.add(Corphish);
		Pokemon Corsola=new Pokemon("Corsola", "55", "55", "85", "65", "85", "35", "water", "rock"); list.add(Corsola);
		Pokemon Cottonee=new Pokemon("Cottonee", "40", "27", "60", "37", "50", "66", "grass", "fairy"); list.add(Cottonee);
		Pokemon Cradily=new Pokemon("Cradily", "86", "81", "97", "81", "107", "43", "grass", "rock"); list.add(Cradily);
		Pokemon Cranidos=new Pokemon("Cranidos", "67", "125", "40", "30", "30", "58", "rock", null); list.add(Cranidos);
		Pokemon Crawdaunt=new Pokemon("Crawdaunt", "63", "120", "85", "90", "55", "55", "water", "dark"); list.add(Crawdaunt);
		Pokemon Cresselia=new Pokemon("Cresselia", "120", "70", "120", "75", "130", "85", "psychic", null); list.add(Cresselia);
		Pokemon Croagunk=new Pokemon("Croagunk", "48", "61", "40", "61", "40", "50", "fighting", "poison"); list.add(Croagunk);
		Pokemon Crobat=new Pokemon("Crobat", "85", "90", "80", "70", "80", "130", "flying", "poison"); list.add(Crobat);
		Pokemon Croconaw=new Pokemon("Croconaw", "65", "80", "80", "59", "63", "58", "water", null); list.add(Croconaw);
		Pokemon Crustle=new Pokemon("Crustle", "70", "95", "125", "65", "75", "45", "bug", "rock"); list.add(Crustle);
		Pokemon Cryogonal=new Pokemon("Cryogonal", "70", "50", "30", "95", "135", "105", "ice", null); list.add(Cryogonal);
		Pokemon Cubchoo=new Pokemon("Cubchoo", "55", "70", "40", "60", "40", "40", "ice", null); list.add(Cubchoo);
		Pokemon Cubone=new Pokemon("Cubone", "50", "50", "95", "40", "50", "35", "ground", null); list.add(Cubone);
		Pokemon Cyndaquil=new Pokemon("Cyndaquil", "39", "52", "43", "60", "50", "65", "fire", null); list.add(Cyndaquil);
		Pokemon Darkrai=new Pokemon("Darkrai", "70", "90", "90", "135", "90", "125", "dark", null); list.add(Darkrai);
		Pokemon Darmanitan=new Pokemon("Darmanitan", "105", "140", "55", "30", "55", "95", "fire", null); list.add(Darmanitan);
		Pokemon Darumaka=new Pokemon("Darumaka", "70", "90", "45", "15", "45", "50", "fire", null); list.add(Darumaka);
		Pokemon Dedenne=new Pokemon("Dedenne", "67", "58", "57", "81", "67", "101", "eletric", "fairy"); list.add(Dedenne);
		Pokemon Deerling=new Pokemon("Deerling", "60", "60", "50", "40", "50", "75", "grass", "normal"); list.add(Deerling);
		Pokemon Deino=new Pokemon("Deino", "52", "65", "50", "45", "50", "38", "dragon", "dark"); list.add(Deino);
		Pokemon Delcatty=new Pokemon("Delcatty", "70", "65", "65", "55", "55", "70", "normal", null); list.add(Delcatty);
		Pokemon Delibird=new Pokemon("Delibird", "45", "55", "45", "65", "45", "75", "ice", "flying"); list.add(Delibird);
		Pokemon Delphox=new Pokemon("Delphox", "75", "69", "72", "114", "100", "104", "fire", "psychic"); list.add(Delphox);
		Pokemon DeoxysA=new Pokemon("Deoxys-Attack", "50", "180", "20", "180", "20", "150", "psychic", null); list.add(DeoxysA);
		Pokemon DeoxysD=new Pokemon("Deoxys-Defense", "50", "70", "160", "70", "160","90", "psychic", null); list.add(DeoxysD);
		Pokemon DeoxysN=new Pokemon("Deoxys", "50", "150", "50", "150", "50", "150", "psychic", null); list.add(DeoxysN);
		Pokemon DeoxysS=new Pokemon("Deoxys-Speed", "50", "95", "90", "95", "90", "180", "psychic", null); list.add(DeoxysS);			
		Pokemon Dewgong=new Pokemon("Dewgong", "90", "70", "80", "70", "95", "70", "ice", "water"); list.add(Dewgong);
		Pokemon Dewott=new Pokemon("Dewott", "75", "75", "60", "83", "60", "60", "water", null); list.add(Dewott);
		Pokemon Dialga=new Pokemon("Dialga", "100", "120", "120", "150", "100", "90", "dragon", "steel"); list.add(Dialga);
		Pokemon Diancie=new Pokemon("Diancie", "50", "100", "150", "100", "150", "50", "rock", "fairy"); list.add(Diancie);
		
		Pokemon Diggersby=new Pokemon("Diggersby", "85", "56", "77", "50", "77", "78", "normal", "ground"); list.add(Diggersby);
		Pokemon Diglett=new Pokemon("Diglett", "10", "55", "25", "35", "45", "95", "ground", null); list.add(Diglett);
		Pokemon Ditto=new Pokemon("Ditto", "48", "48", "48", "48", "48", "48", "normal", null); list.add(Ditto);
		Pokemon Dodrio=new Pokemon("Dodrio", "60", "110", "70", "60", "60", "100", "flying", "normal"); list.add(Dodrio);
		Pokemon Doduo=new Pokemon("Duduo", "35", "85", "45", "35", "35", "75", "flying", "normal"); list.add(Doduo);
		Pokemon Donphan=new Pokemon("Donphan", "90", "120", "120", "60", "60", "50", "ground", null); list.add(Donphan);
		Pokemon Doublade=new Pokemon("Doublade", "59", "110", "150", "45", "49", "35", "ghost", "steel"); list.add(Doublade);
		Pokemon Dragalge=new Pokemon("Dragalge", "65", "75", "90", "97", "123", "44", "dragon", "poison"); list.add(Dragalge);
		Pokemon Dragonair=new Pokemon("Dragonair", "61", "84", "65", "70", "70", "70", "dragon", null); list.add(Dragonair);
		Pokemon Dragonite=new Pokemon("Dragonite", "91", "134", "95", "100", "100", "80", "dragon", "flying"); list.add(Dragonite);
		Pokemon Drapion=new Pokemon("Drapion", "70", "90", "110", "60", "75", "95", "poison", "dark"); list.add(Drapion);
		Pokemon Dratini=new Pokemon("Dratini", "41", "64", "45", "50", "50", "50", "dragon", null); list.add(Dratini);
		Pokemon Drifblim=new Pokemon("Drifblim", "150", "80", "44", "90", "54", "80", "ghost", "flying"); list.add(Drifblim);
		Pokemon Drifloon=new Pokemon("Drifloon", "90", "50", "35", "60", "44", "70", "ghost", "flying"); list.add(Drifloon);
		Pokemon Drilbur=new Pokemon("Drilbur", "60", "85", "40", "30", "45", "68", "ground", null); list.add(Drilbur);
		Pokemon Drowzee=new Pokemon("Drowzee", "60", "48", "45", "43", "90", "42", "psychic", null); list.add(Drowzee);
		Pokemon Druddigon=new Pokemon("Druddigon", "77", "120", "90", "60", "90", "48", "dragon", null); list.add(Druddigon);
		Pokemon Ducklett=new Pokemon("Ducklett", "62", "44", "50", "44", "50", "55", "flying", "water"); list.add(Ducklett);
		Pokemon Dugtrio=new Pokemon("Dugtrio", "35", "80", "50", "50", "70", "120", "ground", null); list.add(Dugtrio);
		Pokemon Dunsparce=new Pokemon("Dunsparce", "100", "70", "70", "65", "65", "45", "normal", null); list.add(Dunsparce);
		Pokemon Duosion=new Pokemon("Duosion", "65", "40", "50", "125", "60", "30", "psychic", null); list.add(Duosion);
		Pokemon Durant=new Pokemon("Durant", "58", "109", "112", "48", "48", "109", "bug", "steel"); list.add(Durant);
		Pokemon Dusclops=new Pokemon("Dusclops", "40", "70", "130", "60", "130", "25", "ghost", null); list.add(Dusclops);
		Pokemon Dusknoir=new Pokemon("Dusknoir", "45", "100", "135", "65", "135", "45", "ghost", null); list.add(Dusknoir);
		Pokemon Duskull=new Pokemon("Duskull", "20", "40", "90", "30", "90", "25", "ghost", null); list.add(Duskull);
		Pokemon Dustox=new Pokemon("Dustox", "60", "50", "70", "50", "90", "65", "bug", "poison"); list.add(Dustox);
		Pokemon Dwebble=new Pokemon("Dwebble", "50", "65", "85", "35", "35", "55", "bug", "rock"); list.add(Dwebble);
		Pokemon Eelektrik=new Pokemon("Eelektrik", "65", "85", "70", "75", "70", "40", "electric", null); list.add(Eelektrik);
		Pokemon Eelektross=new Pokemon("Eelektross", "85", "115", "80", "105", "80", "50", "electric", null); list.add(Eelektross);
		Pokemon Eevee=new Pokemon("Eevee", "55", "55", "50", "45", "65", "55", "normal", null); list.add(Eevee);
		Pokemon Ekans=new Pokemon("Ekans", "35", "60", "44", "40", "54", "55", "poison", null); list.add(Ekans);
		Pokemon Electabuzz=new Pokemon("Electabuzz", "65", "83", "57", "95", "85", "105", "electric", null); list.add(Electabuzz);
		Pokemon Electivire=new Pokemon("Electivire", "75", "123", "67", "95", "85", "95", "electric", null); list.add(Electivire);
		Pokemon Electrike=new Pokemon("Electrike", "40", "45", "40", "65", "40", "65", "elctric", null); list.add(Electrike);
		Pokemon Electrode=new Pokemon("Electrode", "60", "50", "70", "80", "80", "140", "electric", null); list.add(Electrode);
		Pokemon Elekid=new Pokemon("Elekid", "45", "63", "37", "65", "55", "95", "electric", null); list.add(Elekid);
		Pokemon Elgyem=new Pokemon("Elgyem", "55", "55", "55", "85", "55", "30", "psychic", null); list.add(Elgyem);
		Pokemon Emboar=new Pokemon("Emboar", "110", "123", "65", "100", "65", "65", "fire", "fighting"); list.add(Emboar);
		Pokemon Emolga=new Pokemon("Emolga", "55", "75", "60", "75", "60", "103", "electric", "flying"); list.add(Emolga);
		Pokemon Empoleon=new Pokemon("Empoleon", "84", "86", "88", "111", "101", "60", "water", "steel"); list.add(Empoleon);
		Pokemon Entei=new Pokemon("Entei", "115", "115", "85", "90", "75", "100", "fire", null); list.add(Entei);
		Pokemon Escavalier=new Pokemon("Escavalier", "70", "135", "105", "60", "105", "20", "bug", "steel"); list.add(Escavalier);
		Pokemon Espeon=new Pokemon("Espeon", "65", "65", "60", "130", "95", "110", "psychic", null); list.add(Espeon);
		Pokemon Espurr=new Pokemon("Espurr", "62", "48", "54", "63", "60", "68", "psychic", null); list.add(Espurr);
		Pokemon Excadrill=new Pokemon("Excadrill", "110", "135", "60", "50", "65", "88", "ground", "steel"); list.add(Excadrill);
		Pokemon Exeggcute=new Pokemon("Exeggcute", "60", "40", "80", "60", "45", "40", "psychic", "grass"); list.add(Exeggcute);
		Pokemon Exeggutor=new Pokemon("Exeggutor", "95", "95", "85", "125", "65", "55", "psychic", "grass"); list.add(Exeggutor);
		Pokemon Exploud=new Pokemon("Exploud", "104", "91", "63", "91", "73", "68", "normal", null); list.add(Exploud);
		Pokemon Farfetchd=new Pokemon("Farfetch'd", "52", "65", "55", "58", "62", "60", "flying", "normal"); list.add(Farfetchd);
		Pokemon Fearow=new Pokemon("Fearow", "65", "90", "65", "61", "61", "100", "flying", "normal"); list.add(Fearow);
		Pokemon Feebas=new Pokemon("Feebas", "20", "15", "20", "10", "55", "80", "water", null); list.add(Feebas);
		Pokemon Fennekin=new Pokemon("Fennekin", "40", "45", "40", "62", "60", "60", "fire", null); list.add(Fennekin);
		Pokemon Feraligatr=new Pokemon("Feraligatr", "85", "105", "100", "79", "83", "78", "water", null); list.add(Feraligatr);
		Pokemon Ferroseed=new Pokemon("Ferroseed", "44", "50", "91", "24", "86", "10", "grass", "steel"); list.add(Ferroseed);
		Pokemon Ferrothorn=new Pokemon("Ferrothorn", "74", "94", "131", "54", "116", "20", "grass", "steel"); list.add(Ferrothorn);
		Pokemon Finneon=new Pokemon("Finneon", "49", "49", "56", "49", "61", "66", "water", null); list.add(Finneon);
		Pokemon Flaaffy=new Pokemon("Flaaffy", "70", "55", "55", "80", "60", "45", "electric", null); list.add(Flaaffy);
		Pokemon Flabébé=new Pokemon("Flabébé", "44", "38", "39", "61", "79", "42", "fairy", null); list.add(Flabébé);
		Pokemon Flareon=new Pokemon("Flareon", "65", "130", "60", "95", "110", "65", "fire", null); list.add(Flareon);
		Pokemon Fletchinder=new Pokemon("Fletchinder", "62", "73", "55", "56", "52", "84", "flying", "fire"); list.add(Fletchinder);
		Pokemon Fletchling=new Pokemon("Fletchling", "45", "50", "43", "40", "38", "62", "flying", "normal"); list.add(Fletchling);
		Pokemon Floatzel=new Pokemon("Floatzel", "68", "105", "55", "85", "50", "115", "water", null); list.add(Floatzel);
		Pokemon Floette=new Pokemon("Floette", "54", "45", "47", "75", "98", "52", "fairy", null); list.add(Floette);
		Pokemon Florges=new Pokemon("Florges", "78", "65", "68", "112", "154", "75", "fairy", null); list.add(Florges);
		Pokemon Flygon=new Pokemon("Flygon", "80", "100", "80", "80", "80", "100", "dragon", "ground"); list.add(Flygon);
		Pokemon Foongus=new Pokemon("Foongus", "69", "55", "45", "55", "55", "15", "grass", "poison"); list.add(Foongus);
		Pokemon Forretress=new Pokemon("Forretress", "75", "90", "140", "60", "60", "40", "bug", "steel"); list.add(Forretress);
		Pokemon Fraxure=new Pokemon("Fraxure", "66", "117", "70", "40", "50", "67", "dragon", null); list.add(Fraxure);
		Pokemon Frillish=new Pokemon("Frillish", "55", "40", "50", "65", "85", "40", "ghost", "water"); list.add(Frillish);
		Pokemon Froakie=new Pokemon("Froakie", "41", "56", "40", "62", "44", "71", "water", null); list.add(Froakie);
		Pokemon Frogadier=new Pokemon("Frogadier", "54", "63", "52", "83", "56", "97", "water", null); list.add(Frogadier);
		Pokemon Froslass=new Pokemon("Froslass", "70", "80", "70", "80", "70", "110", "ghost", "ice"); list.add(Froslass);
		Pokemon Furfrou=new Pokemon("Furfrou", "75", "80", "60", "65", "90", "102", "normal", null); list.add(Furfrou);
		Pokemon Furret=new Pokemon("Furret", "85", "76", "64", "45", "55", "90", "normal", null); list.add(Furret);
		Pokemon Gabite=new Pokemon("Gabite", "68", "90", "65", "50", "55", "82", "ground", "dragon"); list.add(Gabite);
		Pokemon Gallade=new Pokemon("Gallade", "68", "125", "65", "65", "115", "80", "fighting", "psychic"); list.add(Gallade);
		
		Pokemon Galvantula=new Pokemon("Galvantula", "70", "77", "60", "97", "60", "108", "bug", "electric"); list.add(Galvantula);
		Pokemon Garbodor=new Pokemon("Garbodor", "80", "95", "82", "60", "82", "75", "poison", null); list.add(Garbodor);
		Pokemon Garchomp=new Pokemon("Garchomp", "108", "130", "95", "80", "85", "102", "dragon", "ground"); list.add(Garchomp);
		
		Pokemon Gardevoir=new Pokemon("Gardevoir", "68", "65", "65", "125", "115", "80", "psychic", "fairy"); list.add(Gardevoir);
		
		Pokemon Gastly=new Pokemon("Gastly", "30", "35", "30", "100", "35", "80", "ghost", "poison"); list.add(Gastly);
		Pokemon Gastrodon=new Pokemon("Gastrodon", "111", "83", "68", "92", "82", "39", "water", "ground"); list.add(Gastrodon);
		Pokemon Genesect=new Pokemon("Genesect", "71", "120", "95", "120", "95", "99", "bug", "steel"); list.add(Genesect);
		Pokemon Gengar=new Pokemon("Gengar", "60", "65", "60", "130", "75", "110", "ghost", "poison"); list.add(Gengar);
		
		Pokemon Geodude=new Pokemon("Geodude", "40", "80", "100", "30", "30", "20", "rock", "ground"); list.add(Geodude);
		Pokemon Gible=new Pokemon("Gible", "58", "70", "45", "40", "45", "42", "dragon", "ground"); list.add(Gible);
		Pokemon Gigalith=new Pokemon("Gigalith", "85", "135", "130", "60", "80", "25", "rock", "ground"); list.add(Gigalith);
		Pokemon Girafarig=new Pokemon("Girafarig", "70", "80", "65", "90", "65", "85", "normal", "psychic"); list.add(Girafarig);
		Pokemon Giratina=new Pokemon("Giratina", "150", "100", "120", "100", "120", "90", "dragon", "ghost"); list.add(Giratina);
		Pokemon GiratinaOrigin=new Pokemon("Giratina-Origin", "150", "120", "100", "120", "100", "90", "dragon", "ghost"); list.add(GiratinaOrigin);
		Pokemon Glaceon=new Pokemon("Glaceon", "65", "60", "110", "130", "95", "65", "ice", null); list.add(Glaceon);
		Pokemon Glalie=new Pokemon("Glalie", "80", "80", "80", "80", "80", "80", "ice", null); list.add(Glalie);
		
		Pokemon Glameow=new Pokemon("Glameow", "49", "55", "42", "42", "37", "85", "normal", null); list.add(Glameow);
		Pokemon Gligar=new Pokemon("Gligar", "65", "75", "105", "35", "65", "85", "flying", "ground"); list.add(Gligar);
		Pokemon Gliscor=new Pokemon("Gliscor", "75", "95", "125", "45", "75", "95", "flying", "ground"); list.add(Gliscor);
		Pokemon Gloom=new Pokemon("Gloom", "60", "65", "70", "85", "75", "40", "grass", "poison"); list.add(Gloom);
		Pokemon Gogoat=new Pokemon("Gogoat", "123", "100", "62", "55", "65", "45", "grass", null); list.add(Gogoat);
		Pokemon Golbat=new Pokemon("Golbat", "75", "80", "70", "65", "75", "90", "flying", "poison"); list.add(Golbat);
		Pokemon Goldeen=new Pokemon("Goldeen", "45", "67", "60", "35", "50", "63", "water", null); list.add(Goldeen);
		Pokemon Golduck=new Pokemon("Golduck", "80", "82", "78", "95", "80", "85", "water", null); list.add(Golduck);
		Pokemon Golem=new Pokemon("Golem", "80", "120", "130", "55", "65", "45", "rock", "ground"); list.add(Golem);
		Pokemon Golett=new Pokemon("Golett", "59", "74", "50", "35", "50", "35", "ghost", "ground"); list.add(Golett);
		Pokemon Golurk=new Pokemon("Golurk", "89", "124", "80", "55", "80", "55", "ghost", "ground"); list.add(Golurk);
		Pokemon Goodra=new Pokemon("Goodra", "90", "100", "70", "110", "150", "80", "dragon", null); list.add(Goodra);
		Pokemon Goomy=new Pokemon("Goomy", "45", "50", "35", "55", "75", "40", "dragon", null); list.add(Goomy);
		Pokemon Gorebyss=new Pokemon("Gorebyss", "55", "84", "105", "114", "75", "40", "water", null); list.add(Gorebyss);
		Pokemon Gothita=new Pokemon("Gothita", "45", "30", "50", "55", "65", "45", "psychic", null); list.add(Gothita);
		Pokemon Gothitelle=new Pokemon("Gothitelle", "70", "55", "95", "95", "110", "65", "psychic", null); list.add(Gothitelle);
		Pokemon Gothorita=new Pokemon("Gothorita", "60", "45", "70", "75", "85", "55", "psychic", null); list.add(Gothorita);
		Pokemon GourgeistAverage=new Pokemon("Gourgeist", "65", "90", "122", "58", "75", "84", "ghost", null); list.add(GourgeistAverage);
		Pokemon GourgeistLarge=new Pokemon("Gourgeist-Large", "75", "95", "122", "58", "75", "69", "ghost", null); list.add(GourgeistLarge);
		Pokemon GourgeistSmall=new Pokemon("Gourgeist-Small", "55", "85", "122", "58", "75", "99", "ghost", null); list.add(GourgeistSmall);
		Pokemon GourgeistSuper=new Pokemon("Gourgeist-Super", "85", "100", "122", "58", "75", "54", "ghost", null); list.add(GourgeistSuper);
		Pokemon Granbull=new Pokemon("Granbull", "90", "120", "75", "60", "60", "45", "fairy", null); list.add(Granbull);
		Pokemon Graveler=new Pokemon("Graveler", "55", "95", "115", "45", "45", "35", "rock", "ground"); list.add(Graveler);
		Pokemon Greninja=new Pokemon("Greninja", "72", "95", "67", "103", "71", "122", "water", "dark"); list.add(Greninja);
		Pokemon Grimer=new Pokemon("Grimer", "80", "80", "50", "40", "50", "25", "poison", null); list.add(Grimer);
		Pokemon Grotle=new Pokemon("Grotle", "75", "89", "85", "55", "65", "36", "grass", null); list.add(Grotle);
		Pokemon Groudon=new Pokemon("Groudon", "100", "150", "140", "100", "90", "90", "ground", null); list.add(Groudon);
		
		Pokemon Grovyle=new Pokemon("Grovyle", "50", "65", "45", "85", "65", "95", "grass", null); list.add(Grovyle);
		Pokemon Growlithe=new Pokemon("Growlithe", "55", "70", "45", "70", "50", "60", "fire", null); list.add(Growlithe);
		Pokemon Grumpig=new Pokemon("Grumpig", "80", "45", "65", "90", "110", "80", "psychic", null); list.add(Grumpig);
		Pokemon Gulpin=new Pokemon("Gulpin", "70", "43", "53", "43", "53", "40", "poison", null); list.add(Gulpin);
		Pokemon Gurdurr=new Pokemon("Gurdurr", "85", "105", "85", "40", "50", "40", "fighting", null); list.add(Gurdurr);
		Pokemon Gyarados=new Pokemon("Gyrados", "95", "125", "79", "60", "100", "81", "water", "flying"); list.add(Gyarados);
		
		Pokemon Happiny=new Pokemon("Happiny", "100", "5", "5", "15", "65", "30", "normal", null); list.add(Happiny);
		Pokemon Hariyama=new Pokemon("Hariyama", "144", "120", "60", "40", "60", "50", "fighting", null); list.add(Hariyama);
		Pokemon Haunter=new Pokemon("Haunter", "45", "50", "45", "115", "55", "95", "ghost", "poison"); list.add(Haunter);
		Pokemon Hawlucha=new Pokemon("Hawlucha", "78", "92", "75", "74", "64", "118", "flying", "fighting"); list.add(Hawlucha);
		Pokemon Haxorus=new Pokemon("Haxorus", "76", "147", "90", "60", "70", "97", "dragon", null); list.add(Haxorus);
		Pokemon Heatmor=new Pokemon("Heatmor", "85", "97", "66", "105", "66", "65", "fire", null); list.add(Heatmor);
		Pokemon Heatran=new Pokemon("Heatran", "91", "90", "106", "130", "106", "77", "fire", "steel"); list.add(Heatran);
		Pokemon Heliolisk=new Pokemon("Heliolisk", "62", "55", "52", "109", "94", "109", "electric", "normal"); list.add(Heliolisk);
		Pokemon Helioptile=new Pokemon("Helioptile", "44", "38", "33", "61", "43", "70", "electric", "normal"); list.add(Helioptile);
		Pokemon Heracross=new Pokemon("Heracross", "80", "125", "75", "40", "95", "85", "bug", "fighting"); list.add(Heracross);
		
		Pokemon Herdier=new Pokemon("Herdier", "65", "80", "65", "35", "65", "60", "normal", null); list.add(Herdier);
		Pokemon Hippopotas=new Pokemon("Hippopotas", "68", "72", "78", "38", "42", "32", "ground", null); list.add(Hippopotas);
		Pokemon Hippowdon=new Pokemon("Hippowdon", "108", "112", "118", "68", "72", "47", "ground", null); list.add(Hippowdon);
		Pokemon Hitmonchan=new Pokemon("Hitmonchan", "50", "105", "79", "35", "110", "76", "fighting", null); list.add(Hitmonchan);
		Pokemon Hitmonlee=new Pokemon("Hitmonlee", "50", "120", "53", "35", "110", "87", "fighting", null); list.add(Hitmonlee);
		Pokemon Hitmontop=new Pokemon("Hitmontop", "50", "95", "95", "35", "110", "70", "fighting", null); list.add(Hitmontop);
		Pokemon Hooh=new Pokemon("Ho-oh", "106", "130", "90", "110", "154", "90", "fire", "flying"); list.add(Hooh);
		Pokemon Honchkrow=new Pokemon("Honchkrow", "100", "125", "52", "105", "52", "71", "flying", "dark"); list.add(Honchkrow);
		Pokemon Honedge=new Pokemon("Honedge", "45", "80", "100", "35", "37", "28", "ghost", "steel"); list.add(Honedge);
		Pokemon Hoothoot=new Pokemon("Hoothoot", "60", "30", "30", "36", "56", "50", "flying", "normal"); list.add(Hoothoot);
		Pokemon Hoppip=new Pokemon("Hoppip", "35", "35", "40", "35", "55", "50", "grass", null); list.add(Hoppip);
		Pokemon Horsea=new Pokemon("Horsea", "30", "40", "70", "70", "25", "50", "water", null); list.add(Horsea);
		Pokemon Houndoom=new Pokemon("Houndoom", "75", "90", "90", "140", "80", "95", "fire", "dark"); list.add(Houndoom);
		
		Pokemon Houndour=new Pokemon("Houndour", "45", "60", "30", "80", "50", "65", "fire", "dark"); list.add(Houndour);
		Pokemon Huntail=new Pokemon("Huntail", "55", "104", "105", "94", "75", "52", "water", null); list.add(Huntail);
		Pokemon Hydreigon=new Pokemon("Hydreigon", "92", "105", "90", "125", "90", "98", "dragon", "dark"); list.add(Hydreigon);
		Pokemon Hypno=new Pokemon("Hypno", "85", "73", "70", "73", "115", "67", "psychic", null); list.add(Hypno);
		Pokemon Igglybuff=new Pokemon("Igglybuff", "90", "30", "15", "40", "20", "15", "fairy", "normal"); list.add(Igglybuff);
		Pokemon Illumise=new Pokemon("Illumise", "65", "47", "55", "73", "75", "85", "bug", null); list.add(Illumise);
		Pokemon Infernape=new Pokemon("Infernape", "76", "104", "71", "104", "71", "108", "fire", "fighting"); list.add(Infernape);
		Pokemon Inkay=new Pokemon("Inkay", "53", "54", "53", "37", "46", "45", "psychic", "dark"); list.add(Inkay);
		Pokemon Ivysaur=new Pokemon("Ivysaur", "60", "62", "63", "80", "80", "60", "poison", "grass"); list.add(Ivysaur);
		Pokemon Jellicent=new Pokemon("Jellicent", "100", "60", "70", "85", "105", "60", "ghost", "water"); list.add(Jellicent);
		Pokemon Jigglypuff=new Pokemon("Jigglypuff", "115", "45", "20", "45", "25", "20", "fairy", "normal"); list.add(Jigglypuff);
		Pokemon Jirachi=new Pokemon("Jirachi", "100", "100", "100", "100", "100", "100", "psychic", "steel"); list.add(Jirachi);
		Pokemon Jolteon=new Pokemon("Jolteon", "65", "65", "60", "110", "95", "130", "electric", null); list.add(Jolteon);
		Pokemon Joltik=new Pokemon("Joltik", "50", "47", "50", "57", "50", "65", "electric", "bug"); list.add(Joltik);
		Pokemon Jumpluff=new Pokemon("Jumpluff", "75", "55", "70", "55", "95", "110", "grass", "flying"); list.add(Jumpluff);
		Pokemon Jynx=new Pokemon("Jynx", "65", "50", "35", "115", "95", "95", "ice", "psychic"); list.add(Jynx);
		Pokemon Kabuto=new Pokemon("Kabuto", "30", "80", "90", "55", "45", "55", "water", "rock"); list.add(Kabuto);
		Pokemon Kabutops=new Pokemon("Kabutops", "60", "115", "105", "65", "70", "80", "water", "rock"); list.add(Kabutops);
		Pokemon Kadabra=new Pokemon("Kadabra", "40", "35", "30", "120", "70", "105", "psychic", null); list.add(Kadabra);
		Pokemon Kakuna=new Pokemon("Kakuna", "45", "25", "50", "25", "25", "35", "bug", "poison"); list.add(Kakuna);
		Pokemon Kangaskhan=new Pokemon("Kangaskhan", "105", "95", "80", "40", "80", "90", "normal", null); list.add(Kangaskhan);
		
		Pokemon Karrablast=new Pokemon("Karrablast", "50", "75", "45", "40", "45", "60", "bug", null); list.add(Karrablast);
		Pokemon Kecleon=new Pokemon("Kecleon", "60", "90", "70", "60", "120", "40", "normal", null); list.add(Kecleon);
		Pokemon Keldeo=new Pokemon("Keldeo", "91", "72", "90", "129", "90", "108", "water", "fighting"); list.add(Keldeo);
		Pokemon Kingdra=new Pokemon("Kingdra", "75", "95", "95", "95", "95", "85", "water", "dragon"); list.add(Kingdra);
		Pokemon Kingler=new Pokemon("Kingler", "55", "130", "115", "50", "50", "75", "water", null); list.add(Kingler);
		Pokemon Kirlia=new Pokemon("Kirlia", "38", "35", "35", "65", "55", "50", "psychic", "fairy"); list.add(Kirlia);
		Pokemon Klang=new Pokemon("Klang", "60", "80", "95", "70", "85", "50", "steel", null); list.add(Klang);
		Pokemon Klefki=new Pokemon("Klefki", "57", "80", "91", "80", "87", "75", "steel", "fairy"); list.add(Klefki);
		Pokemon Klink=new Pokemon("Klink", "40", "55", "70", "45", "60", "30", "steel", null); list.add(Klink);
		Pokemon Klinklang=new Pokemon("Klinklang", "60", "100", "115", "70", "85", "90", "steel", null); list.add(Klinklang);
		Pokemon Koffing=new Pokemon("Koffing", "40", "65", "95", "60", "45", "35", "poison", null); list.add(Koffing);
		Pokemon Krabby=new Pokemon("Krabby", "30", "105", "90", "25", "25", "50", "water", null); list.add(Krabby);
		Pokemon Kricketot=new Pokemon("Kricketot", "37", "25", "41", "25", "41", "25", "bug", null); list.add(Kricketot);
		Pokemon Kricketune=new Pokemon("Kricketune", "77", "85", "51", "55", "51", "65", "bug", null); list.add(Kricketune);
		Pokemon Krokorok=new Pokemon("Krokorok", "60", "82", "45", "45", "45", "74", "ground", "rock"); list.add(Krokorok);
		Pokemon Krookodile=new Pokemon("Krookodile", "95", "117", "80", "65", "70", "92", "ground", "rock"); list.add(Krookodile);
		Pokemon Kyogre=new Pokemon("Kyogre", "100", "100", "90", "150", "140", "90", "water", null); list.add(Kyogre);
		Pokemon KyuremB=new Pokemon("Kyurem-Black", "125", "170", "100", "120", "90", "95", "ice", "dragon"); list.add(KyuremB);
		Pokemon Kyurem=new Pokemon("Kyurem", "125", "130", "90", "130", "90", "95", "ice", "dragon"); list.add(Kyurem);
		Pokemon KyuremW=new Pokemon("Kyurem-White", "125", "120", "90", "170", "100", "95", "ice", "dragon"); list.add(KyuremW);
		Pokemon Lairon=new Pokemon("Lairon", "60", "90", "140", "50", "50", "40", "rock", "steel"); list.add(Lairon);
		Pokemon Lampent=new Pokemon("Lampent", "60", "40", "60", "95", "60", "55", "ghost", "fire"); list.add(Lampent);
		Pokemon Landorus=new Pokemon("Landorus", "89", "125", "90", "115", "80", "101", "flying", "ground"); list.add(Landorus);
		Pokemon LandorusT=new Pokemon("Landorus-Therian","89","145","90","105","80","91","flying","ground"); list.add(LandorusT);
		Pokemon Lanturn=new Pokemon("Lanturn", "125", "58", "58", "76", "76", "67", "water", "electric"); list.add(Lanturn);
		Pokemon Lapras=new Pokemon("Lapras", "130", "85", "80", "85", "95", "60", "water", "ice"); list.add(Lapras);
		Pokemon Larvesta=new Pokemon("Larvesta", "55", "85", "55", "50", "55", "60", "bug", "fire"); list.add(Larvesta);
		Pokemon Larvitar=new Pokemon("Larvitar", "50", "64", "50", "45", "50", "41", "ground", "rock"); list.add(Larvitar);
		Pokemon Latias=new Pokemon("Latias", "80", "80", "90", "110", "130", "110", "dragon", "psychic"); list.add(Latias);
		
		Pokemon Latios=new Pokemon("Latios", "80", "90", "80", "130", "110", "110", "dragon", "psychic"); list.add(Latios);
		
		Pokemon Leafeon=new Pokemon("Leafeon", "65", "110", "130", "60", "65", "95", "grass", null); list.add(Leafeon);
		Pokemon Leavanny=new Pokemon("Leavanny", "75", "103", "80", "70", "80", "92", "grass", "bug"); list.add(Leavanny);
		Pokemon Ledian=new Pokemon("Ledian", "55", "35", "50", "55", "110", "85", "bug", "flying"); list.add(Ledian);
		Pokemon Ledyba=new Pokemon("Ledyba", "40", "20", "30", "40", "80", "55", "bug", "flying"); list.add(Ledyba);
		Pokemon Lickilicky=new Pokemon("Lickilicky", "110", "85", "95", "80", "95", "50", "normal", null); list.add(Lickilicky);
		Pokemon Lickitung=new Pokemon("Lickitung", "90", "55", "75", "60", "75", "30", "normal", null); list.add(Lickitung);
		Pokemon Liepard=new Pokemon("Liepard", "64", "88", "50", "88", "50", "106", "dark", null); list.add(Liepard);
		Pokemon Lileep=new Pokemon("Lileep", "66", "41", "77", "61", "87", "23", "rock", "grass"); list.add(Lileep);
		Pokemon Lilligant=new Pokemon("Lilligant", "70", "60", "75", "110", "75", "90", "grass", null); list.add(Lilligant);
		Pokemon Lillipup=new Pokemon("Lillipup", "45", "60", "45", "25", "45", "55", "normal", null); list.add(Lillipup);
		Pokemon Linoone=new Pokemon("Linoone", "78", "70", "61", "50", "61", "100", "normal", null); list.add(Linoone);
		Pokemon Litleo=new Pokemon("Litleo", "62", "50", "58", "73", "54", "72", "normal", null); list.add(Litleo);
		Pokemon Litwick=new Pokemon("Litwick", "50", "30", "55", "65", "55", "20", "ghost", "fire"); list.add(Litwick);
		Pokemon Lombre=new Pokemon("Lombre", "60", "50", "50", "60", "70", "50", "grass", "normal"); list.add(Lombre);
		Pokemon Lopunny=new Pokemon("Lopunny", "65", "76", "84", "54", "96", "105", "normal", null); list.add(Lopunny);
		
		Pokemon Lotad=new Pokemon("Lotad", "40", "30", "30", "40", "50", "30", "grass", "water"); list.add(Lotad);
		Pokemon Loudred=new Pokemon("Loudred", "84", "71", "43", "71", "43", "48", "normal", null); list.add(Loudred);
		Pokemon Lucario=new Pokemon("Lucario", "70", "110", "70", "115", "70", "90", "steel", "fighting"); list.add(Lucario);
		
		Pokemon Ludicolo=new Pokemon("Ludicolo", "80", "70", "70", "90", "110", "70", "water", "grass"); list.add(Ludicolo);
		Pokemon Lugia=new Pokemon("Lugia", "106", "90", "130", "90", "154", "110", "flying", "psychic"); list.add(Lugia);
		Pokemon Lumineon=new Pokemon("Lumineon", "69", "69", "76", "69", "86", "91", "water", null); list.add(Lumineon);
		Pokemon Lunatone=new Pokemon("Lunatone", "70", "55", "65", "95", "85", "70", "rock", "psychic"); list.add(Lunatone);
		Pokemon Luvdisc=new Pokemon("Luvdisc", "43", "30", "55", "40", "65", "97", "water", null); list.add(Luvdisc);
		Pokemon Luxio=new Pokemon("Luxio", "60", "85", "49", "60", "49", "60", "electric", null); list.add(Luxio);
		Pokemon Luxray=new Pokemon("Luxray", "80", "120", "79", "95", "79", "70", "electric", null); list.add(Luxray);
		Pokemon Machamp=new Pokemon("Machamp", "90", "130", "80", "65", "85", "55", "fighting", null); list.add(Machamp);
		Pokemon Machoke=new Pokemon("Machoke", "80", "100", "70", "50", "60", "45", "fighting", null); list.add(Machoke);
		Pokemon Machop=new Pokemon("Machop", "70", "80", "50", "35", "35", "35", "fighting", null); list.add(Machop);
		Pokemon Magby=new Pokemon("Magby", "45", "75", "37", "70", "55", "83", "fire", null); list.add(Magby);
		Pokemon Magcargo=new Pokemon("Magcargo", "50", "50", "120", "80", "80", "30", "fire", "rock"); list.add(Magcargo);
		Pokemon Magikarp=new Pokemon("Magikarp", "20", "10", "55", "15", "20", "80", "water", null); list.add(Magikarp);
		Pokemon Magmar=new Pokemon("Magmar", "65", "95", "57", "100", "85", "93", "fire", null); list.add(Magmar);
		Pokemon Magmortar=new Pokemon("Magmortar", "75", "95", "67", "125", "95", "83", "fire", null); list.add(Magmortar);
		Pokemon Magnemite=new Pokemon("Magnemite", "25", "35", "70", "95", "55", "45", "electric", "steel"); list.add(Magnemite);
		Pokemon Magneton=new Pokemon("Magneton", "50", "60", "95", "120", "70", "70", "electric", "steel"); list.add(Magneton);
		Pokemon Magnezone=new Pokemon("Magnezone", "70", "70", "115", "130", "90", "60", "electric", "steel"); list.add(Magnezone);
		Pokemon Makuhita=new Pokemon("Makuhita", "72", "60", "30", "20", "30", "25", "fighting", null); list.add(Makuhita);
		Pokemon Malamar=new Pokemon("Malamar", "86", "92", "88", "68", "75", "73", "psychic", "dark"); list.add(Malamar);
		Pokemon Mamoswine=new Pokemon("Mamoswine", "110", "130", "80", "70", "60", "80", "ground", "ice"); list.add(Mamoswine);
		Pokemon Manaphy=new Pokemon("Manaphy", "100", "100", "100", "100", "100", "100", "water", null); list.add(Manaphy);
		Pokemon Mandibuzz=new Pokemon("Mandibuzz", "110", "65", "105", "55", "95", "80", "flying", "dark"); list.add(Mandibuzz);
		Pokemon Manectric=new Pokemon("Manectric", "70", "75", "60", "105", "60", "105", "electric", null); list.add(Manectric);
		
		Pokemon Mankey=new Pokemon("Mankey", "40", "80", "35", "35", "45", "70", "fighting", null); list.add(Mankey);
		Pokemon Mantine=new Pokemon("Mantine", "65", "40", "70", "80", "140", "70", "water", "flying"); list.add(Mantine);
		Pokemon Mantyke=new Pokemon("Mantyke", "45", "20", "50", "60", "120", "50", "water", "flying"); list.add(Mantyke);
		Pokemon Maractus=new Pokemon("Maractus", "75", "86", "67", "106", "67", "60", "grass", null); list.add(Maractus);
		Pokemon Mareep=new Pokemon("Mareep", "55", "40", "40", "65", "45", "35", "electric", null); list.add(Mareep);
		Pokemon Marill=new Pokemon("Marill", "70", "20", "50", "20", "50", "40", "water", "fairy"); list.add(Marill);
		Pokemon Marowak=new Pokemon("Marowak", "60", "80", "110", "50", "80", "45", "ground", null); list.add(Marowak);
		Pokemon Marshtomp=new Pokemon("Marshtomp", "70", "85", "70", "60", "70", "50", "ground", "water"); list.add(Marshtomp);
		Pokemon Masquerain=new Pokemon("Masquerain", "70", "60", "62", "80", "82", "60", "bug", "flying"); list.add(Masquerain);
		Pokemon Mawile=new Pokemon("Mawile", "50", "85", "85", "55", "55", "50", "steel", "fairy"); list.add(Mawile);
		
		Pokemon Medicham=new Pokemon("Medicham", "60", "60", "75", "60", "75", "80", "psychic", "fighting"); list.add(Medicham);
		
		Pokemon Meditite=new Pokemon("Meditite", "30", "40", "55", "40", "55", "60", "psychic", "fighting"); list.add(Meditite);
		Pokemon Meganium=new Pokemon("Meganium", "80", "82", "100", "83", "100", "80", "grass", null); list.add(Meganium);
		Pokemon Meloetta=new Pokemon("Meloetta", "100", "128", "90", "77", "77", "128", "normal", "psychic"); list.add(Meloetta);
		Pokemon Meowstic=new Pokemon("Meowstic", "74", "48", "76", "83", "81", "104", "psychic", null); list.add(Meowstic);
		Pokemon Meowth=new Pokemon("Meowth", "40", "45", "35", "40", "40", "90", "normal", null); list.add(Meowth);
		Pokemon Mesprit=new Pokemon("Mesprit", "80", "105", "105", "105", "105", "80", "psychic", null); list.add(Mesprit);
		Pokemon Metagross=new Pokemon("Metagross", "80", "135", "130", "95", "90", "70", "psychic", "steel"); list.add(Metagross);
		
		Pokemon Metang=new Pokemon("Metang", "60", "75", "100", "55", "80", "50", "psychic", "steel"); list.add(Metang);
		Pokemon Metapod=new Pokemon("Metapod", "50", "20", "55", "25", "25", "30", "bug", null); list.add(Metapod);
		Pokemon Mew=new Pokemon("Mew", "100", "100", "100", "100", "100", "100", "psychic", null); list.add(Mew);
		Pokemon Mewtwo=new Pokemon("Mewtwo", "106", "110", "90", "154", "90", "130", "psychic", null); list.add(Mewtwo);
		
		
		Pokemon Mienfoo=new Pokemon("Mienfoo", "45", "85", "50", "55", "50", "65", "fighting", null); list.add(Mienfoo);
		Pokemon Mienshao=new Pokemon("Mienshao", "65", "125", "60", "95", "60", "105", "fighting", null); list.add(Mienshao);
		Pokemon Mightyena=new Pokemon("Mightyena", "70", "90", "70", "60", "60", "70", "dark", null); list.add(Mightyena);
		Pokemon Milotic=new Pokemon("Milotic", "95", "60", "79", "100", "125", "81", "water", null); list.add(Milotic);
		Pokemon Miltank=new Pokemon("Miltank", "95", "80", "105", "40", "70", "100", "normal", null); list.add(Miltank);
		Pokemon MimeJr=new Pokemon("Mime Jr.", "20", "25", "45", "70", "90", "60", "psychic", "fairy"); list.add(MimeJr);
		Pokemon Minccino=new Pokemon("Minccino", "55", "50", "40", "40", "40", "75", "normal", null); list.add(Minccino);
		Pokemon Minun=new Pokemon("Minun", "60", "40", "50", "75", "85", "95", "electric", null); list.add(Minun);
		Pokemon Misdreavus=new Pokemon("Misdreavus", "60", "60", "60", "85", "85", "85", "ghost", null); list.add(Misdreavus);
		Pokemon Mismagius=new Pokemon("Mismagius", "60", "60", "60", "105", "105", "105", "ghost", "null"); list.add(Mismagius);
		Pokemon Moltres=new Pokemon("Moltres", "90", "100", "90", "125", "85", "90", "fire", "flying"); list.add(Moltres);
		Pokemon Monferno=new Pokemon("Monferno", "64", "78", "52", "78", "52", "81", "fire", "fighting"); list.add(Monferno);
		Pokemon Mothim=new Pokemon("Mothim", "70", "94", "50", "94", "50", "66", "bug", "flying"); list.add(Mothim);
		Pokemon MrMime=new Pokemon("MrMime", "40", "45", "65", "100", "120", "90", "psychic", "fairy"); list.add(MrMime);
		Pokemon Mudkip=new Pokemon("Mudkip", "50", "70", "50", "50", "50", "40", "water", null); list.add(Mudkip);
		Pokemon Muk=new Pokemon("Muk", "105", "105", "75", "65", "100", "50", "poison", null); list.add(Muk);
		Pokemon Munchlax=new Pokemon("Munchlax", "135", "85", "40", "40", "85", "5", "normal", null); list.add(Munchlax);
		Pokemon Munna=new Pokemon("Munna", "76", "25", "45", "67", "55", "24", "psychic", null); list.add(Munna);
		Pokemon Murkrow=new Pokemon("Murkrow", "60", "85", "42", "85", "42", "91", "dark", "flying"); list.add(Murkrow);
		Pokemon Musharna=new Pokemon("Musharna", "116", "55", "85", "107", "95", "29", "psychic", null); list.add(Musharna);
		Pokemon Natu=new Pokemon("Natu", "40", "50", "45", "70", "45", "70", "psychic", "flying"); list.add(Natu);
		Pokemon Nidoking=new Pokemon("Nidoking", "81", "102", "77", "85", "75", "85", "ground", "poison"); list.add(Nidoking);
		Pokemon Nidoqueen=new Pokemon("Nidoqueen", "90", "92", "87", "75", "85", "76", "ground", "poison"); list.add(Nidoqueen);
		Pokemon NidoranF=new Pokemon("Nidoran-F", "55", "47", "52", "40", "40", "41", "poison", null); list.add(NidoranF);
		Pokemon NidoranM=new Pokemon("Nidoran-M", "46", "57", "40", "40", "40", "50", "poison", null); list.add(NidoranM);
		Pokemon Nidorina=new Pokemon("Nidorina", "70", "62", "67", "55", "55", "56", "poison", null); list.add(Nidorina);
		Pokemon Nidorino=new Pokemon("Nidorino", "61", "72", "57", "55", "55", "65", "poison", null); list.add(Nidorino);
		Pokemon Nincada=new Pokemon("Nincada", "31", "45", "90", "30", "30", "40", "bug", "ground"); list.add(Nincada);
		Pokemon Ninetales=new Pokemon("Ninetales", "73", "76", "75", "81", "100", "100", "fire", null); list.add(Ninetales);
		Pokemon Ninjask=new Pokemon("Ninjask", "61", "90", "45", "50", "50", "160", "bug", "flying"); list.add(Ninjask);
		Pokemon Noctowl=new Pokemon("Noctowl", "100", "50", "50", "76", "96", "70", "flying", "normal"); list.add(Noctowl);
		Pokemon Noibat=new Pokemon("Noibat", "40", "30", "35", "45", "40", "55", "flying", "psychic"); list.add(Noibat);
		Pokemon Noivern=new Pokemon("Noivern", "85", "70", "80", "97", "80", "123", "dragon", "flying"); list.add(Noivern);
		Pokemon Nosepass=new Pokemon("Nosepass", "30", "45", "135", "45", "90", "30", "rock", null); list.add(Nosepass);
		Pokemon Numel=new Pokemon("Numel", "60", "60", "40", "65", "45", "35", "fire", "ground"); list.add(Numel);
		Pokemon Nuzleaf=new Pokemon("Nuzleaf", "70", "70", "40", "60", "40", "60", "grass", "dark"); list.add(Nuzleaf);
		Pokemon Octillery=new Pokemon("Octillery", "75", "105", "75", "105", "75", "45", "water", null); list.add(Octillery);
		Pokemon Oddish=new Pokemon("Oddish", "45", "50", "55", "75", "65", "30", "grass", "poison"); list.add(Oddish);
		Pokemon Omanyte=new Pokemon("Omanyte", "35", "40", "100", "90", "55", "35", "rock", "water"); list.add(Omanyte);
		Pokemon Omastar=new Pokemon("Omastar", "70", "60", "125", "115", "70", "55", "rock", "water"); list.add(Omastar);
		Pokemon Onix=new Pokemon("Onix", "35", "45", "160", "30", "45", "70", "rock", "ground"); list.add(Onix);
		Pokemon Oshawott=new Pokemon("Oshawott", "55", "55", "45", "63", "45", "45", "water", null); list.add(Oshawott);
		Pokemon Pachirisu=new Pokemon("Pachirisu", "60", "45", "70", "45", "90", "95", "electric", null); list.add(Pachirisu);
		Pokemon Palkia=new Pokemon("Palkia", "90", "120", "100", "150", "120", "100", "dragon", "water"); list.add(Palkia);
		Pokemon Palpitoad=new Pokemon("Palpitoad", "75", "65", "55", "65", "55", "69", "water", "ground"); list.add(Palpitoad);
		Pokemon Pancham=new Pokemon("Pancham", "67", "82", "62", "46", "48", "43", "fighting", null); list.add(Pancham);
		Pokemon Pangoro=new Pokemon("Pangoro", "95", "124", "78", "69", "71", "58", "fighting", "dark"); list.add(Pangoro);
		Pokemon Panpour=new Pokemon("Panpour", "50", "53", "48", "53", "48", "64", "water", null); list.add(Panpour);
		Pokemon Pansage=new Pokemon("Pansage", "50", "53", "48", "53", "48", "64", "grass", null); list.add(Pansage);
		Pokemon Pansear=new Pokemon("Pansear", "50", "53", "48", "53", "48", "64", "fire", null); list.add(Pansear);
		Pokemon Paras=new Pokemon("Paras", "35", "70", "55", "45", "55", "25", "bug", "grass"); list.add(Paras);
		Pokemon Parasect=new Pokemon("Parasect", "60", "95", "80", "60", "80", "30", "bug", "grass"); list.add(Parasect);
		Pokemon Patrat=new Pokemon("Patrat", "45", "55", "39", "35", "39", "42", "normal", null); list.add(Patrat);
		Pokemon Pawniard=new Pokemon("Pawniard", "45", "85", "70", "40", "40", "60", "dark", "steel"); list.add(Pawniard);
		Pokemon Pelipper=new Pokemon("Pelipper", "60", "50", "100", "85", "70", "65", "flying", "water"); list.add(Pelipper);
		Pokemon Persian=new Pokemon("Persian", "65", "70", "60", "65", "65", "115", "normal", null); list.add(Persian);
		Pokemon Petilil=new Pokemon("Petilil", "45", "35", "50", "70", "50", "30", "grass", null); list.add(Petilil);
		Pokemon Phanpy=new Pokemon("Phanpy", "90", "60", "60", "40", "40", "40", "ground", null); list.add(Phanpy);
		Pokemon Phantump=new Pokemon("Phantump", "43", "70", "48", "50", "60", "38", "ghost", "grass"); list.add(Phantump);
		Pokemon Phione=new Pokemon("Phione", "80", "80", "80", "80", "80", "80", "water", null); list.add(Phione);
		Pokemon Pichu=new Pokemon("Pichu", "20", "40", "15", "35", "35", "60", "electric", null); list.add(Pichu);
		Pokemon Pidgeot=new Pokemon("Pidgeot", "83", "80", "75", "70", "70", "101", "flying", "normal"); list.add(Pidgeot);
		
		Pokemon Pidgeotto=new Pokemon("Pidgeotto", "63", "60", "55", "50", "50", "71", "flying", "normal"); list.add(Pidgeotto);
		Pokemon Pidgey=new Pokemon("Pidgey", "40", "45", "40", "35", "35", "56", "flying", "normal"); list.add(Pidgey);
		Pokemon Pidove=new Pokemon("Pidove", "50", "55", "50", "36", "30", "43", "flying", "normal"); list.add(Pidove);
		Pokemon Pignite=new Pokemon("Pignite", "90", "93", "55", "70", "55", "55", "fighting", "fire"); list.add(Pignite);
		Pokemon Pikachu=new Pokemon("Pikachu", "35", "55", "40", "50", "50", "90", "electric", "null"); list.add(Pikachu);
		Pokemon Piloswine=new Pokemon("Piloswine", "100", "100", "80", "60", "60", "50", "ground", "ice"); list.add(Piloswine);
		Pokemon Pineco=new Pokemon("Pineco", "50", "65", "90", "35", "35", "15", "bug", null); list.add(Pineco);
		Pokemon Pinsir=new Pokemon("Pinsir", "65", "125", "100", "55", "70", "85", "bug", null); list.add(Pinsir);
		
		Pokemon Piplup=new Pokemon("Piplup", "53", "51", "53", "61", "56", "40", "water", null); list.add(Piplup);
		Pokemon Plusle=new Pokemon("Plusle", "60", "50", "40", "85", "75", "95", "electric", null); list.add(Plusle);
		Pokemon Politoed=new Pokemon("Politoed", "90", "75", "75", "90", "100", "70", "water", null); list.add(Politoed);
		Pokemon Poliwag=new Pokemon("Poliwag", "40", "50", "40", "40", "40", "90", "water", null); list.add(Poliwag);
		Pokemon Poliwhirl=new Pokemon("Poliwhirl", "65", "65", "65", "50", "50", "90", "water", null); list.add(Poliwhirl);
		Pokemon Poliwrath=new Pokemon("Poliwrath", "90", "95", "95", "70", "90", "70", "water", "fighting"); list.add(Poliwrath);
		Pokemon Ponyta=new Pokemon("Ponyta", "50", "85", "55", "65", "65", "90", "fire", null); list.add(Ponyta);
		Pokemon Poochyena=new Pokemon("Poochyena", "35", "55", "35", "30", "30", "35", "dark", null); list.add(Poochyena);
		Pokemon Porygon=new Pokemon("Porygon", "65", "60", "70", "85", "75", "40", "normal", null); list.add(Porygon);
		Pokemon PorygonZ=new Pokemon("Porygon-Z", "85", "80", "70", "135", "75", "90", "normal", null); list.add(PorygonZ);
		Pokemon Porygon2=new Pokemon("Porygon2", "85", "80", "90", "105", "95", "60", "normal", null); list.add(Porygon2);
		Pokemon Primeape=new Pokemon("Primeape", "65", "105", "60", "60", "70", "95", "fighting", null); list.add(Primeape);
		Pokemon Prinplup=new Pokemon("Prinplup", "64", "66", "68", "81", "76", "50", "water", null); list.add(Prinplup);
		Pokemon Probopass=new Pokemon("Probopass", "50", "55", "145", "75", "150", "40", "rock", "steel"); list.add(Probopass);
		Pokemon Psyduck=new Pokemon("Psyduck", "50", "52", "48", "65", "50", "55", "water", null); list.add(Psyduck);
		Pokemon PumpkabooA=new Pokemon("Pumpkaboo", "49", "66", "70", "44", "55", "51", "grass", "ghost"); list.add(PumpkabooA);
		Pokemon PumpkabooL=new Pokemon("Pumpkaboo-Large", "54", "66", "70", "44", "55", "46", "grass", "ghost"); list.add(PumpkabooL);
		Pokemon PumpkabooSM=new Pokemon("Pumpkaboo-Small", "44", "66", "70", "44", "55", "46", "grass", "ghost"); list.add(PumpkabooSM);
		Pokemon PumpkabooSU=new Pokemon("Pumpkaboo-Super", "59", "66", "70", "44", "55", "41", "grass", "ghost"); list.add(PumpkabooSU);
		Pokemon Pupitar=new Pokemon("Pupitar", "70", "84", "70", "65", "70", "51", "rock", "ground"); list.add(Pupitar);
		Pokemon Purrloin=new Pokemon("Purrloin", "41", "50", "37", "50", "37", "66", "dark", null); list.add(Purrloin);
		Pokemon Purugly=new Pokemon("Purugly", "71", "82", "64", "64", "59", "112", "normal", null); list.add(Purugly);
		Pokemon Pyroar=new Pokemon("Pyraor", "86", "68", "72", "109", "66", "106", "fire", "normal"); list.add(Pyroar);
		Pokemon Quagsire=new Pokemon("Quagsire", "95", "85", "85", "65", "65", "35", "water", "ground"); list.add(Quagsire);
		Pokemon Quilava=new Pokemon("Quilava", "58", "64", "58", "80", "65", "80", "fire", null); list.add(Quilava);
		Pokemon Quilladin=new Pokemon("Quilladin", "61", "78", "95", "56", "58", "57", "grass", null); list.add(Quilladin);
		Pokemon Qwilfish=new Pokemon("Qwilfish", "65", "95", "75", "55", "55", "85", "water", "poison"); list.add(Qwilfish);
		Pokemon Raichu=new Pokemon("Raichu", "60", "90", "55", "90", "80", "110", "electric", null); list.add(Raichu);
		Pokemon Raikou=new Pokemon("Raikou", "90", "85", "75", "115", "100", "115", "electric", null); list.add(Raikou);
		Pokemon Ralts=new Pokemon("Ralts", "28", "25", "25", "45", "35", "40", "psychic", "fairy"); list.add(Ralts);
		Pokemon Rampardos=new Pokemon("Rampardos", "97", "165", "60", "65", "50", "58", "rock", null); list.add(Rampardos);
		Pokemon Rapidash=new Pokemon("Rapidash", "65", "100", "70", "80", "80", "105", "fire", null); list.add(Rapidash);
		Pokemon Raticate=new Pokemon("Raticate", "55", "81", "60", "50", "70", "97", "normal", null); list.add(Raticate);
		Pokemon Rattata=new Pokemon("Rattata", "30", "56", "35", "25", "35", "72", "normal", null); list.add(Rattata);
		Pokemon Rayquaza=new Pokemon("Rayquaza", "105", "150", "90", "150", "90", "95", "dragon", "flying"); list.add(Rayquaza);
		
		Pokemon Regice=new Pokemon("Regice", "80", "50", "100", "100", "200", "50", "ice", null); list.add(Regice);
		Pokemon Regigigas=new Pokemon("Regigigas", "110", "160", "100", "80", "110", "100", "normal", null); list.add(Regigigas);
		Pokemon Regirock=new Pokemon("Regirock", "80", "100", "200", "50", "100", "50", "rock", null); list.add(Regirock);
		Pokemon Registeel=new Pokemon("Registeel", "80", "75", "150", "75", "150", "50", "steel", null); list.add(Registeel);
		Pokemon Relicanth=new Pokemon("Relicanth", "100", "90", "130", "45", "65", "55", "rock", "water"); list.add(Relicanth);
		Pokemon Remoraid=new Pokemon("Remoraid", "35", "65", "35", "65", "35", "65", "water", null); list.add(Remoraid);
		Pokemon Reshiram=new Pokemon("Reshiram", "100", "120", "100", "150", "120", "90", "dragon", "fire"); list.add(Reshiram);
		Pokemon Reuniclus=new Pokemon("Reuniclus", "110", "65", "75", "125", "85", "30", "psychic", null); list.add(Reuniclus);
		Pokemon Rhydon=new Pokemon("Rhydon", "105", "130", "120", "45", "45", "40", "rock", "ground"); list.add(Rhydon);
		Pokemon Rhyhorn=new Pokemon("Rhyhorn", "80", "85", "95", "30", "30", "25", "rock", "ground"); list.add(Rhyhorn);
		Pokemon Rhyperior=new Pokemon("Rhyperior", "115", "140", "130", "55", "55", "40", "rock", "ground"); list.add(Rhyperior);
		Pokemon Riolu=new Pokemon("Riolu", "40", "70", "40", "35", "40", "60", "fighting", null); list.add(Riolu);
		Pokemon Roggenrola=new Pokemon("Roggenrola", "55", "75", "85", "25", "25", "15", "rock", "ground"); list.add(Roggenrola);
		Pokemon Roselia=new Pokemon("Roselia", "50", "60", "45", "100", "80", "65", "poison", "grass"); list.add(Roselia);
		Pokemon Roserade=new Pokemon("Roserade", "60", "70", "65", "125", "105", "90", "grass", "poison"); list.add(Roserade);
		Pokemon RotomFa=new Pokemon("Rotom-Fan", "50", "65", "107", "105", "107", "86", "electric", "flying"); list.add(RotomFa);
		Pokemon RotomFr=new Pokemon("Rotom-Frost", "50", "65", "107", "105", "107", "86", "electric", "ice"); list.add(RotomFr);
		Pokemon RotomH=new Pokemon("Rotom-Heat", "50", "65", "107", "105", "107", "86", "electric", "fire"); list.add(RotomH);
		Pokemon RotomM=new Pokemon("Rotom-Mow", "50", "65", "107", "105", "107", "86", "electric", "grass"); list.add(RotomM);
		Pokemon Rotom=new Pokemon("Rotom", "50", "50", "77", "95", "77", "91", "electric", "ghost"); list.add(Rotom);
		Pokemon RotomW=new Pokemon("Rotom-Wash", "50", "65", "107", "105", "107", "86", "electric", "water"); list.add(RotomW);	
		Pokemon Rufflet=new Pokemon("Rufflet", "70", "83", "50", "37", "50", "60", "flying", "normal"); list.add(Rufflet);
		Pokemon Sableye=new Pokemon("Sableye", "50", "75", "75", "65", "65", "50", "ghost", "dark"); list.add(Sableye);
		
		Pokemon Salamence=new Pokemon("Salamence", "95", "135", "80", "110", "80", "100", "dragon", "flying"); list.add(Salamence);
		
		Pokemon Samurott=new Pokemon("Samurott", "95", "100", "85", "108", "70", "70", "water", null); list.add(Samurott);
		Pokemon Sandile=new Pokemon("Sandile", "50", "72", "35", "35", "35", "65", "ground", "dark"); list.add(Sandile);
		Pokemon Sandshrew=new Pokemon("Sandshrew", "50", "75", "85", "20", "30", "40", "ground", null); list.add(Sandshrew);
		Pokemon Sandslash=new Pokemon("Sandslash", "75", "100", "110", "45", "55", "65", "ground", null); list.add(Sandslash);
		Pokemon Sawk=new Pokemon("Sawk", "75", "125", "75", "30", "75", "85", "fighting", null); list.add(Sawk);
		Pokemon Sawsbuck=new Pokemon("Sawsbuck", "80", "100", "70", "60", "70", "95", "normal", "grass"); list.add(Sawsbuck);
		Pokemon Scatterbug=new Pokemon("Scatterbug", "38", "35", "40", "27", "25", "35", "bug", null); list.add(Scatterbug);
		Pokemon Sceptile=new Pokemon("Sceptile", "70", "85", "65", "105", "85", "120", "grass", null); list.add(Sceptile);
		
		Pokemon Scizor=new Pokemon("Scizor", "70", "130", "100", "55", "80", "65", "bug", "steel"); list.add(Scizor);
		
		Pokemon Scolipede=new Pokemon("Scolipede", "60", "100", "89", "55", "69", "112", "bug", "poison"); list.add(Scolipede);
		Pokemon Scrafty=new Pokemon("Scrafty", "65", "90", "115", "45", "115", "58", "fighting", "dark"); list.add(Scrafty);
		Pokemon Scraggy=new Pokemon("Scraggy", "50", "75", "70", "35", "70", "48", "fighting", "dark"); list.add(Scraggy);
		Pokemon Scyther=new Pokemon("Scyther", "70", "110", "80", "55", "80", "105", "bug", "flying"); list.add(Scyther);
		Pokemon Seadra=new Pokemon("Seadra", "55", "65", "95", "95", "45", "85", "water", null); list.add(Seadra);
		Pokemon Seaking=new Pokemon("Seaking", "80", "92", "65", "65", "80", "68", "water", null); list.add(Seaking);
		Pokemon Sealeo=new Pokemon("Sealeo", "90", "60", "70", "75", "70", "45", "water", null); list.add(Sealeo);
		Pokemon Seedot=new Pokemon("Seedot", "40", "40", "50", "30", "30", "30", "grass", null); list.add(Seedot);
		Pokemon Seel=new Pokemon("Seel", "65", "45", "55", "45", "70", "45", "water", null); list.add(Seel);
		Pokemon Seismitoad=new Pokemon("Seismitoad", "105", "95", "75", "85", "75", "74", "water", "ground"); list.add(Seismitoad);
		Pokemon Sentret=new Pokemon("Sentret", "35", "46", "34", "35", "45", "20", "normal", null); list.add(Sentret);
		Pokemon Serperior=new Pokemon("Serperior", "75", "75", "95", "75", "95", "113", "grass", null); list.add(Serperior);
		Pokemon Servine=new Pokemon("Servine", "60", "60", "75", "60", "75", "83", "grass", null); list.add(Servine);
		Pokemon Seviper=new Pokemon("Seviper", "73", "100", "60", "100", "60", "65", "poison", null); list.add(Seviper);
		Pokemon Sewaddle=new Pokemon("Sewaddle", "45", "53", "70", "40", "60", "42", "bug", "grass"); list.add(Sewaddle);
		Pokemon Sharpedo=new Pokemon("Sharpedo", "70", "120", "40", "95", "40", "95", "water", "dark"); list.add(Sharpedo);
		
		Pokemon Shaymin=new Pokemon("Shaymin", "100", "100", "100", "100", "100", "100", "grass", null); list.add(Shaymin);
		Pokemon ShayminS=new Pokemon("Shaymin-Sky", "100", "103", "75", "120", "75", "127", "grass", null); list.add(ShayminS);
		Pokemon Shedinja=new Pokemon("Shedinja", "1", "90", "45", "30", "30", "40", "ghost", "bug"); list.add(Shedinja);
		Pokemon Shelgon=new Pokemon("Shelgon", "65", "95", "100", "60", "50", "50", "dragon", null); list.add(Shelgon);
		Pokemon Shellder=new Pokemon("Shellder", "30", "65", "100", "45", "25", "40", "water", "ice"); list.add(Shellder);
		Pokemon Shellos=new Pokemon("Shellos", "76", "48", "48", "57", "62", "34", "ground", "water"); list.add(Shellos);
		Pokemon Shelmet=new Pokemon("Shelmet", "50", "40", "85", "40", "65", "25", "bug", null); list.add(Shelmet);
		Pokemon Shieldon=new Pokemon("Shieldon", "30", "42", "118", "42", "88", "30", "rock", "steel"); list.add(Shieldon);
		Pokemon Shiftry=new Pokemon("Shiftry", "90", "100", "60", "90", "60", "80", "grass", "dark"); list.add(Shiftry);
		Pokemon Shinx=new Pokemon("Shinx", "45", "65", "34", "40", "34", "45", "electric", null); list.add(Shinx);
		Pokemon Shroomish=new Pokemon("Shroomish", "60", "40", "60", "40", "60", "35", "grass", "poison"); list.add(Shroomish);
		Pokemon Shuckle=new Pokemon("Shuckle", "20", "10", "230", "10", "230", "5", "rock", "bug"); list.add(Shuckle);
		Pokemon Shuppet=new Pokemon("Shuppet", "44", "75", "35", "63", "33", "45", "ghost", null); list.add(Shuppet);
		Pokemon Sigilyph=new Pokemon("Sigilyph", "72", "58", "80", "103", "80", "97", "psychic", "flying"); list.add(Sigilyph);
		Pokemon Silcoon=new Pokemon("Silcoon", "50", "35", "55", "25", "25", "15", "bug", null); list.add(Silcoon);
		Pokemon Simipour=new Pokemon("Simipour", "75", "98", "63", "98", "63", "101", "water", null); list.add(Simipour);
		Pokemon Simisage=new Pokemon("Simisage", "75", "98", "63", "98", "63", "101", "grass", null); list.add(Simisage);
		Pokemon Simisear=new Pokemon("Simisear", "75", "98", "63", "98", "63", "101", "fire", null); list.add(Simisear);
		Pokemon Skarmory=new Pokemon("Skarmory", "65", "80", "140", "40", "70", "70", "flying", "steel"); list.add(Skarmory);
		Pokemon Skiddo=new Pokemon("Skiddo", "66", "65", "48", "62", "57", "52", "grass", null); list.add(Skiddo);
		Pokemon Skiploom=new Pokemon("Skiploom", "55", "45", "50", "45", "65", "80", "grass", "flying"); list.add(Skiploom);
		Pokemon Skitty=new Pokemon("Skitty", "50", "45", "45", "35", "35", "50", "normal", null); list.add(Skitty);
		Pokemon Skorupi=new Pokemon("Skorupi", "40", "50", "90", "30", "55", "65", "bug", "poison"); list.add(Skorupi);
		Pokemon Skrelp=new Pokemon("Skrelp", "50", "60", "60", "60", "60", "30", "poison", "water"); list.add(Skrelp);
		Pokemon Skuntank=new Pokemon("Skuntank", "103", "93", "67", "71", "61", "84", "poison", "dark"); list.add(Skuntank);
		Pokemon Slaking=new Pokemon("Slaking", "150", "160", "100", "95", "65", "100", "normal", null); list.add(Slaking);
		Pokemon Slakoth=new Pokemon("Slakoth", "60", "60", "60", "35", "35", "30", "normal", null); list.add(Slakoth);
		Pokemon Sliggoo=new Pokemon("Sliggoo", "68", "75", "53", "83", "113", "60", "dragon", null); list.add(Sliggoo);
		Pokemon Slowbro=new Pokemon("Slowbro", "95", "75", "110", "100", "80", "30", "water", "psychic"); list.add(Slowbro);
		
		Pokemon Slowking=new Pokemon("Slowking", "95", "75", "80", "100", "110", "30", "water", "psychic"); list.add(Slowking);
		Pokemon Slowpoke=new Pokemon("Slowpoke", "90", "65", "65", "40", "40", "15", "water", "psychic"); list.add(Slowpoke);
		Pokemon Slugma=new Pokemon("Slugma", "82", "80", "86", "85", "75", "72", "fire", null); list.add(Slugma);
		Pokemon Slurpuff=new Pokemon("Slurpuff", "82", "80", "86", "85", "75", "72", "fairy", null); list.add(Slurpuff);
		Pokemon Smeargle=new Pokemon("Smeargle", "55", "20", "35", "20", "45", "75", "normal", null); list.add(Smeargle);
		Pokemon Smoochum=new Pokemon("Smoochum", "45", "30", "15", "85", "65", "65", "ice", "psychic"); list.add(Smoochum);
		Pokemon Sneasel=new Pokemon("Sneasel", "55", "95", "55", "35", "75", "115", "dark", "ice"); list.add(Sneasel);
		Pokemon Snivy=new Pokemon("Snivy", "45", "45", "55", "45", "55", "63", "grass", null); list.add(Snivy);
		Pokemon Snorlax=new Pokemon("Snorlax", "160", "110", "65", "65", "110", "30", "normal", null); list.add(Snorlax);
		Pokemon Snorunt=new Pokemon("Snorunt", "50", "50", "50", "50", "50", "50", "ice", null); list.add(Snorunt);
		Pokemon Snover=new Pokemon("Snover", "60", "62", "50", "62", "60", "40", "grass", "ice"); list.add(Snover);
		Pokemon Snubbull=new Pokemon("Snubbull", "60", "80", "50", "40", "40", "30", "fairy", null); list.add(Snubbull);
		Pokemon Solosis=new Pokemon("Solosis", "45", "30", "40", "105", "50", "20", "psychic", null); list.add(Solosis);
		Pokemon Solrock=new Pokemon("Solrock", "70", "95", "85", "55", "65", "70", "rock", "psychic"); list.add(Solrock);
		Pokemon Spearow=new Pokemon("Spearow", "40", "60", "30", "31", "31", "70", "flying", "normal"); list.add(Spearow);
		Pokemon Spewpa=new Pokemon("Spewpa", "45", "22", "60", "27", "30", "29", "bug", null); list.add(Spewpa);
		Pokemon Spheal=new Pokemon("Spheal", "70", "40", "50", "55", "50", "25", "ice", "water"); list.add(Spheal);
		Pokemon Spinarak=new Pokemon("Spinarak", "40", "60", "40", "40", "40", "30", "bug", "poison"); list.add(Spinarak);
		Pokemon Spinda=new Pokemon("Spinda", "60", "60", "60", "60", "60", "60", "normal", null); list.add(Spinda);
		Pokemon Spiritomb=new Pokemon("Spiritomb", "50", "92", "108", "92", "108", "35", "dark", "ghost"); list.add(Spiritomb);
		Pokemon Spoink=new Pokemon("Spoink", "60", "25", "35", "70", "80", "60", "psychic", null); list.add(Spoink);
		Pokemon Spritzee=new Pokemon("Spritzee", "78", "52", "60", "63", "65", "23", "fairy", null); list.add(Spritzee);
		Pokemon Squirtle=new Pokemon("Squirtle", "44", "48", "65", "50", "64", "43", "water", null); list.add(Squirtle);
		Pokemon Stantler=new Pokemon("Stantler", "73", "95", "62", "85", "65", "85", "normal", null); list.add(Stantler);
		Pokemon Staraptor=new Pokemon("Staraptor", "85", "120", "70", "50", "60", "100", "flying", "normal"); list.add(Staraptor);
		Pokemon Staravia=new Pokemon("Staravia", "55", "75", "50", "40", "40", "80", "flying", "normal"); list.add(Staravia);
		Pokemon Starly=new Pokemon("Starly", "40", "50", "30", "30", "30", "60", "flying", "normal"); list.add(Starly);
		Pokemon Starmie=new Pokemon("Starmie", "60", "75", "85", "100", "85", "115", "water", "psychic"); list.add(Starmie);
		Pokemon Staryu=new Pokemon("Staryu", "30", "45", "55", "70", "65", "30", "water", null); list.add(Staryu);
		Pokemon Steelix=new Pokemon("Steelix", "75", "85", "200", "55", "65", "30", "steel", "ground"); list.add(Steelix);
		
		Pokemon Stoutland=new Pokemon("Stoutland", "85", "110", "90", "45", "90", "80", "normal", null); list.add(Stoutland);
		Pokemon Stunfisk=new Pokemon("Stunfisk", "109", "66", "84", "81", "99", "32", "electric", "ground"); list.add(Stunfisk);
		Pokemon Stunky=new Pokemon("Stunky", "63", "63", "47", "41", "41", "74", "dark", "poison"); list.add(Stunky);
		Pokemon Sudowoodo=new Pokemon("Sudowoodo", "70", "100", "115", "30", "65", "30", "rock", null); list.add(Sudowoodo);
		Pokemon Suicune=new Pokemon("Suicune", "100", "75", "115", "90", "115", "85", "water", null); list.add(Suicune);
		Pokemon Sunflora=new Pokemon("Sunflora", "75", "75", "55", "105", "85", "30", "grass", null); list.add(Sunflora);
		Pokemon Sunkern=new Pokemon("Sunkern", "30", "30", "30", "30", "30", "30", "grass", null); list.add(Sunkern);
		Pokemon Surskit=new Pokemon("Surskit", "40", "30", "42", "50", "52", "65", "bug", "water"); list.add(Surskit);
		Pokemon Swablu=new Pokemon("Swablu", "45", "40", "60", "40", "75", "50", "flying", "normal"); list.add(Swablu);
		Pokemon Swadloon=new Pokemon("Swadloon", "55", "63", "90", "50", "80", "42", "bug", "grass"); list.add(Swadloon);
		Pokemon Swalot=new Pokemon("Swalot", "100", "73", "83", "73", "83", "55", "poison", null); list.add(Swalot);
		Pokemon Swampert=new Pokemon("Swampert", "100", "110", "90", "85", "90", "60", "ground", "water"); list.add(Swampert);
		
		Pokemon Swanna=new Pokemon("Swanna", "75", "87", "63", "87", "63", "98", "flying", "water"); list.add(Swanna);
		Pokemon Swellow=new Pokemon("Swellow", "60", "85", "60", "50", "50", "125", "flying", "normal"); list.add(Swellow);
		Pokemon Swinub=new Pokemon("Swinub", "50", "50", "40", "30", "30", "50", "ice", "ground"); list.add(Swinub);
		Pokemon Swirlix=new Pokemon("Swirlix", "62", "48", "66", "59", "57", "49", "fairy", null); list.add(Swirlix);
		Pokemon Swoobat=new Pokemon("Swoobat", "67", "57", "55", "77", "55", "114", "flying", "psychic"); list.add(Swoobat);
		Pokemon Sylveon=new Pokemon("Sylveon", "95", "65", "65", "110", "130", "60", "fairy", null); list.add(Sylveon);
		Pokemon Taillow=new Pokemon("Tailow", "40", "55", "30", "30", "30", "85", "flying", "normal"); list.add(Taillow);
		Pokemon Talonflame=new Pokemon("Talonflame", "78", "81", "71", "74", "69", "126", "flying", "fire"); list.add(Talonflame);
		Pokemon Tangela=new Pokemon("Tangela", "65", "55", "115", "100", "40", "60", "grass", null); list.add(Tangela);
		Pokemon Tangrowth=new Pokemon("Tangrowth", "100", "100", "125", "110", "50", "50", "grass", null); list.add(Tangrowth);
		Pokemon Tauros=new Pokemon("Tauros", "75", "100", "95", "40", "70", "110", "normal", null); list.add(Tauros);
		Pokemon Teddiursa=new Pokemon("Teddiursa", "60", "80", "50", "50", "50", "40", "normal", null); list.add(Teddiursa);
		Pokemon Tentacool=new Pokemon("Tentacool", "40", "40", "35", "50", "100", "70", "water", "poison"); list.add(Tentacool);
		Pokemon Tentacruel=new Pokemon("Tentacruel", "80", "70", "65", "80", "120", "100", "water", "poison"); list.add(Tentacruel);
		Pokemon Tepig=new Pokemon("Tepig", "65", "63", "45", "45", "45", "45", "fire", null); list.add(Tepig);
		Pokemon Terrakion=new Pokemon("Terrakion", "91", "129", "90", "72", "90", "108", "rock", "fighting"); list.add(Terrakion);
		Pokemon Throh=new Pokemon("Throh", "120", "100", "85", "30", "85", "45", "fighting", null); list.add(Throh);
		Pokemon Thundurus=new Pokemon("Thundurus", "79", "115", "70", "125", "80", "111", "flying", "electric"); list.add(Thundurus);
		Pokemon ThundurusT=new Pokemon("Thundurus-Therian", "79", "105", "70", "145", "80", "101", "flying", "electric"); list.add(ThundurusT);
		Pokemon Timburr=new Pokemon("Timburr", "75", "80", "55", "25", "35", "35", "fighting", null); list.add(Timburr);
		Pokemon Tirtouga=new Pokemon("Tirtouga", "54", "78", "103", "53", "45", "22", "rock", "water"); list.add(Tirtouga);
		Pokemon Togekiss=new Pokemon("Togekiss", "85", "50", "95", "120", "115", "80", "flying", "fairy"); list.add(Togekiss);
		Pokemon Togepi=new Pokemon("Togepi", "35", "20", "65", "40", "65", "20", "fairy", null); list.add(Togepi);
		Pokemon Togetic=new Pokemon("Togetic", "55", "40", "85", "80", "105", "40", "fairy", "flying"); list.add(Togetic);
		Pokemon Torchic=new Pokemon("Torchic", "45", "60", "40", "70", "50", "45", "fire", null); list.add(Torchic);
		Pokemon Torkoal=new Pokemon("Torkoal", "70", "85", "140", "85", "70", "20", "fire", null); list.add(Torkoal);
		Pokemon Tornadus=new Pokemon("Tornadus", "79", "115", "70", "125", "80", "111", "flying", null); list.add(Tornadus);
		Pokemon TornadusT=new Pokemon("Tornadus-Therian", "79", "110", "80", "110", "90", "121", "flying", null); list.add(TornadusT);
		Pokemon Torterra=new Pokemon("Torterra", "95", "109", "105", "75", "85", "56", "grass", "ground"); list.add(Torterra);
		Pokemon Totodile=new Pokemon("Totodile", "50", "65", "64", "44", "48", "43", "water", null); list.add(Totodile);
		Pokemon Toxicroak=new Pokemon("Toxicroak", "83", "106", "65", "86", "65", "85", "poison", "fighting"); list.add(Toxicroak);
		Pokemon Tranquill=new Pokemon("Tranquill", "62", "77", "62", "50", "42", "65", "flying", "normal"); list.add(Tranquill);
		Pokemon Trapinch=new Pokemon("Trapinch", "45", "100", "45", "45", "45", "10", "ground", null); list.add(Trapinch);
		Pokemon Treecko=new Pokemon("Treecko", "40", "45", "35", "65", "55", "70", "grass", null); list.add(Treecko);
		Pokemon Trevenant=new Pokemon("Trevenant", "85", "110", "76", "65", "82", "56", "grass", "ghost"); list.add(Trevenant);
		Pokemon Tropius=new Pokemon("Tropius", "99", "68", "83", "72", "87", "51", "grass", "flying"); list.add(Tropius);
		Pokemon Trubbish=new Pokemon("Trubbish", "50", "50", "62", "40", "62", "65", "poison", null); list.add(Trubbish);
		Pokemon Turtwig=new Pokemon("Turtwig", "55", "68", "64", "45", "55", "31", "grass", null); list.add(Turtwig);
		Pokemon Tympole=new Pokemon("Tympole", "50", "50", "40", "50", "40", "64", "water", null); list.add(Tympole);
		Pokemon Tynamo=new Pokemon("Tynamo", "35", "55", "40", "45", "40", "60", "electric", null); list.add(Tynamo);
		Pokemon Typhlosion=new Pokemon("Trphlosion", "78", "84", "78", "109", "85", "100", "fire", null); list.add(Typhlosion);
		Pokemon Tyranitar=new Pokemon("Tyranitar", "100", "134", "110", "95", "100", "61", "rock", "dark"); list.add(Tyranitar);
		
		Pokemon Tyrantrum=new Pokemon("Tyrantrum", "82", "121", "119", "69", "59", "71", "rock", "dragon"); list.add(Tyrantrum);
		Pokemon Tyrogue=new Pokemon("Tyrogue", "35", "35", "35", "35", "35", "35", "fighting", null); list.add(Tyrogue);
		Pokemon Tyrunt=new Pokemon("Tyrunt", "58", "89", "77", "45", "45", "48", "rock", "dragon"); list.add(Tyrunt);
		Pokemon Umbreon=new Pokemon("Umbreon", "95", "65", "110", "60", "130", "65", "dark", null); list.add(Umbreon);
		Pokemon Unfezant=new Pokemon("Unfezant", "80", "115", "80", "65", "55", "93", "flying", "normal"); list.add(Unfezant);
		Pokemon Unown=new Pokemon("Unown", "48", "72", "48", "72", "48", "48", "psychic", null); list.add(Unown);
		Pokemon Ursaring=new Pokemon("Ursaring", "90", "130", "75", "75", "75", "55", "normal", null); list.add(Ursaring);
		Pokemon Uxie=new Pokemon("Uxie", "75", "74", "130", "75", "130", "95", "psychic", null); list.add(Uxie);
		Pokemon Vanillish=new Pokemon("Vanillish", "51", "65", "65", "80", "75", "59", "ice", null); list.add(Vanillish);
		Pokemon Vanillite=new Pokemon("Vanillite", "36", "50", "50", "65", "60", "44", "ice", null); list.add(Vanillite);
		Pokemon Vanilluxe=new Pokemon("Vanilluxe", "71", "95", "85", "110", "95", "79", "ice", null); list.add(Vanilluxe);
		Pokemon Vaporeon=new Pokemon("Vaporeon", "130", "65", "60", "110", "95", "65", "water", null); list.add(Vaporeon);
		Pokemon Venipede=new Pokemon("Venipede", "30", "45", "59", "30", "39", "57", "bug", "poison"); list.add(Venipede);
		Pokemon Venomoth=new Pokemon("Venomoth", "70", "65", "60", "90", "75", "90", "bug", "poison"); list.add(Venomoth);
		Pokemon Venonat=new Pokemon("Venonat", "60", "55", "50", "40", "55", "45", "bug", "poison"); list.add(Venonat);
		Pokemon Venusaur=new Pokemon("Venusaur", "80", "82", "83", "100", "100", "80", "grass", "poison"); list.add(Venusaur);
		
		Pokemon Vespiquen=new Pokemon("Vespiquen", "70", "80", "102", "80", "102", "40", "bug", "flying"); list.add(Vespiquen);
		Pokemon Vibrava=new Pokemon("Vibrava", "50", "70", "50", "50", "50", "70", "ground", "dragon"); list.add(Vibrava);
		Pokemon Victini=new Pokemon("Victini", "100", "100", "100", "100", "100", "100", "fire", "psychic"); list.add(Victini);
		Pokemon Victreebel=new Pokemon("Victreebel", "80", "105", "65", "100", "70", "70", "grass", "poison"); list.add(Victreebel);
		Pokemon Vigoroth=new Pokemon("vigoroth", "80", "80", "80", "55", "55", "90", "normal", null); list.add(Vigoroth);
		Pokemon Vileplume=new Pokemon("Vileplume", "75", "80", "85", "110", "90", "50", "grass", "poison"); list.add(Vileplume);
		Pokemon Virizion=new Pokemon("Virizion", "91", "90", "72", "90", "129", "108", "grass", "fighting"); list.add(Virizion);
		Pokemon Vivillon=new Pokemon("Viillon", "80", "52", "50", "90", "129", "108", "bug", "flying"); list.add(Vivillon);
		Pokemon Volbeat=new Pokemon("Volbeat", "65", "73", "55", "47", "75", "85", "bug", null); list.add(Volbeat);
		Pokemon Volcarona=new Pokemon("Volcarona", "85", "60", "65", "135", "105", "100", "bug", "fire"); list.add(Volcarona);
		Pokemon Voltorb=new Pokemon("Voltorb", "40", "30", "50", "55", "55", "100", "electric", null); list.add(Voltorb);
		Pokemon Vullaby=new Pokemon("Vullaby", "70", "55", "75", "45", "65", "60", "dark", "flying"); list.add(Vullaby);
		Pokemon Vulpix=new Pokemon("Vulpix", "38", "41", "40", "50", "65", "65", "fire", null); list.add(Vulpix);
		Pokemon Wailmer=new Pokemon("Wailmer", "130", "70", "35", "70", "35", "60", "water", null); list.add(Wailmer);
		Pokemon Wailord=new Pokemon("Wailord", "170", "90", "45", "90", "45", "60", "water", null); list.add(Wailord);
		Pokemon Walrein=new Pokemon("Walrein", "110", "80", "90", "95", "90", "65", "water", "ice"); list.add(Walrein);
		Pokemon Wartortle=new Pokemon("Wartortle", "59", "63", "80", "65", "80", "58", "water", null); list.add(Wartortle);
		Pokemon Watchog=new Pokemon("Watchog", "60", "85", "69", "60", "69", "77", "normal", null); list.add(Watchog);
		Pokemon Weavile=new Pokemon("Weavile", "70", "120", "65", "45", "85", "125", "dark", "ice"); list.add(Weavile);
		Pokemon Weedle=new Pokemon("Weedle", "40", "35", "30", "20", "20", "50", "bug", "poison"); list.add(Weedle);
		Pokemon Weepinbell=new Pokemon("Weepinbell", "65", "90", "50", "85", "45", "55", "grass", "poison"); list.add(Weepinbell);
		Pokemon Weezing=new Pokemon("Weezing", "65", "90", "120", "85", "70", "60", "poison", null); list.add(Weezing);
		Pokemon Whimsicott=new Pokemon("Whimsicott", "60", "67", "85", "77", "75", "116", "grass", "fairy"); list.add(Whimsicott);
		Pokemon Whirlipede=new Pokemon("Whirlipede", "40", "55", "99", "40", "79", "47", "bug", "poison"); list.add(Whirlipede);
		Pokemon Whiscash=new Pokemon("Whiscash", "110", "78", "73", "76", "71", "60", "water", "ground"); list.add(Whiscash);
		Pokemon Whismur=new Pokemon("Whismur", "64", "51", "23", "51", "23", "28", "normal", null); list.add(Whismur);
		Pokemon Wigglytuff=new Pokemon("Wigglytuff", "140", "70", "45", "85", "50", "45", "fairy", "normal"); list.add(Wigglytuff);
		Pokemon Wingull=new Pokemon("Wingull", "40", "30", "30", "55", "30", "85", "flying", "water"); list.add(Wingull);
		Pokemon Wobbuffet=new Pokemon("Wobbuffet", "190", "33", "58", "33", "58", "33", "psychic", null); list.add(Wobbuffet);
		Pokemon Woobat=new Pokemon("Woobat", "55", "45", "43", "55", "43", "72", "flying", "psychic"); list.add(Woobat);
		Pokemon Wooper=new Pokemon("Wooper", "55", "45", "45", "25", "25", "15", "ground", "water"); list.add(Wooper);
		Pokemon WormadamP=new Pokemon("Wormadam", "60", "59", "85", "79", "105", "36", "bug", "grass"); list.add(WormadamP);
		Pokemon WormadamS=new Pokemon("Wormadam-Sandy", "60", "79", "105", "59", "85", "36", "bug", "ground"); list.add(WormadamS);
		Pokemon WormadamT=new Pokemon("Wormadam-Trash", "60", "69", "95", "59", "95", "36", "bug", "steel"); list.add(WormadamT);
		Pokemon Wurmple=new Pokemon("Wurmple", "45", "45", "35", "20", "30", "20", "bug", null); list.add(Wurmple);
		Pokemon Wynaut=new Pokemon("Wynaut", "95", "23", "48", "23", "48", "23", "psychic", null); list.add(Wynaut);
		Pokemon Xatu=new Pokemon("Xatu", "65", "75", "70", "95", "70", "95", "flying", "psychic"); list.add(Xatu);
		Pokemon Xerneas=new Pokemon("Xerneas", "126", "131", "95", "131", "98", "99", "fairy", null); list.add(Xerneas);
		Pokemon Yamask=new Pokemon("Yamask", "38", "30", "85", "55", "65", "30", "ghost", null); list.add(Yamask);
		Pokemon Yanma=new Pokemon("Yanma", "65", "65", "45", "75", "45", "95", "bug", "flying"); list.add(Yanma);
		Pokemon Yanmega=new Pokemon("Yanmega", "86", "76", "86", "116", "56", "95", "bug", "flying"); list.add(Yanmega);
		Pokemon Yveltal=new Pokemon("Yveltal", "126", "131", "95", "131", "98", "99", "dark", "flying"); list.add(Yveltal);
		Pokemon Zangoose=new Pokemon("Zangoose", "73", "115", "60", "60", "60", "90", "normal", null); list.add(Zangoose);
		Pokemon Zapdos=new Pokemon("Zapdos", "90", "90", "85", "125", "90", "100", "electric", "flying"); list.add(Zapdos);
		Pokemon Zebstrika=new Pokemon("Zebstrika", "75", "100", "63", "80", "63", "100", "electric", null); list.add(Zebstrika);
		Pokemon Zekrom=new Pokemon("Zekrom", "100", "150", "120", "120", "100", "90", "electric", "dragon"); list.add(Zekrom);
		Pokemon Zigzagoon=new Pokemon("Zigzagoon", "38", "30", "41", "30", "41", "60", "normal", null); list.add(Zigzagoon);
		Pokemon Zoroark=new Pokemon("Zoroark", "60", "105", "60", "120", "60", "105", "dragon", "electric"); list.add(Zoroark);
		Pokemon Zorua=new Pokemon("Zorua", "40", "65", "40", "80", "40", "65", "dark", null); list.add(Zorua);
		Pokemon Zubat=new Pokemon("Zubat", "40", "45", "35", "30", "40", "55", "flying", "poison"); list.add(Zubat);
		Pokemon Zweilous=new Pokemon("Zweilous", "72", "85", "70", "65", "70", "58", "dark", "dragon"); list.add(Zweilous);
		Pokemon Zygarde=new Pokemon("Zygarde", "108", "100", "121", "81", "95", "95", "dragon", "ground"); list.add(Zygarde);
	}
	
	public String getName(){
		return stats[0];
	}
	
	public String getStats(){ //String result of the stats (used for Individual stats)
		String st="";
		for (int counter=1; counter<7; counter++){
			st+=stats[counter]+"   ";
		}
		return st;
	}
	
	public int[] receiveStats(){ //integer array result of the stats (used for Average Stats)
		int [] stat=new int [6];
			for (int counter=1; counter<7; counter++){
				stat[counter-1]=(int) Integer.parseInt(stats[counter]);
			}
		return stat;
	}
	
	public int [] getAverageStats(int [] stat1, int [] stat2, int [] stat3, int [] stat4, int [] stat5, int [] stat6, int divide){
		int [] Astats=new int [6];
			if(divide==0){
				Astats[0]=0; Astats[1]=0; Astats[2]=0; Astats[3]=0; Astats[4]=0; Astats[5]=0;
			}
			else{
		for (int counter=0; counter<6; counter++){//This shifts through the stats of the pokemon and finds the average 
			Astats[counter]=(stat1[counter]+stat2[counter]+stat3[counter]+stat4[counter]+stat5[counter]+stat6[counter])/divide;
			}
		}
		return Astats;
	}
	
	public String  getTypes(){
		String type="";
		for (int counter=0; counter<2; counter++){
			type+=stats[counter+7]+" ";
		}
		return type;
	}
	
	public void getSearch(String name){
		String result=""; 
	}
	
	public void save(ArrayList <Pokemon> listA){
		for (int counter=0; counter<list.size(); counter++){
			listA.add(list.get(counter));
		}
	}
	
	public double [] findWeaknesses(){
		//weaknesses go 0Normal, 1Fire, 2Water, 3Electric, 4Grass, 5Ice, 6Fighting, 7Poison, 8Ground, 9Flying, 10Psychic, 11Bug, 12Rock, 13Ghost, 14Dragon, 15Dark, 16Steel, 17Fairy 
		double [] weak1={1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0}; 
		String type1[]={"",""}; int position=0;
		
		for (int counter=0; counter<this.getTypes().length(); counter++){
			if (this.getTypes().substring(counter,counter+1).equals(" ")){ 	position++;	}
			else{type1[position]+=this.getTypes().substring(counter,counter+1);}
		}
		
		if (type1[0].equals("normal") || type1[1].equals("normal")){ weak1[6]=weak1[6]*2; weak1[13]*=0;} //normal weaknesses
	
		if (type1[0].equals("fire") || type1[1].equals("fire")){ weak1[1]=weak1[1]*.5; weak1[2]=weak1[2]*2; weak1[4]=weak1[4]*.5; weak1[5]=weak1[5]*.5; weak1[8]=weak1[8]*2; weak1[11]=weak1[11]*.5; weak1[12]=weak1[12]*2; weak1[16]=weak1[16]*.5; weak1[17]=weak1[17]*.5;  } //fire weaknesses
	
		if (type1[0].equals("water") || type1[1].equals("water")){ weak1[1]=weak1[1]*.5; weak1[2]=weak1[2]*.5; weak1[3]=weak1[3]*2; weak1[4]*=2; weak1[5]*=.5; weak1[16]*=.5;} //water weaknesses
		
		if (type1[0].equals("electric") || type1[1].equals("electric")){ weak1[3]*=.5; weak1[8]*=2; weak1[9]*=.5; weak1[16]*=.5;} //electric weaknesses
		
		if (type1[0].equals("grass") || type1[1].equals("grass")){ weak1[1]*=2; weak1[2]*=.5; weak1[3]*=.5; weak1[4]*=.5; weak1[5]*=2; weak1[7]*=2; weak1[8]*=.5; weak1[9]*=2; weak1[11]*=2;} //grass weaknesses
	
		if (type1[0].equals("ice") || type1[1].equals("ice")){ weak1[1]*=2; weak1[5]*=.5; weak1[6]*=2; weak1[12]*=2; weak1[16]*=2;} //ice weaknesses

		if (type1[0].equals("fighting") || type1[1].equals("fighting")){ weak1[9]*=2; weak1[10]*=2; weak1[11]*=.5; weak1[12]*=.5; weak1[15]*=.5; weak1[17]*=2;} //fighting weaknesses
		
		if (type1[0].equals("poison") || type1[1].equals("poison")){ weak1[4]*=.5; weak1[6]*=.5; weak1[7]*=.5; weak1[8]*=2; weak1[10]*=2; weak1[11]*=.5; weak1[17]*=.5;} //poison weaknesses
	
		if (type1[0].equals("ground") || type1[1].equals("ground")){ weak1[2]*=2; weak1[3]*=0; weak1[4]*=2; weak1[5]*=2; weak1[7]*=.5; weak1[12]*=.5;} //ground weaknesses
	
		if (type1[0].equals("flying") || type1[1].equals("flying")){ weak1[3]*=2; weak1[4]*=.5; weak1[5]*=2; weak1[8]*=0; weak1[11]*=.5; weak1[12]*=2;} //flying weaknesses
	
		if (type1[0].equals("psychic") || type1[1].equals("psychic")){ weak1[6]*=.5; weak1[10]*=.5; weak1[11]*=2; weak1[13]*=2; weak1[15]*=2;} //psychic weaknesses

		if (type1[0].equals("bug") || type1[1].equals("bug")){ weak1[1]*=2; weak1[4]*=.5; weak1[6]*=.5; weak1[8]*=.5; weak1[9]*=2; weak1[12]*=2; } //bug weaknesses

		if (type1[0].equals("rock") || type1[1].equals("rock")){ weak1[0]*=.5; weak1[1]*=.5; weak1[2]*=.5; weak1[2]*=2; weak1[4]*=2; weak1[6]*=2; weak1[7]*=.5; weak1[8]*=2; weak1[9]*=.5; weak1[16]*=2;} //rock weaknesses

		if (type1[0].equals("ghost") || type1[1].equals("ghost")){ weak1[0]*=0; weak1[6]*=0; weak1[7]*=.5; weak1[11]*=.5; weak1[13]*=2; weak1[15]*=2;} //ghost weaknesses

		if (type1[0].equals("dragon") || type1[1].equals("dragon")){ weak1[1]*=.5; weak1[2]*=.5; weak1[3]*=.5; weak1[4]*=.5; weak1[5]*=2; weak1[14]*=2; weak1[17]*=2;} //dragon weaknesses

		if (type1[0].equals("dark") || type1[1].equals("dark")){ weak1[6]*=2; weak1[10]*=0; weak1[11]*=2; weak1[13]*=.5; weak1[15]*=.5; weak1[17]*=2;} //dark weaknesses

		if (type1[0].equals("steel") || type1[1].equals("steel")){ weak1[0]*=.5; weak1[1]*=2; weak1[4]*=.5; weak1[5]*=.5; weak1[6]*=2; weak1[7]*=0; weak1[8]*=2; weak1[9]*=.5; weak1[10]*=.5; weak1[11]*=.5; weak1[12]*=.5; weak1[14]*=.5; weak1[16]*=.5; weak1[17]*=.5;} //steel weaknesses
	
		if (type1[0].equals("fairy") || type1[1].equals("fairy")){ weak1[6]*=.5; weak1[7]*=2; weak1[11]*=.5; weak1[14]*=0; weak1[15]*=.5; weak1[16]*=2;} //fairy weaknesses
		
		return weak1;
	}
	
	public void output(){
		System.out.println(list.size());
	}
	public void testPrint(){
		for(int counter=0; counter<3; counter++){
			System.out.println(list.size());
		}
	}
 
}
