package com.mmd.book.repository;

import com.mmd.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author xch
 * @description
 * @date 2020-05-06
 */
public interface BookRepository extends JpaRepository<Book, Integer>, JpaSpecificationExecutor {

}
