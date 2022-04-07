package com.example.firstprojact.controller;

import com.example.firstprojact.dto.ArticleForm;
import com.example.firstprojact.entity.Article;
import com.example.firstprojact.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j // 로깅을 위한 골뱅이(어노테이션)
public class ArticleController {

    @Autowired // 스프링부트가 미리 생성해놓은 객채를 가져다가 자동 연결!
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        log.info(form.toString());
        //System.out.println(form.toString()); -> 로깅 기능으로 대체

        // 1. Dto를 변환 Entity!
        Article article = form.toEntity();
        log.info(article.toString());
        //System.out.println(article.toString());

        // 2. Repository에게 Entity를 DB안에 저장하게 함
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());

        return "";
    }
}
