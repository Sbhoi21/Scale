package z_random_geek;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

import z_classroom.TreeNode;

public class TreeZigzagLevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode n = new TreeNode(1,
				new TreeNode(2, new TreeNode(4, null, null),
						new TreeNode(5, new TreeNode(7, null, null), new TreeNode(8, null, null))),
				new TreeNode(3, new TreeNode(6, null,
						new TreeNode(9, new TreeNode(10, null, null), new TreeNode(11, null, null))), null));

		System.out.println(zigzagLevelOrder(n));
	}

	public static List<Integer> zigzagLevelOrder(TreeNode root) {

		List<Integer> ans = new ArrayList<>();

		if (root == null)
			return null;

		Queue<TreeNode> qu = new ArrayDeque<TreeNode>();
		qu.add(root);
		boolean level = false;
		while (qu.size() > 0) {
			int size = qu.size();

			List<Integer> list = new ArrayList<>();

			for (int i = 0; i < size; i++) {
				TreeNode node = qu.remove();
				if (node.left != null)
					qu.add(node.left);
				if (node.right != null)
					qu.add(node.right);

				list.add(node.val);

			}

			if (level) {
				Collections.reverse(list);
			}
			ans.addAll(list);
			level = !level;
		}

		return ans;

	}

}
