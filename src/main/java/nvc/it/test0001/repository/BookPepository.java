package nvc.it.test0001.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.test0001.model.Book;

public interface BookPepository extends JpaRepository<Book, Integer>{
    
}
