package com.project_EyeCare.EyeCare.Repository;

import com.project_EyeCare.EyeCare.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ItemRepository extends JpaRepository<Product, Integer>{

}
