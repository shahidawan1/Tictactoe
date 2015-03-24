import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.*;

import javax.swing.*;

public class Tictac {
	public static char[][] game = { { '1', '2', '3' }, { '4', '5', '6' },
			{ '7', '8', '9' } };
	private JFrame mainFrame;
	private JLabel statusLabel;
	int count = 0;

	Tictac() {

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

		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int win=won();
				if(win==1)
					JOptionPane.showMessageDialog (null ,"Congratulations......Cross 'x' WINS");
					
				else if (win==0)
					JOptionPane.showMessageDialog (null ,"Congratulations......Zeros '0' WINS");
				else{if(count!=9){
						if(game[0][0]=='1')
						{
						count++;
		
							if (count < 10) {
								if (count % 2 == 0) {
								B1.setText("x");
								game[0][0] = 'x';
								} else{
								B1.setText("0");
							    game[0][0] = '0';}
							}
						}}else {JOptionPane.showMessageDialog (null ,"GAME DRAW");}
				}	
}
		});

		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int win=won();
				if(win==1)
					JOptionPane.showMessageDialog (null ,"Congratulations......Cross 'x' WINS");
				else if (win==0)
					JOptionPane.showMessageDialog (null ,"Congratulations......Zeros '0' WINS");
				else{	if(count!=9){			
						if(game[0][1]=='2')
								{	
								   count++;
								
									if (count < 10) {
										if (count % 2 == 0) {
										B2.setText("x");
										game[0][1] = 'x';
										} else{
										B2.setText("0");
										game[0][1] = '0';}
				
									}
								}}else {JOptionPane.showMessageDialog (null ,"GAME DRAW");}
				}			}
		});

		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int win=won();
				if(win==1)
					JOptionPane.showMessageDialog (null ,"Congratulations......Cross 'x' WINS");
				else if (win==0)
					JOptionPane.showMessageDialog (null ,"Congratulations......Zeros '0' WINS");
				else{if(count!=9){			
				
						if(game[0][2]=='3')
						{	
						count++;
						if (count < 10) {
							if (count % 2 == 0) {
								B3.setText("x");
								game[0][2] = 'x';
								
							} else{
								B3.setText("0");
							    game[0][2] = '0';}
							}
						}	}else {JOptionPane.showMessageDialog (null ,"GAME DRAW");}
				}
			}
		});

		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int win=won();
				if(win==1)
					JOptionPane.showMessageDialog (null ,"Congratulations......Cross 'x' WINS");
				else if (win==0)
					JOptionPane.showMessageDialog (null ,"Congratulations......Zeros '0' WINS");
				else{if(count!=9){
							if(game[1][0]=='4')
							{	
							count++;
							if (count < 10) {
								if (count % 2 == 0) {
									B4.setText("x");
									game[1][0] = 'x';
								} else{
									B4.setText("0");
								game[1][0] = '0';}
								}
							}}else {JOptionPane.showMessageDialog (null ,"GAME DRAW");}	
				}
			}
		});

		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int win=won();
				if(win==1)
					JOptionPane.showMessageDialog (null ,"Congratulations......Cross 'x' WINS");
				else if (win==0)
					JOptionPane.showMessageDialog (null ,"Congratulations......Zeros '0' WINS");
				else{if(count!=9){
				
						if(game[1][1]=='5')
						{
						count++;
						if (count < 10) {
							if (count % 2 == 0) {
								B5.setText("x");
								game[1][1] = 'x';
							} else{
								B5.setText("0");
							game[1][1] = '0';}
						}
				}	}else {JOptionPane.showMessageDialog (null ,"GAME DRAW");}
						}	

			}
		});

		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int win=won();
				if(win==1)
					JOptionPane.showMessageDialog (null ,"Congratulations......Cross 'x' WINS");
				else if (win==0)
					JOptionPane.showMessageDialog (null ,"Congratulations......Zeros '0' WINS");
				else{if(count!=9){
				
				if(game[1][2]=='6')
				{
				count++;
				if (count < 10) {
					if (count % 2 == 0) {
						B6.setText("x");
						game[1][2] = 'x';
					} else{
						B6.setText("0");
					game[1][2] = '0';}
				}
				}}else {JOptionPane.showMessageDialog (null ,"GAME DRAW");}
			}}
		});

		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int win=won();
				if(win==1)
					JOptionPane.showMessageDialog (null ,"Congratulations......Cross 'x' WINS");
				else if (win==0)
					JOptionPane.showMessageDialog (null ,"Congratulations......Zeros '0' WINS");
				else{if(count!=9){
				if(game[2][0]=='7')
				{
				count++;
				if (count < 10) {
					if (count % 2 == 0) {
						B7.setText("x");
						game[2][0] = 'x';
					} else{
						B7.setText("0");
					game[2][0] = '0';}
				}
			}}else {JOptionPane.showMessageDialog (null ,"GAME DRAW");}
			}}
		});

		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int win=won();
				if(win==1)
					JOptionPane.showMessageDialog (null ,"Congratulations......Cross 'x' WINS");
				else if (win==0)
					JOptionPane.showMessageDialog (null ,"Congratulations......Zeros '0' WINS");
				else{if(count!=9){
				if(game[2][1]=='8')
				{
				count++;
				if (count < 10) {
					if (count % 2 == 0) {
						B8.setText("x");
						game[2][1] = 'x';
					} else{
						B8.setText("0");
					game[2][1] = '0';}

				}
				}}else {JOptionPane.showMessageDialog (null ,"GAME DRAW");}
			}}
		});

		B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int win=won();
				if(win==1)
					JOptionPane.showMessageDialog (null ,"Congratulations......Cross 'x' WINS");
				else if (win==0)
					JOptionPane.showMessageDialog (null ,"Congratulations......Zeros '0' WINS");
				else{if(count!=9){
					if(game[2][2]=='9')
				{
				count++;
				if (count < 10) {
					if (count % 2 == 0) {
						B9.setText("x");
						game[2][2] = 'x';
					} else{
						B9.setText("0");
					game[2][2] = '0';}

				}
				}}else {JOptionPane.showMessageDialog (null ,"GAME DRAW");}
			}}
		});
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

	}

	public int won() {int winner=3;
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

		) {// if condition is true execute this
			winner=0;
		}
return winner;
	}

	public void draw() {
		if ((game[0][0]) != '1' && (game[0][1]) != '2' && (game[0][2]) != '3'
				|| (game[1][0]) != '4' && (game[1][1]) != '5'
				&& (game[1][2]) != '6' || (game[2][0]) != '7'
				&& (game[2][1]) != '8' && (game[2][2]) != '9') {
			System.out.print("game draw");
		}
	}

	public static void main(String args[]) {
		
		Tictac t = new Tictac();
		t.showbutton();

	}
}
