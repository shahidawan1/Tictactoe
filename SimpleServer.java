import java.net.*;
import java.io.*;

public class SimpleServer {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		
		ServerSocket s = new ServerSocket(1647);
		Socket s1 = s.accept();
		
		OutputStream s1out = s1.getOutputStream();
		DataOutputStream dos = new DataOutputStream(s1out);
		
		dos.writeUTF("Hi shahid");
int obj;
		ObjectInputStream sistream = new ObjectInputStream(s1.getInputStream());
obj=(int) sistream.readObject();
System.out.println("the value is ="+obj);
		
		dos.close();
		s1out.close();
		s1.close();
	}
}
