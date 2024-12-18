public class Container_with_most_water {
    
    public int maxArea(int[] height) {
        int maxArea = 0;
        int s=0;
        int e=height.length-1;
        while(s<e){
            int area = (e-s)*Math.min(height[s],height[e]);
            maxArea = Math.max(maxArea,area);
            if(height[s]<height[e]){
                s++;
            }
            else{
                e--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Container_with_most_water obj = new Container_with_most_water();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(height));
    }
}