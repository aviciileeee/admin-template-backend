package cn.fanfannet.admin.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("")
    public Response test() {
        Response response = new Response();
        response.setCode(0);
        response.setData(Map.of("name", "avicii"));
        return response;
    }
}

@Data
class Response {

    private Map data;
    private Integer code;
}
