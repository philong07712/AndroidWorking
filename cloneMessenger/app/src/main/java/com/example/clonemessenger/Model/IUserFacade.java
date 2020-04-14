package com.example.clonemessenger.Model;

import com.example.clonemessenger.Model.News.INews;

public interface IUserFacade {
    IHuman getHuman();
    void setHuman(IHuman human);
    INews getNews();
    void setNews(INews news);
}

