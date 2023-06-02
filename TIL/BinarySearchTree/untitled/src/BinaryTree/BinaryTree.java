package BinaryTree;

import java.util.List;

public class BinaryTree {
    public Node root;


    private class Node {
        private Node left;
        private Node right;
        private int value;

        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }
    private boolean find(int value){
        Node currentNode = root;

        while(currentNode != null){
            if(currentNode.getValue()==value){
                return true;
            } else if (currentNode.getValue() > value) {
                currentNode = currentNode.getLeft();
            }else {
                currentNode = currentNode.getRight();
            }
        }
        return false;
    }

    public boolean insert(int value){
        Node newNode = new Node(value);

        if(find(value)){
            return false;
        }
        if(root == null){
            return true;
        }

        Node currentNode = root;
        Node parent;

        while (true){
            parent = currentNode;
            if (value < currentNode.getValue()){
                currentNode = currentNode.getLeft();
                if(currentNode == null){
                    parent.setLeft(newNode);
                    return true;
                }
            }else {
                currentNode = currentNode.getRight();
                if(currentNode ==null){
                    parent.setRight(newNode);
                    return true;
                }
            }
        }
    }

    // 전위 순회
    // 현재 노드 -> 왼쪽 자식 노드 -> 오른쪽 자식 노드
    private List<Integer> preOrderTraverse(Node currentNode, List<Integer> integers){
        if(currentNode !=null){
            integers.add(currentNode.getValue());
            preOrderTraverse(currentNode.getLeft(), integers);
            preOrderTraverse(currentNode.getRight(), integers);
        }
        return integers;
    }

    // 중위 순위
    // 왼쪽 자식 노드 -> 현재 노드 -< 오른쪽 자식 노드
    private List<Integer> inOrderTraverse(Node currentNode, List<Integer> integers){
        if(currentNode != null){
            inOrderTraverse(currentNode.getLeft(), integers);
            integers.add(currentNode.getValue());
            inOrderTraverse(currentNode.getRight(), integers);
        }
        return integers;
    }

    // 후위 순위
    // 현재 노드 -> 왼쪽 자식 노드 -> 오른쪽 자식 노드
    private List<Integer> postOrderTraverse(Node currentNode, List<Integer> integers){
        if (currentNode != null){
            postOrderTraverse(currentNode.getLeft(), integers);
            postOrderTraverse(currentNode.getRight(), integers);
            integers.add(currentNode.getValue());
        }
        return integers;
    }
}
