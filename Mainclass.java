import java.util.*;
interface Internal
{
	void get_Internalmarks();
}
interface Externals
{
	void get_Externalmarks();
}

interface marks extends Internal ,Externals
{
	void show_Marks();
}

class Result implements marks 
{
	double s1_i,s2_i,s3_i;
	double s1_e,s2_e,s3_e;
	Scanner s = new Scanner(System.in);
	public void get_Internalmarks()
	{
		System.out.println("Enter 3 subject marks ");
		s1_i = s.nextDouble();
		s2_i = s.nextDouble();
		s3_i = s.nextDouble();
		
	}
	public void get_Externalmarks()
	{
		System.out.println("enter 3 subjects external marks ");
		s1_e = s.nextDouble();
		s2_e = s.nextDouble();
		s3_e = s.nextDouble();
		
	}
	public void show_Marks()
	{
		System.out.println("sunbject 1"+"  "+s1_i+"  "+s1_e+"  "+(s1_i+s1_e));
		System.out.println("sunbject 2"+"  "+s2_i+"  "+s2_e+"  "+(s2_i+s2_e));
		System.out.println("sunbject 3"+"  "+s3_i+"  "+s3_e+"  "+(s3_i+s3_e));
	}
	
}
public class Mainclass {

	public static void main(String[] args) {
   
		marks m = new Result();
		m.get_Internalmarks();
		m.get_Externalmarks();
		m.show_Marks();

	}

}