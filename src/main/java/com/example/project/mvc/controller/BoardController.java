package com.example.project.mvc.controller;

import com.example.project.mvc.domain.Board;
import com.example.project.mvc.repository.BoardRepository;
import com.example.project.mvc.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    //목록
    @GetMapping
    public List<Board> getList() {
        return boardService.getList();
    }

    //하나 불러오기
    @GetMapping("/{boardSeq}")
    public Board get(@PathVariable int boardSeq) {
        return boardService.get(boardSeq);
    }

    //저장
    @GetMapping("/save")
    public int save(Board board) {
        return boardService.save(board);
    }

    //삭제
    @GetMapping("/delete/{boardSeq}")
    public void delete(@PathVariable int boardSeq) {
        boardService.delete(boardSeq);
    }
}
