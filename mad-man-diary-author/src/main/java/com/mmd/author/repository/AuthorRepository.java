package com.mmd.author.repository;

import com.mmd.author.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author xch
 * @description
 * @date 2020-05-06
 */
public interface AuthorRepository extends JpaRepository<Author, Integer>, JpaSpecificationExecutor {
}
