class Solution {
public:
    int minimumTime(int n, vector<vector<int>>& relations, vector<int>& time) {
        vector<vector<int>> graph(n);

        for (const vector<int>& relation : relations) {
            int prev = relation[0] - 1;
            int next = relation[1] - 1;
            graph[prev].push_back(next);
        }

        vector<int> memo(n, -1);

        function<int(int)> calculateTime = [&](int course) {
            if (memo[course] != -1) {
                return memo[course];
            }

            if (graph[course].empty()) {
                memo[course] = time[course];
                return memo[course];
            }

            int maxPrerequisiteTime = 0;
            for (int prereq : graph[course]) {
                maxPrerequisiteTime = max(maxPrerequisiteTime, calculateTime(prereq));
            }

            memo[course] = maxPrerequisiteTime + time[course];
            return memo[course];
        };

        int overallMinTime = 0;
        for (int course = 0; course < n; course++) {
            overallMinTime = max(overallMinTime, calculateTime(course));
        }

        return overallMinTime;
    }
};
9c6f9412-c860-47d6-9a2e-7fcf37ff3321_1686334926.180891.png

Previous
🗓️ Daily LeetCoding Challenge October, Day 18
Next
🔥100% DFS,🔥80% Topological,🔥100% Dynamic Approach Detailed Explained | Java | C++ | Python
Comments (0)

Sort by:Best
Type comment here... (Markdown supported)
Preview
Comment
No comments yet.

  
