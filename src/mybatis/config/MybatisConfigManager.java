package mybatis.config;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



/*
 * Mybatis �����ӿ��� �����ڰ� JDBC��ü�� ������ �����Ͽ�
 * �ڵ带 �ۼ��ϴ� ��ĺ��ٴ�xml�� �̿��Ͽ� �������� �����Ҽ� �ֵ������ش�.
 * ���� mybatis�� �̿��� ��� ���̻�Connection,PreparedStatement,ResultSet ���� JDBC API�� ���� ������ �ʿ䰡����
 * �׳� �������� ���ؼ� SqlSession��ü�� ���.
 * 
 * */
public class MybatisConfigManager {
	
	private static MybatisConfigManager instance;
	SqlSessionFactory sqlSessionFactory;
	InputStream inputStream;
	
	private MybatisConfigManager() {
		try {
			String resource = "mybatis/config/mybatis-config.xml";
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static MybatisConfigManager getInstance() {
		if (instance == null) {
			instance = new MybatisConfigManager();
		}
		return instance;
	}
	
	//mybatis�� ������ ���� ��ü�� SqlSession 1���� Factory�κ��� ��ȯ!!
	public SqlSession getSqlSession() {
		SqlSession sqlSession =null;
		sqlSession=sqlSessionFactory.openSession();
		return sqlSession;
	}
	//��ȯ�ϱ�
	public void freeSession(SqlSession sqlSession) {
		sqlSession.close();
	}
}
