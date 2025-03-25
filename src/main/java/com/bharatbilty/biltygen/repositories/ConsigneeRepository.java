package com.bharatbilty.biltygen.repositories;

import com.bharatbilty.biltygen.models.Consignee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "consignees")
public interface ConsigneeRepository extends JpaRepository<Consignee, Long> { }
