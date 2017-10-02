package quan_li_ngan_hang;

import java.util.Scanner;

public class Account 
{
	private long accountNumber;
	private String accountName;
	private double monney; // tien trong tai khoan
	private double monneyLoaded; // tien nap
	private double monneyWithdrawal; // tien rut
	private double withdrawalFee; // phi rut tien
	private double moneyToTransfer; // tien chuyen khoan
	private static final float INTEREST_RATE = 0.035f; // lai suat
	
	Scanner scanner = new Scanner(System.in);
	
	public Account() {
		super();
	}

	public Account(long accountNumber, String accountName, double monney) {
		this.monney = monney;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}

	public Account(long accountNumber, String accountName, double monney, double monneyLoaded, double monneyWithdrawal,
			double withdrawalFee) 
	{
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.monney = monney;
		this.monneyLoaded = monneyLoaded;
		this.monneyWithdrawal = monneyWithdrawal;
		this.withdrawalFee = withdrawalFee;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getMonney() {
		return monney;
	}

	public void setMonney(double monney) {
		this.monney = monney;
	}

	public double getMonneyLoaded() {
		return monneyLoaded;
	}

	public void setMonneyLoaded(double monneyLoaded) {
		this.monneyLoaded = monneyLoaded;
	}

	public double getMonneyWithdrawal() {
		return monneyWithdrawal;
	}

	public void setMonneyWithdrawal(double monneyWithdrawal) {
		this.monneyWithdrawal = monneyWithdrawal;
	}

	public double getWithdrawalFee() {
		return withdrawalFee;
	}

	public void setWithdrawalFee(double withdrawalFee) {
		this.withdrawalFee = withdrawalFee;
	}

	public double getMoneyToTransfer() {
		return moneyToTransfer;
	}

	public void setMoneyToTransfer(double moneyToTransfer) {
		this.moneyToTransfer = moneyToTransfer;
	}

	public String toString()
	{
		return ("So tai khoan: " + accountNumber + "\tTen tai khoan: " + accountName + "\tTien: " + monney);
	}
	
	public void recharge() // nap tien
	{
		do{
			System.out.println("Nhap so tien can nap: ");
			setMonneyLoaded(scanner.nextDouble());
			
			if (monneyLoaded < 0) {
				System.out.println("(Tien nap > 0) => Nhap lai!");
			}
		}while(monneyLoaded < 0);
		
		System.out.println("So tien trong tai khoan cua ban la: " + (monney + monneyLoaded));
	}
	
	public void withdrawal() // rut tien
	{
		do{
			System.out.println("Nhap so tien can rut: ");
			setMonneyWithdrawal(scanner.nextDouble());
			
			if (monneyWithdrawal > monney) {
				System.out.println("(Tien rut < Tien trong tai khoan) => Nhap lai!");
			}
		}while (monneyWithdrawal > monney);
		
		System.out.println("So tien hien tai trong tai khoan cua ban la: " + (monney - (monneyWithdrawal + withdrawalFee)));
	}
	
	public void expire() // dao han
	{
		System.out.println("Sau ki dao han, so tien trong tai khoan cua ban la: " + (monney + monney * INTEREST_RATE));
	}
	
	public void transfer(Account x) // chuyen khoan
	{
		do{
			System.out.println("Nhap vao so tien can chuyen khoan: ");
			setMoneyToTransfer(scanner.nextDouble());
			
			if (this.moneyToTransfer > this.monney) {
				System.out.println("So tien chuyen khoan khong du.Vui long nhap lai!");
			}
		}while (this.moneyToTransfer > this.monney);
		
		this.monney -= this.moneyToTransfer;
		x.monney += this.moneyToTransfer;
		
		System.out.println("Sau khi chuyen khoan tu " + this.accountName +" sang " + x.accountName + " thi:\n");
		System.out.println("So tien trong tai khoan cua " + this.accountName + ": " + this.monney );
		System.out.println("SO tien trong tai khoan cua " + x.accountName + ": " + x.monney);
	}
}
