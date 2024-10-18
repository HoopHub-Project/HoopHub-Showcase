package com.hoophub.showcase.article;

import com.hoophub.showcase.article.dto.ArticleDto;
import com.hoophub.showcase.article.dto.ArticleForm;
import com.hoophub.showcase.article.exception.ArticleException;
import com.hoophub.showcase.article.util.ArticleMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.*;

@Slf4j
@Component
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService{

    private final ArticleRepository articleRepository;

    private final ArticleMapper articleMapper;

    @Override
    public Article createArticle(ArticleForm articleForm) throws ArticleException {
        if(articleForm == null){
            log.error("A bad request error occured because the form is null");
            throw new ArticleException("The form is not valid", HttpStatus.BAD_REQUEST);
        }
        Article article = Article.builder()
                .title(articleForm.getTitle())
                .description(articleForm.getDescription())
                .publicationDate(new Date())
                .subtitle(articleForm.getSubtitle())
                .lectureTime(articleForm.getLectureTime())
                .category(articleForm.getCategory())
                .pictureLink(articleForm.getPictureLink())
                .build();
        this.articleRepository.save(article);
        return article;
    }

    @Override
    public List<ArticleDto> getAllArticle() {
        List<Article> articleList = this.articleRepository.findAll();
        if(articleList.isEmpty()){
            return new ArrayList<>();
        }
        else {
            return this.articleMapper.toDtoList(this.articleRepository.findAll());
        }
    }

    @Override
    public ArticleDto getArticleById(UUID id) throws ArticleException {
        Optional<Article> optionalArticle = this.articleRepository.findById(id);
        if(optionalArticle.isEmpty()){
            log.error("An error occured because the article is not found");
            throw new ArticleException("Article is not found", HttpStatus.NOT_FOUND);
        }
        return this.articleMapper.toDto(optionalArticle.get());
    }

    @Override
    public Article updateArticle(UUID id, ArticleForm articleForm) throws ArticleException {
        Optional<Article> optionalArticle = this.articleRepository.findById(id);
        if(optionalArticle.isEmpty()){
            log.error("An error occurred because the article is not found");
            throw new ArticleException("Article is not found", HttpStatus.NOT_FOUND);
        }
        if(articleForm == null){
            log.error("An error occured because the article form is null");
            throw new ArticleException("Article form is null", HttpStatus.BAD_REQUEST);
        }
        Article article = optionalArticle.get();
        article.setDescription(articleForm.getDescription());
        article.setCategory(articleForm.getCategory());
        article.setSubtitle(articleForm.getSubtitle());
        article.setTitle(articleForm.getTitle());
        article.setLectureTime(articleForm.getLectureTime());
        article.setPictureLink(articleForm.getPictureLink());
        this.articleRepository.save(article);
        return article;
    }

    @Override
    public Boolean deleteArticle(UUID id) throws ArticleException {
        Optional<Article> optionalArticle = this.articleRepository.findById(id);
        if(optionalArticle.isEmpty()){
            log.error("An error occured because the article is not found");
            throw new ArticleException("The article is not found",HttpStatus.NOT_FOUND);
        }
        this.articleRepository.delete(optionalArticle.get());
        return true;
    }
}
