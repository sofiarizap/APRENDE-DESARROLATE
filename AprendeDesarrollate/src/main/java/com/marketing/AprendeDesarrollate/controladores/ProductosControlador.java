package com.marketing.AprendeDesarrollate.controladores;

import com.marketing.AprendeDesarrollate.DTOS.ProductosDTO;
import com.marketing.AprendeDesarrollate.modulos.Productos;
import com.marketing.AprendeDesarrollate.repositorios.RepositorioProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductosControlador {

  @Autowired
  private RepositorioProductos repositorioProductos;

  @RequestMapping("/productos")
  public List<Productos> getAll() {
    return repositorioProductos.findAll();
  }

  @GetMapping("/accounts/{id}")
  public ProductosDTO getAccount(@PathVariable Long id){
    return new ProductosDTO(repositorioProductos.findById(id)) ;
  }

}
