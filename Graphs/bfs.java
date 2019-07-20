class Traversal {
    static void bfs(int s, ArrayList<ArrayList<Integer>> list, boolean vis[]) {
        Queue<Integer> queue = new LinkedList();

        vis[s] = true;
        queue.add(s);
        while (!queue.isEmpty()) {
            int front = queue.poll();
            System.out.print(front + " ");
            for (int i = 0; i < list.get(front).size(); i++) {
                if (vis[list.get(front).get(i)] == false) {
                    queue.add(list.get(front).get(i));
                    vis[list.get(front).get(i)] = true;

                }
            }

        }

    }
}
