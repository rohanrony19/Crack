package com.rohan.Algorithm.trees.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
// Stack
public class DFSForIterative {
    static void dfsIterative(int start, List<List<Integer>> graph) {
        boolean[] visited = new boolean[graph.size()];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                System.out.print(node + " ");
                visited[node] = true;

                // push neighbors
                for (int neighbor : graph.get(node)) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int n = 5;
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);

        dfsIterative(0, graph);
    }
}
