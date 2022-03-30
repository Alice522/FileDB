package cn.filedb;

import cn.filedb.domian.File;
import cn.filedb.mapper.FileMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * @auther liuzhuochuan
 * @create 2022-03-30-19:40
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config.xml")
public class FileMapperTest {

    @Autowired
    private FileMapper fileMapper;

    @Test
    public void testInsertFile(){
        int num = fileMapper.insertFile(new File(1,"liu",124, new Date(),"d"));
        System.out.println(num);
    }

    @Test
    public void testDeleteFile(){
        int num = fileMapper.deleteFile("liu");
        System.out.println(num);
    }
}
