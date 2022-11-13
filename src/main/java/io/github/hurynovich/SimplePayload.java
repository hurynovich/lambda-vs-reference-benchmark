package io.github.hurynovich;

public class SimplePayload {

    private static String staticData = "default-static-data";
    private String data = "default-data";

    public static String getDataByStatic() {
        return staticData;
    }

    public String getData() {
        return data;
    }
}
