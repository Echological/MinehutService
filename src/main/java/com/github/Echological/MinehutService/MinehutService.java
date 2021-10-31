package com.github.Echological.MinehutService;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONObject;

import java.util.function.Consumer;

public class MinehutService {

    static String id = System.getenv("SERVER_ID");

    public static void server(final Consumer<JSONObject> consumer){
        HttpResponse<JsonNode> res = Unirest.get("https://api.minehut.com/server/"+id)
                .asJson();

        JsonNode node = res.getBody();

        JSONObject obj = node.getObject();

        consumer.accept(obj);
    }

}
