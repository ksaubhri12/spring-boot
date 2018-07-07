package com.sapient.responsebody;

import java.util.List;

public class NewsResponseBody {

    private String status ;

    private Integer totalResults ;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }


    public List<NewsArticleResponseBody> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsArticleResponseBody> articles) {
        this.articles = articles;
    }

    private List<NewsArticleResponseBody> articles ;




}
