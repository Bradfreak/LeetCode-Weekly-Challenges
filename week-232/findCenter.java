//Find Center of Star Graph
class Solution {
    public int findCenter(int[][] edges) {
        int temp = 0;
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]){
            temp = edges[0][0];
        }
        else if(edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1]){
            temp = edges[0][1];
        }
        return temp;
    }
}
