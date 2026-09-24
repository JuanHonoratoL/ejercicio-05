package com.upiiz.hexagonal.domain.ports.out;

import java.util.List;
// Interfaz - contrato - Puerto Salida - Infraestructura
import com.upiiz.hexagonal.domain.models.Categoria;

public interface CategoriaRespository {
    Categoria save(Categoria categoria);
    Categoria findById(Long id);
    List<Categoria> findAll();
    Categoria update(Categoria categoria);
    void delete(Long id);
}
