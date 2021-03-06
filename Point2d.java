import java.util.Scanner;

class Point2d {
	double x,y;
	//constructor
	Point2d(double x , double y){
			this.x=x;
			this.y=y;
	}

	public String getDetails() {
		return "Point ("+x+","+y+")";
	}
	public boolean isEqual(Point2d p2) {
		if((this.x==p2.x) && (this.y==p2.y)) {
			return true;
			}
		return false;
	}
	
	public Point2d createNewObject(double p1,double p2) {
		double x1 = this.x+ p1;
		double y1 = this.y+p2;
		Point2d createdObj =  new Point2d(x1,y1);
		return createdObj;
		
		
	}
	public double calcDistance(Point2d p) {
	return	Math.sqrt(Math.pow(p.x-this.x, 2)+(Math.pow(p.y-this.y, 2)));
		
	}
	
	
}

 class Home{
	
	public static void main(String args[]) {
		//creating new objects
//		Point2d p1= new Point2d(2.0,5.0);
//	    Point2d p2= new Point2d(1.0,3.70);
//	//get details
//String result = p2.getDetails();
//	System.out.println(result);
//	//isEqual 
//	System.out.println(p1.isEqual(p2));
//	//create new object
//	Point2d p3 = p1.createNewObject(5,-1);
//	System.out.println(p3.getDetails());
//	
//	//Distance between two points
//	double distance = p1.calcDistance(p2);
//	System.out.println(distance);
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		Point2d p1= new Point2d(x1,y1);
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		Point2d p2= new Point2d(x2,y2);
	//details of p1 && p2
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
		
	//invoking isEqual function
		if(p1.isEqual(p2)) {
			System.out.println("Points P1 and P2 are same");
		}
		else {
			System.out.println("Points are not same");
		}
		
	//Create new point p3 , with the dimensions offset from p1
		Point2d p3 = p1.createNewObject(5,-1);
		System.out.println(p2.getDetails());
		
	//Display distance between 2 points.(between p1 & p2)
		
		double distance = p1.calcDistance(p2);
		System.out.println("The distance between p1 and p2 is " +distance);

		
	
	
}
}