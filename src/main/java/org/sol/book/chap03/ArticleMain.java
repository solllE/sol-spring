package org.sol.book.chap03;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap02.xml");
		ArticleService articleService = ctx.getBean("articleService", org.sol.book.chap03.ArticleService.class);
		MemberService memberService = ctx.getBean("memberService", org.sol.book.chap03.MemberService.class);

		articleService.addArticle();
		memberService.registerMember();

		ctx.close();
	}

}