package com.sapient.service;


import com.sapient.commonUtil.RestProcessorClient;
import com.sapient.responsebody.NewsResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class NewsService {

    @Autowired
    private RestProcessorClient restProcessorClient ;


    public NewsResponseBody getNews(String country, String category) throws Exception{
        if (country == null){
            throw new Exception("null country id is not acceptable");
        }
        else if (country.trim().equals("")){
            throw new Exception("empty country id is not acceptable");
        }
        if (category == null){
            throw new Exception("null category is not acceptable");
        }
        if (category.trim().equals("")){
            throw new Exception("empty category is not acceptable");
        }
        try {
            String url = "https://newsapi.org/v2/top-headlines";
            String finalUrl = url + "?"+ "country="+country+"&"+"category="+category+"&"+"apiKey=ccaf5d41cc5140c984818c344edcc14d";
            NewsResponseBody result = (NewsResponseBody) restProcessorClient.process(finalUrl,null,null,NewsResponseBody.class,HttpMethod.GET);
            return result;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            throw new Exception(e.getMessage());
        }
    }


}
