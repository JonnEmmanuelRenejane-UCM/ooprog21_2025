public class DebugCircle
{
   private int radius;
   
   public DebugCircle(int radius)
   {
      this.radius = radius;
   }
   public int getRad()
   {
      return radius;
   }
   public int getDiam()
   {
      return radius * 2;
   }
   public double getArea()
   {
      return Math.PI * radius * radius;
   }
  }
