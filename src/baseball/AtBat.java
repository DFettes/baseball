package baseball;

public class AtBat {
	
	public static int NewAtBat(Player p1, Player p2){
		int resultCode = 8;
		double random = Math.random();
		double baseline = 0;
		
		//double[] probabilities = {p1.singleAVG, p1.doubleAVG, p1.tripleAVG, p1.HRAVG, p1.BBAVG, p1.HBPAVG, p1.SOAVG};
		double[] adjProbabilities = {1.1*p1.singleAVG*p2.H9diff, 1*p1.doubleAVG*p2.H9diff, 1*p1.tripleAVG*p2.H9diff, 1.1*p1.HRAVG*p2.HR9diff, 0.75*p1.BBAVG*p2.BB9diff, p1.HBPAVG*p2.HBP9diff, 1.4*p1.SOAVG*p2.K9diff};
		int [] resultsCode = {1,2,3,4,5,6,7,8,9,10};
		
		boolean set = false;
		int index = 0;
		while (!set && (index < adjProbabilities.length)){
			baseline += adjProbabilities[index];
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
