package Program;

import java.util.ArrayList;

public class arraystudent {
	
private ArrayList<student> estu; 

public arraystudent () {
	estu= new ArrayList<student>();	
}

public void adicionar (student x) {
	estu.add(x);
}

public void eliminar(student x) {
	estu.remove(x);
}

public int Tamaño() {
	return estu.size();
}

public student Obtener(int x) {
	return estu.get(x);
}

public student Buscar(int cod) {
	for(int i=0;i<Tamaño();i++) {
		if(Obtener(i).getOrden()==cod) {
			return Obtener(i);
		}
	}
	return null;
}
}
