package BinaryTree;

public class BinaryNode<T> implements TreePrinter.PrintableNode {
  private T value;
  private BinaryNode<T> left;
  private BinaryNode<T> right;

  public BinaryNode(T value, BinaryNode<T> left, BinaryNode<T> right) {
    this.value = value;
    this.left = left;
    this.right = right;
  } 
  public BinaryNode(T value) {
    this.value = value; 
    this.left = null;
    this.right = null;
  }
  public boolean hasLeft() { return this.left != null; }
  public boolean hasRight() { return this.right != null; }
  public T getValue() { return this.value; }
  public BinaryNode<T> getLeft() { return this.left; }
  public BinaryNode<T> getRight() { return this.right; }
  public void setValue(T value) { this.value = value; }
  public void setLeft(BinaryNode<T> left) { this.left = left; }
  public void setRight(BinaryNode<T> right) { this.right = right; }
  public String toString() {
    return this.getValue().toString();
  }
}
