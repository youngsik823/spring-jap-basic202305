package com.study.jpa.chap04_relation.repository;

import com.study.jpa.chap04_relation.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository
        extends JpaRepository<Department, Long> {

    // 별칭을 써야한다
    // jpql 문법
    // fetch join
    @Query("SELECT DISTINCT d FROM Department d JOIN FETCH d.employees")
    List<Department> findAllIncludeEmployees();
}