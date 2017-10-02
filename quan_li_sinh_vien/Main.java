package quan_li_sinh_vien;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Student sv1 = new Student(20160889,"Dao", 8, 7);
		//System.out.println(sv1.toString());
		
		Student sv2 = new Student(20160332,"Nam", 9, 8);
		
		Student sv3 = new Student();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap thong tin sinh vien 3");
		
		System.out.println("Nhap mssv: ");
		sv3.setCode(scanner.nextInt());
		
		System.out.println("Nhap ten: ");
		sv3.setName(scanner.next());
		
		System.out.println("Nhap diem ly thuyet: ");
		sv3.setTheoreticalPoint(scanner.nextFloat());
		
		System.out.println("Nhap diem thuc hanh: ");
		sv3.setPracticePoint(scanner.nextFloat());
		
		System.out.println("-------------------------THONG TIN SINH VIEN-------------------------\n");
		System.out.println("MSSV\t\tTEN\t\tDIEM LT\t\tDIEM TH\t\tDIEM TB");
		System.out.println("====\t\t===\t\t=======\t\t=======\t\t=======");
		System.out.println(sv1.getCode() + "\t" + sv1.getName() + "\t\t" + sv1.getTheoreticalPoint() + "\t\t" + sv1.getPracticePoint() + "\t\t" + sv1.getMediumPoint());
		System.out.println(sv3.getCode() + "\t" + sv2.getName() + "\t\t" + sv2.getTheoreticalPoint() + "\t\t" + sv2.getPracticePoint() + "\t\t" + sv2.getMediumPoint());
		System.out.println(sv3.getCode() + "\t" + sv3.getName() + "\t\t" + sv3.getTheoreticalPoint() + "\t\t" + sv3.getPracticePoint() + "\t\t" + sv3.getMediumPoint());
	}
}
