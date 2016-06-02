package com.zsq.web;

import com.zsq.model.Repo;
import com.zsq.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by china on 2016/6/2.
 */
public interface HttpService {

    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);

    @GET("test")
    Call<List<User>> listUsers();
}
