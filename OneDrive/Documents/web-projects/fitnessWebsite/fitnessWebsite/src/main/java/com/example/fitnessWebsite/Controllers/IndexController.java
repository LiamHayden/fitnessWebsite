package com.example.fitnessWebsite.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  // private final Indexservice indexService;

  @GetMapping("/")
  public String index() {
    return "index";
  }
}