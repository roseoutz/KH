package Object_Oriented_Example;

class SutdaDeck7_2{
	final int CARD_NUM = 20;
	SutdaCard7_2[] cards = new SutdaCard7_2[CARD_NUM];
	
	SutdaDeck7_2() {
		for(int i=0;i<cards.length;i++)
		{
			int num = i%10+1;
			boolean isKwang = (i<10)&&(num==1||num==3||num==8);
			cards[i] = new SutdaCard7_2(num,isKwang);
			
		}
	}
	
	void shuffle() {
		int i = (int)(Math.random()*cards.length);
		int j = (int)(Math.random()*cards.length);
		SutdaCard7_2 tmp = cards[i];
		cards[i] = cards[j];
		cards[j] = tmp;
	}
	
	SutdaCard pick(int index) {
		return cards[index];
		
	}
	
	SutdaCard pick() {
		int index = (int)(Math.random()*cards.length);
		return pick(index);
	}
}
class SutdaCard7_2{
	
		int num;
		boolean isKwang;
		
		SutdaCard7_2(){
			this(1, true);
		}
		
		SutdaCard7_2(int num,boolean isKwang){
			this.num = num;
			this.isKwang = isKwang;
		}
		
		public String toString() {
			return num + (isKwang ? "k" : "");
		}
}

	
public class Excercise7_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaDeck deck = new SutdaDeck();
		for(int i =0; i<deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
	}

}