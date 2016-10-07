package Example;
import java.io.*;
public class WriteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
			/*FileOutputStream f=new FileOutputStream("abc.txt");
			String s="Hello world";
			byte b[]=s.getBytes();
			f.write(b);
			f.close();*/
			FileWriter f=new FileWriter("xyz.txt");
			f.write(110);
			f.write("aresh \nis good boy");
			f.write("\n");
			char[] c={'a','b','h'};
			f.write(c);
			f.write("\n");
			f.flush();
			f.close();
			
			System.out.println("Kiss me baby");
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
