/**
 * 
 */
package SeleniumPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author user
 *
 */
public class Serializationclazz implements Serializable{

	/**
	 * @param args
	 */
	private String name;
	private String address;

	

	public static void main(String[] args) throws IOException {

		Serializationclazz ser = new Serializationclazz();
		ser.name="Akash";
		ser.address= "Banaglore";
		FileOutputStream fout = new FileOutputStream("C:\\Users\\user\\Desktop\\New Text Document.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(ser);
		out.close();
		fout.close();
		System.out.println("Serialization Completed");
	}

}
