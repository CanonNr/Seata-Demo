package com.lksun.service1.config;

import io.seata.rm.datasource.DataSourceProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class DataSourceConfig {

//
//    @Bean("dataSource")
//    public DataSource dataSource(DataSource druidDataSource) {
//        return new DataSourceProxy(druidDataSource);
//    }
}
