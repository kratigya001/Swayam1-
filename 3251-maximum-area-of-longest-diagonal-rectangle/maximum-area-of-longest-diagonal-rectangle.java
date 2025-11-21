class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        //check diagonal first if they r equal then area
        double maxdiagonal=0;
        int maxarea=0;
        for(int [] dimension: dimensions){
            int length=dimension[0];
            int width=dimension[1];
            double diagonal= Math.sqrt(length * length + width * width);
            int area=length * width;
            if(diagonal > maxdiagonal || diagonal == maxdiagonal && area > maxarea){
                maxdiagonal= diagonal;
                maxarea= area;

            }
        }
        return maxarea;
    }
}