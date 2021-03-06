package com.example.learningspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
  @GetMapping("/add/{num}/and/{num2}")
  @ResponseBody
  public int add(@PathVariable int num, @PathVariable int num2) {
    return num + num2;
  }
  @GetMapping("/subtract/{numOne}/from/{numTwo}")
  @ResponseBody
  public int subtract(@PathVariable int numOne, @PathVariable int numTwo) {
    return numTwo - numOne;
}
  @GetMapping("/multiply/{firstNum}/and/{secondNum}")
  @ResponseBody
  public int multiply(@PathVariable int firstNum, @PathVariable int secondNum) {
    return firstNum * secondNum;
  }
  @GetMapping("/divide/{dividend}/by/{divisor}")
  @ResponseBody
  public int divide(@PathVariable int dividend, @PathVariable int divisor) {
    return dividend /  divisor;
  }
}
