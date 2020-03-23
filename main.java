package game;

import javax.swing.JFrame;

public class main {

	public static void main(String[] args) {
		JFrame obj= new JFrame();
		gameplay gp= new gameplay();
		obj.setBounds(10,10,700,600);
		obj.setTitle("Breakout Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gp);
		

	}

}
