package com.adballon.capstone.service;

import com.adballon.capstone.domain.Follow;
import com.adballon.capstone.repository.FollowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FollowService {
    private final FollowRepository followRepository;


    /**
     * 팔로우 하기
     * @param data
     */
    public void follow(Follow data){
        followRepository.save(data);
    }

    /**
     * 팔로잉 리스트
     * @param id
     * @return 팔로잉 리스트
     */
    public List<Follow> followingList(String id){
        return followRepository.findAllById(id);
    }
    /**
     * 팔로워 리스트
     * @param id
     * @return 팔로워 리스트
     */
    public List<Follow> followerList(String id){
        return followRepository.findByTargetId(id);
    }

    /**
     * 팔로잉 수
     * @param id
     * @return 팔로잉 수
     */
    public Long countFollowing(String id){
        return followRepository.countByFollowing(id);
    }
    
    /**
     * 내 팔로워 수
     * @param id
     * @return 내 팔로워 수
     */
    public Long countFollower(String id){
        return followRepository.countByFollower(id);
    }
}
