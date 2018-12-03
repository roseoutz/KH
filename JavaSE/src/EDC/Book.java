package EDC;

public class Book {
public static void main (String[] args) {
BookTest[] bookArray = new BookTest[5];
double totalPrice = 0.0;
// Book 객체를 5개 생성하여 배열에 넣는다 . 	
bookArray[0] = new BookTest("IT", "SQL Plus", 50000, 5 );
bookArray[1] = new BookTest("IT", "Java 2.0", 40000, 3);	
bookArray[2] = new BookTest("IT", "JSP Servlet", 60000, 6);	
bookArray[3] = new BookTest("Nobel", "davincicode", 30000, 10);	
bookArray[4] = new BookTest("Nobel", "cloven hoof", 50000, 15);	
	
// 배열에 있는 객체 정보를 실행결과 형식으로 모두 출력한다. – for loop를 이용할 것 	
for(int i = 0; i < bookArray.length; i++) {
System.out.println (bookArray[i].getCategory() + "\t" + bookArray[i].getBookName() +
"\t" + (double)bookArray[i].getBookPrice() + "원" +
(double)bookArray[i].getBookDiscountRate() + "%");	
totalPrice += bookArray[i].getBookPrice();
}
	
// 합계를 출력한다 . 	
System.out.println ("책 갸걱의 합 : " + totalPrice + "원");
}
}

class BookTest {	
private String category;	
private String bookName;	
private double bookPrice;	
private double bookDiscountRate;
	
public BookTest() { }
	
public BookTest(String category, String bookName, double bookPrice, double bookDiscountRate) {
this.category = category;
this.bookName = bookName;
this.bookPrice = bookPrice;
this.bookDiscountRate = bookDiscountRate;
}

public void setCategory (String category) { this.category = category; }
public void setBookName (String bookName) { this.bookName = bookName; }
public void setBookPrice (double bookPrice) { this.bookPrice = bookPrice; }
public void setBookDiscountRate (double bookDiscountRate) {
this.bookDiscountRate = bookDiscountRate;
}
	
public String getCategory () { return this.category; }
public String getBookName () { return this.bookName; }	
public double getBookPrice () { return this.bookPrice; }	
public double getBookDiscountRate () { return this.bookDiscountRate; }
}