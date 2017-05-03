package qianjun.service;

/**
 * Created by ZiJun
 * Description:
 * Date: 2017/5/3 :11:37.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloMessageService {

  @Value("${name:unknown}")
  private String name;

  public String getMessage() {
    return getMessage(name);
  }

  public String getMessage(String name) {
    return "Hello " + name;
  }

}
