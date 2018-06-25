package Arrays_;

import java.util.*;
/*Given an absolute path for a file (Unix-style), simplify it.

For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"*/
public class path {
    class Solution {
        public String simplifyPath(String path) {
            Deque<String> stack = new LinkedList<>();
            Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
            for (String dir : path.split("/")) {
                if (dir.equals("..") && !stack.isEmpty()) stack.pop();
                else if (!skip.contains(dir)) stack.push(dir);
            }
            String res = "";
            for (String dir : stack) res = "/" + dir + res;
            return res.isEmpty() ? "/" : res;
        }
    }
}
