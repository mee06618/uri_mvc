package com.jhs.exam.exam2.container;

import com.jhs.exam.exam2.http.controller.SiteConvertController;
import com.jhs.exam.exam2.http.controller.UsrArticleController;
import com.jhs.exam.exam2.repository.ArticleRepository;
import com.jhs.exam.exam2.repository.SiteRepository;
import com.jhs.exam.exam2.service.ArticleService;
import com.jhs.exam.exam2.service.SiteService;

public class Container {
	public static ArticleRepository articleRepository;
	
	public static ArticleService articleService;
	
	public static UsrArticleController usrArticleController;
	
	public static SiteRepository siteRepository;
	
	public static SiteService siteService;
	
	public static SiteConvertController siteConvertController;
	
	public static void init() {
		articleRepository = new ArticleRepository();
		articleService = new ArticleService();
		usrArticleController = new UsrArticleController();
		
		siteRepository = new SiteRepository();
		siteService = new SiteService();
		siteConvertController = new SiteConvertController();
	}
}
