package com.adballon.capstone.repository;

import com.adballon.capstone.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface PostRepository extends JpaRepository<Post, String> {
    //Spring Data JPA가 제공하는 공통 인터페이스만으로 충분하다.
}
