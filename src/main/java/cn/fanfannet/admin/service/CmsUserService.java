package cn.fanfannet.admin.service;

import cn.fanfannet.admin.entity.CmsUser;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CmsUserService {

    PageInfo<List<CmsUser>> findPagingUsers(Integer pageNumber, Integer pageSize);

}
