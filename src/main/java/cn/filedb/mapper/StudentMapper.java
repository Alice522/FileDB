package cn.filedb.mapper;

import cn.filedb.domian.Student;

import java.util.List;

/**
 * @auther liuzhuochuan
 * @create 2022-03-30-13:32
 **/
public interface StudentMapper {

    void insertStudent();

    List<Student> getAllStudent();
}
