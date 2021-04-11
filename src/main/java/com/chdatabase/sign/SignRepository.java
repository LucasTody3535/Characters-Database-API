package com.chdatabase.sign;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.chdatabase.sign.models.SignModel;

@Component
public interface SignRepository extends CrudRepository<SignModel, Long>, JpaRepository<SignModel, Long>{

}
