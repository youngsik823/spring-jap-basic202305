package com.study.jpa.chap03_pagination.repository;

import com.study.jpa.chap02_querymethod.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentPageRepository
        extends JpaRepository<Student, String> {

    // 학생 조건없이 전체조회 페이징 (기본기능 - 안만들어도됨)
    Page<Student> findAll(Pageable pageable);

    // 학생의 이름에 특정단어가 포함된걸 조회 + 페이징
    Page<Student> findByNameContaining(String name, Pageable pageable);
    // 특정 조회를 찾고싶을때 앞에 이름과 마지막에 Pageable을 넣어야 한다

    // findByStartWith - 00%
    // findByEndWith - %00

}
