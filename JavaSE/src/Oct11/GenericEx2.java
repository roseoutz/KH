package Oct11;

import static java.lang.System.out;
public class GenericEx2<T> {
	T v;
	
	public GenericEx2(T n) {
		v = n;
	}
	
	public void set(T n) {
		v = n;
	}
	
	public T get() {
		return v;
	}
	
	public static void main(String[] args)
	{
		GenericEx2<?> g2 = new GenericEx2<String>("String Object");
		
		String s = (String)g2.get();
		out.println("g2 is : "+s);
		GenericEx2<?> g3 = new GenericEx2<Integer>(10000);
		out.println("g3 is : " + g3.get());
	}
}
