package org.sol.book.example;

public class MemberService {

	MemberDao memberDao;

	// Dependency Injection (DI) 의존성 주입
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void registerMember() {
		memberDao.getMember();
	}
}