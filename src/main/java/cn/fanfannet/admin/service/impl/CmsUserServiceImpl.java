package cn.fanfannet.admin.service.impl;

import cn.fanfannet.admin.entity.CmsUser;
import cn.fanfannet.admin.mapper.CmsUserMapper;
import cn.fanfannet.admin.service.CmsUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmsUserServiceImpl implements CmsUserService {

    @Autowired
    private CmsUserMapper cmsUserMapper;

    @Override
    public PageInfo<List<CmsUser>> findPagingUsers(Integer pageNumber, Integer pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        return new PageInfo(cmsUserMapper.selectUsers());
    }
}
