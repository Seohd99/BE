package com.adballon.capstone.repository;

import com.adballon.capstone.domain.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface BlockRepository extends JpaRepository<Block,String> {
    //내가 차단한 리스트
    List<Block> findAllById(String id);

    //차단하기
    void updateByIdAndTargetId(String id, String targetId);

    //차단 삭제
    void deleteByIdAndTargetId(String id, String targetId);
}
