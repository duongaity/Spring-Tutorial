package com.gateam.spring.serverless.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "post")
public class Post extends BaseEntity {

    private String image;
    private String title;
    private String summary;
    private String content;
    private String author;
    private boolean status;

}
