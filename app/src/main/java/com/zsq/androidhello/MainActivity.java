package com.zsq.androidhello;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;
import com.zsq.model.Repo;
import com.zsq.model.User;
import com.zsq.web.HttpService;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.btn_my)
    Button btnMy;
    @Bind(R.id.fab)
    FloatingActionButton fab;
    @Bind(R.id.btn_two)
    Button btnTwo;
    @Bind(R.id.btnmain_three)
    Button btnmainThree;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_add:
                Toast.makeText(this, "add", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    @OnClick({R.id.toolbar, R.id.btn_my, R.id.fab, R.id.btn_two,R.id.btnmain_three})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_my:
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

                Retrofit retrofit = new Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .baseUrl("http://115.28.87.77/WebProject/getUser/")
                        .build();
                HttpService service = retrofit.create(HttpService.class);
                Call<List<User>> users = service.listUsers();
                users.enqueue(new Callback<List<User>>() {
                    @Override
                    public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                        Log.e("====", JSON.toJSONString(response));
                        Log.i("info","====---==="+(List<User>)response.body());
                        List<User> reposBody = (List<User>) response.body();
                        for (User oneUser : reposBody) {
                            System.out.println(oneUser.getDeptCode());
                        }
                    }
                    @Override
                    public void onFailure(Call<List<User>> call, Throwable t) {

                    }
                });

//                Toast.makeText(MainActivity.this, "YES", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_two:
                String data = "Hello SecondActivity";
                Intent intent = new Intent("com.zsq.androidhello.SECTION_START");
//                intent.putExtra("data",data);
                startActivityForResult(intent,1);
                break;
            case R.id.btnmain_three:
                Intent intentLocation = new Intent("com.zsq.androidhello.THIRD_ACTIVITY");
                startActivity(intentLocation);
                break;
            case R.id.fab:
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK){
                    String returnedData = data.getStringExtra("data");
                    Log.d("FirstActivity",returnedData);
                }
                break;
            default:
        }
    }
}
