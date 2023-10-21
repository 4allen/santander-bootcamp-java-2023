package me.dio.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="td_feature")
public class Feature extends BaseItem{
    @Id
    private Long id;
}
