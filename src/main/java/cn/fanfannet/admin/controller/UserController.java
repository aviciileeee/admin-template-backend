package cn.fanfannet.admin.controller;

import cn.fanfannet.admin.dto.ApiResponse;
import cn.fanfannet.admin.dto.LoginDto;
import cn.fanfannet.admin.entity.CmsUser;
import cn.fanfannet.admin.service.CmsUserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private CmsUserService cmsUserService;

    @PostMapping("/login")
    public ApiResponse login(@RequestBody(required = false) LoginDto loginDto) throws InterruptedException {
        System.out.println(loginDto);
        Thread.sleep(3000);
        return ApiResponse.success("hello");
    }


    @GetMapping("/getUserInfo")
    public ApiResponse getUserInfo() {
        return ApiResponse.success(Map.of("username", "avicii", "userId", "11111"));
    }

    @GetMapping("/list")
    public ApiResponse getUserList(
            @RequestParam(name = "pageNumber") Integer pageNumber,
            @RequestParam(name = "pageSize") Integer pageSize) {
        PageInfo<List<CmsUser>> pagingUsers = cmsUserService.findPagingUsers(pageNumber, pageSize);
        return ApiResponse.success(pagingUsers);
    }
}
