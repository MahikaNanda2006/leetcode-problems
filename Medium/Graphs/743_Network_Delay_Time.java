//Creating a graph datatype

class Pair
{
    int Node;
    int weight;
    Pair(int Node, int weight)
    {
        this.Node = Node;
        this.weight = weight;
    }    
}

class Solution 
{
    ArrayList<Pair>[] adj;
    Boolean[] visited;
    public int networkDelayTime(int[][] times, int n, int k) 
    {
        adj = new ArrayList[n+1];
        visited = new Boolean[n+1];
        for (int i = 1; i <= n; i++) 
        {
            adj[i] = new ArrayList<>();
        }

        
            int m = times.length;
        for (int i = 0; i < m; i++) {
            int u = times[i][0];
            int v = times[i][1];
            int w = times[i][2];
            adj[u].add(new Pair(v, w));
        

        }
        //For this, we need to use Djikstra, to get the shortest path. That's all.
        //We have a starting node already. We just need to find the distance of the starting node from each node. 
        int dist[] = new int[n+1];
        // Everything else starts out as 0
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0; //As the distance of a node to itself will be 0
        //We use priority queues because we want it to always push out the maximum value
        //In the PQ, we store distance,node pairs. We then let the PQ know that it needs to sort the nodes by distance
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[0] - b[0]));
        pq.add(new int[]{0, k});
        while(!pq.isEmpty())
        {
            int[] cur = pq.poll();//Cur then takes out the current shortest distance
            int distSoFar = cur[0];
            int node = cur[1]; // At this point, we've taken out the current best node, which is ofc the start node itsekf
            //So for each additional node, now, we have to find the next shortest distance wala option
            if (distSoFar > dist[node]) continue; //If the current distSoFar is greater than the distance we already logged, then we ignore it
            //Now we check the neighbours
            for(Pair edge : adj[node])
            {
                int next  = edge.Node;
                int w = edge.weight;
                if (distSoFar + w < dist[next])
                {
                    dist[next] = distSoFar + w;
                    pq.add(new int[]{dist[next], next});
                }
            }
        }
        int max = 0;
        for (int i = 1; i<=n; i++)
        {
            if(dist[i] == Integer.MAX_VALUE) return -1;
            max = Math.max(max, dist[i]);

        }
        return max;
    }

}