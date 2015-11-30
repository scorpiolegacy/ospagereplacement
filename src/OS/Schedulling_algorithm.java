package OS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JProgressBar;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Schedulling_algorithm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Schedulling_algorithm frame = new Schedulling_algorithm();
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
	public Schedulling_algorithm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Schedulling Algorithms", null, panel, null);
		panel.setLayout(null);
		
		JRadioButton rdbtnFcfs = new JRadioButton("FCFS");
		rdbtnFcfs.setBounds(23, 20, 149, 23);
		panel.add(rdbtnFcfs);
		
		JRadioButton rdbtnSjfPreemptive = new JRadioButton("SJF - Preemptive");
		rdbtnSjfPreemptive.setBounds(23, 59, 149, 23);
		panel.add(rdbtnSjfPreemptive);
		
		JRadioButton rdbtnSjfnonPreemptive = new JRadioButton("SJF-Non Preemptive");
		rdbtnSjfnonPreemptive.setBounds(23, 102, 168, 23);
		panel.add(rdbtnSjfnonPreemptive);
		
		JRadioButton rdbtnRoundRobin = new JRadioButton("Round Robin");
		rdbtnRoundRobin.setBounds(23, 143, 149, 23);
		panel.add(rdbtnRoundRobin);
		
		JRadioButton rdbtnPriority = new JRadioButton("Priority");
		rdbtnPriority.setBounds(23, 182, 149, 23);
		panel.add(rdbtnPriority);
		
		JButton btnSelectAnAlgorithm = new JButton("Run Algorithm");
		btnSelectAnAlgorithm.setBounds(223, 101, 189, 25);
		panel.add(btnSelectAnAlgorithm);
	}
}
