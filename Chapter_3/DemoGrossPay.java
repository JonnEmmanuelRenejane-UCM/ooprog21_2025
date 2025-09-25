

class DemoGrossPay {

   public static void main (String[] a){
   
      double hours = 25;
      double HoursWorked = 37.5;
      calculateGross(10);
      calculateGross(hours);
      calculateGross(HoursWorked);
   }
   
   public static void calculateGross (double hours) {
   
      final double STD_RATE = 22.75;
      double gross;
      gross = hours * STD_RATE;
      
      System.out.println (hours + " hours at $" + STD_RATE + " per hour is $" + gross);
   }
}
      
   