package com.dev5ops.healthtart.rival.controller;

import com.dev5ops.healthtart.rival.domain.dto.RivalDTO;
import com.dev5ops.healthtart.rival.domain.dto.RivalUserInbodyDTO;
import com.dev5ops.healthtart.rival.domain.vo.response.ResponseRivalVO;
import com.dev5ops.healthtart.rival.service.RivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rival")
public class RivalController {

    private RivalService rivalService;

    @Autowired
    public RivalController(RivalService rivalService) {
        this.rivalService = rivalService;
    }

    @GetMapping
    public ResponseEntity<ResponseRivalVO> findRivalMatch(){
        RivalDTO rival = rivalService.findRivalMatch();

        ResponseRivalVO responseRivalVO = new ResponseRivalVO(
                rival.getRivalMatchCode(),
                rival.getUserCode(),
                rival.getRivalUserCode()
        );

        return ResponseEntity.ok().body(responseRivalVO);
    }

    // 2. 선택한 라이벌 조회하는 기능
    @GetMapping("/{rivalusercode}")
    public ResponseEntity<List<RivalUserInbodyDTO>> findRival(@PathVariable String rivalusercode){

        List<RivalUserInbodyDTO> meAndRivalUserInbodyList = rivalService.findRival(rivalusercode);

        return ResponseEntity.ok().body(meAndRivalUserInbodyList);
    }

    // 3. 선택한 라이벌 삭제
    @DeleteMapping("/{rivalMatchCode}")
    public ResponseEntity<String> deleteRival(@PathVariable Long rivalMatchCode){

        rivalService.deleteRival(rivalMatchCode);

        return ResponseEntity.ok().body("삭제가 완료되었습니다.");
    }

    // 4. 선택한 유저 라이벌 등록
    @PostMapping("/{rivalUserCode}")
    public ResponseEntity insertRival(@PathVariable String rivalUserCode){
        RivalDTO rivalDTO = rivalService.insertRival(rivalUserCode);

        return ResponseEntity.ok().body(rivalDTO);
    }
}
