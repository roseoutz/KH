package interceptor.dao;

import interceptor.model.NumberForAdd;

public class SumDAO {
	public int add(NumberForAdd num) {
		return num.getNum1() + num.getNum2();
	}
}
