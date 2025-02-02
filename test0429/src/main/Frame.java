package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Frame extends JFrame {

	private JPanel contentPane;
	private static int loginProcess;

	public static int getLoginProcess() {
		return loginProcess;
	}

	public static void setLoginProcess(int loginProcess) {
		Frame.loginProcess = loginProcess;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel loginPage = new JPanel();
		loginPage.setLayout(new BorderLayout());
		contentPane.add(loginPage);
		loginPage.add(new LoginPanel());
		JPanel middlePage = new JPanel();
		middlePage.setLayout(new BorderLayout());
		contentPane.add(middlePage);
		middlePage.add(new MiddlePane());
		
		
//		page.setVisible(false);
//		page.setVisible(true);
		
//		page.add(new MiddlePane());
//		page.setVisible(false);
	}
}
