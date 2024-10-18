package com.hoophub.showcase.article;

import com.hoophub.showcase.article.dto.ArticleDto;
import com.hoophub.showcase.article.dto.ArticleForm;
import com.hoophub.showcase.article.exception.ArticleException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/showcase/article")
@RequiredArgsConstructor
@Slf4j
public class ArticleController {

    private final ArticleService articleService;

    @PostMapping
    public ResponseEntity<Article> createArticle(@Valid @RequestBody ArticleForm form){
        try{
            log.info("Creating an article for the showcase app");
            return ResponseEntity.ok(this.articleService.createArticle(form));
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Article> updateArticle(@Valid @RequestBody ArticleForm form, @PathVariable UUID id){
        try {
            log.info("Updating article with the id {}", id);
            return ResponseEntity.ok(this.articleService.updateArticle(id,form));
        }
        catch(ArticleException e){
            log.error("An error occured for the following reason {}",e.getMessage());
            return new ResponseEntity<>(e.getHttpStatus());
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping()
    public ResponseEntity<List<ArticleDto>> getAllArticle(){
        try{
            log.info("Getting all articles for the showcase");
            return ResponseEntity.ok(this.articleService.getAllArticle());
        }
        catch(Exception e){
            log.error("An error occured while getting all articles for the following reason {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArticleDto> getArticleById(@PathVariable UUID id){
        try {
            log.info("Getting article with the id {}",id);
            return ResponseEntity.ok(this.articleService.getArticleById(id));
        }
        catch(ArticleException e){
            log.error("An error occured for the following reason {}",e.getMessage());
            return new ResponseEntity<>(e.getHttpStatus());
        }
        catch(Exception e){
            log.error("An error occured for the following reason {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}