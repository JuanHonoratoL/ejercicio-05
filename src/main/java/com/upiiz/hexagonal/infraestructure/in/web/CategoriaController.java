package com.upiiz.hexagonal.infraestructure.in.web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upiiz.hexagonal.domain.models.Categoria;
import com.upiiz.hexagonal.domain.ports.in.CategoriaUseCase;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
@RequestMapping("api/v1/categorias") // http://api.soriana.com/v1/categorias
public class CategoriaController {
    // Traer los casos de uso - implementados en application
    private final CategoriaUseCase categoriaUseCase;

    public CategoriaController(final CategoriaUseCase categoriaUseCase){
        this.categoriaUseCase = categoriaUseCase;
    }

    @GetMapping
    public List<Categoria> getCategortias(){
        return  null;
    }

    @GetMapping("/{id}")
    public Categoria getCategoria(@PathVariable Long id){
        return categoriaUseCase.buscarPorId(id);
    }

    // Request DTO
    @PostMapping
    public Categoria createCategoria(@RequestBody final Categoria categoria) {
        // Response DTO
        return categoriaUseCase.registrar(categoria);
    }

    // Request DTO
    @PutMapping("/{id}")
    public Categoria updateCategoria(@RequestBody Categoria categoria){
        // Response DTO 
        return categoriaUseCase.actualizar(categoria);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable final Long id){
        categoriaUseCase.eliminar(id);
    }
    
}
