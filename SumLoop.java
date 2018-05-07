// save as SumLoop.java
// run by typing java SumLoop
class SumLoop{
  public static void main (String a[]) {
      int value = Integer.parseInt(a[0]);
      int sum = 0;
      for (int i = 1; i <= value; i++){
          sum = sum + i;
          //System.out.println(sum);
      }
      System.out.println(sum);
}
}
