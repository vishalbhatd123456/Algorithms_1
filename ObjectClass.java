class Sample
{
	@Override
	public String toString()
	{
		return " The toString()";
	}
}
public class ObjClass1 {
	public static void main(String[] args) {
		ObjClass1 o = new ObjClass1();
		System.out.println(o.getClass()); //run time class of the object
		ObjClass1 o2 = new ObjClass1();
		Sample s1 = new Sample();
		System.out.println(s1);
		
		
		System.out.println(o2.equals(o));
		System.out.println(o.hashCode());
//		System.out.println();
	}

}
