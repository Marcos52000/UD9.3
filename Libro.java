
public class Libro {
	//Atributos
	protected String isbn;
	protected String titulo;
	protected String autor;
	protected int numPaginas;
	
	//Contructor
	public Libro(String isbn, String titulo, String autor, int numPaginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	//Getter and Setters
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "El " + titulo + " con ISBN " + isbn + " creado por " + autor + " tiene " + numPaginas + " paginas";
	}
	
	public String tieneMasPaginas(Libro a, Libro b) {
		if(a.numPaginas > b.numPaginas) {
			return "El libro: " + titulo + " tiene mas paginas";
		} else if(a.numPaginas < b.numPaginas) {
			return "El libro: " + titulo + " tiene mas paginas";
		} else {
			return "tienen las mismas paginas";
		}
	}	
}
