package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.SignupVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

public class Signuptests {
	@Setter(onMethod_ = @Autowired)
	SignupDAO mapper;
	
	@Test
	public void testinsertMember() {
		SignupVO vo = new SignupVO();
		vo.setUsername("gkaqhfk");
		vo.setPassword("1234");
		vo.setTel("010-0000-0000");
		vo.setIntroducetext("gkgkgk");
		
		mapper.insertMember(vo);
		
		log.info(vo);
	}
}
