// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {

//     int n=matrix.length;
//     int m=matrix[0].length;
//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             if(matrix[i][j]==target){
//                 return true;
//             }
//         }
//     }
//     return false;

//     }
// }
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int n=matrix.length;
    int m=matrix[0].length;
    int r=(m*n)-1;
    int l=0;
    while(l<=r){
        int mid=(l+r)/2;
        int row=mid/m;
        int col=mid%m;
        if(matrix[row][col]==target){
            return true;
        }
        else if(matrix[row][col]<target){
            l=mid+1;

        }else{
            r=mid-1;
        }
    }
    return false;

    }
    }