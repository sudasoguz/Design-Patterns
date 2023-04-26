package com.oguz.dp.structural.composite;

import com.oguz.dp.structural.composite.iterator.DirectoryIterator;

import java.util.List;

public interface StorageContainer {

  void add(Storage element);

  void delete(Storage element);

  void list();

  List<Storage> elements();

  DirectoryIterator iterator();
}
