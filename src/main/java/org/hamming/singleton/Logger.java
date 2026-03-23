package org.hamming.singleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void classLog(Object object, String info) {
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yy"));
        String className = object.getClass().getSimpleName();
        System.out.println("Log info: " + date + " - " + className + " - " + info);
    }
}
