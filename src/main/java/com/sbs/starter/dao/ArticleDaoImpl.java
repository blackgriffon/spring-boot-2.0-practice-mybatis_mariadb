package com.sbs.starter.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sbs.starter.dto.Article;

@Component //이렇게 해야 Autowired에 의한 연결에 적용된다.(ArticleServiceImpl에서 선언한)
public class ArticleDaoImpl implements ArticleDao {

	public List<Article> getList()
	{
		Article article1 = new Article(1, "2019-08-20 12:12:12", "제목1", "내용1");
		Article article2 = new Article(2, "2019-08-21 12:12:13", "제목2", "내용2");
		Article article3 = new Article(3, "2019-08-22 12:12:14", "제목3", "내용3");
		
		
		List<Article> list = new ArrayList<>();
		
		list.add(article1);
		list.add(article2);
		list.add(article3);		
		return list;
		
	}
	
}
