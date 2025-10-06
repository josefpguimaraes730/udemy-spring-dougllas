package com.github.josefpguimaraes730.springclass.todos.repository;

import com.github.josefpguimaraes730.springclass.todos.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
//Com a annotation nao precisa do extend
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

}
