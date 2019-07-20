class Traversal {
    static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean vis[]) {
        System.out.print(src + " ");
        vis[src] = true;
        for (int i = 0; i < list.get(src).size(); i++) {
            if (vis[list.get(src).get(i)] == false) {
                dfs(list.get(src).get(i), list, vis);
            }

        }

    }
}