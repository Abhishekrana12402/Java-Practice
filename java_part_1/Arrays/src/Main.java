import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int[] a = {1, 2, 3, 4, 5};
        System.out.println(a[1]);
        int[] arr = new int[5];
       arr[0] = 23;

        arr[1] = 45;
        arr[2] = 46;
        arr[3] = 47;
        arr[4] = 48;
       System.out.println(arr[3]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();


        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i] + " ");
        }//method 1 to print array
        for (int num : arr) {
            System.out.print(num+" ");
        }//method
  String[] str=new String[5];
        for(int i=0;i<str.length;i++) {
            str[i] = in.next();
        }
      System.out.println(Arrays.toString(str));

      for(int i=0;i<str.length;i++) {
          System.out.println(str[i]+" ");
      }
      for(String element :str){
          System.out.print(element+" ");
      }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = in.nextInt();
            }

        }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            for (int[] d : c) {
                System.out.println(Arrays.toString(d));
            }
            for (int i = 0; i < 3; i++) {

                    System.out.println(Arrays.toString(c[i]));

            }
        }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] a={{1,2,3},
                {4,5,6},
                {7,8,9}};

        int[][] b={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][] c=new int[3][3];
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }

            }
            System.out.println(Arrays.toString(c[i]));




    }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},};
        int[][] b = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = a[j][i];
            }
            System.out.println(Arrays.toString(b[i]) +" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter element to be searched");
        int n = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("element found at index" +i);

            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
