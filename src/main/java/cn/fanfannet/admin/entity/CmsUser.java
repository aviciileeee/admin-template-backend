package cn.fanfannet.admin.entity;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Data
public class CmsUser {

    private Long id;
    private String userName;
    private String email;
    private Integer state;
    private Integer role;
    private Date registerTime;
}
