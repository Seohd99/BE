package com.adballon.capstone.repository;

import com.adballon.capstone.domain.Pay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface PayRepository  extends JpaRepository<Pay,String> {
    //결제내역
    List<Pay> findAllById(String id);
}