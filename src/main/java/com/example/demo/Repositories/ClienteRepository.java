package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.ClienteEntity;

@Repository
@EnableJpaRepositories
// extends JpaRepository<, Integer>
public interface ClienteRepository {

}
