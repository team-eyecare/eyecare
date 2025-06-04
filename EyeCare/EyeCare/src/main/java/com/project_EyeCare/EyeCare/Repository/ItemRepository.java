package com.project_EyeCare.EyeCare.Repository;

import com.project_EyeCare.EyeCare.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ItemRepository extends JpaRepository<product, Integer>{

}
