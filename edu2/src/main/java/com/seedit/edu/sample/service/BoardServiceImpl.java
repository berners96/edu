package com.seedit.edu.sample.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seedit.edu.sample.dao.BoardDAO;
import com.seedit.edu.sample.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {

	Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BoardDAO boardDAO;

	@Override
	public List<BoardDTO> getBoardList(BoardDTO boardDto) throws Exception {

		return boardDAO.getBoardList(boardDto);
	}

	@Override
	public void insertBoard(BoardDTO boardDto) throws Exception {

		boardDAO.insertBoard(boardDto);

	}

	@Override
	public Map<String, Object> selectBoardDetail(BoardDTO boardDto) throws Exception {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		String searchType = boardDto.getSearchType();

		if ("S".equals(searchType)) {
			int updateHitCnt = boardDAO.updateHitCnt(boardDto);

			if (updateHitCnt > 0) {
				resultMap = boardDAO.selectBoardDetail(boardDto);
			}
		} else {
			resultMap = boardDAO.selectBoardDetail(boardDto);
		}
		return resultMap;
	}

	@Override
	public BoardDTO updateBoard(BoardDTO boardDto) throws Exception {

		BoardDTO boardDTO = new BoardDTO();

		int updateCnt = boardDAO.updateBoard(boardDto);

		if (updateCnt > 0) {
			boardDTO.setResult("SUCCESS");
			boardDTO.setCallBackId("updateBoard");
		} else {
			boardDTO.setResult("FAIL");
		}

		return boardDTO;
	}

	@Override
	public BoardDTO deleteBoard(BoardDTO boardDto) throws Exception {

		BoardDTO boardDTO = new BoardDTO();

		int deleteCnt = boardDAO.deleteBoard(boardDto);

		if (deleteCnt > 0) {
			boardDTO.setResult("SUCCESS");
			boardDTO.setCallBackId("deleteBoard");
		} else {
			boardDTO.setResult("FAIL");
		}

		return boardDTO;
	}

}
