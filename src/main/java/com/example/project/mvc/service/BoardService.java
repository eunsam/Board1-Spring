package com.example.project.mvc.service;

import com.example.project.mvc.domain.Board;
import com.example.project.mvc.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author eunsam
 */
@Service
public class BoardService {

    @Autowired
    private BoardRepository repository;

    //목록
    public List<Board> getList(){
        return repository.getList();
    }

    //하나 불러오기
    public Board get(int boardSeq){
        return repository.get(boardSeq);
    }

    //저장
    public int save(Board board){
        repository.save(board);
        return board.getBoardSeq();
    }

    //업데이트
    public void update(Board board){
        repository.update(board);
    }

    //삭제
    public void delete(int boardSeq){
        repository.delete(boardSeq);
    }
}

