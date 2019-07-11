package com.myframework.board.model.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.myframework.board.model.domain.Board2;

import mybatis.config.MybatisConfigManager;

public class Board2DAO {
	MybatisConfigManager configManager=MybatisConfigManager.getInstance();
	
	public int insert(Board2 board2) {
		int result=0;
		SqlSession sqlSession=configManager.getSqlSession();
		result=sqlSession.insert("Board2.insert",board2);
		sqlSession.commit();
		configManager.freeSession(sqlSession);
		return result;
	}
	//모든 레코드 가져오기
	public List selectAll() {
		List list=null;
		SqlSession sqlSession=configManager.getSqlSession();
		list=sqlSession.selectList("Board2.selectAll");
		configManager.freeSession(sqlSession);
		return list;
	}
	//1건의 레코드가져오기
	public Board2 select(int board2_id) {
		Board2 board2=null;
		SqlSession sqlSession=configManager.getSqlSession();
		board2=sqlSession.selectOne("Board2.select",board2_id);
		configManager.freeSession(sqlSession);
		return board2;
	}
	
	public int delete(int board2_id) {
		int result=0;
		SqlSession sqlSession=configManager.getSqlSession();
		result=sqlSession.delete("Board2.delete",board2_id);
		sqlSession.commit();
		configManager.freeSession(sqlSession);
		return result;
	}
	
	//수정
	public int update(Board2 board2) {
		int result=0;
		SqlSession sqlSession = configManager.getSqlSession();
		result=sqlSession.update("Board2.update",board2);
		sqlSession.commit();
		configManager.freeSession(sqlSession);
		return result;
	}
}
