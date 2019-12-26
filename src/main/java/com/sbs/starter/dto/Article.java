package com.sbs.starter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data //위 다섯개 어노테이션을 한꺼번에 생성
@RequiredArgsConstructor //다른 생성자를 생성하는 어노테이션을
@AllArgsConstructor //모든 필드값을 파라미터로 받는 생성자 생성
@NoArgsConstructor //파라미터없는 기본 생성자 생성
public class Article {
	private long id;
	private String regDate;
	private String title;
	private String body;
}
