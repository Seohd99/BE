package com.adballon.capstone.repository;

import com.adballon.capstone.domain.Follow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface FollowRepository extends JpaRepository<Follow, String> {

    //팔로잉 리스트
    List<Follow> findAllById(String id);

    //팔로워 리스트
    List<Follow> findByTargetId(String id);

    //단건 조회
    Follow findOne(String id);

    //팔로잉 수
    Long countByFollowing(String id);
    //팔로워 수
    Long countByFollower(String id);

}
