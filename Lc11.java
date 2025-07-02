package Arrays;
public class Lc11 {
    //brute force
    public static int mostWater(int[] height){
        int max =0;
for(int i =0; i<height.length; i++){
    for(int j=i+1; j<height.length; j++){
int w = j -i;
int h = Math.min( height[i] , height[j]);
int area = w* h;
max = Math.max(area, max);
    }
    }
    return max;
}
public static void main(String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};
    System.out.println(mostWater(height));
}
    }

