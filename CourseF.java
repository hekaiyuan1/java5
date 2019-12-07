package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CourseF extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseF frame = new CourseF();
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
	public CourseF() {
		setTitle("学生选课系统");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 173);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"高数    教140", "离散\t   教55", "java     教120"}));
		comboBox.setBounds(58, 50, 64, 23);
		contentPane.add(comboBox);
		
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"杨、", "王", "六"}));
		comboBox_1.setBounds(162, 50, 64, 23);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("选课");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s ;
				String name = textField.getText();
				String	id  = textField_1.getText();
				String  c1  = comboBox.getSelectedItem().toString();
				String  c2  = comboBox_1.getSelectedItem().toString();
			   s = name + id + c1 + c2 ;
			   try {
		        	FileWriter writer = new FileWriter("F://JAVA.txt", true);
		        	writer.write(s);
		        	writer.flush();
		        	writer.close();
		        } catch (IOException e2) {
		            e2.printStackTrace();
		        }
				JOptionPane.showMessageDialog(null, "选课成功");
				
			}
		});
		btnNewButton.setBounds(10, 83, 70, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("退课");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 File file =new File("D://1.txt");
			        try {
			            if(!file.exists()) {
			                file.createNewFile();
			            }
			            FileWriter fileWriter =new FileWriter("F://JAVA.txt");
			            fileWriter.write("");
			            fileWriter.flush();
			            fileWriter.close();
			        } catch (IOException a) {
			            a.printStackTrace();
			        }
				JOptionPane.showMessageDialog(null, "退课成功");
				
			}
		});
		btnNewButton_1.setBounds(121, 83, 70, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("查询");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CourseCx frame = new CourseCx();
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(229, 83, 70, 23);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(58, 10, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 10, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("姓名");
		label.setBounds(14, 13, 34, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("学号");
		label_1.setBounds(134, 13, 34, 15);
		contentPane.add(label_1);
	}
}
