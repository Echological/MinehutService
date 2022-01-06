package com.github.Echological.MinehutService;

public class MinehutService {

    static String MAIN_API="https://api.minehut.com/";
    static String PRODUCTS_API="https://facade-service-prod.superleague.com/facade/v1/client/products";

    public static String mainApi() {
        return MAIN_API;
    }
    public static String productsApi() {
        return PRODUCTS_API;
    }

    public static String mainApi(String endpoint) {
        return mainApi()+(endpoint.startsWith("/") ? endpoint : "/"+endpoint);
    }

}
