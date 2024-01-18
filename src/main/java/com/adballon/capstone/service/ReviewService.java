package com.adballon.capstone.service;

import com.adballon.capstone.domain.Review;
import com.adballon.capstone.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;

    /**
     * 내가 쓴 리뷰내역
     * @param id
     * @return 내가 쓴 리뷰내역
     */
    public List<Review> myReviewList(String id){
        return reviewRepository.findAllById(id);
    }

    /**
     * 내가 쓴 리뷰 추가/수정
     * @param data
     */
    public void reviewUpdate(Review data){
        reviewRepository.save(data);
    }

    /**
     * 내가 쓴 리뷰 삭제
     * @param data
     */
    public void reviewDelete(Review data){
        reviewRepository.delete(data);
    }


    /**
     * 남이 쓴 리뷰내역
     * @param id
     * @return 남이 쓴 리뷰내역
     */
    public List<Review> otherReviewList(String id){
        return reviewRepository.findAllByTargetId(id);
    }
    
}
