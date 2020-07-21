package com.xuyanhua.springbootdemo.dao;

import com.xuyanhua.springbootdemo.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, String> {

}
