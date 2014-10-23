package com.dinnerorders.domain;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;


public class UserTest{
    /**
     * Rigourous Test :-)
     */
	private static String resource = "com/dinnerorders/config/mybatis-config.xml";
	private static SqlSessionFactory sqlSessionFactory;
	@BeforeClass
	public static void setUp() throws Exception{
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);		
	}
    @Test
    public void testApp()
    {
    	SqlSession session = sqlSessionFactory.openSession();
    	try {
    	  User user = (User) session.selectOne("com.dinnerorders.dao.UserMapper.selectByPrimaryKey", new Integer(1));
    	  System.out.println(user.getFirstName()+' '+user.getLastName());
    	  List<User> users = session.selectList("com.dinnerorders.dao.UserMapper.selectAll");
    	  System.out.println(users.size());
    	} finally {
    	  session.close();
    	}   	
    }
}
