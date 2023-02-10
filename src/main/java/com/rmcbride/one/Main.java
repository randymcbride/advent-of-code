package com.rmcbride.one;

import com.rmcbride.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
  
  public static void main(String[] args) throws IOException {
    String input = Util.getInputString(args);
    System.out.println(getMaxCalories(input));
  }
  
  private static Long getMaxCalories(String input) {
    Values values = new Values(0L, 0L, 0L);
    long sum = 0L;
    for (String line : input.split("\n")) {
      if(!line.isEmpty()) {
        sum += Long.parseLong(line);
      }else{
        updateValues(values, sum);
        sum = 0L;
        
      }
    }
  updateValues(values, sum);  
    return values.getFirst() + values.getSecond() + values.getThird();
  }
  
  private static void updateValues(Values values, Long sum) {
    if(sum > values.getFirst()) {
      values.setThird(values.getSecond());
      values.setSecond(values.getFirst());
      values.setFirst(sum);
    }else if(sum > values.getSecond()) {
      values.setThird(values.getSecond());
      values.setSecond(sum);
    }else if(sum > values.getThird()) {
      values.setThird(sum);
    }
  }
}
