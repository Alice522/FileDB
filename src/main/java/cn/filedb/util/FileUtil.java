package cn.filedb.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.io.File;
import java.util.ArrayList;

/**
 * @auther liuzhuochuan
 * @create 2022-03-30-20:17
 **/
@Component
public class FileUtil {

    //获取指定路径的File对象
    private final File dir;

    //LinkedMap存储File对象
    private final ArrayList<File> files = new ArrayList<>();


    //构造器传入一个路径
    @Autowired
    public FileUtil(String dir) {
        this.dir = new File(dir);
    }

    //    遍历当前目录下的所有文件并添加到List集合中
    public void addDicFiles() {
        addDicFiles(dir);
    }

    //    遍历指定目录下的所有文件并添加到files
    public void addDicFiles(File dir) {
        if (dir.isDirectory()) {
//            获取当前目录下的文件
            File[] fs = dir.listFiles();

//            遍历File数组并添加到files中
            if(fs != null) {
                for (File f : fs) {
                    files.add(f);
                    addDicFiles(f);
                }
            }
        }
    }

    public ArrayList<File> getFiles() {
        addDicFiles();
        return files;
    }
}
