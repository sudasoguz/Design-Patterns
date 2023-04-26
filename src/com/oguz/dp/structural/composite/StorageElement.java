package com.oguz.dp.structural.composite;

public abstract class StorageElement implements Storage {
  protected String name;
  protected Storage parent;
  protected boolean directory;

  public StorageElement(String name, Storage parent) {
    this.name = name;
    this.parent = parent;
  }

  @Override
  public void rename(String newName) {
    setName(newName);
  }

  @Override
  public void save() {
    System.out.println("Saving the element.");
  }

  @Override
  public void delete() {
    ((Directory) parent).delete(this);
  }

  @Override
  public Storage copy() {
    return null;
  }

  @Override
  public void move(Directory target) {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Storage getParent() {
    return parent;
  }

  public void setParent(Storage parent) {
    this.parent = parent;
  }

  public boolean isDirectory() {
    return directory;
  }

  public void setDirectory(boolean directory) {
    this.directory = directory;
  }

  @Override
  public String toString() {
    return name;
  }
}
