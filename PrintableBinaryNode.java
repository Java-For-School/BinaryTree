package BinaryTree;

public class PrintableBinaryNode<T> {
  private int min; 
  private int max;
  
  public PrintableBinaryNode() {
    this.min = 0;
    this.max = 0;
  }
  public void findMinMax(BinaryNode<T> node, int hd) {
    if (node == null) return;
    if (hd < min) this.min = hd;
    else if (hd > max) this.max = hd;
    
    findMinMax(node.getLeft(), hd - 1);
    findMinMax(node.getRight(), hd + 1);
  }
  public void printLine(BinaryNode<T> node, int line, int hd) {
    if (node == null) return;
    if (line == hd) System.out.print(node.getValue() + " ");
    
    printLine(node.getLeft(), line, hd - 1);
    printLine(node.getRight(), line, hd + 1);
  }
  public void printBinaryNode(BinaryNode<T> node) {
    findMinMax(node, 0); 
    for (int line = this.min; line <= this.max; line++) {
      printLine(node, line, 0);
      System.out.println("");
    }
  }
}
