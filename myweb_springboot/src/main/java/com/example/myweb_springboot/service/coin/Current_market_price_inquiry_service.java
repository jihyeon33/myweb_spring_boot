package com.example.myweb_springboot.service.coin;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.example.myweb_springboot.vo.coin.TickerVo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//업비트 open api. 시세 현재가 조회
public class Current_market_price_inquiry_service {
    //종목 단위 현재가 정보
    public List<TickerVo> current_price_information_per_item(){
        java.util.List<TickerVo> coin_list = new ArrayList<>();
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.upbit.com/v1/ticker?markets=KRW-DOGE")
                .get()
                .addHeader("accept", "application/json")
                .build();

        try {
            Response response = client.newCall(request).execute();
            coin_list = new Gson().fromJson(response.body().string(), new TypeToken<List<TickerVo>>() {}.getType());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return coin_list;
    }


    public List<TickerVo> current_price_information_per_item_2(String coin_name){
        java.util.List<TickerVo> coin_list = new ArrayList<>();
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.upbit.com/v1/ticker?markets=".concat(coin_name))
                .get()
                .addHeader("accept", "application/json")
                .build();

        try {
            Response response = client.newCall(request).execute();
            coin_list = new Gson().fromJson(response.body().string(), new TypeToken<List<TickerVo>>() {}.getType());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return coin_list;
    }
}
