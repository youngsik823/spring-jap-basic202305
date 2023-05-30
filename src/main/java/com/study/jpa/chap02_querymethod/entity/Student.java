package com.study.jpa.chap02_querymethod.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Setter // 실무적 측면에서 setter는 신중히 만들것
@Getter
@ToString
@EqualsAndHashCode(of = {"id"}) // id가 똑같으면은 둘이 똑같은 애다
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tbl_student")
public class Student {

    @Id
    @Column(name = "stu_id")
    @GeneratedValue(generator = "uid")
    @GenericGenerator(strategy = "uuid", name = "uid")
    private String id;

    @Column(name = "stu_name", nullable = false)
    private String name;

    private String city;
    private String major;
}
