package io.pivotal.pal.tracker.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

@EnableZipkinStreamServer
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
