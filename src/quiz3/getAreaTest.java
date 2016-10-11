package quiz3;

import static org.junit.Assert.*;

import org.junit.Test;

public class getAreaTest {

	@Test
	public void test() {
		triangle test = new triangle();
		test.setSide1(3);
		test.setSide2(4);
		test.setSide3(5);
		double output = test.getArea();
		assertEquals(6.0,output,1);
		
	}
	@Test
	public void test1(){
		triangle test1 = new triangle();
		test1.setSide1(4);
		test1.setSide2(5);
		test1.setSide3(6);
		double output = test1.getArea();
		assertEquals(9.9216,output,1);
	}
	@Test
	public void test2(){
		triangle test2 = new triangle();
		test2.setSide1(4);
		test2.setSide2(5);
		test2.setSide3(6);
		double output = test2.getPerimeter();
		assertEquals(15,output,1);
	}
	public void test3(){
		triangle test3 = new triangle();
		test3.setSide1(3);
		test3.setSide2(4);
		test3.setSide3(5);
		double output = test3.getPerimeter();
		assertEquals(12,output,1);
	}
	@Test
	public void test4(){
		triangle test4 = new triangle();
		test4.setSide1(1);
		test4.setSide2(2);
		test4.setSide3(3);
		double output = test4.getArea();
		assertEquals(0,output,1);
}
}
