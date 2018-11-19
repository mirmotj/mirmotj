
public class GradeCalculator {

	public static void main(String[] args) {
		
		math124();

	}
	
	public static void math224 () {
		
		//Grade weights
		int homeWgt = 6;
		int quizWgt = 14;
		int midWgt = 20;
		int finWgt = 40;
		
		//Performance data
		double[] homeScr = {10, 5.5, 0, 3, 0, 8};
		double[] quizScr = {8, 10, 4, 8};
		double mid1Scr = (double)90 / 100;
		double mid2Scr = (double)90 / 100;
		double finScr = (double)90 / 100;
		
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
	
	public static void math124 () {
		
		//Grade weights
		int skillTestWgt = 12;
		int examWgt = 30;
		int quizWgt = 12;
		int dailyWgt = 12;
		int problemWgt = 4;
		int finWgt = 30;
		
		//Performance data
		double[] dailyScr = {10, 10, 10, 10, 10, 4.5, 10, 6, 9.5, 8, 4, 8, 2,
				10, 4, 4, 4, 5};
		double skillScr = (double)8 / 12;
		double exam1 = (double)42 / 60;
		double exam2 = (double)31 / 55;
		double exam3 = (double)75 / 100;
		double quiz1 = (double)28 / 45;
		double quiz2 = (double)34 / 50;
		double quiz3 = (double)70 / 100;
		double problemScr = (double)100 / 100;
		double finScr = (double)75 / 100;
		
		//Calculation data
		int dailyTotal = 10;
		double dailyAvg = 0;
		double examAvg = 0;
		double quizAvg = (quiz1 + quiz2 + quiz3) / 3;
		double[] exams = {exam1, exam2, exam3};
		System.out.println("Quiz Average: " + quizAvg);
		
		//Average daily online quiz grades
		for(int i = 0; i < dailyScr.length; i++) {
			
			dailyAvg += (dailyScr[i] / dailyTotal);
			
		}
		dailyAvg = dailyAvg / dailyScr.length;
		
		double lowExam = exams[0];
		for(int i = 0; i < exams.length; i++) {
			if(exams[i] < lowExam) {
				lowExam = exams[i];
			}
		}
		System.out.println("Lowest exam: " + lowExam);
		
		if(quizAvg > lowExam) {
			for(int i = 0; i < exams.length; i++) {
				if(exams[i] == lowExam) {
					exams[i] = quizAvg;
					System.out.println("The lowest exam has been replaced");
					break;
				}
			}
		}
		
		for(int i = 0; i < exams.length; i++) {
			
			examAvg += exams[i];
			
		}
		examAvg = examAvg / exams.length;
		
		//Total grade calculation
		double totalGrade = (skillScr * skillTestWgt) + (examAvg * examWgt) + 
				(quizAvg * quizWgt) + (dailyAvg * dailyWgt) + 
				(problemScr * problemWgt) + (finScr * finWgt);
		
		System.out.println();
		System.out.println("Total Grade is: " + totalGrade);
	}

}
