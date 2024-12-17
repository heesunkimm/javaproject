package com.example.crawler.service;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.example.crawler.dto.CrawlerDTO;

@Service
public class CrawlerService {
	
    public List<CrawlerDTO> fetchCrawler() {
        List<CrawlerDTO> crawlerList = new ArrayList<>();
        try {
            String url = "https://finance.naver.com/sise/";
            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36")
                    .get();

            Elements topHigh = doc.select("table#siselist_tab_0 tbody tr");

            for (Element row : topHigh) {
                Elements columns = row.select("td");

                // 유효한 데이터가 있는 행만 처리
                if (columns.size() >= 11) {
                    String rank = row.select("td img").attr("src");
                    String name = columns.get(3).text().trim();
                    String price = columns.get(4).text().trim();
                    String change = row.select("td:nth-child(5)").text();
                    String fluctuation = columns.get(6).text().trim();
                    String volume = columns.get(7).text().trim();
                    String open = columns.get(8).text().trim();
                    String high = columns.get(9).text().trim();
                    String low = columns.get(10).text().trim();

                    // DTO에 데이터 저장
                    CrawlerDTO dto = new CrawlerDTO();
                    dto.setStockRank(rank);
                    dto.setStockName(name);
                    dto.setStockPrice(price);
                    dto.setStockPrevPrice(change);
                    dto.setFluctuationRate(fluctuation);
                    dto.setTradingVolume(volume);
                    dto.setStockOpen(open);
                    dto.setStockHigh(high);
                    dto.setStockLow(low);

                    crawlerList.add(dto);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return crawlerList;
    }
}
