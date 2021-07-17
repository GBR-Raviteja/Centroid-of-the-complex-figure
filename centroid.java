package endsem;
import java.util.*;
abstract class shape{
	//datahiding
	protected double r,l,b,h;

	shape(double length,double radius,double breadth,double height){
		 r=radius;
		 l=length;
		 b=breadth;
		 h=height;
	}
	abstract double aixi();
	abstract double aiyi();

void diagram () {
	System.out.println("      **    ");
	System.out.println("   *   r  *   ");
	System.out.println(" *          * ");
	System.out.println(" |----------| ");
    System.out.println(" |          |");
	System.out.println(" |          |");
	System.out.println(" l          |");
	System.out.println(" |          |");
	System.out.println(" |----b-----|");
	System.out.println(" |          *");
	System.out.println(" |         *");
	System.out.println(" |        *");
	System.out.println(" h       *");
	System.out.println(" |      *");
	System.out.println(" |     *");
	System.out.println(" |    *");
	System.out.println(" |   *");
	System.out.println(" | *");
	System.out.println(" *");	
}
void structure()
{
	System.out.println("      **    ");
	System.out.println("   *   r  *   ");
	System.out.println(" *          * ");
	System.out.println(" |----------| ");
    System.out.println(" |          |");
	System.out.println(" |          |");
	System.out.println(" l          |");
	System.out.println(" |          |");
	System.out.println(" |----b-----|");
	System.out.println(" |          *");
	System.out.println(" |         *");
	System.out.println(" |        *");
	System.out.println(" h       *");
	System.out.println(" |      *");
	System.out.println(" |     *");
	System.out.println(" |    *");
	System.out.println(" |   *");
	System.out.println(" | *");
	System.out.println(" *");	
}
void display() {
	System.out.println();
	System.out.println("the whole mass of the object lies at the centre");
	System.out.println();
}
//overloading
void display(double length,double radius,double breadth,double height) {
	System.out.println("length, breadth,height,radius cannot be negative");
}
abstract double area();
	}
class semicircle extends shape{
	double rad,l,xi1,yi1;

	semicircle(double length,double radius,double breadth,double height ){
		super(length,radius,breadth,height);
		rad=radius;
		l=length;
	}
	//overriding
	void diagram() {
		System.out.println("      **    ");
		System.out.println("   *   r  *   ");
		System.out.println(" *          * ");
		System.out.println(" |----------| ");
	}

	double area() {
		return((3.14*rad*rad)/2);
	}
	void display() {
		System.out.println("given radius is "+rad);
	}
	double xi1() {
		xi1=0.5*rad;
		return(xi1);
	}
	double yi1(){
		yi1=l+rad/3*3.14;
		return(yi1);
	}
	double aixi() {
		double aixi;
		xi1=1/2*rad;
		aixi=xi1*area();
		return(aixi);
	}
	double aiyi(){
		double aiyi;
		yi1=l+rad/3*3.14;
		aiyi=yi1*area();
		return(aiyi);
	}
}
class rectangle extends shape{
	double l,b,xi2,yi2;
rectangle(double length,double radius,double breadth,double height ){
	super(length,radius,breadth,height);
l=length;
b=breadth;
}
void diagram() {
	System.out.println(" |----------| ");
    System.out.println(" |          |");
	System.out.println(" |          |");
	System.out.println(" l          |");
	System.out.println(" |          |");
	System.out.println(" |----b-----|");
}
	double area() {
		return(l*b);
	}	
	double xi2() {
		xi2=b/2;
		return(xi2);
	}
	double yi2(){
		yi2=l/2;
		return(yi2);
	}
	double aixi() {
		double aixi;
		xi2=b/2;
		 aixi=xi2*area();
		 return(aixi);
	}
	double aiyi(){
		double aiyi;
		yi2=l/2;
		aiyi=yi2*area();
		return(aiyi);
	}
	
}
class triangle extends shape{
	double b,h,xi3,yi3;
	triangle(double length,double radius,double breadth,double height){
		super(length,radius,breadth,height);
		b=breadth;
		h=height;
		}
	void diagram() {
		System.out.println(" |----b-----|");
		System.out.println(" |          *");
		System.out.println(" |         *");
		System.out.println(" |        *");
		System.out.println(" h       *");
		System.out.println(" |      *");
		System.out.println(" |     *");
		System.out.println(" |    *");
		System.out.println(" |   *");
		System.out.println(" | *");
		System.out.println(" *");	
	}
	double area() {
		return(0.5*b*h);
	}
	void display() {
		System.out.println("given bredth,heigth is "+b+"and"+h);
	}
	void centroid(){
		xi3=b/3;
		yi3=-h/3;
		System.out.println("centeroid is at ("+xi3+","+yi3+")");

	}
	double xi3() {
		yi3=-h/3;
		return(xi3);
	}
	double yi(){
		yi3=-h/3;
		return(yi3);
	}
	double aixi() {
		double aixi;
		xi3=b/3;
		aixi=xi3*area();
		return (aixi);
	}
	double aiyi(){
		double aiyi;
		yi3=-h/3;
		aiyi=yi3*area();
		return (aiyi);
	}
	
}

