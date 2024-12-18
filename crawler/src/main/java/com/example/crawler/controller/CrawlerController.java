package com.example.crawler.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.crawler.dto.CrawlerDTO;
import com.example.crawler.service.CrawlerService;

@Controller
public class CrawlerController {

    private final CrawlerService crawlerService;

    public CrawlerController(CrawlerService crawlerService) {
        this.crawlerService = crawlerService;
    }
    
    @GetMapping("/")
    public String getCrawler(Model model) {
        List<CrawlerDTO> crawlerList = crawlerService.fetchCrawler();
        model.addAttribute("crawlerList", crawlerList);
        return "index";
    }
    
	// 일정알람 (평일 4시)
    @Scheduled(cron = "0 0 16 * * MON-FRI")
	private void scheduleCrawler() {
	    try {
	        List<CrawlerDTO> crawlerList = crawlerService.fetchCrawler();
	        for (CrawlerDTO dto : crawlerList) {
	            crawlerService.insertCrawler(dto.topStock());
	        }
	    } catch (Exception e) {
	    	System.err.println("크롤링 데이터 저장 중 문제가 발생했습니다: " + e.getMessage());
	        e.printStackTrace();
	    }
	}

}
