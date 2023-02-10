package com.rmcbride;

import com.rmcbride.one.Main;
import java.io.IOException;
import java.io.InputStream;

public interface Util {
  static String getInputString(String[] args) throws IOException {
    String inputFile = args[0];
    InputStream stream = Main.class.getClassLoader().getResourceAsStream(inputFile);
    if(stream == null) {
      throw new RuntimeException("Could not find input file: " + inputFile);
    }
    final byte[] x = stream.readAllBytes();
    return new String(x);
  }
}
