
public class GradeCalculator {

	public static void main(String[] args) {
		
		math224();

	}
	
	public static void math224 () {
		
		int homeWgt = 6;
		int quizWgt = 14;
		int midWgt = 20;
		int finWgt = 40;
		
		double[] homeScr = {10, 5.5, 0, 3, 0};
		double[] quizScr = {8, 10};
		int homeTotal = 10;
		int quizTotal = 10;
		
		double homeAvg = 0;
		double quizAvg = 0;
		
		double mid1Scr = (double)90 / 100;
		double mid2Scr = (double)85 / 100;
		double finScr = (double)85 / 100;
		
		double totalGrade = 0;
		
		for(int i = 0; i < homeScr.length; i++) {
			
			homeAvg += (homeScr[i] / homeTotal);
			
		}
		homeAvg = homeAvg / homeScr.length;
		
		for(int i = 0; i < quizScr.length; i++) {
			
			quizAvg += (quizScr[i] / quizTotal);
			
		}
		quizAvg = quizAvg / quizScr.length;
		
		totalGrade = (homeAvg * homeWgt) + (quizAvg * quizWgt)
				+ (mid1Scr * midWgt) + (mid2Scr * midWgt) + (finScr * finWgt);
		
		System.out.println("Total Grade is: " + totalGrade);
	}

}
