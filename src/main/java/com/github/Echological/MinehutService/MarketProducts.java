package com.github.Echological.MinehutService;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

import java.util.Objects;

import static com.github.Echological.MinehutService.MinehutService.productsApi;

public class MarketProducts {

    public static JSONObject product(String id) {
        HttpResponse<JsonNode> res = Unirest.get(productsApi("product", id))
                .asJson();
        JsonNode node = res.getBody();
        return node.getObject();
    }

    public static JSONArray products() {
        HttpResponse<JsonNode> res = Unirest.get(productsApi("products"))
                .asJson();
        JsonNode node = res.getBody();
        return node.getArray();
    }

}
