package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {
  @GetMapping("/")
  fun gerb(): String {
    return "gerb.html"
  }
}
