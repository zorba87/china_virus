package com.glshlee.boilerplate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void testHello() throws Exception {
        String result = testRestTemplate.getForObject("/", String.class);
        Assert.assertEquals("Hello World!", result);
    }

    @Test
    public void testCalc() throws Exception {
        // TODO: test required
        // String result = testRestTemplate.getForObject("/calc?left=100&right=200",
        // String.class);
        // System.out.println(result);

        // given().param("left", 100).param("right",
        // 200).get("/calc").then().body("left", is(100)).body("right", is(200))
        // .body("answer", is(300));
    }
}