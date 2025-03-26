package pertemuan_2;

public class Ball {
	private String color; 
	private int size; 
	private boolean moveStatus;
	

	
	public void move() {
		moveStatus = true;
		System.out.println("The ball is moving.");
		}
	
	public void stop() {
		moveStatus = true;
		System.out.println("The ball has stopped.");
		}
	
	public void showStatus() {
	String status = moveStatus ? "moving" : "not moving";
				System.out.println("The ball is currently" + status + ".");
	}
	
	public void showColor() {System.out.println("The color of the ball is" + color + ".");}
	public void showSize() {System.out.println("The size of the ball is" + size + ".");}

 //constructor
public void Ball(String color, int size, boolean moveStatus){
	this.color = color;
	this.size = size;
	this.moveStatus = moveStatus;
	}

public class Main{
	public static void main(String[]args){
	Ball myBall1 = new Ball(color:"red", size:12, moveStatus:true);
	System.out.println(myBall.getColor());
	
	Ball myBall2 = new Ball(color:"blue", size:13, moveStatus:false);
	
	
	System.out.println(myBall2.getColor());
	
	}
}