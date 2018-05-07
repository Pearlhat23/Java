import java.util.*;

class Noodle {
	public static void main (String a[]){
		double iteration = Double.parseDouble(a[0]);
		double length = Double.parseDouble(a[1]);
		double count = 0;
		double ratio = 0;
		double n = 0;
		int max = 3; // maximum number of cards
		int maxmatches = 0;
		// define arrays
		double noodle[] = new double[max];
		while (n < iteration){
			noodle[0] = Math.random() *length;
			// think here
			noodle[1] = Math.random() * (length - noodle[0]);
			noodle[2] = length - noodle[0] - noodle[1];
			Arrays.sort(noodle);
			System.out.println(noodle[0]+" "+noodle[1]+" "+noodle[2]);
			if (noodle[0] + noodle[1] > noodle[2]) count++;
			n++;
		}
		System.out.println("\n\n"+count);
		System.out.println(" PERCENTAGE AS A DECIMAL ");
		ratio = count / iteration;
		System.out.println("\n\n"+ratio);
		
	}
	
}

 //https://mathoverflow.net/questions/2014if-you-break-a-stick-at-two-points-chosen-uniformly-the-probability-the-three-r
