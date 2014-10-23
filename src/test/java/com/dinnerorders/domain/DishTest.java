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

public class DishTest {
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
    	  Dish dish = new Dish();
    	  dish.setName("patatoes");
    	  dish.setDescription("patatoes");
    	  dish.setPrice(new BigDecimal(18));
    	  session.insert("com.dinnerorders.dao.DishMapper.insert",dish);
    	  System.out.println("Dish id: "+dish.getId());
    	  Dish dish1 = (Dish) session.selectOne("com.dinnerorders.dao.DishMapper.selectByPrimaryKey", dish.getId());
       	  Dish dish2 = (Dish) session.selectOne("com.dinnerorders.dao.DishMapper.selectByPrimaryKey", dish.getId());
    	  assertEquals(dish1,dish2);
    	} finally {
    	  session.close();
    	}   	
    }
}
