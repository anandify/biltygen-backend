package com.bharatbilty.biltygen.repositories;

import com.bharatbilty.biltygen.models.Bilty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "bilties")
public interface BiltyRepository extends JpaRepository<Bilty, Long> { }

