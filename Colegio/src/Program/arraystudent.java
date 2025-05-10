package Program;

import java.util.ArrayList;

public class arraystudent {
private ArrayList<student> estu; 
public arraystudent () {
	estu= new ArrayList<student>();
	adicionar(new student(1,"Jimenez Villegas, Erick ", 15, 12, 13, 14));	
	adicionar(new student(2,"Julca Espinoza, Ramiro ", 10, 11, 17, 16));
	adicionar(new student(3,"Loro Purizaca, Angel ", 10, 12, 13, 16));
	adicionar(new student(4,"Mamani Mamani, Joaquin ", 19, 10, 16, 18));

	
}
public void adicionar (student x) {
	estu.add(x);
}
public int Tamaño() {
	return estu.size();
}
public student Obtener(int x) {
	return estu.get(x);
}
public student Buscar(int cod) {
	for(int i=0;i<Tamaño();i++) {
		if(Obtener(i).getCod()==cod) {
			return Obtener(i);
		}
	}
	return null;
}

}
