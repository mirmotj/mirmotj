
public class GradeCalculator {

	public static void main(String[] args) {
		
		math224();

	}
	
	public static void math224 () {
		
		//Grade weights
		int homeWgt = 6;
		int quizWgt = 14;
		int midWgt = 20;
		int finWgt = 40;
		
		//Performance data
		double[] homeScr = {10, 5.5, 0, 3, 0};
		double[] quizScr = {8, 10};
		double mid1Scr = (double)90 / 100;
		double mid2Scr = (double)95 / 100;
		double finScr = (double)95 / 100;
		
		//Calculation data
		int homeTotal = 10;
		int quizTotal = 10;
		double homeAvg = 0;
		double quizAvg = 0;
		
		//Average homework grades
		for(int i = 0; i < homeScr.length; i++) {
			
			homeAvg += (homeScr[i] / homeTotal);
			
		}
		homeAvg = homeAvg / homeScr.length;
		
		//Average quiz grades
		for(int i = 0; i < quizScr.length; i++) {
			
			quizAvg += (quizScr[i] / quizTotal);
			
		}
		quizAvg = quizAvg / quizScr.length;
		
		//Total grade calculation
		double totalGrade = (homeAvg * homeWgt) + (quizAvg * quizWgt)
				+ (mid1Scr * midWgt) + (mid2Scr * midWgt) + (finScr * finWgt);
		
		System.out.println("Total Grade is: " + totalGrade);
	}

}
