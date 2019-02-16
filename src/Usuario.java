
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Daniel RC
 */
public class Usuario {

    String usuario;
    String contraseña;
    String telefono;
    String genero;
    ArrayList<Libros> libros = new ArrayList();
    ArrayList<Usuario> amigos = new ArrayList();

    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, String telefono, String genero) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.genero = genero;
    }

    public Usuario(String usuario) {
        this.usuario = usuario;
    }
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.libros = libros;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }
    
    
}
