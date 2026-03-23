/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Pair {
    TreeNode node;
    int row,hd;

    Pair(TreeNode node, int row ,int hd) {
        this.node = node;
        this.row = row;
        this.hd = hd;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer, List<int[]>> map = new TreeMap<>();
        q.add(new Pair(root, 0, 0));
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            map.putIfAbsent(curr.hd, new ArrayList<>());
            map.get(curr.hd).add(new int[]{curr.row, curr.node.val});

            if (curr.node.left != null)
                q.add(new Pair(curr.node.left, curr.row+1, curr.hd - 1));

            if (curr.node.right != null)
                q.add(new Pair(curr.node.right, curr.row+1, curr.hd + 1));
        }
        for (List<int[]> list : map.values()) {
            Collections.sort(list, (a, b) -> {
                if (a[0] == b[0]) return a[1] - b[1];
                return a[0] - b[0];
            });

            List<Integer> col = new ArrayList<>();
            for (int[] arr : list) {
                col.add(arr[1]);
            }

            res.add(col);
        }

        return res;
    }
}