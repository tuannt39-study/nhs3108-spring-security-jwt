package vn.its.springjwt.model;

import java.util.ArrayList;
import java.util.List;

public class FakeNews {

    public static List<News> getListNews() {
        List<News> newsList = new ArrayList<News>();
        newsList.add(new News("Title 1", "Content 1", "Tuan"));
        newsList.add(new News("Title 2", "Content 2", "Nguyen"));
        newsList.add(new News("Title 3", "Content 3", "Tuan Nguyen"));
        return newsList;
    }
}
