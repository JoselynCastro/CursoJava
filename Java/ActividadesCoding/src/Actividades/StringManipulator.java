package Actividades;

public class StringManipulator {
	
	public static String trimAndConcat(String string1, String string2) {
	String str = string1.trim()+""+string2.trim();
	return(str); 
	}
	
	public int getIndexOrNull(String st1, char letra) {
		int pos= st1.indexOf(letra);
		return (pos);
	}
	
	public int getIndexOrNull(String palabra1, String palabra2) {
		int pal= palabra1.indexOf(palabra2);
		return (pal);
	}
	
	public String concatSubstring(String pal1, int v1, int v2, String pal2) {
		String pal= pal2;
		String cadena= pal1.substring(v1, v2)+pal;
		return (cadena);		
	}
}


