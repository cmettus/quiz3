package quiz3;

public class triangle {
	
	private double side1, side2, side3 =1.0;
	
	
	triangle(){
	}
	
	triangle(double side1, double side2, double side3){
		
	}

	public void setSide1(double side1){
		this.side1=side1;
	}
	public void setSide2(double side2){
		this.side2=side2;
	}
	public void setSide3(double side3){
		this.side3=side3;
	}
	private double getside1(){
		return side1;
	}
	private double getSide2(){
		return side2;
	}
	private double getSide3(){
		return side3;
	}
	/**
	 * Method which finds the area
	 * of the triangle 
	 */
	public double getArea(){
		double p,area;
		p=((side1+side2+side3)/2);
		area=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		if(area<0||area==0){
			TriangleException e = new TriangleException(area);
			System.out.println("You did not create a real triangle. Please enter new numbers.");
			return 0;
		}
		return area;
	}
	/**
	 * Method which finds the perimeter
	 * of the triangle
	 */
	public double getPerimeter(){
		double perimeter;
		perimeter=side1+side2+side3;
		return perimeter;
	}
	/**
	 * Method which describes the triangle
	 */
	public String toString(){
		String out = (getPerimeter()+ " is the perimeter " + getArea() + " is the area ");
		return out;
	}
}
