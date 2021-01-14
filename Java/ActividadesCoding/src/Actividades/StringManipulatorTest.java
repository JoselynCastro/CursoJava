package Actividades;

public class StringManipulatorTest {
	public static void main(String[] args) {
		String str= StringManipulator.trimAndConcat("    Hola     ","     Mundo    ");
		System.out.println(str);
		
//		StringManipulator manipulator = new StringManipulator();
//		char letter = 'n';
//		int a = manipulator.getIndexOrNull("Coding", letter);
//		int b = manipulator.getIndexOrNull("Hola Mundo", letter);
//		int c = manipulator.getIndexOrNull("Saludar", letter);
//		System.out.println(a);
//		System.out.println(b); 
//		System.out.println(c); 
		
//		StringManipulator tercero = new StringManipulator();
//		String word = "Hola";
//		String subString = "la";
//		String notSubString = "mundo";
//		int a = tercero.getIndexOrNull(word, subString);
//		int b = tercero.getIndexOrNull(word, notSubString);
//		System.out.println(a); // 2
//		System.out.println(b);
		
		StringManipulator manipulator = new StringManipulator();
		String word = manipulator.concatSubstring("Hola", 1, 3, "mundo");
		System.out.println(word); 
   }
	
}
