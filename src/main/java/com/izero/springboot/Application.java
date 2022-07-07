package com.izero.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//  SpringBootApplication 어노테이션이 있는 위치부터 설정을 읽어가므로, 클래스는 항상 프로젝트의 최상단에 위치하여야 함
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        //  해당 run 함수로 내장 WAS를 실행. 내장 WAS란 별도로 외부에 WAS를 두지 않고 앱 실행 시 내부에서 WAS를 실행하는 것
        //  이러면 항상 서버에 Tomcat을 설치할 필요가 없어짐.
        //  내장 WAS를 사용해야 '언제 어디서나 같은 환경에서 스프링 부트 배포' 가능. 외장 WAS 사용시 실수할 여지도 많고 시간도 많이 필요함.
        SpringApplication.run(Application.class, args);
    }
}
