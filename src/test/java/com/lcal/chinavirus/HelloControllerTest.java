package com.lcal.chinavirus;


import com.lcal.chinavirus.controller.FirstController;
import org.assertj.core.api.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@WebMvcTest(controllers = FirstController.class )

public class HelloControllerTest {

    @Autowired
    TestRestTemplate testRestTemplate;
    @Autowired
    private MockMvc mvc;

    
    @Test
    public void testHello() throws Exception {
        
        String str = "hihi test";
        mvc.perform(get("/hello")).andExpect(status().isOk());
        //String result = testRestTemplate.getForObject("/", String.class);
        // Assert..("Hello World!", result);
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

