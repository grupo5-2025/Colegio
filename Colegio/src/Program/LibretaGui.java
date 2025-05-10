package Program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class LibretaGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_4;
	private JTextField textField_2;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JLabel lblNewLabel_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibretaGui frame = new LibretaGui();
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
	public LibretaGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			panel = new JPanel();
			panel.setBounds(148, 11, 310, 109);
			contentPane.add(panel);
			panel.setLayout(null);
			{
				lblNewLabel = new JLabel("Institución Educativa 5093 Antonio Raymondi");
				lblNewLabel.setBounds(41, 5, 217, 14);
				panel.add(lblNewLabel);
			}
			{
				lblNewLabel_1 = new JLabel("Nivel Secundaria");
				lblNewLabel_1.setBounds(20, 30, 90, 14);
				panel.add(lblNewLabel_1);
			}
			{
				lblNewLabel_2 = new JLabel("Seccion:");
				lblNewLabel_2.setBounds(212, 30, 46, 14);
				panel.add(lblNewLabel_2);
			}
			{
				lblNewLabel_3 = new JLabel("Grado:");
				lblNewLabel_3.setBounds(131, 30, 46, 14);
				panel.add(lblNewLabel_3);
			}
			{
				textField = new JTextField();
				textField.setEditable(false);
				textField.setBounds(165, 27, 30, 20);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				textField_1 = new JTextField();
				textField_1.setEditable(false);
				textField_1.setColumns(10);
				textField_1.setBounds(255, 27, 30, 20);
				panel.add(textField_1);
			}
			{
				lblNewLabel_4 = new JLabel("Estudiante:");
				lblNewLabel_4.setBounds(20, 58, 69, 14);
				panel.add(lblNewLabel_4);
			}
			{
				textField_2 = new JTextField();
				textField_2.setEditable(false);
				textField_2.setBounds(78, 55, 223, 20);
				panel.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				lblNewLabel_5 = new JLabel("2025");
				lblNewLabel_5.setBounds(255, 86, 46, 14);
				panel.add(lblNewLabel_5);
			}
			{
				lblNewLabel_6 = new JLabel("Constancia de Aprendizaje");
				lblNewLabel_6.setBounds(121, 86, 137, 14);
				panel.add(lblNewLabel_6);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBounds(10, 133, 501, 180);
			contentPane.add(panel_1);
		}
		{
			panel_2 = new JPanel();
			panel_2.setBounds(10, 324, 501, 180);
			contentPane.add(panel_2);
		}
		{
			panel_3 = new JPanel();
			panel_3.setBounds(10, 513, 310, 95);
			contentPane.add(panel_3);
		}
		{
			panel_4 = new JPanel();
			panel_4.setBounds(330, 512, 181, 95);
			contentPane.add(panel_4);
		}
		{
			lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setIcon(new ImageIcon(LibretaGui.class.getResource("/imagen/images.jpeg")));
			lblNewLabel_7.setBounds(10, 11, 128, 109);
			contentPane.add(lblNewLabel_7);
		}
	}
}
