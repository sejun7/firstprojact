package com.example.firstprojact.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // /DB가 해당 객체 인식 가능
@AllArgsConstructor
@ToString
public class Article {

    @Id // 대표값을 지정 ex)주민등록번호
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

}
