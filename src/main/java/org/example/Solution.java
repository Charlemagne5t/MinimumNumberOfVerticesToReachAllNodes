package org.example;

import java.util.*;


public class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> setOfNodes = new HashSet<>();

        for (int i = 0; i < edges.size(); i++) {
            setOfNodes.add(edges.get(i).get(0));
        }

        for (int i = 0; i < edges.size(); i++) {
            setOfNodes.remove(edges.get(i).get(1));

        }
        return new ArrayList<>(setOfNodes);
    }
}
