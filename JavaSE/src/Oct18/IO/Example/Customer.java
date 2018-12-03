package Oct18.IO.Example;

public class Customer implements java.io.Serializable{

private String name;

public Customer(String name) {
	this.name = name;
}

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public String toString() {
	return "your name is : " + name;
}

}
