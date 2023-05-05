package com.marketing.AprendeDesarrollate.repositorios;

import com.marketing.AprendeDesarrollate.modulos.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public  interface RepositorioProductos  extends JpaRepository <Productos,Long> {


}
