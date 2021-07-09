package study.davincijcloud.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void 홈_템플릿_테스트() throws Exception {
        mockMvc.perform(get("/")) // GET /를 수행한다
                .andExpect(status().isOk()) // HTTP 200이 되어야 한다
                .andExpect(view().name("home")) // home 뷰가 있어야 한다
                .andExpect(content().string(containsString("Welcome to davincij-cloud"))); // 콘텐츠에 'Welcome to...'가 포함되어야 한다
    }
}