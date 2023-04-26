package com.oguz.dp.structural.composite;

public interface Storage {

  void rename(String newName);

  void save();

  void delete();

  Storage copy();

  void move(Directory target);
}
