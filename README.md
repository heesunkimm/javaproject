# SPRING BOOT를 이용한 웹크롤링 프로젝트

## 프로젝트 목적
 - 목표: 특정 웹사이트에서 데이터를 크롤링하여 분석하거나 저장하는 기능 구현
 - 주요 기능: Jsoup을 활용한 데이터 크롤링, 크롤링한 데이터 저장 및 관리, 일정 시간마다 자동으로 데이터 수집
 
 - 개발 기간: 24.12.08 ~ 24.12.18 (11일)
 - 개발 인원: 개인프로젝트

## 프로젝트 결과
 - Jsoup 라이브러리를 활용하여 실시간 데이터 크롤링
 - HTML DOM 파싱을 통해 필요한 데이터 추출
 - 스케줄링을 사용하여 평일 오후 4시에 자동으로 크롤링된 데이터를 저장하는 기능 구현

 ## 파일구조
    webcrawler/
    ├── src/
    │ ├── main/
    │ │ ├── java/
    │ │ │ └── com/
    │ │ │  └── example/
    │ │ │   └── webcrawler/
    │ │ │    ├── config/
    │ │ │    ├── controller/
    │ │ │    ├── dto/
    │ │ │    ├── exception/
    │ │ │    └── service/
    │ │ ├── resources/
    │ │ │ ├── mybatis/
    │ │ │ ├── templates/
    │ │ │ └── application.properties
    │ ├── webapp/
    │ │ └── WEB-INF/
    │ │   └── views/
    │ └── test/
    ├── .gitignore
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── README.md

## 기술 스택
 - Environment
   - Framework: Spring Boot
   - Database: Oracle
   - Version Control: Git, GitHub

 - Development
   - Frontend: JSP
   - Backend: Spring Boot, MyBatis
   - Build Tool: Maven
   - Web Scraping: Jsoup