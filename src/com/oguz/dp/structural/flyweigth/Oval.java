package com.oguz.dp.structural.flyweigth;

import java.awt.*;

public class Oval implements Shape {

  private boolean fill;

  public Oval(boolean fill) {
    this.fill = fill;
    System.out.println("Created oval object.");
    try {
      Thread.sleep(2000);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
    circle.setColor(color);
    circle.drawOval(x, y, width, height);
    if (fill) {
      circle.fillOval(x, y, width, height);
    }
  }
}
