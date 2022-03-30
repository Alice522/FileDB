package cn.filedb;

import cn.filedb.domian.File;
import cn.filedb.mapper.FileMapper;
import cn.filedb.util.FileDB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

/**
 * @auther liuzhuochuan
 * @create 2022-03-30-20:23
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config.xml")
public class StartFileDBTest {

    @Autowired
    private FileMapper fileMapper;

    @Autowired
    private FileDB fileDB;

    private ArrayList<File> files;

    @Test
    public void fileDBTest(){
        files = fileDB.execute();

        for(File f : files){
            fileMapper.insertFile(f);
        }
    }
}
