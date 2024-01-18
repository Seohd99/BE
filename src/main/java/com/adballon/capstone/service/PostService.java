package com.adballon.capstone.service;

import com.adballon.capstone.domain.Post;
import com.adballon.capstone.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    /**
     * 전체 조회
     * @return 게시글 리스트
     */
    public List<Post> postList(){
        return postRepository.findAll();
    }

    /**
     * 단건 조회
     * @param id
     * @return id에 해당하는 게시글 상세정보
     */
    public Optional<Post> postInfo(String id){
        //Join해서 여러 정보를 가져와야 하지 않나?
        return postRepository.findById(id);
    }

}