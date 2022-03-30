package cn.filedb;

import cn.filedb.domian.Student;
import cn.filedb.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;


/**
 * @auther liuzhuochuan
 * @create 2022-03-30-13:44
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config.xml")
public class StudentMapperTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void testInsert(){
        List<Student> stus = studentMapper.getAllStudent();
        for(Student s : stus){
            System.out.println(s);
        }
    }
}
