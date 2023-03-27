package com.homework.homework.homedao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homework.homework.home.Home;

import java.util.List;
import java.util.Optional;

@Repository
public interface HomeDao extends JpaRepository<Home,Long>{
    List<Home> findByShipperId(String shipperId);
    Optional<Home> findById(long id);
}