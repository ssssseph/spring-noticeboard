package com.study.board.controller;

import com.study.board.Service.BoardService;
import com.study.board.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardContorller {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write") //localhost:8080/board/write
    public String boardWriteForm() {
        return "boardwrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(Board board) {
        boardService.write(board);
        return "";
    }

    @GetMapping("/board/list")
    public String boarList(Model model) {
        model.addAttribute("list", boardService.boardList());

        return "boardlist";
    }

    @GetMapping("/board/view")
    public String boardview() {
        return "boardview";
    }
}
