package com.example.firstprojact.repository;

import com.example.firstprojact.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository  extends CrudRepository<Article,Long> {

}
