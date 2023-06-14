package com.rmcbride.two;

import com.rmcbride.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
  final static Map<Character, Integer> OP_VALUES = new HashMap<>() {{
    put('A', 1);
    put('B', 2);
    put('C', 3);
  }};
  
  
  final static Map<Character, Integer> PLAYER_VALUES = new HashMap<>() {{
    put('X', 1);
    put('Y', 2);
    put('Z', 3);
  }};
  
  public static void main(String[] args) throws IOException {
    final String inputString = Util.getInputString(args);
    System.out.println(getScore(inputString));
  }
  
  private static long getScore(String inputString) {
    long score = 0;
    Character op = null;
    for (int i = 0; i < inputString.length(); i++) {
      char c = inputString.charAt(i);
      if(Character.isLetter(c)){
        if(op==null){
          op =c;
        }else{
          score += calculateScore(op, c);
          op = null;
        }
      }
    }
    return score;
  }
  
  private static long calculateScore(char opponent, char player) {
    long score = PLAYER_VALUES.get(player);
    if(score == OP_VALUES.get(opponent)){
      score += 3;
    }
    else if(player == 'X' && opponent == 'C' || player == 'Y' && opponent == 'A' || player =='Z' && opponent == 'B'){
      score += 6;
    }
    return score;
  }
  
}