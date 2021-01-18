package Actividades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

	public void canciones(String nombre) {
		ArrayList<String> array = new ArrayList<String>();
		HashMap<String, String> userLetra = new HashMap<String, String>();
		userLetra.put("Luz de día", "Destapa el champagne, Apaga las luces...");
        userLetra.put("Avanti morocha", "¡Arriba morocha, que nadie está muerto!..");
        userLetra.put("Sin documentos", "Déjame atravesar el viento sin documentos...");
        userLetra.put("Alegría","En las buenas y en las malas ¡alegria!..");
		Set<String> keys = userLetra.keySet();
        for(String key : keys) {
        	if(key==nombre) {
        	System.out.println("Tu canción es:"+nombre+"\n Letra:"+userLetra.get(key)+"");
        	}
            array.add("Cancion:" +key+"  Letra:"+ userLetra.get(key)+"\n");   
        }
        System.out.println("Track Lirics: "+array);
	}
}


