package com.xx.ioc;

import java.util.Base64;

public class Encoder {
    //Encoder 입장에서는 IEncoder를 외부에서 주입을 받았기 때문에, DI를 받은 것이다.
    //즉, 의존을 가지고 있는 애를 주입 받았다.
    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder) {
        this.iEncoder =iEncoder;
    }

    public String encode(String message) {
        return iEncoder.encode(message);
    }
}
