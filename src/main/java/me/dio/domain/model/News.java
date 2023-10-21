package me.dio.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="news")
public class News extends BaseItem{
    @Id
    private Long id;

}
