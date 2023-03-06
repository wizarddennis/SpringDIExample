package com.xx.ioc;

public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        // UrlEncoder, Base64Encoder 를 외부에서 넣어주면, Encoder 클래스는 수정할 필요가 없다.
        //Encoder encoder = new Encoder(new UrlEncoder());
        Encoder encoder = new Encoder(new Base64Encoder());
        String result = encoder.encode(url);
        System.out.println(result);
    }
}