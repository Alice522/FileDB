package cn.filedb.mapper;

import cn.filedb.domian.File;

/**
 * @auther liuzhuochuan
 * @create 2022-03-30-19:12
 **/
public interface FileMapper {

    int insertFile(File file);

    int deleteFile(String name);
}
