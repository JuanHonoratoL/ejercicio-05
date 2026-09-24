package com.upiiz.hexagonal.application;

import java.util.List;

import org.springframework.stereotype.Component;

import com.upiiz.hexagonal.domain.models.Categoria;
import com.upiiz.hexagonal.domain.ports.in.CategoriaUseCase;
import com.upiiz.hexagonal.domain.ports.out.CategoriaRespository;

public class CategoriaService implements CategoriaUseCase{
    private final CategoriaRespository categoriaRespository;


    public CategoriaService(CategoriaRespository categoriaRespository) {
        this.categoriaRespository = categoriaRespository;
    }

    @Override
    public Categoria actualizar(Categoria categoria) {
        return categoriaRespository.update(categoria);
    }

    @Override
    public Categoria buscarPorId(Long id) {
        return categoriaRespository.findById(id);
    }

    @Override
    public void eliminar(Long id) {
        categoriaRespository.delete(id);
        
    }

    @Override
    public List<Categoria> listar() {
        return categoriaRespository.findAll();
    }

    @Override
    public Categoria registrar(Categoria categoria) {
        // Validar que los datos estén correctos
        return categoriaRespository.save(categoria);
    }
}