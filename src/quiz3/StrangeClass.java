package quiz3;

public class StrangeClass{
	public static void main(String[] args){
Circle circle1=new Circle();
Circle circle2=new Circle();
System.out.println(circle1.equals(circle2));
}
	}
class Circle{
	double radius;
	public boolean equals(Object circle){
	return this.radius == ((Circle)circle).radius;
	}
}