package com.study.board.Service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepositoty boardRepositoty;
    public void write(Board board) {
        boardRepositoty.save(board);
    }

    public List<Board> boardList() {
        return boardRepositoty.findAll();
    }
}
