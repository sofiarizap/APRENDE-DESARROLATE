package com.marketing.AprendeDesarrollate.controladores;

import com.marketing.AprendeDesarrollate.DTOS.ProductosDTO;
import com.marketing.AprendeDesarrollate.modulos.Productos;
import com.marketing.AprendeDesarrollate.repositorios.RepositorioProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.stream.Collectors;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductosControlador {

  @Autowired
  private RepositorioProductos repositorioProductos;

  @RequestMapping("/productos")
  public List<ProductosDTO> getAll() {
    return repositorioProductos.findAll().stream().map(producto -> new ProductosDTO(producto)).collect(Collectors.toList());
  }

  @GetMapping("/productos/{id}")
  public ProductosDTO getId(@PathVariable Long id){
    ProductosDTO Id = new ProductosDTO(repositorioProductos.findById(id).orElse(null));
    return Id;
  }

}
