import javax.swing.*;

import pokemon.*;
import stats.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.Math;
import java.util.ArrayList;
import java.lang.Thread;
public class Analyser implements ActionListener {
	
	
	//--------------------------------------------------------------------------------------------UI--------------------------------------------------------------------------------
	JFrame frame;
	JFrame newFrame;
	JPanel contentPane;
	JPanel newContentPane;
	JLabel title; 
	
	JFrame Statframe;
	JPanel statcontent;
	JLabel stattitle;
	
	
	
	JComboBox one;JComboBox two;JComboBox three; JComboBox four; JComboBox five; JComboBox six;				//Selection of Pokemon
	JComboBox oneAbility; JComboBox twoAbility; JComboBox threeAbility; JComboBox fourAbility; JComboBox fiveAbility; JComboBox sixAbility; //Ability

	JComboBox OneMoveOne; JComboBox OneMoveTwo; JComboBox OneMoveThree; JComboBox OneMoveFour;				//First pokemon moves
	JComboBox TwoMoveOne; JComboBox TwoMoveTwo; JComboBox TwoMoveThree; JComboBox TwoMoveFour;				//Second Pokemon moves
	JComboBox ThreeMoveOne; JComboBox ThreeMoveTwo; JComboBox ThreeMoveThree; JComboBox ThreeMoveFour;		//Third Pokemon moves
	JComboBox FourMoveOne; JComboBox FourMoveTwo; JComboBox FourMoveThree; JComboBox FourMoveFour;			//Fourth Pokemon moves
	JComboBox FiveMoveOne; JComboBox FiveMoveTwo; JComboBox FiveMoveThree; JComboBox FiveMoveFour;			//Fifth Pokemon moves
	JComboBox SixMoveOne; JComboBox SixMoveTwo; JComboBox SixMoveThree; JComboBox SixMoveFour;				//Sixth Pokemon moves
	JComboBox NatureOne; JComboBox NatureTwo; JComboBox NatureThree; JComboBox NatureFour; JComboBox NatureFive; JComboBox NatureSix;	//Natures for Pokemon 
	
	JComboBox Itemone; JComboBox Itemtwo; JComboBox Itemthree; JComboBox Itemfour; JComboBox Itemfive; JComboBox Itemsix;
	
	JTextField Nickname1;	JTextField Nickname2;	JTextField Nickname3;	JTextField Nickname4;	JTextField Nickname5;	JTextField Nickname6;
	
	
	
	
	JSpinner IVHP;	JSpinner IVAT;	JSpinner IVDE;	JSpinner IVSA;	JSpinner IVSD;	JSpinner IVSP;
	JSpinner EVHP;	JSpinner EVAT;	JSpinner EVDE;	JSpinner EVSA;	JSpinner EVSD;	JSpinner EVSP;

	JSpinner Level;
	
	JButton stat1; JButton stat2; JButton stat3; JButton stat4; JButton stat5; JButton stat6; JButton realStat;
	JButton close; JButton output;
	JCheckBox shiny1; JCheckBox shiny2; JCheckBox shiny3; JCheckBox shiny4; JCheckBox shiny5; JCheckBox shiny6; 
	
	//----------------------------------------------------------------------------------------Variables------------------------------------------------------------------------------
	private String [] hi={"Test","100","100","100","100","100","100","fire","ice"};
	public ArrayList <Pokemon> listA=new ArrayList <Pokemon>();	
	public ArrayList <Moves> listB=new ArrayList<Moves>();
			
	 public int [] coverNumber=new int [18];
	 public String [] coverName=new String [18];
	 
	 
	 Integer oneHPIV=31; Integer oneAttIV=31; Integer oneDefIV=31; Integer oneSAtIV=31; Integer oneSDeIV=31; Integer oneSpeIV=31;
	 Integer twoHPIV=31; Integer twoAttIV=31; Integer twoDefIV=31; Integer twoSAtIV=31; Integer twoSDeIV=31; Integer twoSpeIV=31;
	 Integer threeHPIV=31; Integer threeAttIV=31; Integer threeDefIV=31; Integer threeSAtIV=31; Integer threeSDeIV=31; Integer threeSpeIV=31;
	 Integer fourHPIV=31; Integer fourAttIV=31; Integer fourDefIV=31; Integer fourSAtIV=31; Integer fourSDeIV=31; Integer fourSpeIV=31;
	 Integer fiveHPIV=31; Integer fiveAttIV=31; Integer fiveDefIV=31; Integer fiveSAtIV=31; Integer fiveSDeIV=31; Integer fiveSpeIV=31;
	 Integer sixHPIV=31; Integer sixAttIV=31; Integer sixDefIV=31; Integer sixSAtIV=31; Integer sixSDeIV=31; Integer sixSpeIV=31;
	 
	 Integer oneHPEV=0; Integer oneAttEV=0; Integer oneDefEV=0; Integer oneSAtEV=0; Integer oneSDeEV=0; Integer oneSpeEV=0;
	 Integer twoHPEV=0; Integer twoAttEV=0; Integer twoDefEV=0; Integer twoSAtEV=0; Integer twoSDeEV=0; Integer twoSpeEV=0;
	 Integer threeHPEV=0; Integer threeAttEV=0; Integer threeDefEV=0; Integer threeSAtEV=0; Integer threeSDeEV=0; Integer threeSpeEV=0;
	 Integer fourHPEV=0; Integer fourAttEV=0; Integer fourDefEV=0; Integer fourSAtEV=0; Integer fourSDeEV=0; Integer fourSpeEV=0;
	 Integer fiveHPEV=0; Integer fiveAttEV=0; Integer fiveDefEV=0; Integer fiveSAtEV=0; Integer fiveSDeEV=0; Integer fiveSpeEV=0;
	 Integer sixHPEV=0; Integer sixAttEV=0; Integer sixDefEV=0; Integer sixSAtEV=0; Integer sixSDeEV=0; Integer sixSpeEV=0;
	  
	boolean sOne=false; boolean sTwo=false; boolean sThree=false; boolean sFour=false; boolean sFive=false; boolean sSix=false; 
		
	Pokemon test=new Pokemon(hi);
	Moves test1=new Moves("test",false,"ice", "it does nothing cause this is a test.");

	Stats test2=new Stats("hello");
	
