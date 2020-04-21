package com.example.mall.generator.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description
 *
 * @author : Charles
 * @date : 2020/4/6
 */
@Configuration
@MapperScan("com.example.mall.temp.mapper")
public class MyBatisConfig {

}
