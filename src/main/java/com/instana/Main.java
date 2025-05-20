package com.instana;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.instana.tasks.Task1;
import com.instana.tasks.Task2;

import io.github.cdimascio.dotenv.Dotenv;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    Dotenv dotenv = Dotenv.configure().load();

    try {

      Task1 task1 = new Task1();
      task1.startTask();

      Task2 task2 = new Task2();
      task2.startTask();

    } catch (Exception e) {
      logger.error("Error in main", e);
    }
  }

}
