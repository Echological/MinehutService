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

    /**
     * @param consumer consumer to output the JSONObject data of the server
     */
    public static void server(final Consumer<JSONObject> consumer){
        consumer.accept(data());
    }

    /**
     * @return JSONObject - server data from the api request
     */
    public static JSONObject server(){
        return data();
    }

    /**
     * @param consumer consumer to output String of the server name
     */
    public static void name(final Consumer<String> consumer){
        JSONObject data = data();
        consumer.accept(data.getString("name"));
    }

    /**
     * @return String - name of the server
     */
    public static String name(){
        JSONObject data = data();
        return data.getString("name");
    }

    /**
     * @param consumer consumer to output boolean determining if the server is offline or online
     */
    public static void online(final Consumer<Boolean> consumer){
        JSONObject data = data();
        consumer.accept(data.getBoolean("online"));
    }

    /**
     * @return boolean - boolean determining if the server is online or offline
     */
    public static boolean online(){
        JSONObject data = data();
        return data.getBoolean("online");
    }

    /**
     * @param consumer consumer to output JSON array of player uuids
     */
    public static void players(final Consumer<JSONArray> consumer){
        JSONObject data = data();
        consumer.accept(data.getJSONArray("players"));
    }

    /**
     * @return JSONArray - JSON array of player uuids
     */
    public static JSONArray players(){
        JSONObject data = data();
        return data.getJSONArray("players");
    }

    /**
     * @param consumer consumer to ouput motd of the server
     */
    public static void motd(final Consumer<String> consumer){
        JSONObject data = data();
        consumer.accept(data.getString("motd"));
    }

    /**
     * @return String - motd of the server
     */
    public static String motd(){
        JSONObject data = data();
        return data.getString("motd");
    }

}
