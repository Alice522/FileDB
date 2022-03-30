package cn.filedb.domian;

import java.util.Date;

/**
 * @auther liuzhuochuan
 * @create 2022-03-30-19:07
 **/
public class File {

    private int id;
    private String name;
    private long size;
    private Date time;
    private String dir;

    public File() {
    }

    public File(int id, String name, long size, Date time, String dir) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.time = time;
        this.dir = dir;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", time=" + time +
                ", dir='" + dir + '\'' +
                '}';
    }
}
