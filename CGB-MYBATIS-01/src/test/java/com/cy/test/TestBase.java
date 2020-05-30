package com.cy.test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

public class TestBase {
	private SqlSessionFactory sqlSessionFactory ;
	@Before 
	public void init() throws Exception{
		String resource="mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void testSSF(){
		System.out.println(sqlSessionFactory);
	}
	@Test
	public void testConnection(){
		SqlSession session = sqlSessionFactory.openSession();
		Connection conn = session.getConnection();
		System.out.println(conn);
	}
}
