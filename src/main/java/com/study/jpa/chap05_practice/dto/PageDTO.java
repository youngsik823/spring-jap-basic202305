package com.study.jpa.chap05_practice.dto;

import lombok.*;

@Getter @Setter
@AllArgsConstructor // request라서 setter와 AllArgsConstructor가 있어야 한다
@Builder
@ToString @EqualsAndHashCode
public class PageDTO {

    private int page;
    private int size;

    public PageDTO() {
        this.page = 1;
        this.size = 10;
    }
}