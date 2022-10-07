package com.usa.misiontic.proyectoalquilercomputer.repository.crudRepository;

import com.usa.misiontic.proyectoalquilercomputer.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product,Integer> {
}
