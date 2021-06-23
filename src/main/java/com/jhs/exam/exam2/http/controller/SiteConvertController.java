package com.jhs.exam.exam2.http.controller;

import java.util.List;

import com.jhs.exam.exam2.container.Container;
import com.jhs.exam.exam2.dto.Article;
import com.jhs.exam.exam2.dto.ResultData;
import com.jhs.exam.exam2.http.Rq;
import com.jhs.exam.exam2.service.ArticleService;
import com.jhs.exam.exam2.service.SiteService;
import com.jhs.exam.exam2.util.Ut;

public class SiteConvertController extends Controller {
	private SiteService siteService = Container.siteService;

	@Override
	public void performAction(Rq rq) {
		switch (rq.getActionMethodName()) {
		case "a":
			actionConvertSite(rq);
			break;

		default:
			rq.println("존재하지 않는 페이지 입니다.");
			break;
		}
	}

	
	
	private void actionConvertSite(Rq rq) {
		String originUri = rq.getParam("originUri", "");
		
		String shortCode= siteService.getShortCode(originUri);
		if(siteService.checkOrigin(originUri)==1) {
			rq.jsp("index");
		}
		//siteService.convertSite(originUri,shortCode);
		rq.setAttr("shortCode", shortCode);
		rq.jsp("index");
	}
}
