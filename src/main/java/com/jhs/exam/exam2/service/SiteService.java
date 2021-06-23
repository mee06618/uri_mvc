package com.jhs.exam.exam2.service;

import java.util.List;

import com.jhs.exam.exam2.container.Container;
import com.jhs.exam.exam2.dto.Article;
import com.jhs.exam.exam2.dto.ResultData;
import com.jhs.exam.exam2.repository.SiteRepository;
import com.jhs.exam.exam2.util.*;

public class SiteService {
	private SiteRepository siteRepository = Container.siteRepository;

	public int convertSite(String originUri, String shortCode,String text,String blanklessText) {
		
		int row = siteRepository.convertUri(originUri, shortCode, text, blanklessText);

		return row;
	}

	public String getShortCode(String originUri) {
		random ran = new random();
		String shortCode=ran.getRand();
		
		while(siteRepository.constrantCode(shortCode)!=0) {
			shortCode=ran.getRand();
		}
		
		return shortCode;
	}

	public int checkOrigin(String originUri) {
		
	
		
		return siteRepository.CountOriginUri(originUri);
	}




}
