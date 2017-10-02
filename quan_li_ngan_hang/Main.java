package quan_li_ngan_hang;

public class Main 
{
	public static void main(String[] args) 
	{
		Account x = new Account(20160889, "DAO", 100);
		Account y = new Account(20160332, "DUNG", 200);
		System.out.println(x.toString());
		System.out.println(y.toString());
		
		x.transfer(y); // chuyen khoan tu x sang y
		x.withdrawal(); // rut tien tu x
	}
}
