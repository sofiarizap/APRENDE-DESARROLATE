package com.marketing.AprendeDesarrollate.DTOS;

import com.marketing.AprendeDesarrollate.Enums.Categoria;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.marketing.AprendeDesarrollate.Enums.Categoria;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.*;

  @Entity
  public class ProductosDTO {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long Id;
    private String Nombre;
    private String Descripcion;
    private String Imagen;
    private com.marketing.AprendeDesarrollate.Enums.Categoria Categoria;
    private Boolean Activo;

    public ProductosDTO() { }

    public ProductosDTO(String nombre, String descripcion,String imagen, Categoria categoria, Boolean activo ) {
      this.Nombre = nombre;
      this.Descripcion = descripcion;
      this.Imagen = imagen;
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

    public void setCategoria(Categoria categoria) {
      Categoria = categoria;
    }
}

