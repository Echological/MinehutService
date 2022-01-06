package com.github.Echological.MinehutService;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

import static com.github.Echological.MinehutService.MinehutService.mainApi;

public class MinehutServer {

    static String id = System.getenv("SERVER_ID");

    static JSONObject data() {
        HttpResponse<JsonNode> res = Unirest.get(mainApi("server", id))
                .asJson();

        JsonNode node = res.getBody();

        return node.getObject().getJSONObject("server");
    }

    /**
     * @return JSONObject - server data from the api request
     */
    public static JSONObject server(){
        return data();
    }

    /**
     * @return String - name of the server
     */
    public static String name(){
        JSONObject data = data();
        return data.getString("name");
    }

    /**
     * @return boolean - boolean determining if the server is online or offline
     */
    public static boolean online(){
        JSONObject data = data();
        return data.getBoolean("online");
    }

    /**
     * @return JSONArray - JSON array of player uuids
     */
    public static JSONArray players(){
        JSONObject data = data();
        return data.getJSONArray("players");
    }

    /**
     * @return String - motd of the server
     */
    public static String motd(){
        JSONObject data = data();
        return data.getString("motd");
    }

    /**
     * @return JSONArray - installed content on the server
     */
    public static JSONArray installedContent(){
        JSONObject data = data();
        return data.getJSONArray("installed_content");
    }

    /**
     * @return String - the id of the server
     */
    public static String id() {
        return id;
    }

}
