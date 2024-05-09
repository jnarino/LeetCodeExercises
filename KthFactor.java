import javax.swing.tree.TreeNode;

class Practica {

    public static void main(String[] args) {
        // System.out.println("STARTING");
        // System.out.println(kthFactor(7, 2));
        // System.out.println("END");
        // TreeNode root = new TreeNode(1);

    }

    private static int kthFactor(int n, int k) {
        int count = 0;
        int i;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        return -1;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {

        return null;

    }
}