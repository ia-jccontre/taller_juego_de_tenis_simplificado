package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import codigo.Tennis;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class TennisView extends JFrame {

	private JPanel contentPane;
	private Tennis codigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TennisView frame = new TennisView();
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
	public TennisView() {
		codigo = new Tennis();
		setTitle("Taller Tenis");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(2, 2, 2, 2));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel labelPlayer = new JLabel("0");
		contentPane.add(labelPlayer, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		
		JButton btnCalculatePlayerOne = new JButton("Jugador 1");
		btnCalculatePlayerOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelPlayer.setText(codigo.addPoints(0));
			}
		});
		panel.add(btnCalculatePlayerOne);

		JButton btnCalculateTwo = new JButton("Jugador 2");
		btnCalculateTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelPlayer.setText(codigo.addPoints(1));
			}
		});
		panel.add(btnCalculateTwo);
	}
}
