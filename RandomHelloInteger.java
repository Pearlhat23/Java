class RandomHelloInteger {
	public static void main (String a[]){
		int i;
		double val;
		int valInt;
		double max = 999999;
		double multiplier = max+1;
		int maxcount = 0;
		for (i = 0; i < 1000000000; i++){
			val = Math.random();
			valInt = (int) (val * multiplier);
			System.out.print(valInt);
			System.out.print(" ");
			
			if (valInt == max){
				System.out.println("* * * * * * * * * * * *");
				System.out.println(max);
				break;
				
			}
		}
		System.out.println("COUNT TO GET "+max+" IS "+i);
	}
}
