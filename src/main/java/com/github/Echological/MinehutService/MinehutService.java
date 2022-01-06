package com.github.Echological.MinehutService;

public class MinehutService {

    static String MAIN_API="https://api.minehut.com/";
    static String PRODUCTS_API="https://facade-service-prod.superleague.com/facade/v1/client/";

    public static String mainApi() {
        return MAIN_API;
    }
    public static String productsApi() {
        return PRODUCTS_API;
    }

    public static String mainApi(String... endpoint) {
        String end = String.join("/", endpoint);
        return mainApi()+(end.startsWith("/") ? end : "/"+end);
    }

    public static String productsApi(String... endpoint) {
        String end = String.join("/", endpoint);
        return productsApi()+(end.startsWith("/") ? end : "/"+end);
    }

}
