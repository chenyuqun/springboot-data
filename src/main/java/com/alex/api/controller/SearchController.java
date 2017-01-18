package com.alex.api.controller;

import com.alex.api.entity.data.elasticsearch.Article;
import com.alex.api.exception.core.MyException;
import com.alex.api.exception.data.EmptyException;
import com.alex.api.repository.data.elasticsearch.ArticleSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/find")
    public Article getRequest(@RequestParam Long id) throws MyException{

        Article article=articleSearchRepository.findOne(id);
        if(article==null){
            throw new EmptyException();
        }
        return article;
    }

}
