package Oct18.IO.Example;

import java.io.*;

public class ExternalizableEx implements Externalizable{

	private String name;
	private int age;
	private int weight;
	
	public ExternalizableEx() {}
	
	public ExternalizableEx(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void writeExternal(ObjectOutput objOutput) throws IOException{
		objOutput.writeObject(name);
		objOutput.writeObject(new Integer(age));
	}
	
	public void readExternal(ObjectInput objInput) throws ClassNotFoundException, IOException{
		name =(String)objInput.readObject();
		age = ((Integer)objInput.readObject()).intValue();
	}
	
	public String toString() {
		return "name : " + name +", age : "+age+", weight : "+weight;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExternalizableEx ex1=new ExternalizableEx("SSOL", 30, 70);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fos = new FileOutputStream("/Users/donggyukim/Desktop/IO/external.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ex1);
			
			fis = new FileInputStream("/Users/donggyukim/Desktop/IO/external.ser");
			ois = new ObjectInputStream(fis);
			ExternalizableEx ex2 = (ExternalizableEx) ois.readObject();
			System.out.println("원본 객체 : " + ex1);
			System.out.println("복원된 객체 : " + ex2);
		} catch (IOException ioe){
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
}












