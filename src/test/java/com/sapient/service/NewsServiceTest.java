package com.sapient.service;

import com.sapient.commonUtil.RestProcessorClient;
import com.sapient.responsebody.NewsResponseBody;
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
        NewsResponseBody response = getResponseBody();
        when(restProcessorClient.process(any(),any(),any(),any(),any())).thenReturn(response);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getNewsWhenEverythingIsSuccessful() throws Exception {

        String country = "US";
        String category = "bussines";

        NewsResponseBody result = newsService.getNews(country,category);

        as


    }

    public NewsResponseBody getResponseBody(){
        NewsResponseBody newsResponseBody = new NewsResponseBody();
        newsResponseBody.setStatus("ok");
        newsResponseBody.setTotalResults(20);
        newsResponseBody.setArticles(null);
    }



}