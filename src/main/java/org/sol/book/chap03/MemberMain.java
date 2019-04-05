package org.sol.book.chap03;

public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService();
		regService.setMemberDao(memberDao);

		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("qufrhdwn1111@naver.com");
		req.setPassword("958401");
		req.setName("solE");

		// 회원 등록
		regService.regist(req);
	}
}