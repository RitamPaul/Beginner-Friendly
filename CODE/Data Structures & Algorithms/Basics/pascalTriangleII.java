/*
QUESTION:- 119. Pascal's Triangle II    [From Leetcode]

Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
                                1
                               / \
                              1   1
                             / \ / \
                            1   2   1
                           / \ / \ / \
                          1   3   3   1
                         / \ / \ / \ / \
                        1   4   6   4   1

Example-1:-
Input: rowIndex = 3
Output: [1,3,3,1]

Example-2:-
Input: rowIndex = 0
Output: [1]

Example-3:-
Input: rowIndex = 1
Output: [1,1] 

Constraints:- 0 <= rowIndex <= 33
*/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long prev = 1;
        for(int i=1;i<=rowIndex;i++){
            long next = prev * (rowIndex - i + 1) / i;
            res.add((int) next);
            prev = next;
        }

        return res;
    }
}
