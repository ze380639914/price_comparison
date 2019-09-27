package com.zewu.price.comparison.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan({"com.zewu.price.comparison.mbg.mapper","com.zewu.price.comparison.dao"})
public class MyBatisConfig {
}
