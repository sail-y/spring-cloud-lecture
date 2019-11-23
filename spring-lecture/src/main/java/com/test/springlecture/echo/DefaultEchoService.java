package com.test.springlecture.echo;

/**
 * @author yangfan
 * @date 2019/11/23
 */
public class DefaultEchoService implements EchoService {
    private final String echoFormat;

    public DefaultEchoService(String echoFormat) {
        this.echoFormat = echoFormat != null ? echoFormat : "%s";
    }

    @Override
    public String getMessage(String message) {
        return String.format(this.echoFormat, message);
    }
}
