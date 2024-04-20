package com.company.varnaa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

public interface ContactUsRepository extends JpaRepository<contactus,Id > {

}
