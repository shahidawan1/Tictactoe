import java.net.*;

import java.io.*;



public class SimpleClient {

	public static void main(String args[]) throws IOException {

		Socket s1 = new Socket("127.0.0.1", 1337);


		InputStream s1In = s1.getInputStream();

		DataInputStream dis = new DataInputStream(s1In);

		String st = new String(dis.readUTF());

		System.out.println(st);
Player obj=new Player();
obj.col=2;
obj.row=2;
obj.turn=1;
obj.win=3;
ObjectOutputStream oos = new ObjectOutputStream(s1.getOutputStream());
oos.writeObject(obj);
oos.flush();



		dis.close();

		s1In.close();

		s1.close();

	}

}