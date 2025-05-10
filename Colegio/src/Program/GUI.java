package Program;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblApellidosYNombres;
	private JTextField txtname;
	private JLabel lblNotaN;
	private JLabel lblNotaN_4;
	private JLabel lblNotaN_1;
	private JLabel lblNotaN_2;
	private JTextField txtnota1;
	private JTextField txtnota2;
	private JTextField txtnota3;
	private JTextField txtnota4;
	private JButton btnEliminar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblApellidosYNombres = new JLabel("Apellidos y Nombres : ");
			lblApellidosYNombres.setBounds(27, 41, 125, 13);
			contentPane.add(lblApellidosYNombres);
		}
		{
			txtname = new JTextField();
			txtname.setBounds(150, 37, 296, 19);
			contentPane.add(txtname);
			txtname.setColumns(10);
		}
		{
			lblNotaN = new JLabel("Nota N° 1");
			lblNotaN.setBounds(70, 104, 59, 13);
			contentPane.add(lblNotaN);
		}
		{
			lblNotaN_4 = new JLabel("Nota N° 2");
			lblNotaN_4.setBounds(284, 104, 59, 13);
			contentPane.add(lblNotaN_4);
		}
		{
			lblNotaN_1 = new JLabel("Nota N° 3");
			lblNotaN_1.setBounds(490, 104, 59, 13);
			contentPane.add(lblNotaN_1);
		}
		{
			lblNotaN_2 = new JLabel("Nota N° 4");
			lblNotaN_2.setBounds(678, 104, 59, 13);
			contentPane.add(lblNotaN_2);
		}
		{
			txtnota1 = new JTextField();
			txtnota1.setBounds(59, 127, 70, 19);
			contentPane.add(txtnota1);
			txtnota1.setColumns(10);
		}
		{
			txtnota2 = new JTextField();
			txtnota2.setColumns(10);
			txtnota2.setBounds(273, 127, 70, 19);
			contentPane.add(txtnota2);
		}
		{
			txtnota3 = new JTextField();
			txtnota3.setColumns(10);
			txtnota3.setBounds(479, 127, 70, 19);
			contentPane.add(txtnota3);
		}
		{
			txtnota4 = new JTextField();
			txtnota4.setColumns(10);
			txtnota4.setBounds(667, 127, 70, 19);
			contentPane.add(txtnota4);
		}
		{
			btnEliminar = new JButton("Buscar");
			btnEliminar.addActionListener(this);
			btnEliminar.setBounds(245, 72, 85, 21);
			contentPane.add(btnEliminar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(27, 157, 710, 165);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			btnNewButton_1 = new JButton("CURSO #1");
			btnNewButton_1.setBounds(481, 38, 109, 19);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("CURSO #2");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(600, 38, 107, 19);
			contentPane.add(btnNewButton_2);
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(27, 333, 710, 165);
			contentPane.add(scrollPane_1);
			{
				textArea = new JTextArea();
				scrollPane_1.setViewportView(textArea);
			}
		}
		{
			lblNewLabel_1 = new JLabel("Registrar");
			lblNewLabel_1.setBounds(486, 20, 46, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			textField = new JTextField();
			textField.setBounds(364, 519, 373, 75);
			contentPane.add(textField);
			textField.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("Observaciones del docente:");
			lblNewLabel_2.setBounds(224, 541, 142, 31);
			contentPane.add(lblNewLabel_2);
		}
		{
			btnNewButton = new JButton("GENERAR LIBRETA");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(31, 532, 183, 49);
			contentPane.add(btnNewButton);
		}
		{
			btnEliminar_1 = new JButton("Eliminar");
			btnEliminar_1.setBounds(150, 71, 85, 21);
			contentPane.add(btnEliminar_1);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
	}
	arraystudent arreglo = new arraystudent();
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane_1;
	private JLabel lblNewLabel_1;
	private JTextArea textArea;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnEliminar_1;
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
	}
}
