package qianjun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by ZiJun
 * Description:
 * Date: 2017/5/3 :14:39.
 */
@Controller
public class WelcomeController {

  @Value("${welcome.message:test}")
  private String message = "Hello Spring Boot";

  @RequestMapping("/")
  public String welcome(Map<String, Object> model){
    model.put("message", this.message);

    return "welcome";
  }
}
