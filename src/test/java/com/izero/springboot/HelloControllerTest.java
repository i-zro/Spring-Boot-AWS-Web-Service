package com.izero.springboot;

import com.izero.springboot.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// RunWith: 테스트를 진행할 때 JUnit에 내장된 실행자 외에 다른 실행자를 실행시킴.
// 여기서는 SpringRunner라는 실행자를 사용한 것.
// 스프링 부트 테스트와 JUnit 사이에 연결자 역할.
@RunWith(SpringRunner.class)
//  선언할 경우 @Service, @Component, @Repository를 사용 못함. 여기서는 컨트롤러만 사용해서 사용한 것.
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    @Autowired  //  스프링이 관리하는 빈(Bean)을 주입 받음
    private MockMvc mvc;    //  웹 API를 테스트 할 때 사용, 스프링 MVC 테스트의 시작점, 이 클래스로 HTTP GET, POST 등에 대한 API 테스트 가능

    @Test
    public void hello가_리턴된다() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello"))  //  MockMvc를 통해 /hello 주소로 HTTP GET 요청
                .andExpect(status().isOk()) //  mvc.perform 결과 검증 : HTTP Header 상태 검증 (200, 404, 500 등)
                .andExpect(content().string(hello));    //  mvc.perform 결과 검증 : 본문 내용 검증 ("hello" return 맞는지)
    }
}
