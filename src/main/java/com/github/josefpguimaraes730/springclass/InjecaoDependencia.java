package com.github.josefpguimaraes730.springclass;

import com.github.josefpguimaraes730.springclass.todos.entity.TodoEntity;
import com.github.josefpguimaraes730.springclass.todos.repository.TodoRepository;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaMetamodelEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.SQLException;


public class InjecaoDependencia {

    //Este exemplo nao e funional, somente para mostrar todos os passos que sao suprimidos ao utilizar @Component e @Autowired annotation
    public static void main(String[] args) throws SQLException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("url");
        dataSource.setUsername("username");
        dataSource.setPassword("password");

        Connection connection = dataSource.getConnection();

        //Necessita EntityManagerFactory
        EntityManager entityManager = null;

        JpaEntityInformation<TodoEntity, Long> entityInformation = new JpaMetamodelEntityInformation<>(TodoEntity.class, entityManager.getMetamodel(), null);
        SimpleJpaRepository<TodoEntity, Integer> simpleRepo = new SimpleJpaRepository<TodoEntity, Integer>(entityInformation, entityManager);
        //Casting 'simpleRepo' to 'TodoRepository' will produce 'ClassCastException' for any non-null value
        TodoRepository repository = (TodoRepository) simpleRepo;
    }
}
