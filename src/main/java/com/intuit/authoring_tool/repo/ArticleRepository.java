package com.intuit.authoring_tool.repo;

import com.intuit.authoring_tool.models.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, Integer>  {

}
