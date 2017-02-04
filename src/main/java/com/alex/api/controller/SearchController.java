package com.alex.api.controller;

import com.alex.api.entity.data.elasticsearch.Article;
import com.alex.api.exception.core.MyException;
import com.alex.api.exception.data.EmptyException;
import com.alex.api.repository.data.elasticsearch.ArticleSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Function:
 *
 * @author Alex
 * @date 2017/1/17
 */
@RestController
@RequestMapping("/api/search")
public class SearchController {

    @Autowired
    private ArticleSearchRepository articleSearchRepository;

    @GetMapping("/find/article")
    public Article findArticle(@RequestParam Long id) throws MyException{

        Article article=articleSearchRepository.findOne(id);
        if(article==null){
            throw new EmptyException();
        }
        return article;
    }

    @PostMapping("/save/article")
    public Article saveArticle(@RequestBody Article article) throws MyException{
        Article result=articleSearchRepository.save(article);
        return result;
    }
}
