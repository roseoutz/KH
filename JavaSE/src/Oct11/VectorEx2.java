package Oct11;
import static java.lang.System.out;
import java.util.*;
public class VectorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Vector<Double> v = new Vector<Double>(2,5);
	
	v.add(100.3);
	v.add(3.14);
	v.add(1000.);
	
	for(Double n : v)
		out.println(n);
	
	double search = 1000.0;
	int index = v.indexOf(search);
	if(index != -1)
		out.println("검색요소 "+search+"의 위치 :"+index);
	else
		out.println("검색요소 "+search+"가 없습니다.");
	
	out.println(":::::::삭제 전 용량/크기 확인:::::::");
	out.println("capacity : "+v.capacity ()); //7
	out.println("size : "+v.size ()); //3
	
	double del = 3.14;
	if(v.contains(del)) {
		v.remove(del);
		out.println(del+"delete complete");
	}
	
	out.println(":::::::삭제 후 용량/크기 확인:::::::");
	out.println("capacity : "+v.capacity ());
	out.println("size : "+v.size ());

	v.trimToSize ();//용량을 현재 요소의 수 크기로 설정
	out.println(":::::용량조절 후 용량/크기 확인:::::");
	out.println("capacity : "+v.capacity ());
	out.println("size : "+v.size ());
	}

}
