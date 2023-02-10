package com.rmcbride.one;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

class MainTest {
  
  @SneakyThrows
  @Test
  void solution() {
    Main.main(new String[]{"2022/one/input.txt"});
  }
  
  @SneakyThrows
  @Test
  void test() {
    Main.main(new String[]{"2022/one/test-input.txt"});
  }
  
}