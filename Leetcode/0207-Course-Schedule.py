class Solution:
    def canFinish(self, numCourses, prerequisites):
        graph = {i: [] for i in range(numCourses)}
        for u, v in prerequisites:
            graph[v].append(u)
        visited = [0] * numCourses
        def dfs(course):
            if visited[course] == -1:
                return False
            if visited[course] == 1:
                return True
            visited[course] = -1
            for nei in graph[course]:
                if not dfs(nei):
                    return False
            visited[course] = 1
            return True
        for i in range(numCourses):
            if not dfs(i):
                return False
        return True
