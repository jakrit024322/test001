package nvc.it.test0001.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.test0001.model.Category;

public interface CategoryRepository  extends JpaRepository<Category,Integer>{
    
}
