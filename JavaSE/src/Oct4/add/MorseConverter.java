package Oct4.add;

public class MorseConverter {

	public static void main(String[] args)
	{
		if(args.length!=1)
		{
			System.out.println("Uasge : java morseconverter Word");
			System.exit(0);
		}
		
		System.out.println("source : " + args[0]);
		String source = args[0].toUpperCase();
		
		String[] morse = {".-", "-...", "-.-.","-..", "."
				,"..-.", "--.", "....","..",".---"
				, "-.-", ".-..", "--", "-.", "---"
				, ".--.", "--.-",".-.","...","-"
				, "..-", "...-", ".--", "-..-","-.--"
				, "--.." };
		String result = "";
		
		for(int i=0;i<source.length();i++)
		{
			result+=morse[source.charAt(i)-'A'];
		}
		System.out.println(result);
		}
}
