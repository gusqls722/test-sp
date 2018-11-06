package com.test.sp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.sp.dao.TtInfoDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TtInfoTest {

	@Autowired
	private TtInfoDAO tidao;
	@Test
	public void listTest() {
		assertEquals(3, tidao.getTtInfoList().size());
	}
	
	@Test
	public void objTest() {
		assertNotNull(tidao.getTtInfo(1));
	}
}
