import java.util.*;
import java.io.*;

public class Histogram {
	private static final String[] COUNTER_SCORE = null;
	private static String[] arrScores = new String[100];
	private static String[] countScores = new String[11];
	private static int counter = 0;

	public static void main(String[] args) throws IOException {

		String totalScores;
		String[] tempString;
		int score;

		try {

			File midterm = new File("MidtermScores.txt");
			FileReader readFile = new FileReader(midterm);
			BufferedReader rd = new BufferedReader(readFile);
			

			while ((totalScores = rd.readLine()) != null) {
				tempString = totalScores.split(" ");
				score = Integer.parseInt(totalScores);
				arrScores[counter] = tempString[0];
				System.out.println(totalScores);

				if (score >= 0 && score <= 9) {
					COUNTER_SCORE[0] += 1;
				} else if (score >= 10 && score <= 19) {
					COUNTER_SCORE[1] += 1;
				} else if (score >= 20 && score <= 29) {
					COUNTER_SCORE[2] += 1;
				} else if (score >= 30 && score <= 39) {
					COUNTER_SCORE[3] += 1;
				} else if (score >= 40 && score <= 49) {
					COUNTER_SCORE[4] += 1;
				} else if (score >= 50 && score <= 59) {
					COUNTER_SCORE[5] += 1;
				} else if (score >= 60 && score <= 69) {
					COUNTER_SCORE[6] += 1;
				}

				else if (score >= 70 && score <= 79) {
					COUNTER_SCORE[7] += 1;
				}

				else if (score >= 70 && score <= 79) {
					COUNTER_SCORE[7] += 1;
				} else if (score >= 80 && score <= 89) {
					COUNTER_SCORE[8] += 1;
				} else if (score >= 90 && score <= 99) {
					COUNTER_SCORE[9] += 1;
				} else if (score == 100) {
					COUNTER_SCORE[10] += 1;
					break;
				}

			}
			System.out.println("00-09: " + COUNTER_SCORE[0]);
			System.out.println("10-19: " + COUNTER_SCORE[1]);
			System.out.println("20-29: " + COUNTER_SCORE[2]);
			System.out.println("30-39: " + COUNTER_SCORE[3]);
			System.out.println("40-49: " + COUNTER_SCORE[4]);
			System.out.println("50-59: " + COUNTER_SCORE[5]);
			System.out.println("60-69: " + COUNTER_SCORE[6]);
			System.out.println("70-79: " + COUNTER_SCORE[7]);
			System.out.println("80-89: " + COUNTER_SCORE[8]);
			System.out.println("90-99: " + COUNTER_SCORE[9]);
			System.out.println("100 " + COUNTER_SCORE[10]);
			

		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
