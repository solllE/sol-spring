package org.sol.book.chap07;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.sol.book.chap03.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * p.204 [리스트 8.13]를 Main과 Service로 분리한 Service 부분
 * 
 * @author Jacob
 */
@Service
public class MemberService {

	Logger logger = LogManager.getLogger();
	@Autowired
	MemberDao memberDao;

	/**
	 * memberDao setter for injection
	 */
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void selectAll() {
		List<Member> members = memberDao.selectAll(0, 100);
		logger.debug(members);
	}

	public void updateMember() {
		Member member = memberDao.selectByEmail("solE@naver.com");
		member.setPassword("basd");
		memberDao.update(member);
		logger.debug("Update complete.");
	}

	public void insertMember() {
		Member member = new Member();
		member.setEmail("solE@naver.com");
		member.setPassword("1234");
		member.setName("김솔이");
		memberDao.insert(member);
		logger.debug("Insert complete.");
	}
}