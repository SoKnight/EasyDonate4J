package ru.easydonate.sdk;

import java.time.format.DateTimeFormatter;

public final class Constants {

    public static final String USER_AGENT;
    public static final int CONNECT_TIMEOUT;
    public static final int RESPONSE_TIMEOUT;
    public static final int READ_TIMEOUT;
    public static final int WRITE_TIMEOUT;
    public static final DateTimeFormatter DATE_FORMATTER;

    static {
        USER_AGENT = "EasyDonate4j";
        CONNECT_TIMEOUT = 5000;
        RESPONSE_TIMEOUT = 5000;
        READ_TIMEOUT = 5000;
        WRITE_TIMEOUT = 5000;
        DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

}
