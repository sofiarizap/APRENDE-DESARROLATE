package com.marketing.AprendeDesarrollate.DTOS;

import com.marketing.AprendeDesarrollate.Enums.Categoria;
import com.marketing.AprendeDesarrollate.modulos.Productos;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Optional;

@Entity
  public class ProductosDTO {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long Id;
    private String Nombre;
    private String Descripcion;
    private String Imagen;
    private String ImagenBanner;
    private String Certificado;
    private String Video;
    private com.marketing.AprendeDesarrollate.Enums.Categoria Categoria;
    private Boolean Activo;

    public ProductosDTO() { }

    public ProductosDTO(Productos productos ) {
      this.Id = productos.getId();
      this.Nombre = productos.getNombre();
      this.Descripcion = productos.getDescripcion();
      this.Imagen = productos.getImagen();
      this.ImagenBanner = productos.getImagenBanner();
      this.Certificado = productos.getCertificado();
      this.Video = productos.getVideo();
      this.Categoria = productos.getCategoria();
      this.Activo= productos.getActivo();
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

    public void setCategoria(Categoria categoria) {
      Categoria = categoria;
    }
    public String getImagenBanner() {
    return ImagenBanner;
  }
    public String getImagen() {
    return Imagen;
  }
    public String getCertificado() {
      return Certificado;
    }
    public String getVideo() {
      return Video;
    }
}

