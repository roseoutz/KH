package Oct4.add;

public class ArrayEx15 {
	public static void main(String[] args)
	{
		if(args.length !=3)
		{
		System.out.println("Usage : java ArrEx15 NUM1 OP NUM2");
		System.exit(0);
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		char op = args[1].charAt(0);
		
		int result = 0;
		
		switch(op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case 'x':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default :
			System.out.println("Not Support operation");
		}
		
		System.out.println("result = "+result);
	}
}
