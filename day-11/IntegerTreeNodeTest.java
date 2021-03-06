public class IntegerTreeNodeTest {
    public static void main(String[] args) {
        IntegerTreeNode integerTreeNode1 = new IntegerTreeNode(4);

        integerTreeNode1.add(2);
        integerTreeNode1.add(6);
        integerTreeNode1.add(-1);
        System.out.println("integerTreeNode1.contains(7): " + integerTreeNode1.contains(7));
        integerTreeNode1.add(7);
        System.out.println("integerTreeNode1.contains(7): " + integerTreeNode1.contains(7));
        System.out.println("integerTreeNode1.getMax(): " + integerTreeNode1.getMax());
        System.out.println("integerTreeNode1.getMin(): " + integerTreeNode1.getMin());
        System.out.println("integerTreeNode1.toString(): " + integerTreeNode1.toString());
        System.out.println("integerTreeNode1.getDepth(): " + integerTreeNode1.getDepth());
        System.out.println("integerTreeNode1.containsVerbose(7): " + integerTreeNode1.containsVerbose(7));
    }
}