package com.java.xue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xue.zeng
 * @date 2020/12/28 12:03 PM
 */
@RestController
@SpringBootApplication
public class DockerfileApplication {
  public static void main(final String[] args) {
    SpringApplication.run(DockerfileApplication.class);
  }

  @GetMapping("/docker/hello")
  public String helloDocker() {
    return "hello docker";
  }
}
