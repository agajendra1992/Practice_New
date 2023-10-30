/**
 * 
 */
package SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.junit.runner.Describable;

/**
 * @author user
 *
 */
public class DeSerializationClazz {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serializationclazz ser = null;

		// TODO Auto-generated method stub
		// DeSerializationClazz dser = new DeSerializationClazz();
		FileInputStream fin = new FileInputStream("C:\\Users\\user\\Desktop\\New Text Document.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		 ser = (Serializationclazz) oin.readObject();
		oin.close();
		fin.close();
		System.out.println(ser);
		System.out.println();
	}

}
