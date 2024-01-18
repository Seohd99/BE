package com.adballon.capstone.service;

import com.adballon.capstone.domain.Block;
import com.adballon.capstone.repository.BlockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BlockService {
    private final BlockRepository blockRepository;

    //차단 추가
    public void blockUpdate(String id, String target){
        blockRepository.updateByIdAndTargetId(id, target);
    }

    //차단 삭제
    public void blockCancel(String id, String target){
        blockRepository.deleteByIdAndTargetId(id, target);
    }

    //차단 리스트
    public List<Block> blockList(String id){
        return blockRepository.findAllById(id);
    }

}
