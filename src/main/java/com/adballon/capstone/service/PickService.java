package com.adballon.capstone.service;

import com.adballon.capstone.domain.Pick;
import com.adballon.capstone.repository.PickRepository;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PickService {
    private final PickRepository pickRepository;

    /**
     * 찜 리스트
     * @return 찜 리스트
     */
    public List<Pick> pickList(String id){
        return pickRepository.findAllById(id);
    }

    /**
     * 찜 추가
     * @param data
     */
    public void pickUpdate(Pick data){
        pickRepository.save(data);
    }

    /**
     * 찜 삭제
     * @param data
     */
    public void pickCancel(Pick data){
        pickRepository.delete(data);
    }
}
