package baseball;

public class AtBat {
	
	public static int NewAtBat(Player p){
		//String result = "Out";
		int resultCode = 8;
		double random = Math.random();
		double baseline = 0;
		//System.out.println("random: " + random);
		
		double[] probabilities = {p.singleAVG, p.doubleAVG, p.tripleAVG, p.HRAVG, p.BBAVG, p.HBPAVG, p.SOAVG};
		int [] resultsCode = {1,2,3,4,5,6,7,8,9,10};
		//String[] results = {"Single", "Double", "Triple", "HOME RUN!", "Walk", "Hit By Pitch", "Strikeout", "Out" "Ground Out", "Fly out"};
		
		boolean set = false;
		int index = 0;
		while (!set && (index < probabilities.length)){
			baseline += probabilities[index];
			if (random <= baseline){
				resultCode = resultsCode[index];
				//result = results[index];
				set = true;
			}
			index++;
		}
		if (resultCode == 8){
			double randomOut = Math.random();
			if (randomOut < 0.53){
				resultCode = 9;
			}
			else resultCode = 10;
		}
		
		return resultCode;
	}

}
