package com.example.crawler.controller;

import java.util.List;

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
}
