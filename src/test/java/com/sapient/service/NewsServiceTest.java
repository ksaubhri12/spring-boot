package com.sapient.service;

import com.sapient.commonUtil.RestProcessorClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class NewsServiceTest {


    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @InjectMocks
    private NewsService newsService;

    @Mock
    private RestProcessorClient restProcessorClient;

    @Before
    public void setUp() throws Exception {
        String response = "{\n" +
                "\t\"status\": \"ok\",\n" +
                "\t\"totalResults\": 20,\n" +
                "\t\"articles\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"source\": {\n" +
                "\t\t\t\t\"id\": \"the-huffington-post\",\n" +
                "\t\t\t\t\"name\": \"The Huffington Post\"\n" +
                "\t\t\t},\n" +
                "\t\t\t\"author\": \"Lee Breslouer\",\n" +
                "\t\t\t\"title\": \"This Is America's Best Fast Food Fried Chicken\",\n" +
                "\t\t\t\"description\": \"Five major brands do battle. Things get greasy.\",\n" +
                "\t\t\t\"url\": \"https://www.huffingtonpost.com/entry/best-fast-food-fried-chicken_us_5b328c43e4b0cb56051ccaab\",\n" +
                "\t\t\t\"urlToImage\": \"https://img.huffingtonpost.com/asset/5b3389dd2200009204eeca6e.jpeg?ops=1200_630\",\n" +
                "\t\t\t\"publishedAt\": \"2018-07-06T09:46:00Z\"\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";
        when(restProcessorClient.process(any(),any(),any(),any(),any())).thenReturn(response);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getNewsWhenEverythingIsSuccessful() throws Exception {

        String country = "US";
        String category = "busines";

        String result = newsService.getNews(country,category);


    }



}