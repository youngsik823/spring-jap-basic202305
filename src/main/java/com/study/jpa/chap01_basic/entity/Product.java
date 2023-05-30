package com.study.jpa.chap01_basic.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter @Getter
@ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_product")
public class Product {
// Mysql은 IDENTITY oracle은 SEQUENCE
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private long id;

    @Column(name = "prod_nm", nullable = false, length = 30)
    private String name;

    @Builder.Default // Build를 쓰면 붙여야 한다
    private int price = 0; // insert 안했을때 0으로 하고싶으면 default 0

    @Enumerated(EnumType.STRING) // 이걸 설정해야 Integer에서 String으로 나온다
    private Category category;

    @CreationTimestamp
    @Column(updatable = false)// 등록이 한번되면 수정을 못하게 해준다
    private LocalDateTime createdDate;

    @UpdateTimestamp
    private LocalDateTime updatedDate;

    public enum Category {
        FOOD, FASHION, ELECTRONIC
    }
}
