package org.sid.dao;

import java.util.List;

import org.sid.entities.ProductParams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductParamsRepository extends JpaRepository<ProductParams,Long>{
@Query("select p from ProductParams p where p.bank=:x")
public List<ProductParams>getParams(@Param("x") String bank);
}