public class centroid {
public static void main(String args[]){
	 double a=0,axi=0,ayi=0,l,b,h,r,x;
	 shape object=new rectangle(1,3,5,7);
	 object.structure();
	 Scanner input= new Scanner(System.in);
	 System.out.println("enter value of length of rectangle");
	 l=input.nextDouble();
	 System.out.println("enter value of breadth of rectangle");
	 b=input.nextDouble();
	 System.out.println("enter value of height of triangle");
	 h=input.nextDouble();
	 System.out.println("enter value of radius of semi circle");
	 r=input.nextDouble();
//dynamic method dispatch
	 shape obj;
	 obj=new rectangle(l,r,b,h);
	 obj.display(l, r, b, h);
	 obj.display();
	 obj.aixi();
	 a=a+obj.area();
	 axi=axi+obj.aixi();
	 ayi=ayi+obj.aiyi(); 
	 obj=new triangle(l,r,b,h);
     a=a+obj.area();
     axi=axi+obj.aixi();
     ayi=ayi+obj.aiyi();
	 obj=new semicircle(l,r,b,h);
     a=a+obj.area();
     axi=axi+obj.aixi();
     ayi=ayi+obj.aiyi();
     System.out.println("the centroid is at ("+axi+","+ayi+")");
     int i=100;
    while(i!=0) {
    	System.out.println("press 1 to know centroid and area of rectangle");
   	 obj=new rectangle(l,r,b,h);
       obj.diagram();
       System.out.println();
    	System.out.println("press 2 to know centroid and area of triangle");
   	 obj=new triangle(l,r,b,h);
     obj.diagram();
    	System.out.println("press 3 to know centroid and area of semicircle");
      	 obj=new semicircle(l,r,b,h);
      	 obj.diagram();
         System.out.println();
    	System.out.println("press 4 to know centroid and area of complex figure");
    	obj.structure();
    	i=input.nextInt();
        System.out.println();

    switch(i) {
    case 1:
    	shape obj1=new rectangle(l,r,b,h);
    	System.out.println("area of rectangle is "+obj1.area()+"\ncentroid of rectangle is ("+b*0.5+","+l*0.5+")");
    	break;
    case 2:

    	obj1=new triangle(l,r,b,h); 
    	System.out.println("area of triangle is "+obj1.area()+"\ncentroid of triangle is ("+0.33*b+","+0.33*h+")");
    break;
    case 3:
    	obj1=new semicircle(l,r,b,h); 
    	System.out.println("area of semicircle is "+obj1.area()+"\ncentroid of semicircle is ("+b*0.5+","+(l+4*r*0.105)+")");
    break;
    case 4:
    	System.out.println("area of complex shape is "+a+"\ncentroid of the comlex shape is("+axi/a+","+ayi/a+")");
    	break;
    	default:
    		//exception handling
    		if(i!=1&&i!=2&&i!=3&&i!=4) {
    			try {
    				throw new RuntimeException();
    				            }
    				catch (RuntimeException e) {
    				System.out.println("you should not give value other than 1, 2, 3, 4");}}
    				else { 
    					System.out.println("enter 0 to terminate");
    					i=input.nextInt();
    					}
    		}
    System.out.println("enter 0 to terminate");
	i=input.nextInt();
    }
    }
}

	
