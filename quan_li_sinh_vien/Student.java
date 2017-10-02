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
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
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
