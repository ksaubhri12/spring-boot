package com.sapient.responsebody;

public class NewsArticleResponseBody {

    public ArticeSourceResponseBody getSource() {
        return source;
    }

    public void setSource(ArticeSourceResponseBody source) {
        this.source = source;
    }

    private ArticeSourceResponseBody source ;

    private String author ;

    private String title ;

    private String description ;

    private  String url ;



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    private String urlToImage ;

    private String publishedAt ;




}
