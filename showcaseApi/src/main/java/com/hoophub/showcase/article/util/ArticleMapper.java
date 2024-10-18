package com.hoophub.showcase.article.util;


import com.hoophub.showcase.article.Article;
import com.hoophub.showcase.article.dto.ArticleDto;
import com.hoophub.showcase.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ArticleMapper extends BaseMapper<Article, ArticleDto> {

    ArticleMapper INSTANCE = Mappers.getMapper(ArticleMapper.class);
}
