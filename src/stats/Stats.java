package stats;

public class Stats {
	private String nature;
	
	public Stats(String n){
	}
	public double AC=1.0;
	public double DC=1.0;
	public double SAC=1.0;
	public double SDC=1.0;
	public double SC=1.0;
	
	
	public void natureCheck(String nature){
		if (nature.equals("Adamant")){
			AC=1.1;
			SAC=.9;
		}
		
		else if (nature.equals("Bold")){
			DC=1.1;
			AC=.9;
		}
		else if (nature.equals("Brave")){
			AC=1.1;
			SC=.9;
		}
		else if (nature.equals("Calm")){
			SDC=1.1;
			AC=.9;
		}
		else if (nature.equals("Careful")){
			SDC=1.1;
			SAC=.9;
		}
		
		else if (nature.equals("Gentle")){
			SDC=1.1;
			DC=.9;
		}
		else if (nature.equals("Hasty")){
			SC=1.1;
			DC=.9;
		}
		else if (nature.equals("Impish")){
			DC=1.1;
			SAC=.9;
		}
		else if (nature.equals("Jolly")){
			SC=1.1;
			SAC=.9;
		}
		else if (nature.equals("Lax")){
			DC=1.1;
			SDC=.9;
		}
		else if (nature.equals("Lonely")){
			AC=1.1;
			DC=.9;
		}
		else if (nature.equals("Mild")){
			SAC=1.1;
			DC=.9;
		}
		else if (nature.equals("Modest")){
			SAC=1.1;
			DC=.9;
		}
		else if (nature.equals("Naive")){
			SC=1.1;
			SDC=.9;
		}
		else if (nature.equals("Naughty")){
			AC=1.1;
			SDC=.9;
		}
		else if (nature.equals("Quiet")){
			SAC=1.1;
			SDC=.9;
		}
		else if(nature.equals("Rash")){
			SAC=1.1;
			SDC=.9;
		}
		else if(nature.equals("Relaxed")){
			DC=1.1;
			SC=.9;
		}
		else if(nature.equals("Sassy")){
			SDC=1.1;
			SC=.9;
		}
		else if(nature.equals("Timid")){
			SC=1.1;
			AC=.9;
		}
	}

	public int [] calculateStats(int [] base, int []eviv, String nature, int level){
		int stats[]=new int [6];
		natureCheck(nature);
		if(base[0]==1){	stats[0]=1;	}//special case for Shedinja
		else{
			stats[0]=(int)(((eviv[0]+(2*base[0])+((double)(eviv[6]/4.0))+100)*level)/100)+10;
		}
		stats[1]=(int) (((((eviv[1]+(2*base[1])+((double)(eviv[7]/4.0)))*level)/100)+5)*AC);
		stats[2]=(int) (((((eviv[2]+(2*base[2])+((double)(eviv[8]/4.0)))*level)/100)+5)*DC);
		stats[3]=(int) (((((eviv[3]+(2*base[3])+((double)(eviv[9]/4.0)))*level)/100)+5)*SAC);
		stats[4]=(int) (((((eviv[4]+(2*base[4])+((double)(eviv[10]/4.0)))*level)/100)+5)*SDC);
		stats[5]=(int) (((((eviv[5]+(2*base[5])+((double)(eviv[11]/4.0)))*level)/100)+5)*SC);
		
		AC=1.0;
		DC=1.0;
		SAC=1.0;
		SDC=1.0;
		SC=1.0;
		
		return stats;
	}
	
}
