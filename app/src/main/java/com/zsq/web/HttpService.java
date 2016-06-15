package com.zsq.web;

import com.zsq.model.Customer;
import com.zsq.model.Repo;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by china on 2016/6/2.
 */
public interface HttpService {

    //                Retrofit retrofit = new Retrofit.Builder()
//                        .addConverterFactory(GsonConverterFactory.create())
//                        .baseUrl("https://api.github.com/")
//                        .build();
//                HttpService service = retrofit.create(HttpService.class);
//                Call<List<Repo>> repos = service.listRepos("aubergines");
//                repos.enqueue(new Callback<List<Repo>>() {
//                    @Override
//                    public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
//                        Log.e("====", JSON.toJSONString(response));
//                        Log.i("info","====---==="+(List<Repo>)response.body());
//                        List<Repo> reposBody = (List<Repo>) response.body();
//                        for (Repo oneRepo : reposBody) {
//                            System.out.println(oneRepo.getArchive_url());
//                        }
//                    }
//                    @Override
//                    public void onFailure(Call<List<Repo>> call, Throwable t) {
//
//                    }
//                });

    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);

    @GET("user")
    Call<Customer> createQuote(@Query("id") String id);


//    Retrofit retrofit = new Retrofit.Builder()
//            .addConverterFactory(GsonConverterFactory.create())
//            .baseUrl("http://115.28.87.77/WebProject/getUser/")
//            .build();
//    HttpService service = retrofit.create(HttpService.class);
//    Call<List<User>> users = service.listUsers();
//    users.enqueue(new Callback<List<User>>() {
//        @Override
//        public void onResponse(Call<List<User>> call, Response<List<User>> response) {
//            Log.e("====", JSON.toJSONString(response));
//            Log.i("info","====---==="+(List<User>)response.body());
//            List<User> reposBody = (List<User>) response.body();
//            for (User oneUser : reposBody) {
//                System.out.println(oneUser.getDeptCode());
//            }
//        }
//        @Override
//        public void onFailure(Call<List<User>> call, Throwable t) {
//
//        }
//    });
    @GET("test")
    Call<List<?>> listUsers();
}
