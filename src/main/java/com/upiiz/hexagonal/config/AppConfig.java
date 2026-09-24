package com.upiiz.hexagonal.config;

import com.upiiz.hexagonal.infraestructure.out.persistence.CategoriaRepositoryJpa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.upiiz.hexagonal.application.CategoriaService;
import com.upiiz.hexagonal.domain.ports.in.CategoriaUseCase;
import com.upiiz.hexagonal.domain.ports.out.CategoriaRespository;
import com.upiiz.hexagonal.infraestructure.out.persistence.CategoriaRepositoryImpl;

@Configuration
public class AppConfig {
    // Frijolitos que se van a comer
    // Instancias que la app va a usar

    // Puerto de salida - BD
    /*private final CategoriaRepositoryJpa categoriaRepositoryJpa;

    AppConfig(CategoriaRepositoryJpa categoriaRepositoryJpa) {
        this.categoriaRepositoryJpa = categoriaRepositoryJpa;
    }

    @Bean
    public CategoriaRespository categoriaRespository(){
        return new CategoriaRepositoryImpl(categoriaRepositoryJpa);
    }
    */
   
    // Puerto de entrada - Rest
    @Bean
    public CategoriaUseCase categoriaUseCase(CategoriaRespository categoriaRespository){
        return new CategoriaService(categoriaRespository);
    }
}
