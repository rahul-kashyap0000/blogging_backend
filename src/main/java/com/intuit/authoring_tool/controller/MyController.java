package com.intuit.authoring_tool.controller;

import com.intuit.authoring_tool.models.Article;
import com.intuit.authoring_tool.repo.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/articles")
public class MyController {
    @Autowired
    private ArticleRepository articleRepository;
    @PostMapping("/")
    public ResponseEntity<?> addArticle(@RequestBody Article article){
        Article save = (Article) this.articleRepository.save(article);

        return ResponseEntity.ok(save);
    }

    @GetMapping("/")
    public ResponseEntity<?> getArticles(){
        return ResponseEntity.ok(this.articleRepository.findAll());
    }

}