if(arr[i]>max) {
    max = arr[i];
}
        }
    System.out.print("Largest element in the array is: " +max);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8};
        int n=in.nextInt();
        int start=0;
        int end=arr.length-1;
        BinarySearch(arr,n,start,end);
    }
    public static void BinarySearch(int[] arr, int n, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == n) {
                System.out.println("element found at index :"+mid);
                break;
            }
            if (arr[mid] > n) {
                end = mid - 1;
            } else
                start = mid + 1;


        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        RevArray(arr);

    }
    public static void RevArray(int[] arr){int temp;int end=arr.length-1;int start=0;
            int mid=(start+end)/2;
                while (start<=mid){

              temp= arr[start];
              arr[start]=arr[end];
              arr[end]=temp;
              start++;
              end--;
            }
        System.out.print(Arrays.toString(arr));
        }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int[] b=new int[6];int j=a.length;
        for(int i=0;i<a.length;i++) {
            b[j-1]=a[i];
            j--;
        }
        System.out.print(Arrays.toString(b));
    }
    public static void main(String[] args) {int count=0;
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                System.out.print(arr[i]+","+arr[j]+"  ");
                count++;
            }
            System.out.println();

        }
        System.out.println("total pairs:"+count);
    }
}

    //SubArray
    public static void main(String[] args) {
        int[] arr = {1, -2, 6,-1,3};
        int[] b = new int[5];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                if (sum > max)
                    max = sum;
                System.out.println();
                 System.out.println("sum of elements of the above SubArray is:" + sum);
            }
        }
        System.out.println("Maximum sum of the SubArrays is:"+ max);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 25, 56, 88, 95};
        int mid;
        int start = 0;
        int end = arr.length - 1;
        System.out.println("Enter key to be searched: ");
        int n = in.nextInt();

        while (start<=end) {
            mid = (start + end) / 2;
            if (arr[mid] == n) {
                System.out.println("Element found at index :" + mid + " position: " + (mid+1));
                break;
            }
            else if(arr[mid]>n){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};int max=0;int temp=0;
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++) {
                int sum = 0;

                sum = arr[i] + arr[j];
                System.out.print(arr[i]+","+arr[j]+" ");
                if (sum > temp) {
                    max = sum;
                    temp=sum;

                }
            }
            System.out.println();

        }
        System.out.println("Pair which has highest sum:" +max);
    }
    public static void main(String[] args) {
        int[] arr={-2,-4,-8,8,7};int temp=0;int max=0;
        for(int i=0;i<arr.length;i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
//                for(int k=i;k<=j;k++){
//                    System.out.print(arr[k]+" ");
//                }
//                System.out.println();
                sum += arr[j];
                if (sum > temp) {
                    max = sum;
                    temp = sum;
                }

            }

        }
        System.out.print("Maximum sum of SubArray is:"+ max);
    }
   //another method for maximum Sum of SubArray
   public static void main(String[] args) {
        int[] arr={2,4,6,8,10};int CurrentSum=0;int MaxSum=0;
        for (int j : arr) {
            CurrentSum += j;
            if(CurrentSum>MaxSum){
                MaxSum=CurrentSum;
            }
            if (CurrentSum < 0) {
                CurrentSum = 0;
            }
        }
        System.out.println(MaxSum);
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 6, 3, 2, 5};
        int max = 0;int TrappedWater=0;
        int[] LeftMaxBound = new int[arr.length];
        int[] RightMaxBound = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            LeftMaxBound[i] = Math.max(arr[0], max);
        }
        System.out.print(Arrays.toString(LeftMaxBound));
        System.out.println();
        max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
            }
            RightMaxBound[i] = Math.max(arr[arr.length - 1], max);
        }
        System.out.print(Arrays.toString(RightMaxBound));
        System.out.println();

        for (int i = 0;i<arr.length;i++){
            int WaterLevel=Math.min(LeftMaxBound[i],RightMaxBound[i]);
             TrappedWater+=WaterLevel-arr[i];
        }
        System.out.println("Maximum Water that can be trapped:"+ TrappedWater);
    }
    public static void main(String[] args) {
        int[] stocks = {7, 1, 5, 3, 6, 4};
        int min = Integer.MAX_VALUE;int[] buy=new int[stocks.length];
        for (int i = 0; i < stocks.length; i++) {
            if (stocks[i] <min){
                min=stocks[i];
            }
            buy[i]=min;
        }
        System.out.println(Arrays.toString(buy));
        System.out.println();
        int MaxProfit=0;
        for(int i=0;i<buy.length;i++){
            int SellingPrice=stocks[i]-buy[i];
            if(SellingPrice>MaxProfit){
                MaxProfit=SellingPrice;
            }
        }
        System.out.println(MaxProfit);
    }
    public static void main(String[] args) {int sum=0;
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++) {
                sum += arr[j];
               // System.out.println(sum);
                if(sum==15){
                    System.out.println((i+1)+" "+(j+1));
                }
            }break;
        }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        SelectionSort(arr,arr.length);
    }
    static void SelectionSort(int[] arr,int n){
for(int i=0;i<n;i++){
    int min=i;
    for(int j=i+1;j<n;j++){
        if(arr[j]>arr[i]){
            min=j;
        }
    }
    int temp=arr[i];
    arr[i]=arr[min];
    arr[min]=temp;
}
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        BubbleSort(arr,arr.length);
    }
    static void BubbleSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        InsertionSort(arr,arr.length);
    }
    static void InsertionSort(int[] arr,int n){
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            for(int j=0;j<n;j++){
                while(prev>=0&&arr[prev]>curr){
                    arr[prev+1]=arr[prev];
                    prev--;
               }
                arr[prev+1]=curr;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1] =arr[prev];
            prev--;
            }
            arr[prev+1]=curr;

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
             max = Math.max(max, arr[i]);
        }
        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;

            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] array = {6, 5, 4, 2, 1};
        int N = array.length;
        MissingNumber(array, N);
    }

    static void MissingNumber(int[] array, int N) {
        Arrays.sort(array);
        int temp=1;
        for (int i = 0; i < array.length; i++) {
            if (temp != array[i]) {
                System.out.println(temp);

               return;
            }
            temp++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {-3, -5};
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        maxSubarraySum(arr, n, max);
    }
    static void maxSubarraySum(int arr[], int n, int max) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        if (count == n) {
            int Max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] > Max) {
                    Max = arr[i];
                }
            }
            System.out.println(Max);
        } else {
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (sum < 0) {
                    sum = 0;
                }
                max = Math.max(sum, max);
            }
            System.out.println(max);
        }
    }
    public static void main(String[] args) {
   int[] arr={1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
   int N=arr.length;
int S=15;
RangeOfGivenSum(arr,N,S);
    }
    static void RangeOfGivenSum(int[] arr, int  N,int S){int sum=0;
        for(int i=0;i<N;i++){
            sum=0;
            for(int j=i;j<N;j++) {
                sum += arr[j];
                if (sum == S) {
                    System.out.println(i+1+" "+(j+1));
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
        int N=arr.length;
        int S=15;
        RangeOfGivenSum(arr,N,S);
    }
    static void RangeOfGivenSum(int[] arr,int N,int S){int start=0;int sum=0;int temp=0;
        while(start<N-1){
            sum+=arr[temp];
            if(sum==S){
                System.out.println((start+1)+" "+(temp+1)+" "){
            }
            temp++;
            if(temp==N){
                start++;
                sum=0;
                temp=start;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3,4};
        int n=arr.length;
        Duplicates(arr,n);
    }
    static void Duplicates(int[] arr,int n) {
        int count=0;int start=0;
        Arrays.sort(arr);
        while(start<n-1) {
            count = 0;int temp=start+1;
            while (arr[start] == arr[temp]) {
                count++;
                temp++;
            }
                start++;

            if (count > 0) {
                System.out.println(arr[start]);
            }
        }
        }
    public static void main(String[] args) {
        int[] a = {1,1,1, 2, 2};
        int n = a.length;
        MajorityElement(a, n);

    }
    static void MajorityElement(int[] a, int n) {//element occuring more than n/2 times
        Arrays.sort(a);
        int start = 0;
        while (start <= n / 2) {
            if (a[start] == a[start + n / 2]) {
                System.out.println(a[start]);
                break;
            }
            start++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2 ,6 ,3, 4, 7 ,2 ,10 ,3 ,2 ,1};
        int n = arr.length;
        int k = 5;
        getMinDiff(arr, n, k);
    }
    static void getMinDiff(int[] arr, int n,int k){
        Arrays.sort(arr);
        int diff=arr[n-1]-arr[0];
        int min;int max;
        for(int i=1;i<n-1;i++) {
            max = Math.max(arr[i] + k, arr[n - 1]-k);
            min = Math.min(arr[0]+k, arr[i] - k);
           diff=Math.min(diff,max-min);
        }
        System.out.println(diff);
    }
    public static void main(String[] args) {
        //int[] a={14, 7 ,14, 6 ,1 ,11 ,3 ,16, 16, 8 ,7 ,4 ,11, 15, 17, 6, 1 ,13 };
        int[] a={0,0};
        int n=a.length;
duplicates(a,n);
    }
  static void   duplicates(int[] a,int n){
      ArrayList<Integer> list = new ArrayList<>();
      Arrays.sort(a);int count=0;
      System.out.println(Arrays.toString(a));
      for(int i=0;i<n-1;i++) {
          if (n==2&&a[0]==a[1]) {
              count++;
              list.add(a[0]);

          }if(i<=1)
          if (i>0&&a[i] == a[i + 1] && a[i] != a[i - 1]) {
              list.add(a[i]);
              count++;
          }
      }

          if (count >= 1) {
              System.out.println(list);
          } else {
              System.out.println(-1);
          }
    }
    public static void main(String[] args) {
        int[] arr={13,87,45,23,33,44,12,11,4,18,13};
        int n=arr.length;
        leaders(arr,n);
    }
    static void leaders(int[] arr,int n){int max=arr[n-1];
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> revlist = new ArrayList<>();
        list.add(max);
        for(int i=n-1;i>0;i--) {
            if(max<arr[i-1]){
                max=arr[i-1];
                list.add(max);
            }
        }
            Collections.reverse(list);
            System.out.println(list);
            }
    public static void main(String[] args) {
        int[][] M = {{0, 0, 1},
                {0, 0, 1},
                {0, 0, 0}};
        celebrity(M);
    }
    static void celebrity(int[][] M){
       int flag=0;int count=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<M.length;i++){

            for(int j=0;j<M[i].length;j++) {
                if (M[i][j] == 1) {
                    flag = 1;
                    break;

                } else {
                    flag = 0;
                }
            }
               if(flag==0){
                  list.add(i);
                  count++;
            }
        }
        if(count>=2){
            System.out.println(-1);
        }else{
            System.out.println(list);
        }
    }
    public static void main(String[] args) {
        int[] arr={2 ,3 ,1 ,1 ,2 ,4 ,2 ,0 ,1 ,1};
        minJumps(arr);
    }
    static void minJumps(int[] arr) {
        int jump = 1;
        for (int i = 1; i < arr.length -1; i++) {
         int m=arr[i];

            System.out.println(i);

         int max=Integer.MIN_VALUE;
while(m>0){
    max=Math.max(max,i+arr[i+1]);
    m--;
i++;
}
jump++;
            System.out.println(max);
            System.out.println(jump);
           if(i+max>=arr.length){
               jump++;
               System.out.println(jump);
               break;
           }
        }
    }
    public static void main(String[] args) {
        int[] arr={6,9,9};int[] LeftMax=new int[arr.length];int[] RightMax=new int[arr.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
          max=Math.max(max,arr[i]);
           LeftMax[i]=max;
        } max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            max=Math.max(max,arr[i]);
            RightMax[i]=max;


        }int TrappedWater=0;
       for(int i=0;i<arr.length;i++){
           int WaterLevel=Math.min(LeftMax[i],RightMax[i]);
          TrappedWater+=WaterLevel-arr[i];
       }
        System.out.println(TrappedWater);

    }
    public static void main(String[] args) {
        int[] A={3,6,3,3};int[] B={4,1,2,1,1,2};int n=A.length;int m=B.length;
        int sumA=0;int diff=0;int flag=0;

        for(int i=0;i<n;i++){
            sumA+=A[i];
        }
        int sumB=0;
        for(int i=0;i<m;i++){
            sumB+=B[i];
        }if(sumB>sumA) {
             diff = sumB - sumA;
        }
        else{
            diff=sumA-sumB;
        }
        System.out.println(diff);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A[i]+B[j]==diff){
                    flag=1;
                    System.out.println(flag);
                    break;
                }

            }
        }
    }
    public static void main(String[] args) {
        int [] arr={2,2};
        ArrayList<Integer> list = new ArrayList<>();
Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));int flag=0;
        for(int i=0;i<arr.length-1;i++){
            if(flag==0) {
                if (arr[i] == arr[i + 1]) {
                    list.add(arr[i]);
                    flag++;

                }
            }
            if(arr[i]-arr[i]>1){
                list.add(i);
            }
        }
        int[] A=new int[list.size()] ;
        for(int i=0;i<list.size();i++){
            A[i]= list.get(i);
            System.out.println(A[i]+" ");
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};int start=0;int temp;int sumB=0;int sumA=0;
        while (start < arr.length) {
            sumA+=arr[start];
            if(sumA==sumB){
          System.out.println(start+1);
            }

             sumB=0;
             temp=start+1;
            while (temp < arr.length) {
                sumB += arr[temp];
                temp++;
            }


            start++;
        }
    }

   public static void main(String[] args) {
        int[] arr={1,2,5,6,7,4,9,1,4,5,1};
        int step=arr[0];int jump=1;

        int maxreach=arr[0];
        if(arr.length==1){
            System.out.println(1);
        }
        if(arr[0]==0){
            System.out.println(-1);
        }
        for(int i=1;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.println(jump);
            }
            maxreach=Math.max(maxreach,i+arr[i]);
            step--;
            if(step==0){
                jump++;
                step=maxreach-i;
            }

        }
    }
    public static void main(String[] args) {
        int[] frogs={6334 ,26500 ,19169, 15724 ,11478 ,29358 ,26962 ,24464, 5705, 28145 ,23281 ,16827 ,9961 ,491 ,2995 ,11942 ,4827 ,5436,
                32391, 14604 ,3902 ,153, 292 ,12382 ,17421 ,18716 ,19718 ,19895, 5447 ,21726 ,14771 ,11538 ,1869 ,19912, 25667, 26299 ,17035 ,
                9894, 28703 ,23811, 31322 ,30333};int count=0;
        int N= frogs.length;
        int leaves=18468;int temp[]=new int[leaves];
        for(int i=0;i<frogs.length;i++) {
            int m = frogs[i];
            while(m <=leaves) {
                temp[m-1]++;
                m = m + frogs[i];

            }
        }
        for(int i=0;i<leaves;i++){
            if(temp[i]==0){
                count++;
            }

        }
        if(count==0){
            System.out.println(0);
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        int[] arr={14,7,14,6,1,11,3,16,16,8,7,4,11,15,17,6,1,13};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
      //  int[] arr={14,7,14,6,1,11,3,16,16,8,7,4,11,15,17,6,1,13};
        int[] arr={2,3,1,2,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));int count=0;
        for(int i=0;i<arr.length-1;i++){
            count=0;
         while(arr[i]==arr[i+1]){
             count++;
             if(i==arr.length-2){
                 break;
             }

             i++;
         }

         if(count>=1){
             System.out.print(arr[i]+" ");
         }
        }
        if (count==0){
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        for(int i=0;i<arr.length;i++){
            Arrays.sort(arr,i+1,arr.length-1);
           // System.out.println(arr[i+1]);
            if(arr[i]>arr[arr.length-1]){
                System.out.println(arr[i]+" ");
            }

        }
        }
    public static void main(String[] args) {
        int[] A = {1,3,2};
        int N = A.length;
       Arrays.sort(A);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        for(int i=0;i<A.length;i++){
            if(A[i]*N>=sum){
                System.out.println(A[i]);
                return;
            }
        }
        }
    public static void main(String[] args) {
        int n=16;int sum=0;int count=0;
        for(int i=1;i<n;i++){
            sum+=i;
            count++;
            if(sum>=n){
                break;
            }

        }
        System.out.println(count);
    }


    public static void main(String[] args) {

       int[] arr1= { 2, 3 ,6 ,7 ,9 };
        int[] arr2={1, 4, 8 ,10 };
        int n = arr1.length;
        int m = arr2.length;
        int k = 5;
        int[] arr3 = new int[n + m];
        int start1 = 0;
        int count = 0;
        int start2 = 0;
        while(start1<n){
            arr3[count]=arr1[start1];
            count++;
            start1++;
        }
        while(start2<m){
            arr3[count]=arr2[start2];
            count++;
start2++;
        }
       Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr3[k-1]);
    }
    public static void main(String[] args) {
            int[] arr1 = {2, 3, 6, 7, 9,11,13};
            int[] arr2 = {1, 4, 8, 10};
            int n = arr1.length;
            int m = arr2.length;
            int k = 5;
            int[] arr3 = new int[n + m];
            int i=0;int j=0;int s=0;
            while(i<=n-1&&j<=m-1){
                if(arr1[i]<arr2[j]){
                    arr3[s]=arr1[i];
                    i++;
                }
                else{
                    arr3[s]=arr2[j];
                    j++;
                }
                s++;
            }
            while(i<=n-1){
                arr3[s++]=arr1[i++];
            }
            while(j<=m-1){
                arr3[s++]=arr2[j++];
            }
        System.out.println((arr3[k-1]));

        }


    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                {4,5,6},
                {7,8,9}};
        ArrayList<Integer> list = new ArrayList<>();
        int start_row=0;int end_row= arr.length-1;int start_column=0;int end_column=arr[0].length-1;
        while(start_row<=end_row&&start_column<=end_column){
            for(int i=start_column;i<=end_column;i++){

                list.add(arr[start_row][i]);
            }
            for(int i=start_row+1;i<=end_row;i++){

                list.add(arr[i][end_column]);
            }
            for(int i=end_column-1;i>=start_row;i--){

                list.add(arr[end_row][i]);
            }
            for(int i=end_row-1;i>start_row;i--){

                list.add(arr[i][start_column]);
            }
            start_row++;
            end_row--;
            start_column++;
            end_column--;
        }
        System.out.println(list);
    }


    public static void main(String[] args) {
        int[] A={4, 1, 2, 1, 1, 2};
        int[] B={3, 6, 3, 3};
        int SumA=0;
        int SumB=0;
        for(int i=0;i<A.length;i++){
            SumA+=A[i];
        }
        for(int i=0;i<B.length;i++){
            SumB+=B[i];
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                if(SumA-A[i]+B[j]==SumB-B[j]+A[i]){
                    System.out.println(A[i]+" " +B[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] Ar1 = {2,5};
        int[] Ar2 = {1,1};
        int mid=(Ar1.length+ Ar2.length)/2;
       System.out.println(mid);
        int count=0;int i=0;int j=0;int a=0;int sum=0;
        while(count<mid+1){
if(Ar1[i]<=Ar2[j]||count==Ar2.length){
    a=Ar1[i];

        i++;

}
else if(Ar1[i]>Ar2[j]&&count<Ar2.length) {
    a = Ar2[j];

    j++;

}
            System.out.println(a);
count++;
if(count==mid||count==mid+1){
   sum+=a;
}
        }
        //System.out.println(count);
       // System.out.println(sum);

    }


    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3};int key=9;
        int start=0;int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];

        while(start<=end) {
            int mid = (start + end);
            if (key == arr[mid]) {
                System.out.println(mid);
                break;
            }
            if (isAsc) {
             if (key > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else{
                if (key > arr[mid]) {
                    end=mid-1;
                } else {
                    start=mid+1;
                }

            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,8,10,11,12,19};

       int ans=CeilingOfNumber(arr,0, arr.length - 1,13 );
        System.out.println(ans);
    }

    static int CeilingOfNumber(int[] arr,int start, int end, int num) {


        while (start <= end) {
            int mid = (start + end)/2;
            if (num == arr[mid]) {
               return arr[mid];
            } else if(num>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
   return arr[start]; }


    public static void main(String[] args) {
        char[] ch={'c','f','g'};

       char ans= NextGreatestletter(ch,'c');
        System.out.println(ans);
    }
    static char NextGreatestletter(char[] ch,char target){
        int start=0;int end=ch.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
             if(target>=ch[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(start);
        return ch[start%ch.length]; }


    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int num = 8;
        int start = 0;
        int end = arr.length - 1;
        int[] temp = new int[2];
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num >= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(end);
         start = 0;
         end = arr.length - 1;
     while (start <= end) {
        int mid = (start + end) / 2;
        if (num <= arr[mid]) {
             end = mid - 1;
        } else {
            start = mid + 1;
        }
    }
        System.out.println(start);
}


  public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=130;
        System.out.println(FindInRange(arr,target));
    }
    static int FindInRange(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int NewStart=end+1;
             end=end+(end-start+1)*2;
             start=NewStart;
        }
       return BinarySearchInfiniteArray(arr,target,start,end);
    }
    static int BinarySearchInfiniteArray(int[] arr,int target,int start,int end){
        while (start <= end) {
            int mid =start+(end-start)/2;
            if (target<arr[mid]) {
                 end=mid-1;
            } else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1; }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target=3;
        int ans=Range(arr,target);
        System.out.println(ans);
    }
    static int Range(int[] arr,int target ) {
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
          int  mid = start + (end - start) / 2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
   return Math.min(BinarySearch(arr,0,start,target),BinarySearch(arr,start,arr.length-1,target));
    }
    static int BinarySearch(int[] arr, int start,int end,int target){
        while (start <= end) {
            int mid = (start + end)/2;
            if (target == arr[mid]) {
                return mid;
            } else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
   return-1; }



    public static void main(String[] args) {
        int[] arr = {8,9,10,2,3,8,8};
        int target = 8;
        int ans = Range(arr, target);
        System.out.println(ans);
    }
    static int Range(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int pivot = FindingPivot(arr, start, end, target);
        if (arr[pivot] == -1) {
            return BinarySearch(arr, start, end, target);
        }
        if (arr[pivot] == target) {
            return pivot;
        } else if (target > arr[start]) {
            return BinarySearch(arr, start, pivot - 1, target);
        }
        return BinarySearch(arr, pivot + 1, end, target);

    }

    static int BinarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    static int FindingPivot(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > start && arr[mid] <= arr[mid - 1]) {
                return mid - 1;
            }
            if (mid < end && arr[mid] >= arr[mid + 1]) {
                return mid;
            }
            //if mid, start and end are equal we will be skipping it by checking whether they can be pivot or not
            if(arr[start]==arr[mid]&&arr[mid]==arr[end]) {
                if (arr[start] > arr[start + 1]) {//after start there is right part of array
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            else if (arr[start]<arr[mid]||arr[start]==arr[mid]&&arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1; }


    public static void main(String[] args) {
        int[] nums={2 ,5 ,6 ,0 ,0 ,1, 2};int target=3;
        int ans=Range(nums,target);
        System.out.println(ans);
        }
        static int Range(int[] nums, int target){
        int start=0;int end=nums.length-1;
        int PivotIndex=Pivot(nums,start,end,target);
        if(nums[PivotIndex]==target){
            return PivotIndex;
        }
        if(PivotIndex==-1){
            return BinarySearch(nums,start,end,target);
        }
        if(nums[start]<target){
            return BinarySearch(nums,start,PivotIndex-1,target);
        }
return BinarySearch(nums,PivotIndex+1,end,target);
        }
        static int BinarySearch(int[] nums,int start,int end,int target){
            while (start <= end) {
                int mid = (start + end) / 2;
                if (target == nums[mid]) {
                    return mid;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;

        }

        static int Pivot(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid-1]>nums[mid]){
                return mid-1;
            }
            if(nums[start]==nums[mid]&&nums[mid]==nums[end]){
                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if(nums[end]<nums[end-1]){
                    return end-1;
                }
            }
            else if(nums[mid]>nums[start]||nums[start]==nums[mid]&&nums[mid]>nums[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
       return -1; }


    public static void main(String[] args) {
        int[] arr={0,1};
        int ans= FindSmallest(arr);
        System.out.println(ans);
    }
    static int FindSmallest(int[] arr){
        Arrays.sort(arr);int count=0;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>0){
                count++;
                if(arr[i]!=1&&count==1){
                    return 1;
                }
                    while(arr[i]==arr[i+1]) {
                        i++;
                    }
                    if(arr[i]+1!=arr[i+1]){
                        return arr[i]+1;
                    }
                }
            }
        return arr[arr.length-1]+1;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{ 4,5,6}};
int ans=searchMatrix(matrix,5);
        System.out.println(ans);
    }
    public static int searchMatrix(int[][] matrix, int target) {
    int m=0;int n=matrix[m].length-1;
        if(matrix.length==1){
        if(matrix[0][0]==target){
            return matrix[0][0];
        }
    }
        while(m<matrix.length&&n>=0){
        if(matrix[m][n]==target){
            return matrix[m][n];
        }
        else if(target>matrix[m][n]){
            m++;
        }
        else{
            n--;
        }
    }
      return -1; }


    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};int temp;
        for(int i=0;i<arr.length;i++){
            boolean swap=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                 temp=arr[j-1];
                 arr[j-1]=arr[j];
                 arr[j]=temp;
                 swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr={5,6,1,2,4,3,3,4,8,9};int min=0;

        for(int i=0;i<arr.length;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){

                if(arr[min]>arr[j]){
                     min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] nums = {3,5,1};
        int target = 3;
        boolean ans=RangeToPerformSearch(nums, target);
        System.out.println(ans);
    }
    static boolean RangeToPerformSearch(int[] nums,int target){
        int start=0;int end=nums.length-1;
        int PivotIndex=Pivot(nums,start,end,target);
        System.out.println(PivotIndex);
        if(PivotIndex==-1){
            return BinarySearch(nums,start,end,target);
        }
        if(nums[PivotIndex]==target){
            return true;
        }
        if(nums[start]<=target){
            return BinarySearch(nums,start,PivotIndex-1,target);
        }
        return BinarySearch(nums,PivotIndex+1,end,target);

    }
    static Boolean BinarySearch(int[] nums,int start,int end,int target){
        while (start <= end) {
            System.out.println(start);
            System.out.println(end);
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return true;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return false;
    }
    static int Pivot(int[] nums ,int start,int end,int target){
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid<end&&nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start&&nums[mid-1]>nums[mid]){
                return mid-1;
            }
             if(nums[start]==nums[mid]&&nums[mid]==nums[end]){
                 if(nums[start]>nums[start+1]){
                     return start;
                 }
                 start++;
                 if(nums[end-1]>nums[end]){
                     return end-1;
                 }
                 end--;
             }
             else if(nums[mid]>nums[start]||nums[start]==nums[mid]&&nums[mid]>nums[end]){
                 start=mid+1;
             }
             else{
                 end=mid-1;
             }
        }
   return -1; }




    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,5};
        for(int i=0;i<arr.length;i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr={5,6,4,3,8,0,9,1};
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[min]){
                   min=j;
               }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 3, 8, 0, 9, 1};
        for (int i = 0; i <arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev>=0&&arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        System.out.println(Arrays.toString(arr));}


    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 3, 8, 0, 9, 1};
        for (int i = 0; i <arr.length-1; i++) {
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        }


    public static void main(String[] args) {
        int[] nums = {2,3,1,2,3};
        int i=0;int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<nums.length){
            int correctpos=nums[i];
            if(nums[i]!=nums[correctpos]){
                int temp=nums[i];
                nums[i]=nums[correctpos];
                nums[correctpos]=temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int index=1;index<nums.length;index++){
            if(nums[index]==nums[index-1]){
               list.add(nums[index]);
               count++;
            }
        }
        if(count==0){
            list.add(nums.length);
        }
        System.out.println(list);
    }


    public static void main(String[] args) {
        int[] nums={1,1};
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        while(i< nums.length){
            int correctpos=nums[i]-1;

            if(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[correctpos]){
                int temp=nums[i];
                nums[i]=nums[correctpos];
                nums[correctpos]=temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j=0;j<nums.length;j++){
           if(nums[j]!=j+1){
               System.out.println(j);
           }
        }
    }


    public static void main(String[] args) {
        int N = 2;int  cur = 1;
        int[] pos ={1,6};
       int[]  time = {10,3};
       int ans=minimumTime(2,1,pos,time);
        System.out.println(ans);
    }
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
        int min=Integer.MAX_VALUE;
        for(int i=0;i< pos.length;i++){
            int temp=Math.max(pos[i],cur)-Math.min(pos[i],cur);
            System.out.println(temp);
            if(temp*time[i]<min){
                min=temp*time[i];
            }
        }
return min;
    }


    public static void main(String[] args) {
        int n = 5;
       int arr[] ={5, 3, 0, 7, 4};
      String ans= solve(arr,n);
        System.out.println(ans);
    }
    static String solve(int[] arr, int n) {
        String="";
        // code here
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start1=0;int res1=0;
        while(start1<n){
            res1=res1*10+arr[start1];
            start1=start1+2;
        }
        System.out.println(res1);

        int start2=1;int res2=0;
        while(start2<n){
            res2=res2*10+arr[start2];
            start2=start2+2;
        }
        System.out.println(res2);
       s+= Integer.toString(res1+res2);

   return s; }


    public static void main(String[] args) {
       int  n=4;
        int[] arr={10,2,2,1};
        System.out.println(dominantPairs(n,arr));
    }
    public static int dominantPairs(int n, int[] arr) {
        // code here
        int count=0;
//        System.out.println(n/2);
        for(int i=0;i<n/2;i++){
            for(int j=n/2;j<n;j++){

                if(5*arr[j]<=arr[i]){
                    count++;
                }

            }
        }
        return count;
    }


    public static void main(String[] args) {
int[] arr={1,2,3,4};
int[] time={1,2,3,4};
        System.out.println(totalTime(4,arr,time));
    }
    public static long totalTime(int n,int arr[],int time[]){
        int sum=0;
for(int i=1;i<n;i++){
   int prev=i-1;

   if(arr[i]==arr[prev]){
       sum+=time[arr[i]-1];
   }
   else{
       sum++;
   }
    System.out.println(sum);
}

   return sum; }
   

    public static void main(String[] args) {
      int[] A={3,1,2,4,5};
        System.out.println(maxArea(A,5));
    }
    static long maxArea(int A[], int len){
        // Code Here
        int max=Integer.MIN_VALUE;
        int start=0;int end=len-1;
        while(start<end){
          int waterlevel=Math.min(A[start],A[end])*(end-start);
          if(waterlevel>max){
              max=waterlevel;
          }
          if(A[start]<A[end]){
              start++;
          }
          else{
              end--;
          }
        }

   return max; }


    public static void main(String[] args) {
        int N = 5;
       int[] Ar1 = {2,5};
        int[] Ar2 = {1,1};
        System.out.println(findMidSum(Ar1,Ar2,N));
    }
   static int findMidSum(int[] ar1, int[] ar2, int n) {
       if(n==1){
           return ar1[0]+ar2[0];
       }
       int mid=(ar1.length+ ar2.length)/2;
       int count=0;int i=0;int j=0;int a;int sum=0;
       while(count<mid+1){
           if(j<ar2.length&&ar1[i]<=ar2[j]){
               a=ar1[i];
               i++;
           }
           else {
               if(j>=ar2.length){
                   a=ar1[i];
               }
               else {
                   a = ar2[j];
                   j++;
               }
           }
           count++;
           if(count==mid||count==mid+1){
               sum+=a;
           }
           System.out.println(sum);
       }

       return sum;
   }


    public static void main(String[] args) {
        System.out.println(NewtonSquareRoot(36));
    }
    static double NewtonSquareRoot(double n){
     double x=n;
     double root;
     while (true){
         root=0.5*(x+(n/x));
         if(Math.abs(root-x)<0.5){
             break;
         }
        x= root;
     }
   return root; }
   
     */


    public static void main(String[] args) {
       Factors(20);
    }
    static  void Factors(int n){
        ArrayList<Integer> list=new ArrayList<>();
//        for(int i=1;i*i<=n;i++){
//            if(n%i==0){
//                System.out.print(i+" "+n/i+" ");
//            }
//        }
//        To print in Ascending order
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                list.add(n/i);
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }



    }

































































































