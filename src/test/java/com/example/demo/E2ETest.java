package com.example.demo;

import static com.codeborne.selenide.Selenide.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import static com.codeborne.selenide.Condition.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class E2ETest {

    @LocalServerPort
    private Integer port;

    @Test
    public void createTask() {
        open("http://localhost:" + port);
        $(By.name("task")).setValue("To wash the car");
        $("#add").click();
        $(".list-group-item").shouldHave(text("To wash the car"));
    }
}
