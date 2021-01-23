package clase2Java.practica1;

public class Libro {

    private String titulo;
    private int isbn;
    private String autor;

    public Libro(){}
    public Libro(String titulo, int isbn, String autor){
        setAutor(autor);
        setIsbn(isbn);
        setTitulo(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void prestamo(){}
    public void devolucion(){}

    //si se hace @Override el metodo tendria que tener el mismo nombre de lo contrario arroja error
    public String toString(){
        return this.getTitulo()+" "+this.getIsbn()+" "+this.getAutor();
    }




}
