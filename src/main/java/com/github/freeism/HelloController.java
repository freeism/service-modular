package com.github.freeism;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Martin
 * @since 2016. 12. 27.
 */
@Controller
public class HelloController {
  @RequestMapping(value = "/test")
  @ResponseBody
  public String test() {
    return "Hello";
  }
}
