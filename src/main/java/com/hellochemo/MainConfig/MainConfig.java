package com.hellochemo.MainConfig;

import com.hellochemo.dbconfig.DbConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.hellochemo.dao","com.hellochemo.service"})
@Import(DbConfig.class)
public class MainConfig {

}