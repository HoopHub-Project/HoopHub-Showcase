package com.hoophub.showcase.article.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ArticleForm {

    @NotBlank(message = "Title cannot be blank")
    @Size(min = 5, max = 100, message = "Title must be between 5 and 100 characters")
    private String title;

    @NotBlank(message = "Subtitle cannot be blank")
    @Size(min = 5, max = 150, message = "Subtitle must be between 5 and 150 characters")
    private String subtitle;

    @NotBlank(message = "Description cannot be null")
    @Size(min = 10, message = "Description must have at least 10 characters")
    private String description;

    @NotBlank(message = "Category cannot be blank")
    @Size(min = 5, max = 40, message = "Category must be between 5 and 40 characters")
    private String category;

    @NotBlank(message = "Lecture time cannot be blank")
    private String lectureTime;

    @NotBlank(message = "Picture link cannot be blank")
    private String pictureLink;
}
