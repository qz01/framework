package com.gyoomi;

import com.gyoomi.adam.core.CHERRY;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

/**
 * 系统配置基类
 *
 * @author Leon
 * @version 2018/5/23 14:40
 */
@SpringBootApplication
public class FrameworkApplication {

    private static final Logger lg = LoggerFactory.getLogger(FrameworkApplication.class);

    public static void main(String[] args) {
        lg.info("Adam-framework start at 【{}】", LocalDateTime.now().format(CHERRY.FORMATTER_DATE_TIME));
        CHERRY.SPRING_CONTEXT = SpringApplication.run(FrameworkApplication.class, args);
    }

}
