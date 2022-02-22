package com.seedit.edu.common.staticValue;

public enum BoardUINameEnum {
	/**
	 * BOARD_WRITE JSP FILE
	 */
	JSP_BOARD_WRITE("sample/boardWrite"),
	/**
	 * BOARD_LIST_JSP FILE
	 */
	JSP_BOARD_LIST("sample/boardList"),

	/**
	 * BOARD_DETAIL JSP FILE
	 */
	JSP_BOARD_DETAIL("sample/boardDetail"),

	/**
	 * BOARD_UPDATE JSP FILE
	 */
	JSP_BOARD_UPDATE("sample/boardUpdate");

	private String jspFileName;

	BoardUINameEnum(String code) {
		this.jspFileName = code;
	}

	public String getJSPFileName() {
		return this.jspFileName;
	}
}
