package org.sid.dao;

import java.util.List;

import org.sid.entities.Parameters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ParametersRepository extends JpaRepository<Parameters,Long>{
@Query("select p from Parameters p where p.codeBank=:x")
public List<Parameters>getParams(@Param("x") int codeBank);
}
