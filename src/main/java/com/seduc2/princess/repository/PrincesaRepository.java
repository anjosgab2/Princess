package com.seduc2.princess.repository;

import com.seduc2.princess.entity.Princesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrincesaRepository extends JpaRepository<Princesa, Integer> {
}
