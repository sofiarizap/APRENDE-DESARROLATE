package com.marketing.AprendeDesarrollate;

import com.marketing.AprendeDesarrollate.Enums.Categoria;
import com.marketing.AprendeDesarrollate.modulos.Productos;
import com.marketing.AprendeDesarrollate.repositorios.RepositorioProductos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AprendeDesarrollateApplication {

	public static void main(String[] args) {

		SpringApplication.run(AprendeDesarrollateApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(RepositorioProductos repositorioProductos){
		return (args) ->{

			Productos producto1 = new Productos("Curso Primeros Auxilios para Perros y Gatos","Aprende todo para brindar la ayuda necesaria a tu mascota en incidentes urgentes.","./assests/imagenes/PRIMEROS AUXILIOS.png", "./assests/imagenes/bannercadoComidaVegana.JPG","./assests/imagenes/certificadoComidaVegana.png","",Categoria.ANIMALES, true);
			Productos producto2 = new Productos("Curso Cocina Vegana","Aprende diversas preparaciones para una alimentación mas consciente.","./assests/imagenes/COCINA VEGANA.png","./assests/imagenes/bannercadoComidaVegana.JPG","./assests/imagenes/certificadoComidaVegana.png","", Categoria.COMIDA, true);
			Productos producto3 = new Productos("Curso Cocina Internacional ","Aprende las mejores recetas de la gastronomia internacional de países como Francia, India, Italia, Mexico, entre muchos mas. ","./assests/imagenes/COCINA INTERNACIONAL.png","./assests/imagenes/bannercadoComidaVegana.JPG","./assests/imagenes/certificadoComidaVegana.png","", Categoria.COMIDA, true);
			Productos producto4 = new Productos("Curso Velas Artesanales","Aprende a desarrollar un hermoso arte con el cual puedes emprender tu propio negocio.","./assests/imagenes/CURSO VELAS.png","./assests/imagenes/bannercadoComidaVegana.JPG","./assests/imagenes/certificadoComidaVegana.png","", Categoria.MANUALIDADES, true);
			Productos producto5 = new Productos("Curso Bolsos Trapillo","Aprende desde cero el paso a paso para crear hermosos bolsos que pueden ayudarte a emprender tu propio negocio.","./assests/imagenes/BOLSO TRAPILLO.png","./assests/imagenes/bannercadoComidaVegana.JPG","./assests/imagenes/certificadoComidaVegana.png","", Categoria.MANUALIDADES, true);
			repositorioProductos.save(producto1);
			repositorioProductos.save(producto2);
			repositorioProductos.save(producto3);
			repositorioProductos.save(producto4);
			repositorioProductos.save(producto5);
		};
	}
}
