package com.izero.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor  //  기본 생성자 자동 추가 (public Posts() {}와 같은 효과)
@Entity //  테이블과 링크될 클래스임을 나타냄 (SalesManager.java -> sales_manager 테이블)
public class Posts {
    @Id //  해당 테이블의 PK 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK의 생성 규칙을 나타냄. GenerationType.IDENTITY 추가해야만 auto_increment
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder    //  해당 클래스의 빌더 패턴 클래스 생성
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
