package Bai_4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class FrmBT_4_5 extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtS;
	private JTextField txtKeyWord;
	private String[] arr = new String[100];
	private int currentSize =0;
	private JTextArea taList;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	
	
		
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmBT_4_5 frame = new FrmBT_4_5();
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
	public FrmBT_4_5() {
		setTitle("Score Board");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setBounds(190, 11, 46, 14);
		contentPane.add(lblScore);
	
		txtN = new JTextField();
		txtN.setBounds(66, 8, 101, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		txtS = new JTextField();
		txtS.setColumns(10);
		txtS.setBounds(246, 8, 76, 20);
		contentPane.add(txtS);
		
		txtKeyWord = new JTextField();
		txtKeyWord.setBounds(364, 195, 129, 31);
		contentPane.add(txtKeyWord);
		txtKeyWord.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		buttonGroup.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton.setBounds(364, 11, 129, 48);
		contentPane.add(btnNewButton);
		
		JButton btnSortNmae = new JButton("Sort Name");
		buttonGroup.add(btnSortNmae);
		btnSortNmae.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				}
			}
		
				
		});
	
		btnSortNmae.setBounds(364, 77, 129, 48);
		contentPane.add(btnSortNmae);

		JButton btnSortScore = new JButton("Sort Score");
		btnSortScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			});
		btnSortScore.setBounds(364, 136, 129, 48);
		contentPane.add(btnSortScore);
		
		JButton btnFind = new JButton("Find");
		btnFind.setBounds(364, 237, 129, 48);
		contentPane.add(btnFind);
		
		taList = new JTextArea();
		taList.setBounds(10, 61, 312, 248);
		contentPane.add(taList);
			}
		}
