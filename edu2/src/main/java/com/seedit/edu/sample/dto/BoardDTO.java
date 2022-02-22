package com.seedit.edu.sample.dto;

import java.util.Date;

import lombok.Data;

/**
 * ===============[ Type ]===============
 * @파일명:BoardDTO.java
 * @작성일자:2022. 2. 16.
 * @작성자: Kim Doyoon
 * @프로젝트이름:edu2
 * @프로그램설명:
 * @변경이력:
 * ===============[ SeedIT ]===============
 */

@Data
public class BoardDTO {

	int boardSeq;
	int boardReRef;
	int boardReLev;
	int boardReSeq;
	String boardWriter;
	String boardSubject;
	String boardContent;
	int boardHits;
	String delYn;
	String insUserId;
	Date insDate;
	String updUserId;
	Date updDate;

	String result;
	String callBackId;
	String searchType;
}
