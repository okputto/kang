package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	private Long[] bnoArr = { 688149L, 688148L, 688147L, 688144L, 688143L };

	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;

	
	@Test
	public void testList2() {
		Criteria cri = new Criteria(2,10);
		
		//20L
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 20L);
		
		replies.forEach(reply -> log.info(reply));
	}
	
//	@Test
//	public void testList() {
//		Criteria cri = new Criteria();
//		
//		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[0]);
//		
//		replies.forEach(reply -> log.info(reply));
//	}
	
//	@Test
//	public void testUpdate() {
//		Long targetRno = 850L;
//		
//		ReplyVO vo = mapper.read(targetRno);
//		
//		vo.setReply("Update Reply ");
//		
//		int count = mapper.update(vo);
//		
//		log.info("UPDATE COUNT: " + count);
//		
//	}
//	@Test
//	public void testDelete() {
//		Long targetRno = 841L;
//		
//		mapper.delete(targetRno);
//	}
//	@Test
//	public void testRead() {
//		Long targetRno = 845L;
//		
//		ReplyVO vo = mapper.read(targetRno);
//		
//		log.info(vo);
//	}
//	@Test
//	public void testCreate() {
//		IntStream.rangeClosed(1,10).forEach(i -> {
//			ReplyVO vo = new ReplyVO();
//			
//			vo.setBno(bnoArr[i % 5]);
//			vo.setReply("댓글 테스트 " + i);
//			vo.setReplyer("replyer" + i);
//			
//			mapper.insert(vo);
//		});
//	}
	
//	@Test
//	public void testMapper() {
//		log.info(mapper);
//	}
	
}
