package baseball;

public class AtBat {
	
	public static String NewAtBat(Player p){
		String result = "Out";
		double random = Math.random();
		double baseline = 0;
		//System.out.println("random: " + random);
		
		double[] probabilities = {p.singleAVG, p.doubleAVG, p.tripleAVG, p.HRAVG, p.BBAVG, p.HBPAVG, p.SOAVG};
		String[] results = {"Single", "Double", "Triple", "HOME RUN!", "Walk", "Hit By Pitch", "Strikeout"};
		
		boolean set = false;
		int index = 0;
		while (!set && (index < probabilities.length)){
			baseline += probabilities[index];
			if (random <= baseline){
				result = results[index];
				set = true;
			}
			index++;
		}
		
		return result;
	}

}
