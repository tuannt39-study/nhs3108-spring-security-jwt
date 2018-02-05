package vn.its.springjwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.its.springjwt.model.FakeNews;
import vn.its.springjwt.model.News;

import java.util.List;

@RestController
public class NewsController {

//    http://localhost:8080/getListNews
    @GetMapping("/getListNews")
    public List<News> getListNews() {
        return FakeNews.getListNews();
    }
}
