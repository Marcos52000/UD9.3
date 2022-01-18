
public class Act3App {

	public static void main(String[] args) {
		Libro libro1 = new Libro("3879851", "'Pepe'", "Jose Martin", 101);
		Libro libro2 = new Libro("3995678", "'Lobos'", "Maria Sanchez", 65);
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		System.out.println(libro1.tieneMasPaginas(libro1, libro2));
	}
	
	

}
