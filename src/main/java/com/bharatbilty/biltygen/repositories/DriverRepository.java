package com.bharatbilty.biltygen.repositories;

import com.bharatbilty.biltygen.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "drivers")
public interface DriverRepository extends JpaRepository<Driver, Long> { }
