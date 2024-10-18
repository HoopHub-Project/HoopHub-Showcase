package com.hoophub.showcase.article;

import com.hoophub.showcase.article.dto.ArticleDto;
import com.hoophub.showcase.article.dto.ArticleForm;
import com.hoophub.showcase.article.exception.ArticleException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ArticleService {
    Article createArticle(ArticleForm articleForm) throws ArticleException;
    List<ArticleDto> getAllArticle();
    ArticleDto getArticleById(UUID id) throws ArticleException;
    Article updateArticle(UUID id, ArticleForm articleForm) throws ArticleException;
    Boolean deleteArticle(UUID id) throws ArticleException;
}
