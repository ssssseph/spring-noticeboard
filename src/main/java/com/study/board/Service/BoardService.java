package com.study.board.Service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class BoardService {

    
    @Autowired
    private BoardRepositoty boardRepositoty;
    
    //글 작성 처리
    public void write(Board board) {
        boardRepositoty.save(board);
    }

    // 게시글 리크트 처리
    public Page<Board> boardList(Pageable pageable) {
        return boardRepositoty.findAll(pageable);
    }
    
    //특정 게시글 불러오기
    public Board boardView(Integer id) {
        return boardRepositoty.findById(id).get();
    }

    //특정 게시글 삭제
    public void boardDelete(Integer id) {
        boardRepositoty.deleteById(id);
    }
}
