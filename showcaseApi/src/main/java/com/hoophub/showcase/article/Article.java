package com.hoophub.showcase.article;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Builder
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(nullable = false, name = "title")
    private String title;

    @Column(nullable = false, name = "subtitle")
    private String subtitle;

    @Column(nullable = false, name = "description")
    private String description;

    @Column(nullable = false, name = "publication_date")
    private Date publicationDate;

    @Column(nullable = false, name = "category")
    private String category;

    @Column(nullable = false, name = "lecture_time")
    private String lectureTime;

    @Column(nullable = false, name = "picture_link")
    private String pictureLink;
}
