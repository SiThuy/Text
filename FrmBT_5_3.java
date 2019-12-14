package Bai_5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmBT_5_3 extends JFrame {
	
     private JPanel contentPane;
	private JTextField txtTenPhim;
	private JTextField txtTheLoai;
	private JTextField txtNgay;
	private JTextField txtRap;
	
	public DSPhim[] phim = new DSPhim[5];
	public int flag =0;
	private JLabel lblImage;
	
	public FrmBT_5_3 (){
	
	           DSPhim p1 = new DSPhim("Toy Story 1", "Hoạt hình", "25/12/2010", "Lotte Cộng Hòa",
				"src/images_2/1.jpg");
				DSPhim p2 = new DSPhim ("Fast and Furious 3", "Hành Động","19/01/2009", "Lotte Cộng Hòa", 
						"src/images/1.1.jpg");
				DSPhim p3 = new DSPhim ("Transformer 1", "Khoa Học Viễn Tưởng - Hành Động", "10/12/2005", "CGV Thảo Điền",
						"src/images_2/1.2.jpg");
				DSPhim p4 = new DSPhim ("Madagascar 1", "Hoạt Hình", "10/11/2008", "Galaxy Nguyễn Văn Quá",
						"src/images_2/1.3.jpg");
				DSPhim p5 = new DSPhim ("Assassin's creed ", " Hành Động", "20/5/2015", "CGV Chung Chánh",
						"src/images_2/1.4.jpg");
				phim [0] = p1;
				phim [1] = p2;
				phim [2] = p3;
				phim [3] = p4;
				phim [4] = p5;
				
				txtTenPhim.setBackground(Color.gray);
				txtTenPhim.setText(phim[0].getTenPhim());
				txtRap.setBackground(Color.PINK);
				txtRap.setText(phim[0].getRap());
				txtNgay.setBackground(Color.GREEN);
				txtNgay.setText(phim[0].getNgay());
				txtTheLoai.setBackground(Color.ORANGE);
				txtTheLoai.setText(phim[0].getTheLoai());
				lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(phim[0].getDuongDanHinh())));
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmBT_5_3 frame = new FrmBT_5_3();
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
	
	    public FrmBT_5_3() {
		setTitle("Phim chi\u1EBFu r\u1EA1p");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblImage = new JLabel("New label");
		lblImage.setBounds(86, 25, 190, 215);
		contentPane.add(lblImage);
		
		txtTenPhim = new JTextField();
		txtTenPhim.setBounds(321, 25, 179, 20);
		contentPane.add(txtTenPhim);
		txtTenPhim.setColumns(10);
		
		txtTheLoai = new JTextField();
		txtTheLoai.setColumns(10);
		txtTheLoai.setBounds(321, 77, 179, 20);
		contentPane.add(txtTheLoai);
		
		txtNgay = new JTextField();
		txtNgay.setColumns(10);
		txtNgay.setBounds(321, 132, 179, 20);
		contentPane.add(txtNgay);
		
		txtRap = new JTextField();
		txtRap.setColumns(10);
		txtRap.setBounds(321, 189, 179, 20);
		contentPane.add(txtRap);
		
		
	           DSPhim p1 = new DSPhim("Toy Story 1", "Hoạt hình", "25/12/2010", "Lotte Cộng Hòa",
				"src/images_2/1.jpg");
				DSPhim p2 = new DSPhim ("Fast and Furious 3", "Hành Động","19/01/2009", "Lotte Cộng Hòa", 
						"src/images/1.1.jpg");
				DSPhim p3 = new DSPhim ("Transformer 1", "Khoa Học Viễn Tưởng - Hành Động", "10/12/2005", "CGV Thảo Điền",
						"src/images_2/1.2.jpg");
				DSPhim p4 = new DSPhim ("Madagascar 1", "Hoạt Hình", "10/11/2008", "Galaxy Nguyễn Văn Quá",
						"src/images_2/1.3.jpg");
				DSPhim p5 = new DSPhim ("Assassin's creed ", " Hành Động", "20/5/2015", "CGV Chung Chánh",
						"src/images_2/1.4.jpg");
				phim [0] = p1;
				phim [1] = p2;
				phim [2] = p3;
				phim [3] = p4;
				phim [4] = p5;
				
				txtTenPhim.setBackground(Color.gray);
				txtTenPhim.setText(phim[0].getTenPhim());
				txtRap.setBackground(Color.PINK);
				txtRap.setText(phim[0].getRap());
				txtNgay.setBackground(Color.GREEN);
				txtNgay.setText(phim[0].getNgay());
				txtTheLoai.setBackground(Color.ORANGE);
				txtTheLoai.setText(phim[0].getTheLoai());
				lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(phim[0].getDuongDanHinh())));
	
		
		JButton btnPhimTruoc = new JButton("");
		btnPhimTruoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag ==0) {
					flag --;
					txtTenPhim.setText(phim[flag].getTenPhim());
					txtRap.setText(phim[flag].getRap());
					txtNgay.setText(phim[flag].getNgay());
					txtTheLoai.setText(phim[flag].getTheLoai());
					lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(phim[flag].getDuongDanHinh())));
				}else {
					JOptionPane.showMessageDialog(rootPane, "Đây là phim đầu tiên, vui lòng quay lại phim trước ! ");
				}
			}
		});
		btnPhimTruoc.setBounds(10, 117, 42, 38);
		contentPane.add(btnPhimTruoc);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (flag < 4) {
					flag ++;
					txtTenPhim.setText(phim[flag].getTenPhim());
					txtRap.setText(phim[flag].getRap());
					txtNgay.setText(phim[flag].getNgay());
					txtTheLoai.setText(phim[flag].getTheLoai());
					lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(phim[flag].getDuongDanHinh())));
			  }else {
				  JOptionPane.showMessageDialog(rootPane, "Đã hết phim, vui lòng quay lại để xem phim khác !");
			  }
			}
		});
		button.setBounds(545, 117, 42, 38);
		contentPane.add(button);
	}
}
