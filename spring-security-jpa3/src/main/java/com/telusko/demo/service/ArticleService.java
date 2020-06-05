package com.telusko.demo.service;

import com.telusko.demo.model.Article;

import java.util.List;
import java.util.Optional;

public interface ArticleService {

    List<Article> findAll();
    void save(Article article);
    Optional<Article> findById(int article_id);
    void delete(int article_id);
  //  void decrementStock(Article article);
  //  Article getOne(int article_id);
  //  List<Object[]> getArticles();

}