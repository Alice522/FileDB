package cn.filedb.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

/**
 * @auther liuzhuochuan
 * @create 2022-03-30-20:32
 **/
@Component
public class FileDB {

    private final ArrayList<File> files;
    private final ArrayList<cn.filedb.domian.File> fileArrayList = new ArrayList<>();

    @Autowired
    public FileDB(FileUtil fileUtil) {
        this.files = fileUtil.getFiles();
    }

    public ArrayList<cn.filedb.domian.File> execute(){
        for(File f : files){
            fileArrayList.add(new cn.filedb.domian.File(1,f.getName(),f.length(),new Date(f.lastModified()),f.getAbsolutePath()));
        }
        return fileArrayList;
    }
}
