package com.alex.api.repository.data.elasticsearch;

import com.alex.api.entity.data.elasticsearch.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleSearchRepository extends ElasticsearchRepository<Article, Long> {

}
