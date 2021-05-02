package cn.niter.forum.dto;

import lombok.Data;

@Data
public class FileDTO {
    private Integer errno; //错误代码，0 表示没有错误。
    private String[] data; //已上传的图片路径
   // private String layData; //已上传的图片路径

    public Integer getErrno() {
        return errno;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
}
