package Program;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.DropMode;

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
	private JButton btnbuscar;
	private JScrollPane scrollPane;

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
			txtname.setBounds(160, 38, 296, 19);
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
			lblNotaN_4.setBounds(266, 104, 59, 13);
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
			txtnota2.setBounds(255, 127, 70, 19);
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
			btnbuscar = new JButton("Buscar");
			btnbuscar.addActionListener(this);
			btnbuscar.setBounds(340, 73, 85, 21);
			contentPane.add(btnbuscar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(27, 157, 710, 352);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			lblNewLabel_2 = new JLabel("Notas del docente:");
			lblNewLabel_2.setBounds(180, 541, 142, 31);
			contentPane.add(lblNewLabel_2);
		}
		{
			btnEliminar_1 = new JButton("Eliminar");
			btnEliminar_1.addActionListener(this);
			btnEliminar_1.setBounds(245, 73, 85, 21);
			contentPane.add(btnEliminar_1);
		}
		
		lblNewLabel = new JLabel("Número de lista : ");
		lblNewLabel.setBounds(27, 15, 125, 13);
		contentPane.add(lblNewLabel);
		
		txtcode = new JTextField();
		txtcode.setColumns(10);
		txtcode.setBounds(160, 12, 70, 19);
		contentPane.add(txtcode);
		
		btnRegistar = new JButton("Registar");
		btnRegistar.addActionListener(this);
		btnRegistar.setBounds(546, 26, 149, 42);
		contentPane.add(btnRegistar);
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(299, 519, 424, 90);
			contentPane.add(scrollPane_1);
			{
				textArea_1 = new JTextArea();
				scrollPane_1.setViewportView(textArea_1);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar_1) {
			do_btnEliminar_1_actionPerformed(e);
		}
		if (e.getSource() == btnRegistar) {
			do_btnRegistar_actionPerformed(e);
		}
		if (e.getSource() == btnbuscar) {
			do_btnEliminar_actionPerformed(e);
		}
	}
	arraystudent arreglo = new arraystudent();
	private JLabel lblNewLabel_2;
	private JButton btnEliminar_1;
	private JLabel lblNewLabel;
	private JTextField txtcode;
	private JButton btnRegistar;
	private JTextArea txtS;
	private JScrollPane scrollPane_1;
	private JTextArea textArea_1;
	
	void Imprimir(String s) 
	{
		txtS.append(s+"\n");
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		try {
		if(txtcode.getText().isBlank()) {
			JOptionPane.showMessageDialog(this, "Ingrese el número de lista del estudiante");
		}else {
			student est = arreglo.Buscar(orden());
			if(est!=null) {
				JOptionPane.showMessageDialog(this,"El estudiante y notas estan registradas");
			}
			else {
				JOptionPane.showMessageDialog(this,"No esta registrado");
			}
		}
		}catch(Exception o) {
			JOptionPane.showMessageDialog(this, "Número de orden de lista inválido");
		}
	}
	public int orden() {
		return Integer.parseInt(txtcode.getText().trim());
	}
	public String nombre() {
		return txtname.getText().trim();
	}
	public double n1() {
		return Double.parseDouble(txtnota1.getText());
	}
	public double n2() {
		return Double.parseDouble(txtnota2.getText());
	}
	public double n3() {
		return Double.parseDouble(txtnota3.getText());
	}
	public double n4() {
		return Double.parseDouble(txtnota4.getText());
	}
	protected void do_btnRegistar_actionPerformed(ActionEvent e) {
		try {
		if(n1()<0||n1()>20||n2()<0||n2()>20||n3()<0||n3()>20||n4()<0||n4()>20) JOptionPane.showMessageDialog(this, "Notas inválidas");
		else {
			if(arreglo.Buscar(orden())==null) {
		txtS.setText("");
		student estu=new student(orden(),nombre(),n1(),n2(),n3(),n4());
		arreglo.adicionar(estu);
		Imprimir("# de lista\tNombre\t\tNota 1\tNota 2\tNota 3\tNota 4\tPromedio");
		for (int i = 0; i < arreglo.Tamaño(); i++) {
			Imprimir("    "+arreglo.Obtener(i).getOrden()+"\t"+arreglo.Obtener(i).getNom()+"\t"+arreglo.Obtener(i).getN1()+
		"\t"+arreglo.Obtener(i).getN2()+"\t"+arreglo.Obtener(i).getN3()+"\t"+arreglo.Obtener(i).getN4()+"\t"+arreglo.Obtener(i).promedio());
			}
		}else {
			JOptionPane.showMessageDialog(this, "Alumno ya registrado");
		}
		}
		}catch(Exception x){
			JOptionPane.showMessageDialog(this, "Datos incorrectos");
		}
	}
	protected void do_btnEliminar_1_actionPerformed(ActionEvent e) {
		try {
		if(txtcode.getText().isBlank()) {
			JOptionPane.showMessageDialog(this, "Ingresar el número de lista del estudiante");
		}else {
		student s = arreglo.Buscar(orden());
		if(s != null) {
			arreglo.eliminar(s); 
			txtS.setText("");
			Imprimir("# de lista\tNombre\t\tNota 1\tNota 2\tNota 3\tNota 4\tPromedio");
			for (int i = 0; i < arreglo.Tamaño(); i++) {
				Imprimir("    "+arreglo.Obtener(i).getOrden()+"\t"+arreglo.Obtener(i).getNom()+"\t"+arreglo.Obtener(i).getN1()+
			"\t"+arreglo.Obtener(i).getN2()+"\t"+arreglo.Obtener(i).getN3()+"\t"+arreglo.Obtener(i).getN4()+"\t"+arreglo.Obtener(i).promedio());
		}
	}else {
		JOptionPane.showMessageDialog(this, "Alumno no registrado");
	}
		}
	}catch(Exception o) {
		JOptionPane.showMessageDialog(this, "Número de orden de lista inválido");
	}
	}
}
