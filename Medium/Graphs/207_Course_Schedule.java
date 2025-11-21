import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new List[numCourses];
        for (int i = 0; i < numCourses; i++) graph[i] = new ArrayList<>();
        for (int[] prereq : prerequisites) {
            int course = prereq[0];
            int pre = prereq[1];
            graph[pre].add(course); 
        }

        int[] state = new int[numCourses]; 

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, state, graph)) return false;
        }
        return true;
    }

    private boolean dfs(int course, int[] state, List<Integer>[] graph) {
        if (state[course] == 1) return false;
        if (state[course] == 2) return true;  

        state[course] = 1; 
        for (int neighbor : graph[course]) {
            if (!dfs(neighbor, state, graph)) return false;
        }
        state[course] = 2; 
        return true;
    }
}
