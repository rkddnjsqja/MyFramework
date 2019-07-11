package com.myframework.board.model.domain;

public class Board2 {
	private int board2_id;
	private String title;
	private String writer;
	private String content;
	private String regdate;
	private int hit;
	
	public int getBoard2_id() {
		return board2_id;
	}
	public void setBoard2_id(int board2_id) {
		this.board2_id = board2_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
}