	private Integer level=100;
	public String [] abilityList=new String [3];
	private String [] pokemonList=new String [743];
	private String [] moveList=new String [621];
	private String [] natureList={"Adamant","Bashful","Bold","Brave","Calm","Careful","Docile","Gentle","Hardy","Hasty","Impish", "Jolly", "Lax", "Lonely", "Mild", "Modest","Naive", "Naughty","Quiet","Quircky","Rash","Relaxed","Sassy","Serious","Timid"};
	public String[] itemList={"none","Abomasite","Absolite","Absorb Bulb","Aerodactylite","Aggronite","Air Balloon","Alakazite","Altarianite","Ampharosite","Amulet Coin","Aquav Berry","Aspear Berry","Assault Vest","Audinite","Babiri Berry","Banettite","Beedrillite","Big Root","Binding Band","Black Belt","Black Glasses","Black Sludge","Blastoisinite","Blazikenite","Blue Orb","Bright Powder","Bug Gem","Cameruptite","Cell Battery","Charcoal","Charizardite X","Charizardite Y","Charti Berry","Cheri Berry","Chesto Berry","Chilan Berry","Choice Band","Choice Scarf","Choice Specs","Chople Berry","Coba Berry","Colbur Berry","Custap Berry","Damp Rock","Dark Gem","Deep Sea Scale","Deep Sea Tooth","Destiny Knot","Diancite","Draco Plate","Dragon Fang","Dragon Gem","Dread Plate","Earth Plate","Eject Button","Electric Gem","Enigma Berry","Eviolite","Expert Belt","Fairy Gem","Fighting Gem","Figy Berry","Fire Gem","Fist Plate","Flame Orb","Flame Plate","Float Stone","Flying Gem","Focus Band","Focus Sash","Full Incense","Galladite","Ganlon Berry","Garchompite","Gardevoirite","Gengarite","Ghost Gem","Glalitite","Grass Gem","Grip Claw","Ground Gem","Gyaradosite","Haban Berry","Hard Stone","Heat Rock","Heracronite","Houndoominite","Iapapa Berry","Ice Gem","Icicle Plate","Icy Rock","Insect Plate","Iron Ball","Iron Plate","Jaboca Berry","Kangaskhanite","Kasib Berry","Kebia Berry","Kee Berry","King's Rock","Lagging Tail","Latiasite","Latiosite","Lax Incense","Leftovers","Leppa Berry","Liechi Berry","Life Orb","Light Ball","Light Clay","Lopunnite","Lucarionite","Luck Incense","Lucky Punch","Lum Berry","Luminous Moss","Magnet","Mago Berry","Manectite","Maranga Berry","Mawilite","Meadow Plate","Medichamite","Mental Herb","Metagrossite","Metal Coat","Metal Powder","Metronome","Mewtwonite X","Mewtwonite Y","Micle Berry","Mind Plate","Miracle Seed","Muscle Band","Mystic Water","Never-Melt Ice","Normal Gem","Occa Berry","Odd Incense","Oran Berry","Passho Berry","Payapa Berry","Pecha Berry","Persim Berry","Petaya Berry","Pidgeotite","Pinsirite","Pixie Plate","Poison Barb","Poison Gem","Power Herb","Psychic Gem","Pure Incense","Quick Claw","Quick Powder","Rawst Berry","Red Card","Red Orb","Rindo Berry","Ring Target","Rock Gem","Rock Incense","Rocky Helmet","Rose Incense","Roseli Berry","Rowap Berry","Sablenite","Safety Goggles","Salac Berry","Salamencite","Sceptilite","Scizorite","Scope Lens","Sea Incense","Sharp Beak","Sharpedonite","Shed Shell","Shell Bell","Shuca Berry","Silk Scarf","Silver Powder","Sitrus Berry","Sky Plate","Slowbronite","Smoke Ball","Smooth Rock","Snowball","Soft Sand","Soul Dew","Spell Tag","Splash Plate","Spooky Plate","Starf Berry","Steel Gem","Steelixite","Stick","Sticky Barb","Stone Plate","Swampertite","Tanga Berry","Thick Club","Toxic Orb","Toxic Plate","Twisted Spoon","Tyranitarite"	,"Venusaurite","Wacan Berry","Water Gem","Wave Incense","Weakness Policy","White Herb","Wide Lens","Wiki Berry","Wise Glasses","Yache Berry","Zap Plate","Zoom Lens"};
	
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------START UP---------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public Analyser(){
		frame=new JFrame("Pokemon Team Analyser");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createIntro();
	}
	
	
	 //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 //-------------------------------------------------------------------------------------START UP PROCESS---------------------------------------------------------------------------------------------
	 //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	   
	public void createIntro(){
		
		contentPane=new JPanel(new GridBagLayout());
		contentPane.setLayout(new GridLayout(7,7,0,0));

		frame.setContentPane(contentPane);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(1400, 400);
		
		
		test.setup();  test.save(listA);
		test1.moveSetUp(); test1.save(listB);
		for (int counter=0; counter<listA.size(); counter++){
			 pokemonList[counter]=((listA.get(counter).getName()));
		}
		for (int counter=0; counter<listB.size(); counter++){
			moveList[counter]=((listB.get(counter).getName()));
		}
		
		one = new JComboBox(pokemonList);
		one.setEditable(false);
		
		one.getEditor().getEditorComponent().setBackground(Color.YELLOW);
	
		
		two = new JComboBox(pokemonList);
		two.setEditable(false);
	
		
		three = new JComboBox(pokemonList);
		three.setEditable(false);

		
		four = new JComboBox(pokemonList);
		four.setEditable(false);

		five = new JComboBox(pokemonList);
		five.setEditable(false);

		
		six = new JComboBox(pokemonList);
		six.setEditable(false);
		
		Itemone=new JComboBox(itemList); Itemone.setEditable(false); Itemone.setToolTipText("Select the first pokemon's held item.");		
		Itemtwo=new JComboBox(itemList); Itemtwo.setEditable(false);	Itemtwo.setToolTipText("Select the second pokemon's held item.");	
		Itemthree=new JComboBox(itemList); Itemthree.setEditable(false); Itemthree.setToolTipText("Select the third pokemon's held item.");
		Itemfour=new JComboBox(itemList); Itemfour.setEditable(false);	Itemfour.setToolTipText("Select the fourth pokemon's held item.");	
		Itemfive=new JComboBox(itemList); Itemfive.setEditable(false);	Itemfive.setToolTipText("Select the fifth pokemon's held item.");	
		Itemsix=new JComboBox(itemList); Itemsix.setEditable(false); Itemsix.setToolTipText("Select the sixth pokemon's held item.");
		
		
		OneMoveOne=new JComboBox(moveList); OneMoveTwo=new JComboBox(moveList); OneMoveThree=new JComboBox(moveList);  OneMoveFour=new JComboBox(moveList);
		TwoMoveOne=new JComboBox(moveList); TwoMoveTwo=new JComboBox(moveList);  TwoMoveThree=new JComboBox(moveList);  TwoMoveFour=new JComboBox(moveList);
		ThreeMoveOne=new JComboBox(moveList); ThreeMoveTwo=new JComboBox(moveList);  ThreeMoveThree=new JComboBox(moveList); ThreeMoveFour=new JComboBox(moveList);
		FourMoveOne=new JComboBox(moveList); FourMoveTwo=new JComboBox(moveList);  FourMoveThree=new JComboBox(moveList);  FourMoveFour=new JComboBox(moveList);
		FiveMoveOne=new JComboBox(moveList); FiveMoveTwo=new JComboBox(moveList);  FiveMoveThree=new JComboBox(moveList);  FiveMoveFour=new JComboBox(moveList);
		SixMoveOne=new JComboBox(moveList); SixMoveTwo=new JComboBox(moveList);  SixMoveThree=new JComboBox(moveList);  SixMoveFour=new JComboBox(moveList);
		
		OneMoveOne.setEditable(false); OneMoveTwo.setEditable(false); OneMoveThree.setEditable(false);  OneMoveFour.setEditable(false);
		TwoMoveOne.setEditable(false); TwoMoveTwo.setEditable(false);  TwoMoveThree.setEditable(false);  TwoMoveFour.setEditable(false);
		ThreeMoveOne.setEditable(false); ThreeMoveTwo.setEditable(false);  ThreeMoveThree.setEditable(false); ThreeMoveFour.setEditable(false);
		FourMoveOne.setEditable(false); FourMoveTwo.setEditable(false);  FourMoveThree.setEditable(false);  FourMoveFour.setEditable(false);
		FiveMoveOne.setEditable(false); FiveMoveTwo.setEditable(false);  FiveMoveThree.setEditable(false);  FiveMoveFour.setEditable(false);
		SixMoveOne.setEditable(false); SixMoveTwo.setEditable(false);  SixMoveThree.setEditable(false);  SixMoveFour.setEditable(false);
		
		NatureOne=new JComboBox(natureList); NatureTwo=new JComboBox(natureList);  NatureThree=new JComboBox(natureList);  NatureFour=new JComboBox(natureList);  NatureFive=new JComboBox(natureList); NatureSix=new JComboBox(natureList); 
		NatureOne.setEditable(false); NatureTwo.setEditable(false); NatureThree.setEditable(false); NatureFour.setEditable(false); NatureFive.setEditable(false);  NatureSix.setEditable(false);
		
		stat1= new JButton(new ImageIcon("eviv.png")); stat2= new JButton(new ImageIcon("eviv.png"));  stat3= new JButton(new ImageIcon("eviv.png")); stat4= new JButton(new ImageIcon("eviv.png")); stat5= new JButton(new ImageIcon("eviv.png")); stat6= new JButton(new ImageIcon("eviv.png"));
		stat1.setActionCommand("stat1"); stat2.setActionCommand("stat2"); stat3.setActionCommand("stat3"); stat4.setActionCommand("stat4"); stat5.setActionCommand("stat5"); stat6.setActionCommand("stat6");
		stat1.addActionListener(this); stat2.addActionListener(this); stat3.addActionListener(this); stat4.addActionListener(this); stat5.addActionListener(this); stat6.addActionListener(this);
		
		
		abilityList=checkAbility(" ");
		oneAbility=new JComboBox(abilityList); 
		twoAbility=new JComboBox(abilityList); 
		threeAbility=new JComboBox(abilityList); 
		fourAbility=new JComboBox(abilityList); 
		fiveAbility=new JComboBox(abilityList); 
		sixAbility=new JComboBox(abilityList); 
		  
		shiny1=new JCheckBox("Shiny"); shiny1.setMnemonic(KeyEvent.VK_C); shiny1.setSelected(false);
		shiny2=new JCheckBox("Shiny"); shiny2.setMnemonic(KeyEvent.VK_C); shiny2.setSelected(false);
		shiny3=new JCheckBox("Shiny"); shiny3.setMnemonic(KeyEvent.VK_C); shiny3.setSelected(false);
		shiny4=new JCheckBox("Shiny"); shiny4.setMnemonic(KeyEvent.VK_C); shiny4.setSelected(false);
		shiny5=new JCheckBox("Shiny"); shiny5.setMnemonic(KeyEvent.VK_C); shiny5.setSelected(false);
		shiny6=new JCheckBox("Shiny"); shiny6.setMnemonic(KeyEvent.VK_C); shiny6.setSelected(false);
		shiny1.addActionListener(this); shiny2.addActionListener(this); shiny3.addActionListener(this); shiny4.addActionListener(this); shiny5.addActionListener(this); shiny6.addActionListener(this);
		
		output=new JButton(new ImageIcon("Output.png"));	output.setActionCommand("output"); output.addActionListener(this); output.setToolTipText("Output the Pokemon team you created.");
		
		Nickname1=new JTextField(""); Nickname1.setEditable(true);
		Nickname2=new JTextField(""); Nickname2.setEditable(true); 
		Nickname3=new JTextField(""); Nickname3.setEditable(true); 
		Nickname4=new JTextField(""); Nickname4.setEditable(true); 
		Nickname5=new JTextField(""); Nickname5.setEditable(true); 
		Nickname6=new JTextField(""); Nickname6.setEditable(true); 
		
		Nickname1.setToolTipText("Enter the nickname for the first pokemon.");
		Nickname2.setToolTipText("Enter the nickname for the second pokemon.");
		Nickname3.setToolTipText("Enter the nickname for the first pokemon.");
		Nickname4.setToolTipText("Enter the nickname for the first pokemon.");
		Nickname5.setToolTipText("Enter the nickname for the first pokemon.");
		Nickname6.setToolTipText("Enter the nickname for the first pokemon.");
		

		
		OneMoveOne.setToolTipText("Select the first pokemon's first move."); OneMoveTwo.setToolTipText("Select the first pokemon's second move."); OneMoveThree.setToolTipText("Select the first pokemon's third move."); OneMoveFour.setToolTipText("Select the first pokemon's fourth move."); 
		TwoMoveOne.setToolTipText("Select the second pokemon's first move."); TwoMoveTwo.setToolTipText("Select the second pokemon's second move."); TwoMoveThree.setToolTipText("Select the second pokemon's third move."); TwoMoveFour.setToolTipText("Select the second pokemon's fourth move."); 
		ThreeMoveOne.setToolTipText("Select the third pokemon's first move."); ThreeMoveTwo.setToolTipText("Select the third pokemon's second move."); ThreeMoveThree.setToolTipText("Select the third pokemon's third move."); ThreeMoveFour.setToolTipText("Select the third pokemon's fourth move."); 
		FourMoveOne.setToolTipText("Select the fourth pokemon's first move."); FourMoveTwo.setToolTipText("Select the fourth pokemon's second move."); FourMoveThree.setToolTipText("Select the fourth pokemon's third move."); FourMoveFour.setToolTipText("Select the fourth pokemon's fourth move."); 
		FiveMoveOne.setToolTipText("Select the fifth pokemon's first move."); FiveMoveTwo.setToolTipText("Select the fifth pokemon's second move."); FiveMoveThree.setToolTipText("Select the fifth pokemon's third move."); FiveMoveFour.setToolTipText("Select the fifth pokemon's fourth move."); 
		SixMoveOne.setToolTipText("Select the sixth pokemon's first move."); SixMoveTwo.setToolTipText("Select the sixth pokemon's second move."); SixMoveThree.setToolTipText("Select the sixth pokemon's third move."); SixMoveFour.setToolTipText("Select the sixth pokemon's fourth move."); 
		one.setToolTipText("Select the first pokemon."); two.setToolTipText("Select the second pokemon."); three.setToolTipText("Select the third pokemon.");
		four.setToolTipText("Select the fourth pokemon."); five.setToolTipText("Select the fifth pokemon."); six.setToolTipText("Select the sixth pokemon.");
		oneAbility.setToolTipText("Select the first pokemon's ability."); twoAbility.setToolTipText("Select the second pokemon's ability."); threeAbility.setToolTipText("Select the third pokemon's ability.");
		fourAbility.setToolTipText("Select the fourth pokemon's ability."); fiveAbility.setToolTipText("Select the fifth pokemon's ability."); sixAbility.setToolTipText("Select the sixth pokemon's ability.");
		NatureOne.setToolTipText("Select the first pokemon's nature."); NatureTwo.setToolTipText("Select the second pokemon's nature."); NatureThree.setToolTipText("Select the third pokemon's nature.");
		NatureFour.setToolTipText("Select the fourth pokemon's nature."); NatureFive.setToolTipText("Select the fourth pokemon's nature."); NatureSix.setToolTipText("Select the sixth pokemon's nature.");
		stat1.setToolTipText("Change the first pokemon's Effort Values and Individual Values."); stat2.setToolTipText("Change the second pokemon's Effort Values and Individual Values."); stat3.setToolTipText("Change the third pokemon's Effort Values and Individual Values.");
		stat4.setToolTipText("Change the fourth pokemon's Effort Values and Individual Values."); stat5.setToolTipText("Change the fourth pokemon's Effort Values and Individual Values."); stat6.setToolTipText("Change the sixth pokemon's Effort Values and Individual Values.");
		shiny1.setToolTipText("Change the pokemon's color scheme."); shiny2.setToolTipText("Change the pokemon's color scheme.");
		shiny3.setToolTipText("Change the pokemon's color scheme."); shiny4.setToolTipText("Change the pokemon's color scheme.");
		shiny5.setToolTipText("Change the pokemon's color scheme."); shiny6.setToolTipText("Change the pokemon's color scheme.");
		
	
		
		
		
		
		contentPane.add(one); contentPane.add(Nickname1); contentPane.add(oneAbility); contentPane.add(Itemone);
		contentPane.add(OneMoveOne);contentPane.add(OneMoveTwo);contentPane.add(OneMoveThree);contentPane.add(OneMoveFour);
		contentPane.add(NatureOne); contentPane.add(stat1); contentPane.add(shiny1);

		contentPane.add(two); contentPane.add(Nickname2); contentPane.add(twoAbility);	contentPane.add(Itemtwo);
		contentPane.add(TwoMoveOne); contentPane.add(TwoMoveTwo); contentPane.add(TwoMoveThree); contentPane.add(TwoMoveFour);
		contentPane.add(NatureTwo); contentPane.add(stat2); contentPane.add(shiny2);
		
		contentPane.add(three); contentPane.add(Nickname3); contentPane.add(threeAbility);	contentPane.add(Itemthree);
		contentPane.add(ThreeMoveOne);contentPane.add(ThreeMoveTwo);		contentPane.add(ThreeMoveThree);		contentPane.add(ThreeMoveFour);
		contentPane.add(NatureThree); contentPane.add(stat3); contentPane.add(shiny3);

		contentPane.add(four);	contentPane.add(Nickname4); contentPane.add(fourAbility);	contentPane.add(Itemfour);
		contentPane.add(FourMoveOne);		contentPane.add(FourMoveTwo);		contentPane.add(FourMoveThree);		contentPane.add(FourMoveFour);
		contentPane.add(NatureFour); contentPane.add(stat4); contentPane.add(shiny4);

		contentPane.add(five);   contentPane.add(Nickname5); contentPane.add(fiveAbility);	contentPane.add(Itemfive);
		contentPane.add(FiveMoveOne);		contentPane.add(FiveMoveTwo);		contentPane.add(FiveMoveThree);		contentPane.add(FiveMoveFour);
		contentPane.add(NatureFive); contentPane.add(stat5); contentPane.add(shiny5);

		contentPane.add(six);	contentPane.add(Nickname6); contentPane.add(sixAbility);	contentPane.add(Itemsix);
		contentPane.add(SixMoveOne);		contentPane.add(SixMoveTwo);		contentPane.add(SixMoveThree);		contentPane.add(SixMoveFour);
		contentPane.add(NatureSix); contentPane.add(stat6); contentPane.add(shiny6);
		
	
		
		//displays the teams overall weaknesses.
		JButton weakness=new JButton(new ImageIcon("weaknesses.png"));
		weakness.setActionCommand("weak");
		weakness.addActionListener(this);
		weakness.setToolTipText("View the teams overall weakness.");
		contentPane.add(weakness);
		
		//displays the teams overall coverage.
		JButton cover=new JButton(new ImageIcon("coverage.png"));
		cover.setActionCommand("cover");
		cover.addActionListener(this);
		cover.setToolTipText("View the teams overall strengths.");
		contentPane.add(cover);

		//displays the teams average stats.
		JButton Astats=new JButton(new ImageIcon("average.png"));
		Astats.setActionCommand("average");
		Astats.addActionListener(this);
		Astats.setToolTipText("View the teams average stats.");
		contentPane.add(Astats);
		
		//displays the individual stats of each pokemon on the team.
		JButton Istats=new JButton(new ImageIcon("individual.png"));
		Istats.setActionCommand("individual");
		Istats.addActionListener(this);
		Istats.setToolTipText("View the teams individual base stats.");
		contentPane.add(Istats);
				
		//displays the teams actual stats
		realStat=new JButton(new ImageIcon("RealStats.png"));
		realStat.setActionCommand("realStat");
		realStat.addActionListener(this);
		realStat.setToolTipText("View the teams actual stats.");
		contentPane.add(realStat);
		
		SpinnerModel sm = new SpinnerNumberModel(100, 0, 100, 1); //default value,lower bound,upper bound,increment by
		
		Level=new JSpinner(sm);
		Level.setToolTipText("Assign the level for the team.");
		contentPane.add(Level);
		
		contentPane.add(output);

	}
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------MAJOR METHOD------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	   public void actionPerformed(ActionEvent event) {
		   String [] abilityList=new String[3];

		   
		   String eventName = event.getActionCommand();
		   
		   
		   if (eventName.equals("close")){
			   if(sOne==true){	
				 if(!(IVHP.getValue().equals("")))  oneHPIV= (Integer)IVHP.getValue();
				 	if(oneHPIV>31)oneHPIV=31;
				  
				 if(!(IVAT.getValue().equals("")))  oneAttIV= (Integer)IVAT.getValue();
				 	if(oneAttIV>31)oneAttIV=31;
				 	
				 if(!(IVDE.getValue().equals(""))) oneDefIV= (Integer)IVDE.getValue();
				 	if(oneDefIV>31)oneDefIV=31;
				 
				 if(!(IVSA.getValue().equals(""))) oneSAtIV= (Integer)IVSA.getValue();
				 	if(oneSAtIV>31)oneSAtIV=31;
				 
				 if(!(IVSD.getValue().equals(""))) oneSDeIV=(Integer) IVSD.getValue();
				 	if(oneSDeIV>31)oneSDeIV=31;
				 
				 if(!(IVSP.getValue().equals(""))) oneSpeIV= (Integer)IVSP.getValue();
				 	if(oneSpeIV>31)oneSpeIV=31;
				 
				 if(!(EVHP.getValue().equals("")))  oneHPEV=(Integer) EVHP.getValue(); 
				 	if(oneHPEV>254)oneHPEV=254; 
				 
				 if(!(EVAT.getValue().equals("")))  oneAttEV= (Integer)EVAT.getValue();
				 	if(oneAttEV>254)oneAttEV=254;	  
				 
				 if(!(EVDE.getValue().equals(""))) oneDefEV= (Integer)EVDE.getValue();
				 	if(oneDefEV>254)oneDefEV=254;
				 
				 if(!(EVSA.getValue().equals(""))) oneSAtEV=(Integer) EVSA.getValue();
				 	if(oneSAtEV>254)oneSAtEV=254;
				 
				 if(!(EVSD.getValue().equals(""))) oneSDeEV= (Integer)EVSD.getValue();
				 	if(oneSDeEV>254)oneSDeEV=254;
				 
				 if(!(EVSP.getValue().equals(""))) oneSpeEV= (Integer)EVSP.getValue();
				 	if(oneSpeEV>254)oneSpeEV=254;
			   }
			   if(sTwo==true){
				   if(!(IVHP.getValue().equals("")))  twoHPIV=(Integer) IVHP.getValue();
				 	if(twoHPIV>31)twoHPIV=31;
				  
				 if(!(IVAT.getValue().equals("")))  twoAttIV=(Integer) IVAT.getValue();
				 	if(twoAttIV>31)twoAttIV=31;
				 	
				 if(!(IVDE.getValue().equals(""))) twoDefIV=(Integer)IVDE.getValue();
				 	if(twoDefIV>31)twoDefIV=31;
				 
				 if(!(IVSA.getValue().equals(""))) twoSAtIV= (Integer)IVSA.getValue();
				 	if(twoSAtIV>31)twoSAtIV=31;
				 
				 if(!(IVSD.getValue().equals(""))) twoSDeIV= (Integer)IVSD.getValue();
				 	if(twoSDeIV>31)twoSDeIV=31;
				 
				 if(!(IVSP.getValue().equals(""))) twoSpeIV= (Integer)IVSP.getValue();
				 	if(twoSpeIV>31)twoSpeIV=31;
				 
				 if(!(EVHP.getValue().equals("")))  twoHPEV= (Integer)EVHP.getValue(); 
				 	if(twoHPEV>254)twoHPEV=254; 
				 
				 if(!(EVAT.getValue().equals("")))  twoAttEV= (Integer)EVAT.getValue();
				 	if(twoAttEV>254)twoAttEV=254;	  
				 
				 if(!(EVDE.getValue().equals(""))) twoDefEV=(Integer) EVDE.getValue();
				 	if(twoDefEV>254)twoDefEV=254;
				 
				 if(!(EVSA.getValue().equals(""))) twoSAtEV= (Integer)EVSA.getValue();
				 	if(twoSAtEV>254)twoSAtEV=254;
				 
				 if(!(EVSD.getValue().equals(""))) twoSDeEV= (Integer)EVSD.getValue();
				 	if(twoSDeEV>254)twoSDeEV=254;
				 
				 if(!(EVSP.getValue().equals(""))) twoSpeEV= (Integer)EVSP.getValue();
				 	if(twoSpeEV>254)twoSpeEV=254;
			   } 
			   if(sThree==true){
				   if(!(IVHP.getValue().equals("")))  threeHPIV=(Integer) IVHP.getValue();
				 	if(threeHPIV>31)threeHPIV=31;
				  
				 if(!(IVAT.getValue().equals("")))  threeAttIV=(Integer) IVAT.getValue();
				 	if(threeAttIV>31)threeAttIV=31;
				 	
				 if(!(IVDE.getValue().equals(""))) threeDefIV= (Integer)IVDE.getValue();
				 	if(threeDefIV>31)threeDefIV=31;
				 
				 if(!(IVSA.getValue().equals(""))) threeSAtIV= (Integer)IVSA.getValue();
				 	if(threeSAtIV>31)threeSAtIV=31;
				 
				 if(!(IVSD.getValue().equals(""))) threeSDeIV= (Integer)IVSD.getValue();
				 	if(threeSDeIV>31)threeSDeIV=31;
				 
				 if(!(IVSP.getValue().equals(""))) threeSpeIV= (Integer)IVSP.getValue();
				 	if(threeSpeIV>31)threeSpeIV=31;
				 
				 if(!(EVHP.getValue().equals("")))  threeHPEV=(Integer) EVHP.getValue(); 
				 	if(threeHPEV>254)threeHPEV=254; 
				 
				 if(!(EVAT.getValue().equals("")))  threeAttEV=(Integer) EVAT.getValue();
				 	if(threeAttEV>254)threeAttEV=254;	  
				 
				 if(!(EVDE.getValue().equals(""))) threeDefEV= (Integer)EVDE.getValue();
				 	if(threeDefEV>254)threeDefEV=254;
				 
				 if(!(EVSA.getValue().equals(""))) threeSAtEV= (Integer)EVSA.getValue();
				 	if(threeSAtEV>254)threeSAtEV=254;
				 
				 if(!(EVSD.getValue().equals(""))) threeSDeEV= (Integer)EVSD.getValue();
				 	if(threeSDeEV>254)threeSDeEV=254;
				 
				 if(!(EVSP.getValue().equals(""))) threeSpeEV= (Integer)EVSP.getValue();
				 	if(threeSpeEV>254)threeSpeEV=254;
			   } 
			   if(sFour==true){
				 if(!(IVHP.getValue().equals("")))  fourHPIV= (Integer)IVHP.getValue();
				   	if(fourHPIV>31)fourHPIV=31;
				  
				 if(!(IVAT.getValue().equals("")))  fourAttIV= (Integer)IVAT.getValue();
				 	if(fourAttIV>31)fourAttIV=31;
				 	
				 if(!(IVDE.getValue().equals(""))) fourDefIV= (Integer)IVDE.getValue();
				 	if(fourDefIV>31)fourDefIV=31;
				 
				 if(!(IVSA.getValue().equals(""))) fourSAtIV= (Integer)IVSA.getValue();
				 	if(fourSAtIV>31)fourSAtIV=31;
				 
				 if(!(IVSD.getValue().equals(""))) fourSDeIV= (Integer)IVSD.getValue();
				 	if(fourSDeIV>31)fourSDeIV=31;
				 
				 if(!(IVSP.getValue().equals(""))) fourSpeIV= (Integer)IVSP.getValue();
				 	if(fourSpeIV>31)fourSpeIV=31;
				 
				 if(!(EVHP.getValue().equals("")))  fourHPEV= (Integer)EVHP.getValue(); 
				 	if(fourHPEV>254)fourHPEV=254; 
				 
				 if(!(EVAT.getValue().equals("")))  fourAttEV=(Integer) EVAT.getValue();
				 	if(fourAttEV>254)fourAttEV=254;	  
				 
				 if(!(EVDE.getValue().equals(""))) fourDefEV= (Integer)EVDE.getValue();
				 	if(fourDefEV>254)fourDefEV=254;
				 
				 if(!(EVSA.getValue().equals(""))) fourSAtEV=(Integer) EVSA.getValue();
				 	if(fourSAtEV>254)fourSAtEV=254;
				 
				 if(!(EVSD.getValue().equals(""))) fourSDeEV= (Integer)EVSD.getValue();
				 	if(fourSDeEV>254)fourSDeEV=254;
				 
				 if(!(EVSP.getValue().equals(""))) fourSpeEV=(Integer) EVSP.getValue();
				 	if(fourSpeEV>254)fourSpeEV=254;}
			   if(sFive==true){
				if(!(IVHP.getValue().equals("")))  fiveHPIV= (Integer)IVHP.getValue();
			 		if(fiveHPIV>31)fiveHPIV=31;
				  
				 if(!(IVAT.getValue().equals("")))  fiveAttIV= (Integer)IVAT.getValue();
				 	if(fiveAttIV>31)fiveAttIV=31;
				 	
				 if(!(IVDE.getValue().equals(""))) fiveDefIV= (Integer)IVDE.getValue();
				 	if(fiveDefIV>31)fiveDefIV=31;
				 
				 if(!(IVSA.getValue().equals(""))) fiveSAtIV= (Integer)IVSA.getValue();
				 	if(fiveSAtIV>31)fiveSAtIV=31;
				 
				 if(!(IVSD.getValue().equals(""))) fiveSDeIV= (Integer)IVSD.getValue();
				 	if(fiveSDeIV>31)fiveSDeIV=31;
				 
				 if(!(IVSP.getValue().equals(""))) fiveSpeIV= (Integer)IVSP.getValue();
				 	if(fiveSpeIV>31)fiveSpeIV=31;
				 
				 if(!(EVHP.getValue().equals("")))  fiveHPEV= (Integer)EVHP.getValue(); 
				 	if(fiveHPEV>254)fiveHPEV=254; 
				 
				 if(!(EVAT.getValue().equals("")))  fiveAttEV= (Integer)EVAT.getValue();
				 	if(fiveAttEV>254)fiveAttEV=254;	  
				 
				 if(!(EVDE.getValue().equals(""))) fiveDefEV=(Integer) EVDE.getValue();
				 	if(fiveDefEV>254)fiveDefEV=254;
				 
				 if(!(EVSA.getValue().equals(""))) fiveSAtEV= (Integer)EVSA.getValue();
				 	if(fiveSAtEV>254)fiveSAtEV=254;
				 
				 if(!(EVSD.getValue().equals(""))) fiveSDeEV= (Integer)EVSD.getValue();
				 	if(fiveSDeEV>254)fiveSDeEV=254;
				 
				 if(!(EVSP.getValue().equals(""))) fiveSpeEV= (Integer)EVSP.getValue();
				 	if(fiveSpeEV>254)fiveSpeEV=254;}
			   if(sSix==true){
				   if(!(IVHP.getValue().equals("")))  sixHPIV= (Integer)IVHP.getValue();
				 	if(sixHPIV>31)sixHPIV=31;
				  
				 if(!(IVAT.getValue().equals("")))  sixAttIV=(Integer) IVAT.getValue();
				 	if(sixAttIV>31)sixAttIV=31;
				 	
				 if(!(IVDE.getValue().equals(""))) sixDefIV= (Integer)IVDE.getValue();
				 	if(sixDefIV>31)sixDefIV=31;
				 
				 if(!(IVSA.getValue().equals(""))) sixSAtIV=(Integer) IVSA.getValue();
				 	if(sixSAtIV>31)sixSAtIV=31;
				 
				 if(!(IVSD.getValue().equals(""))) sixSDeIV= (Integer)IVSD.getValue();
				 	if(sixSDeIV>31)sixSDeIV=31;
				 
				 if(!(IVSP.getValue().equals(""))) sixSpeIV= (Integer)IVSP.getValue();
				 	if(sixSpeIV>31)sixSpeIV=31;
				 
				 if(!(EVHP.getValue().equals("")))  sixHPEV=(Integer) EVHP.getValue(); 
				 	if(sixHPEV>254)sixHPEV=254; 
				 
				 if(!(EVAT.getValue().equals("")))  sixAttEV= (Integer)EVAT.getValue();
				 	if(sixAttEV>254)sixAttEV=254;	  
				 
				 if(!(EVDE.getValue().equals(""))) sixDefEV= (Integer)EVDE.getValue();
				 	if(sixDefEV>254)sixDefEV=254;
				 
				 if(!(EVSA.getValue().equals(""))) sixSAtEV= (Integer)EVSA.getValue();
				 	if(sixSAtEV>254)sixSAtEV=254;
				 
				 if(!(EVSD.getValue().equals(""))) sixSDeEV= (Integer)EVSD.getValue();
				 	if(sixSDeEV>254)sixSDeEV=254;
				 
				 if(!(EVSP.getValue().equals(""))) sixSpeEV= (Integer)EVSP.getValue();
				 	if(sixSpeEV>254)sixSpeEV=254;
			   }
			   
			   Statframe.hide();
		   }
		   
//-------------------------------------------------------------------------------------------------------EVIV--------------------------------------------------------------------------------------------------
		   if(eventName.substring(0,4).equals("stat")){
			   Statframe=new JFrame("Pokemon EV's and IV's");
					Statframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					statcontent=new JPanel(new GridBagLayout());
					statcontent.setLayout(new GridLayout(7,2,0,0));

					Statframe.setContentPane(statcontent);
					Statframe.pack();
					Statframe.setVisible(true);
					Statframe.setSize(800, 500);					
					
					close=new JButton(new ImageIcon("close.png"));
					close.setActionCommand("close");
					close.addActionListener(this);
					
					 SpinnerModel evhp = new SpinnerNumberModel((int)oneHPEV, 0, 252, 4); //default value,lower bound,upper bound,increment by
					   SpinnerModel evat = new SpinnerNumberModel((int)oneAttEV, 0, 252, 4);
					   SpinnerModel evde = new SpinnerNumberModel((int)oneDefEV, 0, 252, 4);
					   SpinnerModel evsa = new SpinnerNumberModel((int)oneSAtEV, 0, 252, 4);
					   SpinnerModel evsd = new SpinnerNumberModel((int)oneSDeEV, 0, 252, 4);
					   SpinnerModel evse = new SpinnerNumberModel((int)oneSpeEV, 0, 252, 4);
					   
					   SpinnerModel ivhp = new SpinnerNumberModel((int)oneHPIV, 0, 31, 1);
					   SpinnerModel ivat = new SpinnerNumberModel((int)oneAttIV, 0, 31, 1);
					   SpinnerModel ivde = new SpinnerNumberModel((int)oneDefIV, 0, 31, 1);
					   SpinnerModel ivsa = new SpinnerNumberModel((int)oneSAtIV, 0, 31, 1);
					   SpinnerModel ivsd = new SpinnerNumberModel((int)oneSDeIV, 0, 31, 1);
					   SpinnerModel ivse = new SpinnerNumberModel((int)oneSpeIV, 0, 31, 1);
					
					
					
			   if(eventName.substring(4,5).equals("1")){
				    evhp = new SpinnerNumberModel((int)oneHPEV, 0, 252, 4); //default value,lower bound,upper bound,increment by
				    evat = new SpinnerNumberModel((int)oneAttEV, 0, 252, 4);
				    evde = new SpinnerNumberModel((int)oneDefEV, 0, 252, 4);
				    evsa = new SpinnerNumberModel((int)oneSAtEV, 0, 252, 4);
				    evsd = new SpinnerNumberModel((int)oneSDeEV, 0, 252, 4);
				    evse = new SpinnerNumberModel((int)oneSpeEV, 0, 252, 4);
				   
				    ivhp = new SpinnerNumberModel((int)oneHPIV, 0, 31, 1);
				    ivat = new SpinnerNumberModel((int)oneAttIV, 0, 31, 1);
				    ivde = new SpinnerNumberModel((int)oneDefIV, 0, 31, 1);
				    ivsa = new SpinnerNumberModel((int)oneSAtIV, 0, 31, 1);
				    ivsd = new SpinnerNumberModel((int)oneSDeIV, 0, 31, 1);
				    ivse = new SpinnerNumberModel((int)oneSpeIV, 0, 31, 1);
				
				   sOne=true; sTwo=false; sThree=false; sFour=false; sFive=false; sSix=false; 
					
			   }  
		   if(eventName.substring(4,5).equals("2")){
			    evhp = new SpinnerNumberModel((int)twoHPEV, 0, 252, 4); //default value,lower bound,upper bound,increment by
			    evat = new SpinnerNumberModel((int)twoAttEV, 0, 252, 4);
			    evde = new SpinnerNumberModel((int)twoDefEV, 0, 252, 4);
			    evsa = new SpinnerNumberModel((int)twoSAtEV, 0, 252, 4);
			    evsd = new SpinnerNumberModel((int)twoSDeEV, 0, 252, 4);
			    evse = new SpinnerNumberModel((int)twoSpeEV, 0, 252, 4);
			   
			    ivhp = new SpinnerNumberModel((int)twoHPIV, 0, 31, 1);
			    ivat = new SpinnerNumberModel((int)twoAttIV, 0, 31, 1);
			    ivde = new SpinnerNumberModel((int)twoDefIV, 0, 31, 1);
			    ivsa = new SpinnerNumberModel((int)twoSAtIV, 0, 31, 1);
			    ivsd = new SpinnerNumberModel((int)twoSDeIV, 0, 31, 1);
			    ivse = new SpinnerNumberModel((int)twoSpeIV, 0, 31, 1);

			   sOne=false; sTwo=true; sThree=false; sFour=false; sFive=false; sSix=false; 
		   }
		   if(eventName.substring(4,5).equals("3")){
			    evhp = new SpinnerNumberModel((int)threeHPEV, 0, 252, 4); //default value,lower bound,upper bound,increment by
			    evat = new SpinnerNumberModel((int)threeAttEV, 0, 252, 4);
			    evde = new SpinnerNumberModel((int)threeDefEV, 0, 252, 4);
			    evsa = new SpinnerNumberModel((int)threeSAtEV, 0, 252, 4);
			    evsd = new SpinnerNumberModel((int)threeSDeEV, 0, 252, 4);
			    evse = new SpinnerNumberModel((int)threeSpeEV, 0, 252, 4);
			   
			    ivhp = new SpinnerNumberModel((int)threeHPIV, 0, 31, 1);
			    ivat = new SpinnerNumberModel((int)threeAttIV, 0, 31, 1);
			    ivde = new SpinnerNumberModel((int)threeDefIV, 0, 31, 1);
			    ivsa = new SpinnerNumberModel((int)threeSAtIV, 0, 31, 1);
			    ivsd = new SpinnerNumberModel((int)threeSDeIV, 0, 31, 1);
			    ivse = new SpinnerNumberModel((int)threeSpeIV, 0, 31, 1);

			   sOne=false; sTwo=false; sThree=true; sFour=false; sFive=false; sSix=false; 
		   }
		   if(eventName.substring(4,5).equals("4")){
			    evhp = new SpinnerNumberModel((int)fourHPEV, 0, 252, 4); //default value,lower bound,upper bound,increment by
			    evat = new SpinnerNumberModel((int)fourAttEV, 0, 252, 4);
			    evde = new SpinnerNumberModel((int)fourDefEV, 0, 252, 4);
			    evsa = new SpinnerNumberModel((int)fourSAtEV, 0, 252, 4);
			    evsd = new SpinnerNumberModel((int)fourSDeEV, 0, 252, 4);
			    evse = new SpinnerNumberModel((int)fourSpeEV, 0, 252, 4);
			   
			    ivhp = new SpinnerNumberModel((int)fourHPIV, 0, 31, 1);
			    ivat = new SpinnerNumberModel((int)fourAttIV, 0, 31, 1);
			    ivde = new SpinnerNumberModel((int)fourDefIV, 0, 31, 1);
			    ivsa = new SpinnerNumberModel((int)fourSAtIV, 0, 31, 1);
			    ivsd = new SpinnerNumberModel((int)fourSDeIV, 0, 31, 1);
			    ivse = new SpinnerNumberModel((int)fourSpeIV, 0, 31, 1);
			   
			   sOne=false; sTwo=false; sThree=false; sFour=true; sFive=false; sSix=false; 
		   }
		   if(eventName.substring(4,5).equals("5")){
			    evhp = new SpinnerNumberModel((int)fiveHPEV, 0, 252, 4); //default value,lower bound,upper bound,increment by
			    evat = new SpinnerNumberModel((int)fiveAttEV, 0, 252, 4);
			    evde = new SpinnerNumberModel((int)fiveDefEV, 0, 252, 4);
			    evsa = new SpinnerNumberModel((int)fiveSAtEV, 0, 252, 4);
			    evsd = new SpinnerNumberModel((int)fiveSDeEV, 0, 252, 4);
			    evse = new SpinnerNumberModel((int)fiveSpeEV, 0, 252, 4);
			   
			    ivhp = new SpinnerNumberModel((int)fiveHPIV, 0, 31, 1);
			    ivat = new SpinnerNumberModel((int)fiveAttIV, 0, 31, 1);
			    ivde = new SpinnerNumberModel((int)fiveDefIV, 0, 31, 1);
			    ivsa = new SpinnerNumberModel((int)fiveSAtIV, 0, 31, 1);
			    ivsd = new SpinnerNumberModel((int)fiveSDeIV, 0, 31, 1);
			    ivse = new SpinnerNumberModel((int)fiveSpeIV, 0, 31, 1);

			   sOne=false; sTwo=false; sThree=false; sFour=false; sFive=true; sSix=false; 
		   }
		   if(eventName.substring(4,5).equals("6")){
			    evhp = new SpinnerNumberModel((int)sixHPEV, 0, 252, 4); //default value,lower bound,upper bound,increment by
			    evat = new SpinnerNumberModel((int)sixAttEV, 0, 252, 4);
			    evde = new SpinnerNumberModel((int)sixDefEV, 0, 252, 4);
			    evsa = new SpinnerNumberModel((int)sixSAtEV, 0, 252, 4);
			    evsd = new SpinnerNumberModel((int)sixSDeEV, 0, 252, 4);
			    evse = new SpinnerNumberModel((int)sixSpeEV, 0, 252, 4);
			   
			    ivhp = new SpinnerNumberModel((int)sixHPIV, 0, 31, 1);
			    ivat = new SpinnerNumberModel((int)sixAttIV, 0, 31, 1);
			    ivde = new SpinnerNumberModel((int)sixDefIV, 0, 31, 1);
			    ivsa = new SpinnerNumberModel((int)sixSAtIV, 0, 31, 1);
			    ivsd = new SpinnerNumberModel((int)sixSDeIV, 0, 31, 1);
			    ivse = new SpinnerNumberModel((int)sixSpeIV, 0, 31, 1);
			   
			   sOne=false; sTwo=false; sThree=false; sFour=false; sFive=false; sSix=true; 
		   	} 
		   
		   IVHP=new JSpinner(ivhp); 
		   IVAT=new JSpinner(ivat); 
		   IVDE=new JSpinner(ivde); 
		   IVSA=new JSpinner(ivsa); 
		   IVSD=new JSpinner(ivsd); 
		   IVSP=new JSpinner(ivse);
		   
		   EVHP=new JSpinner(evhp); 
		   EVAT=new JSpinner(evat); 
		   EVDE=new JSpinner(evde); 
		   EVSA=new JSpinner(evsa); 
		   EVSD=new JSpinner(evsd); 
		   EVSP=new JSpinner(evse); 
			
		   statcontent.add(IVHP); statcontent.add(EVHP);
		   statcontent.add(IVAT); statcontent.add(EVAT);
		   statcontent.add(IVDE); statcontent.add(EVDE);
		   statcontent.add(IVSA); statcontent.add(EVSA);
		   statcontent.add(IVSD); statcontent.add(EVSD);
		   statcontent.add(IVSP); statcontent.add(EVSP);
		   statcontent.add(close);
		   
		   
		   	IVHP.setToolTipText("Input the pokemon's IV (0-31) for Health Points.");
		   	IVAT.setToolTipText("Input the pokemon's IV (0-31) for Attack.");
		   	IVDE.setToolTipText("Input the pokemon's IV (0-31) for Defense.");
		   	IVSA.setToolTipText("Input the pokemon's IV (0-31) for Special Attack.");
		   	IVSD.setToolTipText("Input the pokemon's IV (0-31) for Special Defense.");
		   	IVSP.setToolTipText("Input the pokemon's IV (0-31) for Speed.");
		   	
		   	EVHP.setToolTipText("Input the pokemon's EV (0-254) for Health Points.");
		   	EVAT.setToolTipText("Input the pokemon's EV (0-254) for Attack.");
		   	EVDE.setToolTipText("Input the pokemon's EV (0-254) for Defense.");
		   	EVSA.setToolTipText("Input the pokemon's EV (0-254) for Special Attack.");
		   	EVSD.setToolTipText("Input the pokemon's EV (0-254) for Special Defense.");
		   	EVSP.setToolTipText("Input the pokemon's EV (0-254) for Speed.");
		   }
		  
//---------------------------------------------------------------------------------------------------WEAKNESS--------------------------------------------------------------------------------------------------
		   
	       if(eventName.equals("weak")){
	       double [] weak1=new double [17];  double [] weak2=new double [17]; double [] weak3=new double [17]; double [] weak4=new double [17]; double [] weak5=new double [17]; double [] weak6=new double [17];
	       String result="";
	       for(int counter=0; counter<listA.size(); counter++){ //this searches through all the pokemon to find the selected ones and uses their stats
			   if ((one.getSelectedItem()).equals(listA.get(counter).getName())){ weak1=listA.get(counter).findWeaknesses();   }
			   if ((two.getSelectedItem()).equals(listA.get(counter).getName())){ weak2=listA.get(counter).findWeaknesses();  }
			   if ((three.getSelectedItem()).equals(listA.get(counter).getName())){  weak3=listA.get(counter).findWeaknesses(); }
			   if ((four.getSelectedItem()).equals(listA.get(counter).getName())){ weak4=listA.get(counter).findWeaknesses();  }
			   if ((five.getSelectedItem()).equals(listA.get(counter).getName())){ weak5=listA.get(counter).findWeaknesses();   }
			   if ((six.getSelectedItem()).equals(listA.get(counter).getName())){ weak6=listA.get(counter).findWeaknesses(); }
		   }
	   
			int [] weak4x=new int [18]; int [] weak2x=new int [18]; int [] weakhalfx=new int [18]; int [] weakquarterx=new int [18]; int [] weak0x=new int [18];
			for (int counter=0; counter<18; counter++){
				if (weak1[counter]==4.0){ weak4x[counter]++;}
				if (weak2[counter]==4.0){ weak4x[counter]++;}
				if (weak3[counter]==4.0){ weak4x[counter]++;}
				if (weak4[counter]==4.0){ weak4x[counter]++;}			
				if (weak5[counter]==4.0){ weak4x[counter]++;}
				if (weak6[counter]==4.0){ weak4x[counter]++;}		
				
				if (weak1[counter]==2.0){ weak2x[counter]++;}
				if (weak2[counter]==2.0){ weak2x[counter]++;}
				if (weak3[counter]==2.0){ weak2x[counter]++;}
				if (weak4[counter]==2.0){ weak2x[counter]++;}			
				if (weak5[counter]==2.0){ weak2x[counter]++;}
				if (weak6[counter]==2.0){ weak2x[counter]++;}

				
				if (weak1[counter]==0.50){ weakhalfx[counter]++;}
				if (weak2[counter]==0.50){ weakhalfx[counter]++;}
				if (weak3[counter]==0.50){ weakhalfx[counter]++;}
				if (weak4[counter]==0.50){ weakhalfx[counter]++;}			
				if (weak5[counter]==0.50){ weakhalfx[counter]++;}
				if (weak6[counter]==0.50){ weakhalfx[counter]++;}	
				
				if (weak1[counter]==0.25){ weakquarterx[counter]++;}
				if (weak2[counter]==0.25){ weakquarterx[counter]++;}
				if (weak3[counter]==0.25){ weakquarterx[counter]++;}
				if (weak4[counter]==0.25){ weakquarterx[counter]++;}			
				if (weak5[counter]==0.25){ weakquarterx[counter]++;}
				if (weak6[counter]==0.25){ weakquarterx[counter]++;}
				
				if (weak1[counter]==0.00){ weak0x[counter]++;}
				if (weak2[counter]==0.00){ weak0x[counter]++;}
				if (weak3[counter]==0.00){ weak0x[counter]++;}
				if (weak4[counter]==0.00){ weak0x[counter]++;}			
				if (weak5[counter]==0.00){ weak0x[counter]++;}
				if (weak6[counter]==0.00){ weak0x[counter]++;}
			} String four="4x damage:   "; String two="2x damage:   "; String half=".5x damage:   "; String quarter=".25x damage: "; String zero="0x damage:   ";
			
			for (int counter=0; counter<18; counter++){
				if (weak4x[counter]!=0){
					if (counter==1) four+="Fire "+weak4x[counter]+",    ";
					else if (counter==2) four+="Water "+weak4x[counter]+",    ";
					else if (counter==3) four+="Electric "+weak4x[counter]+",    ";
					else if (counter==4) four+="Grass "+weak4x[counter]+",    ";
					else if (counter==5) four+="Ice "+weak4x[counter]+",    ";
					else if (counter==6) four+="Fighting "+weak4x[counter]+",    ";
					else if (counter==7) four+="Posion "+weak4x[counter]+",    ";
					else if (counter==8) four+="Ground "+weak4x[counter]+",    ";
					else if (counter==9) four+="Flying "+weak4x[counter]+",    ";
					else if (counter==10) four+="Psychic "+weak4x[counter]+",    ";
					else if (counter==11) four+="Bug "+weak4x[counter]+",    ";
					else if (counter==12) four+="Rock "+weak4x[counter]+",    ";
					else if (counter==13) four+="Ghost "+weak4x[counter]+",    ";
					else if (counter==14) four+="Dragon "+weak4x[counter]+",    ";
					else if (counter==15) four+="Dark "+weak4x[counter]+",    ";
					else if (counter==16) four+="Steel "+weak4x[counter]+",    ";
					else if (counter==17) four+="Fairy "+weak4x[counter]+",    ";	
				}
			   if(weak2x[counter]!=0){
				    if (counter==1) two+="Fire "+weak2x[counter]+",    ";
					else if (counter==2) two+="Water "+weak2x[counter]+",    ";
					else if (counter==3) two+="Electric "+weak2x[counter]+",    ";
					else if (counter==4) two+="Grass "+weak2x[counter]+",    ";
					else if (counter==5) two+="Ice "+weak2x[counter]+",    ";
					else if (counter==6) two+="Fighting "+weak2x[counter]+",    ";
					else if (counter==7) two+="Posion "+weak2x[counter]+",    ";
					else if (counter==8) two+="Ground "+weak2x[counter]+",    ";
					else if (counter==9) two+="Flying "+weak2x[counter]+",    ";
					else if (counter==10) two+="Psychic "+weak2x[counter]+",    ";
					else if (counter==11) two+="Bug "+weak2x[counter]+",    ";
					else if (counter==12) two+="Rock "+weak2x[counter]+",    ";
					else if (counter==13) two+="Ghost "+weak2x[counter]+",    ";
					else if (counter==14) two+="Dragon "+weak2x[counter]+",    ";
					else if (counter==15) two+="Dark "+weak2x[counter]+",    ";
					else if (counter==16) two+="Steel "+weak2x[counter]+",    ";
					else if (counter==17) two+="Fairy "+weak2x[counter]+",    ";	
			   }
			   if (weakhalfx[counter]!=0){
				    if (counter==0) half+="Normal"+weakhalfx[counter]+",    ";
				    else if (counter==1) half+="Fire "+weakhalfx[counter]+",    ";
					else if (counter==2) half+="Water "+weakhalfx[counter]+",    ";
					else if (counter==3) half+="Electric "+weakhalfx[counter]+",    ";
					else if (counter==4) half+="Grass "+weakhalfx[counter]+",    ";
					else if (counter==5) half+="Ice "+weakhalfx[counter]+",    ";
					else if (counter==6) half+="Fighting "+weakhalfx[counter]+",    ";
					else if (counter==7) half+="Posion "+weakhalfx[counter]+",    ";
					else if (counter==8) half+="Ground "+weakhalfx[counter]+",    ";
					else if (counter==9) half+="Flying "+weakhalfx[counter]+",    ";
					else if (counter==10) half+="Psychic "+weakhalfx[counter]+",    ";
					else if (counter==11) half+="Bug "+weakhalfx[counter]+",    ";
					else if (counter==12) half+="Rock "+weakhalfx[counter]+",    ";
					else if (counter==13) half+="Ghost "+weakhalfx[counter]+",    ";
					else if (counter==14) half+="Dragon "+weakhalfx[counter]+",    ";
					else if (counter==15) half+="Dark "+weakhalfx[counter]+",    ";
					else if (counter==16) half+="Steel "+weakhalfx[counter]+",    ";
					else if (counter==17) half+="Fairy "+weakhalfx[counter]+",    ";	
			   }
			   if(weakquarterx[counter]!=0){
				    if (counter==0) quarter+="Normal"+weakquarterx[counter]+",    ";
				    else if (counter==1) quarter+="Fire "+weakquarterx[counter]+",    ";
					else if (counter==2) quarter+="Water "+weakquarterx[counter]+",    ";
					else if (counter==3) quarter+="Electric "+weakquarterx[counter]+",    ";
					else if (counter==4) quarter+="Grass "+weakquarterx[counter]+",    ";
					else if (counter==5) quarter+="Ice "+weakquarterx[counter]+",    ";
					else if (counter==6) quarter+="Fighting "+weakquarterx[counter]+",    ";
					else if (counter==7) quarter+="Posion "+weakquarterx[counter]+",    ";
					else if (counter==8) quarter+="Ground "+weakquarterx[counter]+",    ";
					else if (counter==9) quarter+="Flying "+weakquarterx[counter]+",    ";
					else if (counter==10) quarter+="Psychic "+weakquarterx[counter]+",    ";
					else if (counter==11) quarter+="Bug "+weakquarterx[counter]+",    ";
					else if (counter==12) quarter+="Rock "+weakquarterx[counter]+",    ";
					else if (counter==13) quarter+="Ghost "+weakquarterx[counter]+",    ";
					else if (counter==14) quarter+="Dragon "+weakquarterx[counter]+",    ";
					else if (counter==15) quarter+="Dark "+weakquarterx[counter]+",    ";
					else if (counter==16) quarter+="Steel "+weakquarterx[counter]+",    ";
					else if (counter==17) quarter+="Fairy "+weakquarterx[counter]+",    ";	
			   }
			   if(weak0x[counter]!=0){
				    if (counter==0) zero+="Normal "+weak0x[counter]+",    ";
				    else if (counter==1) zero+="Fire "+weak0x[counter]+",    ";
					else if (counter==2) zero+="Water "+weak0x[counter]+",    ";
					else if (counter==3) zero+="Electric "+weak0x[counter]+",    ";
					else if (counter==4) zero+="Grass "+weak0x[counter]+",    ";
					else if (counter==5) zero+="Ice "+weak0x[counter]+",    ";
					else if (counter==6) zero+="Fighting "+weak0x[counter]+",    ";
					else if (counter==7) zero+="Posion "+weak0x[counter]+",    ";
					else if (counter==8) zero+="Ground "+weak0x[counter]+",    ";
					else if (counter==9) zero+="Flying "+weak0x[counter]+",    ";
					else if (counter==10) zero+="Psychic "+weak0x[counter]+",    ";
					else if (counter==11) zero+="Bug "+weak0x[counter]+",    ";
					else if (counter==12) zero+="Rock "+weak0x[counter]+",    ";
					else if (counter==13) zero+="Ghost "+weak0x[counter]+",    ";
					else if (counter==14) zero+="Dragon "+weak0x[counter]+",    ";
					else if (counter==15) zero+="Dark "+weak0x[counter]+",    ";
					else if (counter==16) zero+="Steel "+weak0x[counter]+",    ";
					else if (counter==17) zero+="Fairy "+weak0x[counter]+",    ";	
			   }
			}
			result=four+"\n"+two+"\n"+half+"\n"+quarter+"\n"+zero;
	         JOptionPane.showMessageDialog(frame,result); ////custom title, custom icon
	    	 /*  JOptionPane.showMessageDialog(frame,
	    			    "Eggs are not supposed to be green.",
	    			    "Inane custom dialog",
	    			    JOptionPane.INFORMATION_MESSAGE,
	    			    icon); */
	       }
	       
	       
		   
//----------------------------------------------------------------------------------------------------------COVERAGE--------------------------------------------------------------------------------------------------
		 

		   if(eventName.equals("cover")){
			   
			   ArrayList <Moves> moves=new ArrayList<Moves>();
			    
			  String check=new String();

			   check=(String) OneMoveOne.getSelectedItem();
			   moveChecker((String) one.getSelectedItem(), check);
			
			   check=(String) OneMoveTwo.getSelectedItem(); 
			   moveChecker((String) one.getSelectedItem(), check);
			   
			   check=(String) OneMoveThree.getSelectedItem();
			   moveChecker((String) one.getSelectedItem(), check);
			   
			   check=(String) OneMoveFour.getSelectedItem();
			   moveChecker((String) one.getSelectedItem(), check);
			   
			   check=(String) TwoMoveOne.getSelectedItem(); 
			   moveChecker((String) two.getSelectedItem(), check);
			   
			   check=(String) TwoMoveTwo.getSelectedItem(); 
			   moveChecker((String) two.getSelectedItem(), check);
			   
			   check=(String) TwoMoveThree.getSelectedItem(); 
			   moveChecker((String) two.getSelectedItem(), check);
			   
			   check=(String) TwoMoveFour.getSelectedItem();
			   moveChecker((String) two.getSelectedItem(), check);
			   
			   check=(String) ThreeMoveOne.getSelectedItem(); 
			   moveChecker((String) three.getSelectedItem(), check);
			   
			   check=(String) ThreeMoveTwo.getSelectedItem(); 
			   moveChecker((String) three.getSelectedItem(), check);
			   
			   check=(String) ThreeMoveThree.getSelectedItem(); 
			   moveChecker((String) three.getSelectedItem(), check);
			   
			   check=(String) ThreeMoveFour.getSelectedItem();
			   moveChecker((String) three.getSelectedItem(), check);
			   
			   check=(String) FourMoveOne.getSelectedItem(); 
			   moveChecker((String) four.getSelectedItem(), check);
			   
			   check=(String) FourMoveTwo.getSelectedItem(); 
			   moveChecker((String) four.getSelectedItem(), check);
			   
			   check=(String) FourMoveThree.getSelectedItem(); 
			   moveChecker((String) four.getSelectedItem(), check);
			   
			   check=(String) FourMoveFour.getSelectedItem();
			   moveChecker((String) four.getSelectedItem(), check);
			   
			   check=(String) FiveMoveOne.getSelectedItem(); 
			   moveChecker((String) five.getSelectedItem(), check);
			   
			   check=(String) FiveMoveTwo.getSelectedItem(); 
			   moveChecker((String) five.getSelectedItem(), check);
			   
			   check=(String) FiveMoveThree.getSelectedItem(); 
			   moveChecker((String) five.getSelectedItem(), check);
			   
			   check=(String) FiveMoveFour.getSelectedItem();
			   moveChecker((String) five.getSelectedItem(), check);
			   
			   check=(String) SixMoveOne.getSelectedItem(); 
			   moveChecker((String) six.getSelectedItem(), check);
			   
			   check=(String) SixMoveTwo.getSelectedItem(); 
			   moveChecker((String) six.getSelectedItem(), check);
			   
			   check=(String) SixMoveThree.getSelectedItem(); 
			   moveChecker((String) six.getSelectedItem(), check);
			   
			   check=(String) SixMoveFour.getSelectedItem();
			   moveChecker((String) six.getSelectedItem(), check);
			   
			   String output="PokemonType     # of moves          Pokemon\n";
			   output=coverOutput(output, coverNumber, coverName);

			   JOptionPane.showMessageDialog(frame, output);
		   }
		   
		   
		   
		   
//------------------------------------------------------------------------------------------------------------------AVERAGE------------------------------------------------------------------------------------------------------------
		  
		   
		   if(eventName.equals("average")){  String result ="HP   Atk   Def   Sp.At   Sp.Df   Speed\n"; int [] hold=new int [6];
		   
		   int [] stat1=new int[6]; int [] stat2=new int[6]; int [] stat3=new int[6]; int [] stat4=new int[6]; int [] stat5=new int[6]; int [] stat6=new int[6];
		   int blankcounter=0;
		   for(int counter=0; counter<listA.size(); counter++){ //this searches through all the pokemon to find the selected ones and uses their stats
			   if ((one.getSelectedItem()).equals(listA.get(counter).getName())){ stat1=listA.get(counter).receiveStats();   }
			   if ((two.getSelectedItem()).equals(listA.get(counter).getName())){ stat2=listA.get(counter).receiveStats();  }
			   if ((three.getSelectedItem()).equals(listA.get(counter).getName())){  stat3=listA.get(counter).receiveStats(); }
			   if ((four.getSelectedItem()).equals(listA.get(counter).getName())){ stat4=listA.get(counter).receiveStats();  }
			   if ((five.getSelectedItem()).equals(listA.get(counter).getName())){ stat5=listA.get(counter).receiveStats();   }
			   if ((six.getSelectedItem()).equals(listA.get(counter).getName())){ stat6=listA.get(counter).receiveStats(); }
		   }
		    //this searches to make sure that the blanks are excluded from the average
			   if ((one.getSelectedItem()).equals(" ")){ blankcounter++;   }
			   if ((two.getSelectedItem()).equals(" ")){ blankcounter++;   }
			   if ((three.getSelectedItem()).equals(" ")){ blankcounter++;  }
			   if ((four.getSelectedItem()).equals(" ")){ blankcounter++;   }
			   if ((five.getSelectedItem()).equals(" ")){ blankcounter++;    }
			   if ((six.getSelectedItem()).equals(" ")){ blankcounter++;  }
		   
		    int divide=6-blankcounter;
		    
			   hold=test.getAverageStats(stat1, stat2, stat3, stat4, stat5, stat6, divide);
			  
			   for (int adder=0; adder<hold.length; adder++){ //for loop to add the average stats into the result
				   result+=hold[adder]+"      ";
			   }
			   JOptionPane.showMessageDialog(frame, result);
		   }
		   
		   
//--------------------------------------------------------------------------------------------------------------INDIVIDUAL-----------------------------------------------------------------------------------------------------

		   
		   
		   if(eventName.equals("individual")){//this displays the individual stats of each pokemon			   
			   String result ="Pokemon HP Atk Def Sp.At Sp.Df Speed\n";
			   result+=(String)one.getSelectedItem()+" ";
			   String stat1=""; String stat2=""; String stat3=""; String stat4=""; String stat5=""; String stat6="";
			   
			   for(int counter=0; counter<listA.size(); counter++){ //this searches through all the pokemon to find the selected ones and uses their stats
				   if ((one.getSelectedItem()).equals(listA.get(counter).getName())){   stat1=listA.get(counter).getStats(); }
				   if ((two.getSelectedItem()).equals(listA.get(counter).getName())){   stat2=listA.get(counter).getStats(); }
				   if ((three.getSelectedItem()).equals(listA.get(counter).getName())){   stat3=listA.get(counter).getStats(); }
				   if ((four.getSelectedItem()).equals(listA.get(counter).getName())){   stat4=listA.get(counter).getStats(); }
				   if ((five.getSelectedItem()).equals(listA.get(counter).getName())){   stat5=listA.get(counter).getStats(); }
				   if ((six.getSelectedItem()).equals(listA.get(counter).getName())){   stat6=listA.get(counter).getStats(); }
			   }
			   result+=stat1+"\n"+two.getSelectedItem()+" "+stat2+"\n"+three.getSelectedItem()+" "+stat3+"\n"+four.getSelectedItem()+" "+stat4+"\n"+five.getSelectedItem()+" "+stat5+"\n"+six.getSelectedItem()+" "+stat6;
			   //result is used as a String to display the names and stats of each pokemon.
			   JOptionPane.showMessageDialog(frame, result);
		   }
		   
	   
	   
//--------------------------------------------------------------------------------------------------------------REAL STATS----------------------------------------------------------------------------------------------------
	   
	   
	   if(eventName.equals("realStat")){//this displays the actual stats of each pokemon
		   String output=""; level=(Integer)Level.getValue();
		   int [] onestats=new int [6];  int [] twostats=new int [6];  int [] threestats=new int [6];
		   int [] fourstats=new int [6];  int [] fivestats=new int [6];  int [] sixstats=new int [6];
		   
		   int []oneeviv=new int[12];	int []twoeviv=new int[12];	int []threeeviv=new int[12];
		   int []foureviv=new int[12];	int []fiveeviv=new int[12];	int []sixeviv=new int[12];
		   
		   int pos1=0; int pos2=0; int pos3=0; int pos4=0; int pos5=0; int pos6=0;
		   for(int counter=0; counter<listA.size(); counter++){ //this runs through the possible pokemon, inorder to find the base stats of the pokemon.
			   if ((one.getSelectedItem()).equals(listA.get(counter).getName())){   pos1=counter; }
			   if ((two.getSelectedItem()).equals(listA.get(counter).getName())){   pos2=counter; }
			   if ((three.getSelectedItem()).equals(listA.get(counter).getName())){   pos3=counter; }
			   if ((four.getSelectedItem()).equals(listA.get(counter).getName())){   pos4=counter; }
			   if ((five.getSelectedItem()).equals(listA.get(counter).getName())){  pos5=counter; }
			   if ((six.getSelectedItem()).equals(listA.get(counter).getName())){   pos6=counter; }
		   }
		   oneeviv[0]=oneHPIV; oneeviv[1]=oneAttIV; oneeviv[2]=oneDefIV; oneeviv[3]=oneSAtIV; oneeviv[4]=oneSDeIV; oneeviv[5]=oneSpeIV;
		   oneeviv[6]=oneHPEV; oneeviv[7]=oneAttEV; oneeviv[8]=oneDefEV; oneeviv[9]=oneSAtEV; oneeviv[10]=oneSDeEV; oneeviv[11]=oneSpeEV;
		   
		   twoeviv[0]=twoHPIV; twoeviv[1]=twoAttIV; twoeviv[2]=twoDefIV; twoeviv[3]=twoSAtIV; twoeviv[4]=twoSDeIV; twoeviv[5]=twoSpeIV;
		   twoeviv[6]=twoHPEV; twoeviv[7]=twoAttEV; twoeviv[8]=twoDefEV; twoeviv[9]=twoSAtEV; twoeviv[10]=twoSDeEV; twoeviv[11]=twoSpeEV;
		   
		   threeeviv[0]=threeHPIV; threeeviv[1]=threeAttIV; threeeviv[2]=threeDefIV; threeeviv[3]=threeSAtIV; threeeviv[4]=threeSDeIV; threeeviv[5]=threeSpeIV;
		   threeeviv[6]=threeHPEV; threeeviv[7]=threeAttEV; threeeviv[8]=threeDefEV; threeeviv[9]=threeSAtEV; threeeviv[10]=threeSDeEV; threeeviv[11]=threeSpeEV;
		   
		   foureviv[0]=fourHPIV; foureviv[1]=fourAttIV; foureviv[2]=fourDefIV; foureviv[3]=fourSAtIV; foureviv[4]=fourSDeIV; foureviv[5]=fourSpeIV;
		   foureviv[6]=fourHPEV; foureviv[7]=fourAttEV; foureviv[8]=fourDefEV; foureviv[9]=fourSAtEV; foureviv[10]=fourSDeEV; foureviv[11]=fourSpeEV;
		   
		   fiveeviv[0]=fiveHPIV; fiveeviv[1]=fiveAttIV; fiveeviv[2]=fiveDefIV; fiveeviv[3]=fiveSAtIV; fiveeviv[4]=fiveSDeIV; fiveeviv[5]=fiveSpeIV;
		   fiveeviv[6]=fiveHPEV; fiveeviv[7]=fiveAttEV; fiveeviv[8]=fiveDefEV; fiveeviv[9]=fiveSAtEV; fiveeviv[10]=fiveSDeEV; fiveeviv[11]=fiveSpeEV;
		   
		   sixeviv[0]=sixHPIV; sixeviv[1]=sixAttIV; sixeviv[2]=sixDefIV; sixeviv[3]=sixSAtIV; sixeviv[4]=sixSDeIV; sixeviv[5]=sixSpeIV;
		   sixeviv[6]=sixHPEV; sixeviv[7]=sixAttEV; sixeviv[8]=sixDefEV; sixeviv[9]=sixSAtEV; sixeviv[10]=sixSDeEV; sixeviv[11]=sixSpeEV;
		   
		  onestats=test2.calculateStats(listA.get(pos1).receiveStats(), oneeviv, (String) NatureOne.getSelectedItem(),level);
		  output+=listA.get(pos1).getName()+" HP: "+onestats[0]+" Attack: "+onestats[1]+" Defense: "+onestats[2]+" Special Attack: "+onestats[3]+" Special Defense: "+onestats[4]+" Speed: "+onestats[5]+"\n";
		  
		  twostats=test2.calculateStats(listA.get(pos2).receiveStats(), twoeviv, (String) NatureTwo.getSelectedItem(),level);
		  output+=listA.get(pos2).getName()+" HP: "+twostats[0]+" Attack: "+twostats[1]+" Defense: "+twostats[2]+" Special Attack: "+twostats[3]+" Special Defense: "+twostats[4]+" Speed: "+twostats[5]+"\n";
		  
		  threestats=test2.calculateStats(listA.get(pos3).receiveStats(), threeeviv, (String) NatureThree.getSelectedItem(),level);
		  output+=listA.get(pos3).getName()+" HP: "+threestats[0]+" Attack: "+threestats[1]+" Defense: "+threestats[2]+" Special Attack: "+threestats[3]+" Special Defense: "+threestats[4]+" Speed: "+threestats[5]+"\n";
		  
		  fourstats=test2.calculateStats(listA.get(pos4).receiveStats(), foureviv, (String) NatureFour.getSelectedItem(),level);
		  output+=listA.get(pos4).getName()+" HP: "+fourstats[0]+" Attack: "+fourstats[1]+" Defense: "+fourstats[2]+" Special Attack: "+fourstats[3]+" Special Defense: "+fourstats[4]+" Speed: "+fourstats[5]+"\n";
		  
		  fivestats=test2.calculateStats(listA.get(pos5).receiveStats(), fiveeviv, (String) NatureFive.getSelectedItem(),level);
		  output+=listA.get(pos5).getName()+" HP: "+fivestats[0]+" Attack: "+fivestats[1]+" Defense: "+fivestats[2]+" Special Attack: "+fivestats[3]+" Special Defense: "+fivestats[4]+" Speed: "+fivestats[5]+"\n";
		  
		  sixstats=test2.calculateStats(listA.get(pos6).receiveStats(), sixeviv, (String) NatureSix.getSelectedItem(),level);
		  output+=listA.get(pos6).getName()+" HP: "+sixstats[0]+" Attack: "+sixstats[1]+" Defense: "+sixstats[2]+" Special Attack: "+sixstats[3]+" Special Defense: "+sixstats[4]+" Speed: "+sixstats[5]+"\n";
		  	  
		  
		   JOptionPane.showMessageDialog(frame, output);
	   }
	   //---------------------------------------------------------------------------------------OUTPUT-------------------------------------------------------------------------------------------------
	   if(eventName.equals("output")){
		   String printer="";
		   if(Nickname1.getText().length()!=0){
			   printer+=Nickname1.getText()+" ";
		   }
		   if(!(one.getSelectedItem().equals(" "))){
			   printer+=" ("+one.getSelectedItem()+")";
			   if(!(Itemone.getSelectedItem().equals("none"))){
				   printer+=" @ "+Itemone.getSelectedItem();
			   }
			   printer+="\n";
			   //if(ability)
			   if(sOne){
				   printer+="Shiny: Yes ";
			   }
			    if((int) oneHPEV!=0 || (int) oneAttEV!=0 ||(int) oneDefEV!=0|| (int) oneSAtEV!=0||(int) oneSDeEV!=0 ||(int) oneSpeEV!=0){
			    	printer+="EVs: ";
			    	if((int) oneHPEV!=0)
			    		printer+=(int)oneHPEV+" HP / ";
			    	if((int) oneAttEV!=0)
			    		printer+=(int)oneAttEV+" Atk / ";
			    	if((int) oneDefEV!=0)
			    		printer+=(int)oneDefEV+" Def / ";
			    	if((int) oneSAtEV!=0)
			    		printer+=(int)oneSAtEV+" SpA / ";
			    	if((int) oneSDeEV!=0)
			    		printer+=(int)oneSDeEV+" SpD / ";
			    	if((int) oneSpeEV!=0)
			    		printer+=(int)oneSpeEV+" Spe / ";
			    	printer=printer.substring(0,printer.length()-2);
			   }
			    
			   if((int) oneHPIV!=31 ||(int) oneAttIV!=31 || (int) oneDefIV!=31 || (int) oneSAtIV!=31 || (int) oneSDeIV!=31 || (int) oneSpeIV!=31){
				   printer+="IVs: ";
				   if((int) oneHPIV!=31)
					   printer+=(int)oneHPIV+" HP / ";
				   if((int) oneAttIV!=31)
					   printer+=(int)oneAttIV+" Atk / ";
				   if((int) oneDefIV!=31)
					   printer+=(int)oneDefIV+" Def / ";
				   if((int) oneSAtIV!=31)
					   printer+=(int)oneSAtIV+" SpA / ";
				   if((int) oneSDeIV!=31)
					   printer+=(int)oneSDeIV+" SpD / ";
				   if((int) oneSpeIV!=31)
					   printer+=(int)oneSpeIV+" Spe / ";
				   printer=printer.substring(0,printer.length()-2);
			   }
			    
			   printer+=NatureOne.getSelectedItem()+" Nature \n";
			   
			   if(!(OneMoveOne.getSelectedItem().equals(" "))){
				   printer+="- "+OneMoveOne.getSelectedItem()+" \n";
			   }
			   if(!(OneMoveTwo.getSelectedItem().equals(" "))){
				   printer+="- "+OneMoveTwo.getSelectedItem()+" \n";
			   }
			   if(!(OneMoveThree.getSelectedItem().equals(" "))){
				   printer+="- "+OneMoveThree.getSelectedItem()+" \n";
			   }
			   if(!(OneMoveFour.getSelectedItem().equals(" "))){
				   printer+="- "+OneMoveFour.getSelectedItem()+" \n";
			   }
		   }
		   printer+="\n";
		   if(!(two.getSelectedItem().equals(" "))){
			   printer+=Nickname2.getText()+" ";
		   }
		   if(!(two.getSelectedItem().equals(" "))){
			   printer+=" ("+two.getSelectedItem()+")";
			   if(!(Itemtwo.getSelectedItem().equals("two"))){
				   printer+=" @ "+Itemtwo.getSelectedItem();
			   }
			   printer+="\n";
			   //if(ability)
			   if(sTwo){
				   printer+="Shiny: Yes ";
			   }

			    if((int) twoHPEV!=0 || (int) twoAttEV!=0 ||(int) twoDefEV!=0|| (int) twoSAtEV!=0||(int) twoSDeEV!=0 ||(int) twoSpeEV!=0){
			    	printer+="EVs: ";
			    	if((int) twoHPEV!=0)
			    		printer+=(int)twoHPEV+" HP / ";
			    	if((int) twoAttEV!=0)
			    		printer+=(int)twoAttEV+" Atk / ";
			    	if((int) twoDefEV!=0)
			    		printer+=(int)twoDefEV+" Def / ";
			    	if((int) twoSAtEV!=0)
			    		printer+=(int)twoSAtEV+" SpA / ";
			    	if((int) twoSDeEV!=0)
			    		printer+=(int)twoSDeEV+" SpD / ";
			    	if((int) twoSpeEV!=0)
			    		printer+=(int)twoSpeEV+" Spe / ";
			    	printer=printer.substring(0,printer.length()-2);
			   }
			    
			   if((int) twoHPIV!=31 || (int) twoAttIV!=31 || (int) twoDefIV!=31 || (int) twoSAtIV!=31 || (int) twoSDeIV!=31 || (int) twoSpeIV!=31){
				   printer+="IVs: ";
				   if((int) twoHPIV!=31)
					   printer+=(int)twoHPIV+" HP / ";
				   if((int) twoAttIV!=31)
					   printer+=(int)twoAttIV+" Atk / ";
				   if((int) twoDefIV!=31)
					   printer+=(int)twoDefIV+" Def / ";
				   if((int) twoSAtIV!=31)
					   printer+=(int)twoSAtIV+" SpA / ";
				   if((int) twoSDeIV!=31)
					   printer+=(int)twoSDeIV+" SpD / ";
				   if((int) twoSpeIV!=31)
					   printer+=(int)twoSpeIV+" Spe / ";
				   printer=printer.substring(0,printer.length()-2);
			   }
			   printer+=NatureOne.getSelectedItem()+" Nature \n";
			   
			   if(!(TwoMoveOne.getSelectedItem().equals(" "))){
				   printer+="- "+OneMoveOne.getSelectedItem()+" \n";
			   }
			   if(!(TwoMoveTwo.getSelectedItem().equals(" "))){
				   printer+="- "+OneMoveTwo.getSelectedItem()+" \n";
			   }
			   if(!(TwoMoveThree.getSelectedItem().equals(" "))){
				   printer+="- "+OneMoveThree.getSelectedItem()+" \n";
			   }
			   if(!(TwoMoveFour.getSelectedItem().equals(" "))){
				   printer+="- "+OneMoveFour.getSelectedItem()+" \n";
			   }
			   
		   }
		   printer+="\n";
		   if(!(three.getSelectedItem().equals(" "))){
			     printer+=Nickname3.getText()+" ";
		   }
		   if(!(three.getSelectedItem().equals(" "))){
			   printer+=" ("+three.getSelectedItem()+")";
			   if(!(Itemthree.getSelectedItem().equals("none"))){
				   printer+=" @ "+Itemthree.getSelectedItem();
			   }
			   printer+="\n";
			   //if(ability)
			   if(sThree){
				   printer+="Shiny: Yes ";
			   }
			    if((int) threeHPEV!=0 || (int) threeAttEV!=0 ||(int) threeDefEV!=0|| (int) threeSAtEV!=0||(int) threeSDeEV!=0 ||(int) threeSpeEV!=0){
			    	printer+="EVs: ";
			    	if((int) threeHPEV!=0)
			    		printer+=(int)threeHPEV+" HP / ";
			    	if((int) threeAttEV!=0)
			    		printer+=(int)threeAttEV+" Atk / ";
			    	if((int) threeDefEV!=0)
			    		printer+=(int)threeDefEV+" Def / ";
			    	if((int) threeSAtEV!=0)
			    		printer+=(int)threeSAtEV+" SpA / ";
			    	if((int) threeSDeEV!=0)
			    		printer+=(int)threeSDeEV+" SpD / ";
			    	if((int) threeSpeEV!=0)
			    		printer+=(int)threeSpeEV+" Spe / ";
			    	printer=printer.substring(0,printer.length()-2);
			   }
			    
			   if((int) threeHPIV!=31 || (int) threeAttIV!=31 || (int) threeDefIV!=31 || (int) threeSAtIV!=31 || (int) threeSDeIV!=31 || (int) threeSpeIV!=31){
				   printer+="IVs: ";
				   if((int) threeHPIV!=31)
					   printer+=(int)threeHPIV+" HP / ";
				   if((int) threeAttIV!=31)
					   printer+=(int)threeAttIV+" Atk / ";
				   if((int) threeDefIV!=31)
					   printer+=(int)threeDefIV+" Def / ";
				   if((int) threeSAtIV!=31)
					   printer+=(int)threeSAtIV+" SpA / ";
				   if((int) threeSDeIV!=31)
					   printer+=(int)threeSDeIV+" SpD / ";
				   if((int) threeSpeIV!=31)
					   printer+=(int)threeSpeIV+" Spe / ";
				   printer=printer.substring(0,printer.length()-2);
			   }
			   printer+=NatureThree.getSelectedItem()+" Nature \n";
			   
			   if(!(ThreeMoveOne.getSelectedItem().equals(" "))){
				   printer+="- "+ThreeMoveOne.getSelectedItem()+" \n";
			   }
			   if(!(ThreeMoveTwo.getSelectedItem().equals(" "))){
				   printer+="- "+ThreeMoveTwo.getSelectedItem()+" \n";
			   }
			   if(!(ThreeMoveThree.getSelectedItem().equals(" "))){
				   printer+="- "+ThreeMoveThree.getSelectedItem()+" \n";
			   }
			   if(!(ThreeMoveFour.getSelectedItem().equals(" "))){
				   printer+="- "+ThreeMoveFour.getSelectedItem()+" \n";
			   } 
		   }
		   printer+="\n";
		   if(!(four.getSelectedItem().equals(" "))){
			      printer+=Nickname4.getText()+" ";
		   }
		   if(!(four.getSelectedItem().equals(" "))){
			   printer+=" ("+four.getSelectedItem()+")";
			   if(!(Itemfour.getSelectedItem().equals("none"))){
				   printer+=" @ "+Itemfour.getSelectedItem();
			   }
			   printer+="\n";
			   //if(ability)
			   if(sFour){
				   printer+="Shiny: Yes ";
			   }
			   
			    if((int) fourHPEV!=0 || (int) fourAttEV!=0 ||(int) fourDefEV!=0|| (int) fourSAtEV!=0||(int) fourSDeEV!=0 ||(int) fourSpeEV!=0){
			    	printer+="EVs: ";
			    	if((int) fourHPEV!=0)
			    		printer+=(int)fourHPEV+" HP / ";
			    	if((int) fourAttEV!=0)
			    		printer+=(int)fourAttEV+" Atk / ";
			    	if((int) fourDefEV!=0)
			    		printer+=(int)fourDefEV+" Def / ";
			    	if((int) fourSAtEV!=0)
			    		printer+=(int)fourSAtEV+" SpA / ";
			    	if((int) fourSDeEV!=0)
			    		printer+=(int)fourSDeEV+" SpD / ";
			    	if((int) fourSpeEV!=0)
			    		printer+=(int)fourSpeEV+" Spe / ";
			    	printer=printer.substring(0,printer.length()-2);
			   }
			    
			   if((int) fourHPIV!=31 || (int) fourAttIV!=31 || (int) fourDefIV!=31 || (int) fourSAtIV!=31 || (int) fourSDeIV!=31 || (int) fourSpeIV!=31){
				   printer+="IVs: ";
				   if((int) fourHPIV!=31)
					   printer+=(int)fourHPIV+" HP / ";
				   if((int) fourAttIV!=31)
					   printer+=(int)fourAttIV+" Atk / ";
				   if((int) fourDefIV!=31)
					   printer+=(int)fourDefIV+" Def / ";
				   if((int) fourSAtIV!=31)
					   printer+=(int)fourSAtIV+" SpA / ";
				   if((int) fourSDeIV!=31)
					   printer+=(int)fourSDeIV+" SpD / ";
				   if((int) fourSpeIV!=31)
					   printer+=(int)fourSpeIV+" Spe / ";
				   printer=printer.substring(0,printer.length()-2);
			   }
			   printer+=NatureFour.getSelectedItem()+" Nature \n";
			   
			   if(!(FourMoveOne.getSelectedItem().equals(" "))){
				   printer+="- "+FourMoveOne.getSelectedItem()+" \n";
			   }
			   if(!(FourMoveTwo.getSelectedItem().equals(" "))){
				   printer+="- "+FourMoveTwo.getSelectedItem()+" \n";
			   }
			   if(!(FourMoveThree.getSelectedItem().equals(" "))){
				   printer+="- "+FourMoveThree.getSelectedItem()+" \n";
			   }
			   if(!(FourMoveFour.getSelectedItem().equals(" "))){
				   printer+="- "+FourMoveFour.getSelectedItem()+" \n";
			   }
		   }
		   printer+="\n";
		   if(!(five.getSelectedItem().equals(" "))){
			      printer+=Nickname5.getText()+" ";
		   }
		   if(!(five.getSelectedItem().equals(" "))){
			   printer+=" ("+five.getSelectedItem()+")";
			   if(!(Itemfive.getSelectedItem().equals("none"))){
				   printer+=" @ "+Itemfive.getSelectedItem();
			   }
			   printer+="\n";
			   //if(ability)
			   if(sFive){
				   printer+="Shiny: Yes ";
			   }
	
			   
			    if((int) fiveHPEV!=0 || (int) fiveAttEV!=0 ||(int) fiveDefEV!=0|| (int) fiveSAtEV!=0||(int) fiveSDeEV!=0 ||(int) fiveSpeEV!=0){
			    	printer+="EVs: ";
			    	if((int) fiveHPEV!=0)
			    		printer+=(int)fiveHPEV+" HP / ";
			    	if((int) fiveAttEV!=0)
			    		printer+=(int)fiveAttEV+" Atk / ";
			    	if((int) fiveDefEV!=0)
			    		printer+=(int)fiveDefEV+" Def / ";
			    	if((int) fiveSAtEV!=0)
			    		printer+=(int)fiveSAtEV+" SpA / ";
			    	if((int) fiveSDeEV!=0)
			    		printer+=(int)fiveSDeEV+" SpD / ";
			    	if((int) fiveSpeEV!=0)
			    		printer+=(int)fiveSpeEV+" Spe / ";
			    	printer=printer.substring(0,printer.length()-2);
			   }
			    
			   if((int) fiveHPIV!=31 || (int) fiveAttIV!=31 || (int) fiveDefIV!=31 || (int) fiveSAtIV!=31 || (int) fiveSDeIV!=31 || (int) fiveSpeIV!=31){
				   printer+="IVs: ";
				   if((int) fiveHPIV!=31)
					   printer+=(int)fiveHPIV+" HP / ";
				   if((int) fiveAttIV!=31)
					   printer+=(int)fiveAttIV+" Atk / ";
				   if((int) fiveDefIV!=31)
					   printer+=(int)fiveDefIV+" Def / ";
				   if((int) fiveSAtIV!=31)
					   printer+=(int)fiveSAtIV+" SpA / ";
				   if((int) fiveSDeIV!=31)
					   printer+=(int)fiveSDeIV+" SpD / ";
				   if((int) fiveSpeIV!=31)
					   printer+=(int)fiveSpeIV+" Spe / ";
				   printer=printer.substring(0,printer.length()-2);
			   }
			   printer+=NatureFive.getSelectedItem()+" Nature \n";
			   
			   if(!(FiveMoveOne.getSelectedItem().equals(" "))){
				   printer+="- "+FiveMoveOne.getSelectedItem()+" \n";
			   }
			   if(!(FiveMoveTwo.getSelectedItem().equals(" "))){
				   printer+="- "+FiveMoveTwo.getSelectedItem()+" \n";
			   }
			   if(!(FiveMoveThree.getSelectedItem().equals(" "))){
				   printer+="- "+FiveMoveThree.getSelectedItem()+" \n";
			   }
			   if(!(FiveMoveFour.getSelectedItem().equals(" "))){
				   printer+="- "+FiveMoveFour.getSelectedItem()+" \n";
			   }
		   }
		   printer+="\n";
		   if(!(six.getSelectedItem().equals(" "))){   printer+=Nickname6.getText();
		   }
		   if(!(six.getSelectedItem().equals(" "))){
			   printer+=" ("+six.getSelectedItem()+")";
			   if(!(Itemsix.getSelectedItem().equals("none"))){
				   printer+=" @ "+Itemsix.getSelectedItem();
			   }
			   printer+="\n";
			   //if(ability)
			   if(sSix){
				   printer+="Shiny: Yes ";
			   }

			   
			    if((int) sixHPEV!=0 || (int) sixAttEV!=0 ||(int) sixDefEV!=0|| (int) sixSAtEV!=0||(int) sixSDeEV!=0 ||(int) sixSpeEV!=0){
			    	printer+="EVs: ";
			    	if((int) sixHPEV!=0)
			    		printer+=(int)sixHPEV+" HP / ";
			    	if((int) sixAttEV!=0)
			    		printer+=(int)sixAttEV+" Atk / ";
			    	if((int) sixDefEV!=0)
			    		printer+=(int)sixDefEV+" Def / ";
			    	if((int) sixSAtEV!=0)
			    		printer+=(int)sixSAtEV+" SpA / ";
			    	if((int) sixSDeEV!=0)
			    		printer+=(int)sixSDeEV+" SpD / ";
			    	if((int) sixSpeEV!=0)
			    		printer+=(int)sixSpeEV+" Spe / ";
			   }
			    
			   if((int) sixHPIV!=31 || (int) sixAttIV!=31 || (int) sixDefIV!=31 || (int) sixSAtIV!=31 || (int) sixSDeIV!=31 || (int) sixSpeIV!=31){
				   printer+="IVs: ";
				   if((int) sixHPIV!=31)
					   printer+=(int)sixHPIV+" HP / ";
				   if((int) sixAttIV!=31)
					   printer+=(int)sixAttIV+" Atk / ";
				   if((int) sixDefIV!=31)
					   printer+=(int)sixDefIV+" Def / ";
				   if((int) sixSAtIV!=31)
					   printer+=(int)sixSAtIV+" SpA / ";
				   if((int) sixSDeIV!=31)
					   printer+=(int)sixSDeIV+" SpD / ";
				   if((int) sixSpeIV!=31)
					   printer+=(int)sixSpeIV+" Spe / ";			   
			   }
			   printer+=NatureSix.getSelectedItem()+" Nature \n";
			   
			   if(!(SixMoveOne.getSelectedItem().equals(" "))){
				   printer+="- "+SixMoveOne.getSelectedItem()+" \n";
			   }
			   if(!(SixMoveTwo.getSelectedItem().equals(" "))){
				   printer+="- "+SixMoveTwo.getSelectedItem()+" \n";
			   }
			   if(!(SixMoveThree.getSelectedItem().equals(" "))){
				   printer+="- "+SixMoveThree.getSelectedItem()+" \n";
			   }
			   if(!(SixMoveFour.getSelectedItem().equals(" "))){
				   printer+="- "+SixMoveFour.getSelectedItem()+" \n";
			   }
		   }
			   
			
			   PrintWriter out = null;
			try {
				out = new PrintWriter("team.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   out.println(printer);
			   out.close();
			   
			   System.out.println(printer);
		   
		   }
	   }
	   
	      
	   
	   // end of major method

	
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------CHECK ABILITY----------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public String [] checkAbility(String name){
		String [] ability=new String [3];
		
		if(name=="Abomasnow"){ability[0]="Snow Warning";ability[1]="";ability[2]="Soundproof";}
		else if(name=="Abra"){ability[0]="Synchronize";ability[1]="Inner Focus";ability[2]="Magic Gaurd";}
		else if(name=="Absol"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Accelgor"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Aerodactyl"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Aggron"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Aipom"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Alakazam"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Alomomola"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Altaria"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ambipom"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Amoonguss"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ampharos"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Anorith"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Arbok"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Arcanine"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Arceus"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Archen"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Archeops"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ariados"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Armaldo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Aron"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Articuno"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Audino"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Axew"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Azelf"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Azumarill"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Azurill"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bagon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Baltoy"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Banette"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Barboach"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Basculin"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bastiodon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bayleef"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Beartic"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Beautifly"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Beedrill"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Beheeyem"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Beldum"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bellossom"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bellsprout"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bibarel"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bidoof"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bisharp"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Blastoise"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Blaziken"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Blissey"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Blitzle"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Boldore"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bonsly"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bouffalant"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Braviary"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Breloom"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bronzong"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bronzor"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Budew"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Buizel"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bulbasaur"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Buneary"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Burmy"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Butterfree"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cacnea"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cacturne"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Camerupt"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Carnivine"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Carracosta"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Carvanha"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cascoon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Castform"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Caterpie"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Celebi"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Chandelure"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Chansey"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Charizard"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Charmander"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Charmeleon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Chatot"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cherrim"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cherubi"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Chikorita"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Chimchar"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Chimecho"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Chinchou"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Chingling"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cinccino"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Clamperl"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Claydol"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Clefable"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Clefairy"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cleffa"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cloyster"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cobalion"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cofagrigus"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Combee"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Combusken"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Conkeldurr"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Corphish"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Corsola"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cottonee"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cradily"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cranidos"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Crawdaunt"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cresselia"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Croagunk"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Crobat"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Croconaw"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Crustle"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cryogonal"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cubchoo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cubone"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Cyndaquil"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Darkrai"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Darmanitan"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Darumaka"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Deerling"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Deino"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Delcatty"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Delibird"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Deoxys"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dewgong"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dewott"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dialga"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Diglett"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ditto"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dodrio"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Doduo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Donphan"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dragonair"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dragonite"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Drapion"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dratini"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Drifblim"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Drifloon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Drilbur"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Drowzee"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Druddigon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ducklett"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dugtrio"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dunsparce"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Duosion"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Durant"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dusclops"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dusknoir"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Duskull"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dustox"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dwebble"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Eelektrik"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Eelektross"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Eevee"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ekans"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Electabuzz"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Electivire"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Electrike"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Electrode"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Elekid"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Elgyem"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Emboar"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Emolga"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Empoleon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Entei"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Escavalier"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Espeon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Excadrill"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Exeggcute"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Exeggutor"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Exploud"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Farfetch'd"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Fearow"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Feebas"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Feraligatr"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ferroseed"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ferrothorn"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Finneon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Flaaffy"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Flareon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Floatzel"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Flygon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Foongus"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Forretress"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Fraxure"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Frillish"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Froslass"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Furret"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gabite"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gallade"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Galvantula"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Garbodor"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Garchomp"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gardevoir"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gastly"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gastrodon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Genesect"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gengar"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Geodude"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gible"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gigalith"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Girafarig"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Giratina"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Glaceon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Glalie"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Glameow"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gligar"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gliscor"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gloom"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Golbat"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Goldeen"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Golduck"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Golem"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Golett"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Golurk"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gorebyss"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gothita"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gothitelle"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gothorita"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Granbull"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Graveler"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Grimer"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Grotle"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Groudon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Grovyle"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Growlithe"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Grumpig"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gulpin"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gurdurr"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gyarados"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Happiny"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Hariyama"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Haunter"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Haxorus"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Heatmor"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Heatran"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Heracross"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Herdier"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Hippopotas"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Hippowdon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Hitmonchan"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Hitmonlee"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Hitmontop"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ho-oh"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Honchkrow"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Hoothoot"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Hoppip"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Horsea"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Houndoom"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Houndour"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Huntail"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Hydreigon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Hypno"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Igglybuff"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Illumise"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Infernape"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ivysaur"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Jellicent"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Jigglypuff"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Jirachi"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Jolteon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Joltik"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Jumpluff"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Jynx"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Kabuto"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Kabutops"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Kadabra"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Kakuna"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Kangaskhan"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Karrablast"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Kecleon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Keldeo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Kingdra"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Kingler"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Kirlia"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Klang"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Klink"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Klinklang"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Koffing"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Krabby"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Kricketot"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Kricketune"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Krokorok"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Krookodile"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Kyogre"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Kyurem"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lairon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lampent"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Landorus"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lanturn"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lapras"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Larvesta"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Larvitar"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Latias"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Latios"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Leafeon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Leavanny"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ledian"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ledyba"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lickilicky"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lickitung"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Liepard"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lileep"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lilligant"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lillipup"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Linoone"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Litwick"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lombre"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lopunny"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lotad"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Loudred"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lucario"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ludicolo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lugia"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lumineon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Lunatone"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Luvdisc"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Luxio"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Luxray"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Machamp"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Machoke"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Machop"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Magby"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Magcargo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Magikarp"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Magmar"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Magmortar"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Magnemite"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Magneton"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Magnezone"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Makuhita"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mamoswine"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Manaphy"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mandibuzz"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Manectric"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mankey"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mantine"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mantyke"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Maractus"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mareep"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Marill"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Marowak"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Marshtomp"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Masquerain"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mawile"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Medicham"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Meditite"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Meganium"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Meloetta"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Meowth"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mesprit"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Metagross"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Metang"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Metapod"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mew"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mewtwo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mienfoo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mienshao"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mightyena"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Milotic"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Miltank"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mime Jr."){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Minccino"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Minun"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Misdreavus"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mismagius"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Moltres"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Monferno"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mothim"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mr. Mime"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Mudkip"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Muk"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Munchlax"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Munna"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Murkrow"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Musharna"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Natu"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Nidoking"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Nidoqueen"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Nidoran (f)"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Nidoran (m)"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Nidorina"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Nidorino"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Nincada"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ninetales"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ninjask"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Noctowl"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Nosepass"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Numel"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Nuzleaf"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Octillery"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Oddish"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Omanyte"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Omastar"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Onix"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Oshawott"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pachirisu"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Palkia"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Palpitoad"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Panpour"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pansage"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pansear"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Paras"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Parasect"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Patrat"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pawniard"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pelipper"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Persian"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Petilil"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Phanpy"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Phione"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pichu"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pidgeot"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pidgeotto"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pidgey"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pidove"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pignite"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pikachu"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Piloswine"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pineco"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pinsir"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Piplup"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Plusle"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Politoed"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Poliwag"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Poliwhirl"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Poliwrath"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ponyta"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Poochyena"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Porygon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Porygon-Z"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Porygon2"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Primeape"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Prinplup"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Probopass"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Psyduck"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pupitar"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Purrloin"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Purugly"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Quagsire"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Quilava"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Qwilfish"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Raichu"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Raikou"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ralts"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Rampardos"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Rapidash"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Raticate"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Rattata"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Rayquaza"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Regice"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Regigigas"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Regirock"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Registeel"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Relicanth"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Remoraid"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Reshiram"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Reuniclus"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Rhydon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Rhyhorn"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Rhyperior"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Riolu"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Roggenrola"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Roselia"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Roserade"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Rotom"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Rufflet"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sableye"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Salamence"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Samurott"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sandile"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sandshrew"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sandslash"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sawk"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sawsbuck"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sceptile"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Scizor"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Scolipede"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Scrafty"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Scraggy"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Scyther"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Seadra"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Seaking"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sealeo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Seedot"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Seel"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Seismitoad"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sentret"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Serperior"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Servine"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Seviper"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sewaddle"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sharpedo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Shaymin"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Shedinja"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Shelgon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Shellder"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Shellos"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Shelmet"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Shieldon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Shiftry"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Shinx"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Shroomish"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Shuckle"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Shuppet"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sigilyph"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Silcoon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Simipour"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Simisage"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Simisear"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Skarmory"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Skiploom"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Skitty"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Skorupi"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Skuntank"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Slaking"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Slakoth"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Slowbro"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Slowking"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Slowpoke"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Slugma"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Smeargle"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Smoochum"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sneasel"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Snivy"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Snorlax"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Snorunt"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Snover"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Snubbull"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Solosis"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Solrock"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Spearow"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Spheal"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Spinarak"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Spinda"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Spiritomb"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Spoink"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Squirtle"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Stantler"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Staraptor"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Staravia"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Starly"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Starmie"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Staryu"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Steelix"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Stoutland"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Stunfisk"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Stunky"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sudowoodo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Suicune"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sunflora"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sunkern"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Surskit"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Swablu"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Swadloon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Swalot"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Swampert"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Swanna"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Swellow"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Swinub"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Swoobat"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Taillow"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tangela"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tangrowth"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tauros"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Teddiursa"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tentacool"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tentacruel"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tepig"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Terrakion"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Throh"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Thundurus"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Timburr"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tirtouga"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Togekiss"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Togepi"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Togetic"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Torchic"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Torkoal"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tornadus"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Torterra"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Totodile"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Toxicroak"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tranquill"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Trapinch"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Treecko"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tropius"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Trubbish"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Turtwig"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tympole"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tynamo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Typhlosion"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tyranitar"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tyrogue"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Umbreon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Unfezant"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Unown"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Ursaring"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Uxie"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Vanillish"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Vanillite"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Vanilluxe"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Vaporeon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Venipede"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Venomoth"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Venonat"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Venusaur"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Vespiquen"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Vibrava"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Victini"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Victreebel"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Vigoroth"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Vileplume"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Virizion"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Volbeat"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Volcarona"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Voltorb"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Vullaby"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Vulpix"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Wailmer"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Wailord"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Walrein"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Wartortle"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Watchog"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Weavile"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Weedle"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Weepinbell"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Weezing"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Whimsicott"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Whirlipede"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Whiscash"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Whismur"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Wigglytuff"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Wingull"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Wobbuffet"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Woobat"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Wooper"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Wormadam"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Wurmple"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Wynaut"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Xatu"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Yamask"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Yanma"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Yanmega"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Zangoose"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Zapdos"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Zebstrika"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Zekrom"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Zigzagoon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Zoroark"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Zorua"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Zubat"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Zweilous"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Aegislash"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Amaura"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Aromatisse"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Aurorus"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Avalugg"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Barbaracle"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bergmite"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Binacle"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Braixen"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Bunnelby"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Carbink"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Chesnaught"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Chespin"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Clauncher"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Clawitzer"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dedenne"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Delphox"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Diancie"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Diggersby"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Doublade"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Dragalge"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Espurr"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Fennekin"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Flabébé"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Fletchinder"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Fletchling"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Floette"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Florges"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Froakie"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Frogadier"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Furfrou"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gogoat"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Goodra"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Goomy"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Gourgeist"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Greninja"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Hawlucha"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Heliolisk"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Helioptile"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Honedge"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Inkay"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Klefki"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Litleo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Malamar"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Meowstic"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Noibat"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Noivern"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pancham"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pangoro"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Phantump"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pumpkaboo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Pyroar"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Quilladin"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Scatterbug"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Skiddo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Skrelp"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sliggoo"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Slurpuff"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Spewpa"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Spritzee"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Swirlix"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Sylveon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Talonflame"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Trevenant"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tyrantrum"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Tyrunt"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Vivillon"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Xerneas"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Yveltal"){ability[0]="";ability[1]="";ability[2]="";}
		else if(name=="Zygarde"){ability[0]="";ability[1]="";ability[2]="";}
		
		return ability;
	
	}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------MOVE CHECKER-------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
	
	public void moveChecker(String pokemon, String move){ //used for coverage
		int counter=0; boolean done=false; String type = ""; int place=0;

		while(counter<listB.size() &&!done){
	
			if(move.equals(listB.get(counter).getName())){
				type=listB.get(counter).getType().toLowerCase();
			
				place=counter;
				done=true;
			}
			else counter++;
		}

			if (listB.get(place).getDamage()){	
				
				if (type.equals("normal")){} //normal strengths (normal is not strong to anything)
			
				
				if (type.equals("fire")){
				coverNumber[4]++; coverName[4]+=pokemon+" "; 	
				coverNumber[5]++; coverName[5]+=pokemon+" "; 
				coverNumber[11]++; coverName[11]+=pokemon+" ";
				coverNumber[16]++; coverName[16]+=pokemon+" ";
				} //fire strengths (grass, ice, bug, steel)
		
				if (type.equals("water")){coverNumber[1]++; coverName[1]+=pokemon+" "; coverNumber[8]++; coverName[8]+=pokemon+" "; coverNumber[12]++; coverName[12]+=pokemon+" "; } //water strengths (fire, ground, rock)
			
				if (type.equals("electric")){coverNumber[3]++; coverName[3]+=pokemon+" "; coverNumber[9]++; coverName[9]+=pokemon+" "; } //electric strengths (water, flying)
			
				if (type.equals("grass")){coverNumber[2]++; coverName[2]+=pokemon+" "; coverNumber[8]++; coverName[8]+=pokemon+" "; coverNumber[12]++; coverName[12]+=pokemon+" ";} //grass strengths (water, ground, rock)
		
				if (type.equals("ice")){coverNumber[4]++; coverName[4]+=pokemon+" "; coverNumber[9]++; coverName[9]+=pokemon+" "; coverNumber[12]++; coverName[12]+=pokemon+" "; coverNumber[14]++; coverName[14]+=pokemon+" ";} //ice strengths (grass, flying, rock, dragon)

				if (type.equals("fighting")){coverNumber[0]++; coverName[0]+=pokemon+" "; coverNumber[5]++; coverName[5]+=pokemon+" "; coverNumber[12]++; coverName[12]+=pokemon+" "; coverNumber[15]++; coverName[15]+=pokemon+" "; coverNumber[16]++; coverName[16]+=pokemon+" "; } //fighting strengths (normal, ice, rock, dark, steel)
			
				if (type.equals("poison")){coverNumber[4]++; coverName[4]+=pokemon+" "; coverNumber[17]++; coverName[17]+=pokemon+" "; } //poison strengths (grass, fairy)
		
				if (type.equals("ground")){coverNumber[1]++; coverName[1]+=pokemon+" "; coverNumber[3]++; coverName[3]+=pokemon+" "; coverNumber[7]++; coverName[7]+=pokemon+" "; coverNumber[12]++; coverName[12]+=pokemon+" "; coverNumber[16]++; coverName[16]+=pokemon+" "; } //ground strengths (fire, electric, poison, rock, steel)
		
				if (type.equals("flying")){coverNumber[4]++; coverName[4]+=pokemon+" "; coverNumber[6]++; coverName[6]+=pokemon+" "; coverNumber[11]++; coverName[11]+=pokemon+" "; } //flying strengths (grass, fighting, bug)
		
				if (type.equals("psychic")){coverNumber[6]++; coverName[6]+=pokemon+" "; coverNumber[7]++; coverName[7]+=pokemon+" "; } //psychic strengths (fighting, poison)

				if (type.equals("bug")){coverNumber[4]++; coverName[4]+=pokemon+" "; coverNumber[10]++; coverName[10]+=pokemon+" "; coverNumber[15]++; coverName[15]+=pokemon+" ";} //bug strengths (grass, psychic, dark)

				if (type.equals("rock")){coverNumber[1]++; coverName[1]+=pokemon+" "; coverNumber[5]++; coverName[5]+=pokemon+" "; coverNumber[9]++; coverName[9]+=pokemon+" "; coverNumber[11]++; coverName[11]+=pokemon+" "; } //rock strengths (fire, ice, flying, bug) 

				if (type.equals("ghost")){coverNumber[10]++; coverName[10]+=pokemon+" "; coverNumber[13]++; coverName[13]+=pokemon+" "; } //ghost strengths (psychic, ghost)

				if (type.equals("dragon")){coverNumber[14]++; coverName[14]+=pokemon+" ";} //dragon strengths (dragon)

				if (type.equals("dark")){coverNumber[10]++; coverName[10]+=pokemon+" "; coverNumber[13]++; coverName[13]+=pokemon+" "; } //dark strengths (psychic, ghost)

				if (type.equals("steel")){coverNumber[5]++; coverName[5]+=pokemon+" "; coverNumber[12]++; coverName[12]+=pokemon+" "; coverNumber[17]++; coverName[17]+=pokemon+" "; } //steel strengths(ice, rock, fairy)
		
				if (type.equals("fairy")){coverNumber[6]++; coverName[6]+=pokemon+" "; coverNumber[14]++; coverName[14]+=pokemon+" "; coverNumber[15]++; coverName[15]+=pokemon+" "; } //fairy strengths(fighting, dragon, dark)
			}
		}
	
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------COVERAGE OUTPUT-------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	private String coverOutput(String output, int[] coverNumber, String [] coverName){

			   output+="normal    "+coverNumber[0]+":      "+coverName[0]+"\n";
			   output+="fire      "+coverNumber[1]+":      "+coverName[1]+"\n"; 
			   output+="water      "+coverNumber[2]+":      "+coverName[2]+"\n"; 
			   output+="electric      "+coverNumber[3]+":      "+coverName[3]+"\n"; 
			   output+="grass      "+coverNumber[4]+":      "+coverName[4]+"\n"; 
			   output+="ice      "+coverNumber[5]+":      "+coverName[5]+"\n"; 
			   output+="fighting      "+coverNumber[6]+":      "+coverName[6]+"\n"; 
			   output+="poison      "+coverNumber[7]+":      "+coverName[7]+"\n"; 
			   output+="ground      "+coverNumber[8]+":      "+coverName[8]+"\n"; 
			   output+="flying      "+coverNumber[9]+":      "+coverName[9]+"\n"; 
			   output+="psychic      "+coverNumber[10]+":      "+coverName[10]+"\n"; 
			   output+="bug      "+coverNumber[11]+":      "+coverName[11]+"\n"; 
			   output+="rock      "+coverNumber[12]+":      "+coverName[12]+"\n"; 
			   output+="ghost      "+coverNumber[13]+":      "+coverName[13]+"\n"; 
			   output+="dragon      "+coverNumber[14]+":      "+coverName[14]+"\n"; 
			   output+="dark      "+coverNumber[15]+":      "+coverName[15]+"\n"; 
			   output+="steel      "+coverNumber[16]+":      "+coverName[16]+"\n"; 
			   output+="fairy      "+coverNumber[17]+":    "+coverName[17]+"\n"; 
	
		return output;
	}
		
	
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------BASIC GUI METHODS-----------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	private static void runGUI(){
		JFrame.setDefaultLookAndFeelDecorated(false);
		Analyser greeting = new Analyser();
	}
	
	public static void main (String [] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				runGUI();}
			});
		}
	}

