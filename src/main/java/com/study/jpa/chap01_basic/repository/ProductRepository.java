package com.study.jpa.chap01_basic.repository;

import com.study.jpa.chap01_basic.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository는 우리가 xml로 작성했던 모든 sql문이 다 있다.
// 첫번째 재너릭은 entity 두번째 재너릭은 pk타입
public interface ProductRepository extends JpaRepository<Product, Long> {

}
