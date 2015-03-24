import java.net.*;

import java.io.*;



public class SimpleClient {

	public static void main(String args[]) throws IOException {

		Socket s1 = new Socket("192.168.100.22", 1647);


		InputStream s1In = s1.getInputStream();

		DataInputStream dis = new DataInputStream(s1In);

		String st = new String(dis.readUTF());

		System.out.println(st);
int a=113;
ObjectOutputStream oos = new ObjectOutputStream(s1.getOutputStream());
oos.writeObject(a);
oos.flush();



		dis.close();

		s1In.close();

		s1.close();

	}

}