package org.tmlux.tmluxcodebase;

import org.springframework.boot.SpringApplication;

public class TestTmluxCodebaseApplication {

    public static void main(String[] args) {
        SpringApplication.from(TmluxCodebaseApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
