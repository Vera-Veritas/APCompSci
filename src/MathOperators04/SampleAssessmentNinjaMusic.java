package MathOperators04;

import java.util.Scanner;

public class SampleAssessmentNinjaMusic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double songlength = -999;
		double numsongs = -999;
		double minutes = -999;
		double minsec = -999;
		double seconds = -999;
		double totsec = -999;
		double secpersong = -999;
		double min = -999;
		double sec = -150;

		System.out.println("How many songs?");
		numsongs = input.nextDouble();
		System.out.println("What is the total length of the songs in minutes and seconds? (Write as min.sec)");
		songlength = input.nextDouble();

		minutes = songlength / 1;
		minsec = minutes * 60;
		seconds = songlength % 1;
		totsec = minsec + seconds;
		secpersong = totsec / numsongs;
		min = (int) secpersong / 60;
		sec = (int) Math.round(secpersong % 60);

		System.out.println("The average song length is " + min + " minutes and " + sec + " seconds long.");
	}

}
