package com.adballon.capstone.repository;

import com.adballon.capstone.domain.Pick;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface PickRepository extends JpaRepository<Pick, String> {
    
    //찜 리스트
    List<Pick> findAllById(String id);
}
