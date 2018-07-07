package com.sapient.controller;

import com.google.gson.JsonObject;
import com.sapient.service.NewsService;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {

    @Autowired
    private NewsService newsService;

    @RequestMapping("/news")
    public String getNewsString(@RequestParam Map<String, String> requestParams) {

        String country = requestParams.get("country");
        String category = requestParams.get("category");

        try {
            String result = newsService.getNews(country, category);
//            JSONParser parser = new JSONParser();
//            JSONObject jsonObject = (JSONObject) parser.parse(result);
            return result;

        } catch (Exception e) {
            System.out.println("Exception occured");
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("response", "error occured");
            jsonObject.put("message", e.getMessage());

            return e.getMessage();
        }


    }


}
