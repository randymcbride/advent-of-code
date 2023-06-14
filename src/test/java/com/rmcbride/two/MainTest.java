package com.rmcbride.two;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
  @SneakyThrows
  @Test
  void test() {
    Main.main(new String[]{"2022/two/test-input.txt"});
  }
  
}