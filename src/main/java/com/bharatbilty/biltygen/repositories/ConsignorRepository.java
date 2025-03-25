package com.bharatbilty.biltygen.repositories;

import com.bharatbilty.biltygen.models.Consignor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "consignors")
public interface ConsignorRepository extends JpaRepository<Consignor, Long> { }

