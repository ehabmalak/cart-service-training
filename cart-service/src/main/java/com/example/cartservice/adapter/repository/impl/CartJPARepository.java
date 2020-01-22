package com.example.cartservice.adapter.repository.impl;

import com.example.cartservice.adapter.repository.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartJPARepository extends JpaRepository<CartEntity,String> {
}
