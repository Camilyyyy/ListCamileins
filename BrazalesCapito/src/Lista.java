import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.ArrayList;
;

public class Lista {
    private Set<Jugadores> listajugadores;
    public int contador1 = 0;
    public Lista(){
        listajugadores= new LinkedHashSet<>();
        predefinir();
    }
    public int definirID(){
        contador1++;
        return contador1;
    }
    public void agregarelementos(Jugadores e)  {
        listajugadores.add(e);
    }
    public void predefinir(){
        Jugadores a = new Jugadores(definirID(), "Sebastian", "MASCULINO", "ATLETISMO", 6, 18);
        Jugadores b = new Jugadores(definirID(), "Juan", "MASCULINO", "GIMNASIA", 8, 16);
        Jugadores c = new Jugadores(definirID(), "Maria", "FEMENINO", "ATLETISMO", 7, 20);
        Jugadores d = new Jugadores(definirID(), "Jose", "MASCULINO", "ALTEROFILIA", 5, 21);
        Jugadores e = new Jugadores(definirID(), "Camila", "FEMENINO", " ALTEROFILIA", 9, 18);
        Jugadores f = new Jugadores(definirID(), "Mateo", "MASCULINO", " ALTEROFILIA", 7, 15);
        Jugadores g = new Jugadores(definirID(), "Camily", "FEMENINO", "ATLETISMO", 9, 15);
        Jugadores h = new Jugadores(definirID(), "Bernarda", "FEMENINO", "GIMNASIA", 6, 18);
        Jugadores i = new Jugadores(definirID(), "Sofia", "FEMENINO", "GIMNASIA", 4, 22);
        Jugadores j = new Jugadores(definirID(), "Josue", "MASCULINO", " ALTEROFILIA", 8, 17);
        listajugadores.add(a);
        listajugadores.add(b);
        listajugadores.add(c);
        listajugadores.add(d);
        listajugadores.add(e);
        listajugadores.add(f);
        listajugadores.add(g);
        listajugadores.add(h);
        listajugadores.add(i);
        listajugadores.add(j);
    }
    public String listaelementos(){
        Jugadores aux;
        String respuesta="";
        for (int i=listajugadores.size()-1;i>=0;i--){
           aux=(Jugadores) listajugadores.toArray()[i];
           respuesta+=aux.toString();
        }
        return respuesta;
    }

    public void encontrar(){

    }

}