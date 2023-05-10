package com.marketing.AprendeDesarrollate.modulos;

import com.marketing.AprendeDesarrollate.Enums.Categoria;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.*;

@Entity

public class Productos {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  @GenericGenerator(name = "native", strategy = "native")
  private Long Id;
  private String Nombre;
  private String Descripcion;
  private String DescCompleta;
  private String Imagen;
  private String ImagenBanner;
  private String Certificado;
  private String Book;
  private String Video;
  private Categoria Categoria;
  private Boolean Activo;

  public Productos() { }

  public Productos(String nombre, String descripcion,String descCompleta, String imagen,String imagenBanner,String certificado,String book, String video, Categoria categoria, Boolean activo ) {
    this.Nombre = nombre;
    this.Descripcion = descripcion;
    this.DescCompleta = descCompleta;
    this.Imagen = imagen;
    this.ImagenBanner = imagenBanner;
    this.Certificado = certificado;
    this.Book= book;
    this.Video= video;
    this.Categoria = categoria;
    this.Activo= activo;
  }
  public Long getId() {
    return Id;
  }
  public String getNombre() {
    return Nombre;
  }

  public void setNombre(String nombre) {
    this.Nombre = nombre;
  }

  public String getDescripcion() {
    return Descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.Descripcion = descripcion;
  }
  public Categoria getCategoria() {
    return Categoria;
  }
  public String getImagen() {
    return Imagen;
  }

  public String getImagenBanner() {
    return ImagenBanner;
  }

  public String getCertificado() {
    return Certificado;
  }
  public String getVideo() {
    return Video;
  }
  public String getBook() {
    return Book;
  }
  public String getDescCompleta() {
    return DescCompleta;
  }



  public void setCategoria(Categoria categoria) {
    Categoria = categoria;
  }

  public Boolean getActivo() { return Activo;
  }
}
