package BinaryTree;

public class IsExist {
  public static void main(String[] args) {
    BinaryNode<Integer> node = new BinaryNode(5);
    BinaryNode<Integer> iterator = node;
    BinaryNode<Integer> left;
    BinaryNode<Integer> right;

    for (int i = 0; i < 10; i++) {
      left = new BinaryNode<Integer>(i);
      right = new BinaryNode<Integer>(i);
      iterator.setLeft(left);
      iterator.setRight(right);
      iterator = iterator.getLeft();
    }

    System.out.println(node.toString());
    System.out.println(isExist(node, 1));
    System.out.println(isExist(node, 69));
  }
  private static boolean isExist(BinaryNode<Integer> node, int target) {
    if (node == null) return false;
    if (node.getValue() == target) return true;

    return isExist(node.getLeft(), target) || isExist(node.getRight(), target);
  }
}
