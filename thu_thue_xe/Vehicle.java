package thu_thue_xe;

import java.util.Scanner;

public class Vehicle 
{
	private String nameOfCarOwner;
	private String type;
	private int capacity;
	private double cost;
	
	public Vehicle(){}

	public Vehicle(String nameOfCarOwner, String type, int capacity, float cost) 
	{
		super();
		this.nameOfCarOwner = nameOfCarOwner;
		this.type = type;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getNameOfCarOwner() {
		return nameOfCarOwner;
	}

	public void setNameOfCarOwner(String nameOfCarOwner) {
		this.nameOfCarOwner = nameOfCarOwner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public double getTax()
	{
		if (capacity < 100) {
			return cost/100;
		} else if (capacity >= 100 && capacity <= 200) {
			return cost*3/100;
		} else 
			return cost*5/100;
	}
	
	public void input()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap ten chu xe: ");
		setNameOfCarOwner(scanner.nextLine());
		
		System.out.println("Nhap loai xe: ");
		setType(scanner.next());
		
		System.out.println("Nhap dung tich: ");
		setCapacity(scanner.nextInt());
		
		System.out.println("Nhap gia xe: ");
		setCost(scanner.nextFloat());
	}
	
	public void show()
	{
		System.out.println(getNameOfCarOwner() + "\t\t" + getType() + "\t\t" + getCapacity() + "\t\t" + getCost() + "\t\t" + getTax());
	}
	
}
