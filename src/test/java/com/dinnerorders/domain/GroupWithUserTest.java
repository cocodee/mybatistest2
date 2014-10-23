package com.dinnerorders.domain;
import java.io.InputStream;
import java.math.BigDecimal;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;
public class GroupWithUserTest {
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
    	  GroupWithUser group = (GroupWithUser) session.selectOne("com.dinnerorders.dao.GroupWithUserMapper.selectByPrimaryKey", new Integer(1));
    	  System.out.println(group.getUsers().size());
    	} finally {
    	  session.close();
    	}   	
    }
}
