package Oct11;

import static java.lang.System.out;

public class GenericEx3<T> {
	T v;
	public GenericEx3(T n) {
		v = n;
	}
	public void set (T n) {
		v = n;
	}
	public T get() {
		return v;
	}
	
	public static void main(String[] args)
	{
		GenEx3 g3 = new GenEx3();
		GenericEx4<? super GenEx2> g4 = new GenericEx4(GenEx3)g4.get();
		out.println(test.msg+","+test.getMsg());
	}
}
