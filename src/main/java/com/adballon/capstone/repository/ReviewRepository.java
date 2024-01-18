package com.adballon.capstone.repository;


import com.adballon.capstone.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ReviewRepository extends JpaRepository<Review, String> {
    //내가 쓴 리뷰내역
    List<Review> findAllById(String id);
    //나에게 달린 리뷰내역
    List<Review> findAllByTargetId(String id);
}
