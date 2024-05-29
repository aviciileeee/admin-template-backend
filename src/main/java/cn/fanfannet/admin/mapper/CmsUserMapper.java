package cn.fanfannet.admin.mapper;

import cn.fanfannet.admin.entity.CmsUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CmsUserMapper {


    List<CmsUser> selectUsers();
}
