package cn.filedb.configuration;

import cn.filedb.util.FileDB;
import cn.filedb.util.FileUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther liuzhuochuan
 * @create 2022-03-30-20:45
 **/
@Configuration
@ComponentScan(basePackages = "cn")
public class MyConfiguration {

    @Bean
    public FileUtil fileUtil(){
        return new FileUtil(".");
    }

    @Bean
    public FileDB fileDB(){
        return new FileDB(fileUtil());
    }
}
