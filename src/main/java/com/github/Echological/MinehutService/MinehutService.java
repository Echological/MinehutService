package com.github.Echological.MinehutService;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

import java.util.function.Consumer;

public class MinehutService {

    static String id = System.getenv("SERVER_ID");

    static JSONObject data() {
        HttpResponse<JsonNode> res = Unirest.get("https://api.minehut.com/server/"+id)
                .asJson();

        JsonNode node = res.getBody();

        return node.getObject().getJSONObject("server");
    }

    public static void data(final Consumer<JSONObject> consumer){
        consumer.accept(data());
    }

    public static void name(final Consumer<String> consumer){
        JSONObject data = data();
        consumer.accept(data.getString("name"));
    }

    public static void online(final Consumer<Boolean> consumer){
        JSONObject data = data();
        consumer.accept(data.getBoolean("online"));
    }

    public static void players(final Consumer<JSONArray> consumer){
        JSONObject data = data();
        consumer.accept(data.getJSONArray("players"));
    }

    public static void motd(final Consumer<String> consumer){
        JSONObject data = data();
        consumer.accept(data.getString("motd"));
    }

}
