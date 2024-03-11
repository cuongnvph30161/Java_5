package com.example.asm1b2.service;

import com.example.asm1b2.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieService {
    List<Movie> list = new ArrayList<>();

    public MovieService() {
        list.add(new Movie("1", "hoat hinh", "phim hay", true, "https://bizweb.dktcdn.net/100/438/408/files/anh-chan-dung-dep-yodyvn1.jpg?v=1683537734987"));
    }

    public List<Movie> getAll() {
        return list;
    }
    public void addMovie(Movie movie){
        list.add(movie);
    }
    public void updateMovie(Movie movie){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(movie.getId())) {
                list.set(i, movie);
            }
        }
    }
    public boolean checkTrungIdMovie(String id){
        for (Movie u : list) {
            if (u.getId().equals(id)) {
                return true; // ID đã tồn tại
            }
        }
        return false; // ID không tồn tại
    }

    public Movie getById(String id){
        for(Movie u : list){
            if(u.getId().equals(id)){
                return u;
            }
        }
        return null;
    }
    public void update(Movie movie) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(movie.getId())) {
                list.set(i, movie);
            }
        }
    }
    public void deleteMovie(Movie movie){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId().equals(movie.getId())){
                 list.remove(i);
            }
        }
    }
}
