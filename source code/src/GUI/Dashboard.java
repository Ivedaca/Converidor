package GUI;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Font;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}

	/**
	 * Create the frame.
	 */
	public Dashboard() {
		setBackground(new Color(240, 240, 240));
		setTitle("Convertidor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(408, 326);
		components();
		
		JPanel content = new JPanel();
		content.setBackground(new Color(255, 255, 255));
		content.setBounds(0, 0, 387, 265);
		contentPane.add(content);
		
		contentPane.removeAll();
		contentPane.add(content, BorderLayout.CENTER);
		content.setLayout(null);
		
		JLabel lblTitle = new JLabel("Convertidor de Unidades");
		lblTitle.setBounds(0, 0, 386, 25);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.ITALIC, 20));
		content.add(lblTitle);
		
		JLabel lblDevelopBy = new JLabel("Desarrollado por:");
		lblDevelopBy.setBounds(0, 189, 386, 14);
		lblDevelopBy.setHorizontalAlignment(SwingConstants.CENTER);
		content.add(lblDevelopBy);
		
		JLabel lblAS = new JLabel("Anibal Saavedra");
		lblAS.setBounds(0, 200, 386, 25);
		lblAS.setHorizontalAlignment(SwingConstants.CENTER);
		content.add(lblAS);
		
		JButton btnQuit = new JButton("Salir");
		btnQuit.setBounds(270, 220, 89, 23);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(-1);
			}
		});
		content.add(btnQuit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\A&B\\Documents\\Programming\\C.png"));
		lblNewLabel.setBounds(125, 25, 140, 166);
		content.add(lblNewLabel);
		contentPane.revalidate();
		contentPane.repaint();
		
	}

	private void components() {
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(240, 240, 240));
		setJMenuBar(menuBar);
		
		JMenu mnMenuP = new JMenu("Menu Principal");
		mnMenuP.setBackground(new Color(240, 240, 240));
		mnMenuP.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnMenuP.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnMenuP);
		
		JMenuItem mntmCoinPage = new JMenuItem("Paridad Cambiaria");
		mntmCoinPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoinPage p1  = new CoinPage();
				p1.setSize(500, 270);
				p1.setLocation(0, 0);
				
				contentPane.removeAll();
				contentPane.add(p1, BorderLayout.CENTER);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		mntmCoinPage.setHorizontalAlignment(SwingConstants.LEFT);
		mnMenuP.add(mntmCoinPage);
		
		JMenuItem mntmTempPage = new JMenuItem("Temperatura");
		mntmTempPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TempPage t1  = new TempPage();
				t1.setSize(500, 270);
				t1.setLocation(0, 0);
				
				contentPane.removeAll();
				contentPane.add(t1, BorderLayout.CENTER);
				contentPane.revalidate();
				contentPane.repaint();
			}
		});
		mntmTempPage.setHorizontalAlignment(SwingConstants.LEFT);
		mnMenuP.add(mntmTempPage);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
