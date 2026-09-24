package com.upiiz.hexagonal.infraestructure.out.persistence;

import java.util.List;

import org.springframework.stereotype.Component;

import com.upiiz.hexagonal.domain.models.Categoria;
import com.upiiz.hexagonal.domain.ports.out.CategoriaRespository;
// Para no usar bean manual
    @Component 
public class CategoriaRepositoryImpl implements CategoriaRespository{
    private final CategoriaRepositoryJpa categoriaRepositoryJpa;

    public CategoriaRepositoryImpl(CategoriaRepositoryJpa categoriaRepositoryJpa){
        this.categoriaRepositoryJpa = categoriaRepositoryJpa;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Categoria> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Categoria findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Categoria save(Categoria categoria) {
        CategoriaEntity categoriaEntity = new CategoriaEntity(null, categoria.getDescripcion());
        CategoriaEntity categoriaGuardada = categoriaRepositoryJpa.save(categoriaEntity);
        return new Categoria(categoriaGuardada.getId(), categoriaGuardada.getDescripcion());
    }

    @Override
    public Categoria update(Categoria categoria) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
