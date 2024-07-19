package br.dev.ferreiras.challenges.leetCode;

public class TreeNodeGoodLeafNodes {
  int res = 0;

  private int[] dfs(TreeNode node, int distance) {
    var map = new int[distance + 1];

    if (node == null) return map;

    if (node.left == null && node.right == null)
      map[1] = 1;

    var left = dfs(node.left, distance);
    var right = dfs (node.right, distance);

    for (var i = 1; i < distance; i++)
      for (var j = 1; j <= distance - i; j++)
        res += (left[i] * right[j]);

    for (var i = 2; i < distance + 1; i++)
      map[i] += left[i-1] + right[i-1];

    return map;
  }

  public int countPairs(TreeNode root, int distance) {
    dfs(root, distance);
    return res;
  }
}
