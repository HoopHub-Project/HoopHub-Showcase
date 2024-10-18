package com.hoophub.showcase.article.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ArticleDto {
    private String title;
    private String subtitle;
    private String description;
    private Date publicationDate;
    private String category;
    private String lectureTime;
    private String pictureLink;
}
