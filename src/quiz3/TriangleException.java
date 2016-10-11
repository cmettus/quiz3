package quiz3;



public class TriangleException extends Exception
	{
	   private double area;
	  
	   public TriangleException(double area)
	   {
	      this.area = area;
	   } 
	   public double getArea()
	   {
	      return area;
	   }
	}

