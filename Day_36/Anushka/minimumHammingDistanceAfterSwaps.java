package Day_36.Anushka;

import java.util.*;

public class minimumHammingDistanceAfterSwaps {

    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4};
        int[] target = {2, 1, 4, 5};
        int[][] allowedSwaps = {{0, 1}, {2, 3}};

        minimumHammingDistanceAfterSwaps obj = new minimumHammingDistanceAfterSwaps();
        int ans = obj.minimumHammingDistance(source, target, allowedSwaps);

        System.out.println("Answer: " + ans);
    }

    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n = source.length;

        UnionFind uf = new UnionFind(n);

        for (int[] swap : allowedSwaps) {
            uf.union(swap[0], swap[1]);
        }

        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int parent = uf.find(i);
            groups.computeIfAbsent(parent, k -> new ArrayList<>()).add(i);
        }

        int ans = 0;

        for (List<Integer> group : groups.values()) {
            Map<Integer, Integer> freq = new HashMap<>();

            for (int idx : group) {
                freq.put(source[idx], freq.getOrDefault(source[idx], 0) + 1);
            }

            for (int idx : group) {
                if (freq.getOrDefault(target[idx], 0) > 0) {
                    freq.put(target[idx], freq.get(target[idx]) - 1);
                } else {
                    ans++;
                }
            }
        }

        return ans;
    }
}

// Union Find
class UnionFind {
    int[] parent;

    public UnionFind(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }

    public int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    public void union(int a, int b) {
        parent[find(a)] = find(b);
    }
}