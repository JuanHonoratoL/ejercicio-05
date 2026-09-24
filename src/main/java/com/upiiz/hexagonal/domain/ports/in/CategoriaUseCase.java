package com.upiiz.hexagonal.domain.ports.in;

import java.util.List;

import com.upiiz.hexagonal.domain.models.Categoria;

// Interfaz - contratos - Puerto de entrada
public interface CategoriaUseCase {
    Categoria registrar(Categoria categoria);
    List<Categoria> listar();
    Categoria buscarPorId(Long id);
    Categoria actualizar(Categoria categoria);
    void eliminar(Long id);
}
