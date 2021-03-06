//Find Nearest Point That Has the Same X or Y Coordinate
class Solution {
    public int dist(int[] point, int x, int y){
        return Math.abs(point[0]-x)+Math.abs(point[1]-y);
    }
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans = -1, len = points.length, i, min = Integer.MAX_VALUE, temp = 0;
        for(i = 0; i < len; i++){
            if(x == points[i][0] || y == points[i][1]){
                temp = dist(points[i], x, y);
                if(temp < min){
                    ans = i;
                    min = temp;
                }
            }
        }
        return ans;
    }
}
