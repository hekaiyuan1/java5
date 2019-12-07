package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class CourseCx extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseCx frame = new CourseCx();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CourseCx() {
		setTitle("选课信息");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 47, 259, 131);
		contentPane.add(textField);
		textField.setColumns(10);
		try {
            BufferedReader bufferedReader =new BufferedReader(new FileReader("F://JAVA.txt"));
            String s1 =textField.getText();
            while(null !=(s1=bufferedReader.readLine())) {
            	
            	textField.setText(s1);
            
            }
        }catch (IOException e) {
            e.printStackTrace();
            	
        }
       
		JLabel label = new JLabel("当前选课信息");
		label.setBounds(10, 22, 97, 15);
		contentPane.add(label);
	}

}
