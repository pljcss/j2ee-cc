package com.iocdemo.xml.collectiondi;

import java.util.List;

/**
 * @Author: cs
 * @Date: 2021/1/27 6:25 下午
 * @Desc:
 */
public class Movie {
    private List<String> movieNameList;

    public List<String> getMovieNameList() {
        return movieNameList;
    }

    public void setMovieNameList(List<String> movieNameList) {
        this.movieNameList = movieNameList;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieNameList=" + movieNameList +
                '}';
    }
}
