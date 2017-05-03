package qianjun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import qianjun.service.HelloMessageService;

import static java.lang.System.exit;

/**
 * Created by ZiJun
 * Description:
 * Date: 2017/5/3 :11:29.
 */
@SpringBootApplication
public class Bootstrap implements CommandLineRunner {

  @Autowired
  private HelloMessageService helloService;

  public static void main(String[] args) {
//    SpringApplication.run(Main.class, args);

    SpringApplication app = new SpringApplication(Bootstrap.class);
    app.setBannerMode(Banner.Mode.OFF);
    app.run(args);
  }

  @Override
  public void run(String... args) throws Exception {
    if (args.length > 0) {
      System.out.println(helloService.getMessage(args[0].toString()));
    } else {
      System.out.println(helloService.getMessage());
    }

    exit(0);
  }
}
