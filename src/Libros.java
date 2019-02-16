/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel RC
 */
class Libros {
    String titulo;
    String descripcion;
    String puntaje;
    String copias;
    String genero;
    String valor;
    String edicion;
    String autor;
    String año;

    public Libros(String titulo, String descripcion, String puntaje, String copias, String genero, String valor, String edicion, String autor, String año) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.copias = copias;
        this.genero = genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.año = año;
    }

    public Libros() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo=="") {
            
        }else{
        this.titulo = titulo;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion!="") {
            this.descripcion = descripcion;
        }
            
        
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
      if (puntaje!="") {  
        this.puntaje = puntaje;
    }}

    public String getCopias() {
        return copias;
    }

    public void setCopias(String copias) {
       if (copias!="") { this.copias = copias;
    }}

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero!="") {
        this.genero = genero;
    }}

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
      if (valor!="") {  this.valor = valor;
    }}

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
      if (edicion!="") {  this.edicion = edicion;
    }}

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
      if (autor!="") {  this.autor = autor;
    }}

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        if (año!="") {this.año = año;
    }}
    
}
