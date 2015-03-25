import java.net.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
	

public class SimpleServer {
	
	public static char[][] game = { { '1', '2', '3' }, { '4', '5', '6' },
		{ '7', '8', '9' } };
private static JFrame mainFrame;
private JLabel statusLabel;
static int count=0;
int wins=100;
static int turn=100;
static int row=100;
static int col=100;
Player P1;
 Player P2;
	
	SimpleServer()
	{
		 P1=new Player() ;	
		mainFrame = new JFrame("Tic tac toe");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 3));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		mainFrame.setVisible(true);
		
	}

	JButton B1 = new JButton("");
	JButton B2 = new JButton("");
	JButton B3 = new JButton("");
	JButton B4 = new JButton("");
	JButton B5 = new JButton("");
	JButton B6 = new JButton("");
	JButton B7 = new JButton("");
	JButton B8 = new JButton("");
	JButton B9 = new JButton("");
	
	
	public void showbutton() {
		
		mainFrame.add(B1);
		mainFrame.add(B2);
		mainFrame.add(B3);
		mainFrame.add(B4);
		mainFrame.add(B5);
		mainFrame.add(B6);
		mainFrame.add(B7);
		mainFrame.add(B8);
		mainFrame.add(B9);
		mainFrame.setVisible(true);
		 B1.addActionListener(new ActionListener() {
			 
	            public void actionPerformed(ActionEvent e)
	            {	wins=won();
	            	
			           if(wins==3&&(count%2==0))
			           {
			            	if(game[0][0]=='1')
			            	{
			            		B1.setText("0");
			            		game[0][0] = '0';
			            		row=0;
			            		col=0;
			            		turn=0;
			            		count++;
			            	}
			           }
	            }
	        });    
		 
		 B2.addActionListener(new ActionListener() {
			 
	            public void actionPerformed(ActionEvent e)
	            {	wins=won();
	            	
	            	if(wins==3&&(count%2==0))
			           {

			            	if(game[0][1]=='2')
			            	{
			                
			            		B2.setText("0");
			            		game[0][1] = '0';
			            		row=0;
			            		col=1;
			            		turn=0;
			            		count++;
			            	}
			           }
	            }
	        });    
		 B3.addActionListener(new ActionListener() {
			 
	            public void actionPerformed(ActionEvent e)
	            {wins=won();
            	
            	if(wins==3&&(count%2==0))
		           {
			            	if(game[0][2]=='3')
			            	{
			            		B3.setText("0");
			            		game[0][2] = '0';
			            		count++;
			            		row=0;
			            		col=2;
			            		turn=0;
			            	}
		           }
	            }	
	        });    
		 B4.addActionListener(new ActionListener() {
			 
	            public void actionPerformed(ActionEvent e)
	            {wins=won();
            	
            	if(wins==3&&(count%2==0))
		           {
	            			if(game[1][0]=='4')
			            	{
			            		B4.setText("0");
			            		game[1][0] = '0';
			            		row=1;
			            		col=0;
			            		turn=0;
			            		count++;
			            	}
		           }
	            }
	        });    
		 B5.addActionListener(new ActionListener() {
			 
	            public void actionPerformed(ActionEvent e)
	            {wins=won();
            	
            	if(wins==3&&(count%2==0))
		           {
	            			if(game[1][1]=='5')
			            	{
			            		B5.setText("0");
			            		game[1][1] = '0';
			            		row=1;
			            		col=1;
			            		turn=0;
			            		count++;
			            	}
		           }
		       }
	        });    
		 B6.addActionListener(new ActionListener() {
			 
	            public void actionPerformed(ActionEvent e)
	            {wins=won();
            	
            	if(wins==3&&(count%2==0))
		           {
			            	if(game[1][2]=='6')
			            	{
			            		B6.setText("0");
			            		game[1][2] = '0';
			            		row=1;
			            		col=2;
			            		turn=0;
			            		count++;
			            	}
		           }
	            }
	        });    
		 B7.addActionListener(new ActionListener() {
			 
	            public void actionPerformed(ActionEvent e)
	            {wins=won();
            	
            	if(wins==3&&(count%2==0))
		           {

			            	if(game[2][0]=='7')
			            	{
			            		B7.setText("0");
			            		game[2][0] = '0';
			            		row=2;
			            		col=0;
			            		turn=0;
			            		count++;
			            	}
		           }
	            }
	        });    
		 B8.addActionListener(new ActionListener() {
			 
	            public void actionPerformed(ActionEvent e)
	            {wins=won();
            	
            	if(wins==3&&(count%2==0))
		           {

			            	if(game[2][1]=='8')
			            	{
			            		B8.setText("0");
			            		game[2][1] = '0';
			            		row=2;
			            		col=1;
			            		turn=0;
			            		count++;
			            	}
		           }
	            }
	        });    
		 B9.addActionListener(new ActionListener() {
			 
	            public void actionPerformed(ActionEvent e)
	            {wins=won();
            	
            	if(wins==3&&(count%2==0))
		           {

			            	if(game[2][2]=='9')
			            	{
			            		B9.setText("0");
			            		game[2][2] = '0';
			            		row=2;
			            		col=2;
			            		turn=0;
			            		count++;
			            	}
		           }
	            }
	        });    

	}
	public static int won() {int winner=3;
	if ((((game[0][0]) == 'x' && (game[0][1]) == 'x' && (game[0][2]) == 'x')
			|| ((game[1][0]) == 'x' && (game[1][1]) == 'x' && (game[1][2]) == 'x')
			|| ((game[2][0]) == 'x' && (game[2][1]) == 'x' && (game[2][2]) == 'x')
			||

			((game[0][0]) == 'x' && (game[1][0]) == 'x' && (game[2][0]) == 'x')
			|| ((game[0][1]) == 'x' && (game[1][1]) == 'x' && (game[2][1]) == 'x')
			|| ((game[0][2]) == 'x' && (game[1][2]) == 'x' && (game[2][2]) == 'x')
			||

			((game[0][0]) == 'x' && (game[1][1]) == 'x' && (game[2][2]) == 'x') || ((game[0][2]) == 'x'
			&& (game[1][1]) == 'x' && (game[2][0]) == 'x')

	)

){
	winner=1;	

	JOptionPane.showMessageDialog (null ,"Congrats client side..... crosses 'x' wins");
	}			
	if(

			(((game[0][0]) == '0' && (game[0][1]) == '0' && (game[0][2]) == '0')
					|| ((game[1][0]) == '0' && (game[1][1]) == '0' && (game[1][2]) == '0')
					|| ((game[2][0]) == '0' && (game[2][1]) == '0' && (game[2][2]) == '0')
					||

					((game[0][0]) == '0' && (game[1][0]) == '0' && (game[2][0]) == '0')
					|| ((game[0][1]) == '0' && (game[1][1]) == '0' && (game[2][1]) == '0')
					|| ((game[0][2]) == '0' && (game[1][2]) == '0' && (game[2][2]) == '0')
					||

					((game[0][0]) == '0' && (game[1][1]) == '0' && (game[2][2]) == '0') || ((game[0][2]) == '0'
					&& (game[1][1]) == '0' && (game[2][0]) == '0')

			)

	) {
		winner=0;
		JOptionPane.showMessageDialog (null ,"Congrats server side...... zeros '0' wins");
	}
return winner;
}
	void setvalue(JButton b)
	{	
		b.setText("x");
	}

	public static void main(String args[]) throws IOException, ClassNotFoundException {
		SimpleServer T1=new SimpleServer();
		T1.f1();
	}
	public void f1()throws IOException, ClassNotFoundException{

		//SimpleServer T=new SimpleServer();
		showbutton();		
		
		
int winner=100;

for(int i=0;i<9;i++)
	{	winner=won();
	System.out.print(winner);
	P1.setWin(winner);
	
	
//	T.showbutton();
	System.out.println(i);
		
		if(winner==3)
		{
				if(count%2!=0)
				{//sending object
					P1.setRow(row);
					P1.setCol(col);
					P1.setTurn(turn);
					
					
				}
				else
				{//receiving object
					
					ServerSocket s = new ServerSocket(1337);
					Socket s1 = s.accept();
					
					OutputStream s1out = s1.getOutputStream();
					
					DataOutputStream dos = new DataOutputStream(s1out);
					System.out.println("in connection");
					dos.writeUTF("Hi shahid");

					
					ObjectInputStream sistream = new ObjectInputStream(s1.getInputStream());
			
					P2=(Player) sistream.readObject();
					System.out.println("the object player col=" + P2.getCol());
					col=P2.getCol();
					row=P2.getRow();
					dos.close();
					s1out.close();
					s1.close();
				
		
					game[P2.getRow()][P2.getCol()]='x';
					if(P2.row==0&&P2.col==0)
					{	B1.setText("x");
						count++;
					}
					if(P2.getRow()==0&&P2.getCol()==1)
					{	B2.setText("x");
						count++;
					}
					if(P2.getRow()==0&&P2.getCol()==2)
					{	B3.setText("x");
					}
					if(P2.getRow()==1&&P2.getCol()==0)
					{	B4.setText("x");
						count++;
					}
					if(P2.getRow()==1&&P2.getCol()==1)
					{	B5.setText("x");
						count++;
					}
					if(P2.getRow()==1&&P2.getCol()==2)
					{	B6.setText("x");
						count++;
					}
					if(P2.getRow()==2&&P2.getCol()==0)
					{	B7.setText("x");
						count++;
					}
					if(P2.getRow()==2&&P2.getCol()==1)
					{	B8.setText("x");
						count++;
					}if(P2.getRow()==2&&P2.getCol()==2)
					{	B9.setText("x");
						count++;
					}
					mainFrame.invalidate();
					mainFrame.validate();
					mainFrame.repaint();
	
				}
		}
		else
		{
			break;
		}

	}
		
	}
	
}
