package com.adballon.capstone.service;

import com.adballon.capstone.domain.Pay;
import com.adballon.capstone.repository.PayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
@RequiredArgsConstructor
public class PayService{
    private final PayRepository payRepository;

//    @Autowired
//    OrderRepository orderRepository;

    /**
     * 결제내역
     * @param id
     * @return 결제내역 리스트
     */
    public List<Pay> payList(String id){
        return payRepository.findAllById(id);
    }

    /**
     * 결제상세
     * @param id
     * @return 결제 상세정보
     */
    public Optional<Pay> payInfo(String id){
        return payRepository.findById(id);
    }

    //결제 요청
    public void payOrder(Pay data){

    }
}
