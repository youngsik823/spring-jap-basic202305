package com.study.jpa.chap05_practice.dto;

import com.study.jpa.chap05_practice.entity.Post;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostCreateDTO {

    // 클라이언트가 어떻게 던질지
    @NotBlank
    @Size(min = 2, max = 5)
    private String writer;
    @NotBlank
    @Size(min = 1, max = 20)
    private String title;
    private String content;
    private List<String> hashTags;

    // dto를 엔터티로 변환하는 메서드
    // 엔터티 변환할때는 해시테그를 넣는게 아니다.
    public Post toEntity() {
        return Post.builder()
                .writer(this.writer)
                .content(this.content)
                .title(this.title)
                .build();
    }

}
