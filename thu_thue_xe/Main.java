package thu_thue_xe;

public class Main 
{
	public static void main(String[] args) 
	{
		Vehicle x = new Vehicle();
		x.input();
		x.getTax();
		System.out.println("Ten chu xe\t\tLoai xe\t\tDung tich\tGia xe\t\tThue phai nop");
		System.out.println("=============================================================================================");
		x.show();
	}

}
