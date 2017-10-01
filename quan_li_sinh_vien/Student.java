package quan_li_sinh_vien;

public class Student 
{
	private int code;
	private String name;
	private float theoreticalPoint;
	private float practicePoint;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int code, String name, float theoreticalPoint, float practicePoint) {
		super();
		this.code = code;
		this.name = name;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
	}

	public float getMediumPoint()
	{
		return (theoreticalPoint + practicePoint) / 2;
	}
	
	public String toString()
	{
		return (name + "\n" + code + "\n" + "Theoretical Point:" + theoreticalPoint + "\n" + "Practice Point:" + practicePoint + "\n" + "Medium Point:" + getMediumPoint());
	}
	
}
