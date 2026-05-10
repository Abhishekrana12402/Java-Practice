import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
   /* public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        System.out.println("Enter the no. of processes: ");
        int n=in.nextInt();
        int[] wt=new int[n];
        int[] tt=new int[n];
        int[] bt=new int[n];
        float AvgTTtime=0,Avgwtime=0;int add=0;
        System.out.println("Enter the burst time for each process:");
        for(int i=0;i<n;i++){
            bt[i]= in.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("P"+(i+1)+" "+bt[i]);
        }

        for(int j=1;j<n;j++){
            wt[j]=add;
            Avgwtime+=add;
            add+=bt[j];
            tt[j]=add;
            AvgTTtime+=add;
        }
        System.out.println(" Waiting time for all the processes: ");
        System.out.print(Arrays.toString(wt));
        System.out.println(" TurnAround time for all the processes: ");
        System.out.print(Arrays.toString(tt));
        System.out.println("Average waiting time="+Avgwtime/n);
        System.out.println("Average Turn Around time="+AvgTTtime/n);
    }


   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the process");
       int n=in.nextInt();int temp;
       float avgwttime=0,avgtttime=0;
       int[] bt=new int[n];
       int[] wt=new int[n];
       int[] tt=new int[n];
       int[] p=new int[n];

       for(int i=0;i<n;i++){
           p[i]=i+1;
           System.out.print(p[i]+" ");
       }
       System.out.println();
       System.out.println("Enter the burst time for each processes:");
       for(int i=0;i<n;i++){
           bt[i]=in.nextInt();
       }
       for(int j=0;j<n;j++){
           for(int k=0;k<n-j-1;k++){
               if(bt[k]>bt[k+1]){
                   temp=bt[k];
                   bt[k]=bt[k+1];
                   bt[k+1]=temp;
                   temp=p[k];
                   p[k]=p[k+1];
                   p[k+1]=temp;
               }
           }
       }

       wt[0]=0;
       for(int i=1;i<n;i++){
           wt[i]=wt[i-1]+bt[i-1];
       }

      for(int i=0;i<n;i++){
          avgwttime+=wt[i];

      }

       for(int j=0;j<n;j++){
           tt[j]=wt[j]+bt[j];
       }

       for(int i=0;i<n;i++){
           avgtttime+=tt[i];
       }
       System.out.println("Process"+" "+"BurstTime"+" "+"Waiting Time"+" "+"Turn Around Time");
       for(int i=0;i<n;i++){
           System.out.println(p[i]+"     "+bt[i]+"       "+wt[i]+"          "+tt[i]+" ");
       }
       System.out.println("Average waiting time:"+avgwttime/n);
       System.out.println("Average turnaround time:"+avgtttime/n);
   }


    static int p=5;
    static int r=3;

   public static boolean isSafe(int[] processes,int[] avail,int[][] maxm,int[][] allot) {
       int[][] need = new int[p][r];
       Calculateneed(need, maxm, allot);
       boolean[] finish = new boolean[p];
       int[] safeseq = new int[p];
       int[] work = Arrays.copyOf(avail, r);
       int count = 0;
       while (count < p) {
           boolean found = false;
           for (int i = 0; i < p; i++) {
               if (finish[i] == false) {
                   int j;
                   for (j = 0; j < r; j++)
                       if (need[i][j] > work[j])
                           break;
                       if (j == r ) {
                           for (int k = 0; k < r; k++)
                               work[k] += allot[i][k];
                           safeseq[count++] = i;
                           finish[i] = true;
                           found = true;
                       }
                   }
               }
               if (!found) {
                   return false+;
               }
           }
       for(int i=0;i<p;i++){
           System.out.print(safeseq[i]+"->");
       }
       return true;
       }

   public static void Calculateneed(int[][] need,int[][] maxm,int[][] allot){
       for(int i=0;i<p;i++){
           for(int j=0;j<r;j++){
               need[i][j]=maxm[i][j]-allot[i][j];
           }
       }
   }

    public static void main(String[] args) {
        int processes[] = {0, 1, 2, 3, 4};

        // Available instances of resources
        int avail[] = {3, 3, 2};

        // Maximum R that can be allocated
        // to processes
        int maxm[][] = {{7, 5, 3},
                {3, 2, 2},
                {9, 0, 2},
                {2, 2, 2},
                {4, 3, 3}};

        // Resources allocated to processes
        int allot[][] = {{0, 1, 0},
                {2, 0, 0},
                {3, 0, 2},
                {2, 1, 1},
                {0, 0, 2}};

        // Check system is in safe state or not
        isSafe(processes, avail, maxm, allot);

    }


   public static void main(String[] args) {
       int[] pages = {1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5};
       int capacity = 3;
       int ans= getfaults(pages,capacity);
       System.out.println(ans);
   }
    static int getfaults(int[] pages ,int capacity){
        int index=0;int cache[]=new int[capacity];int faults =0;
        for(int page:pages){
            boolean found =false;
            for(int i=0;i< cache.length;i++){
                if(cache[i]==page){
                    found=true;
                    break;
                }
            }
            if(!found){
                cache[index]=page;
                index=(index+1)%capacity;
                faults++;
            }
        }
   return faults;
   }


   public static void main(String[] args) {
       int[] pages = {1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5};
       int capacity = 3;
       int ans= getfaults(pages,capacity);
       System.out.println(ans);
   }
   static int getfaults(int[] pages,int capacity){
       int cache[]=new int[capacity];int faults=0;int index=0;
       for(int page:pages){
           boolean found=false;
           for(int i=0;i< cache.length;i++){
               if(cache[i]==page){
               found=true;
               break;
           }
       }
       if(!found){
           cache[index]=page;
           index=(index+1)%capacity;
           faults++;
       }

       }
  return faults; }


    static int p=5;
    static int r=3;
   public static void main(String[] args) {
       int processes[] = {0, 1, 2, 3, 4};

       // Available instances of resources
       int avail[] = {3, 3, 2};

       // Maximum R that can be allocated
       // to processes
       int maxm[][] = {{7, 5, 3},
               {3, 2, 2},
               {9, 0, 2},
               {2, 2, 2},
               {4, 3, 3}};

       // Resources allocated to processes
       int allot[][] = {{0, 1, 0},
               {2, 0, 0},
               {3, 0, 2},
               {2, 1, 1},
               {0, 0, 2}};

       // Check system is in safe state or not
       System.out.println(isSafe(processes, avail, maxm, allot));
   }
static boolean isSafe(int[] processes,int[] avail,int[][] maxm,int[][] allot){
 int[][] need=new int[p][r];
 CalculateNeedNatrix(need,maxm,allot);
 int[] work=Arrays.copyOf(avail,r);
 int[] safeseq=new int[p];
 boolean[] finished= new boolean[p];
 int count=0;
 while(count<p){
     boolean found=false;
     for(int i=0;i<p;i++){
         if(!finished[i]){
           int j=0;
           for(j=0;j<r;j++)
               if(need[i][j]>work[j])
                   break;
               if(j==r){
                   for(int k=0;k<r;k++)
                       work[k]+=allot[i][k];
                   found=true;
                   safeseq[count++]=i;
                   finished[i]=true;
               }
         }
     }
     if(!found){
         System.out.println("System is not in the safe state");
         return false;
     }
 }
    System.out.print("System is in safe state");
 for(int i=0;i<p;i++){

     System.out.print(safeseq[i]+"->");
 }
 return true;
}
static void CalculateNeedNatrix(int[][] need,int[][] maxm,int[][] allot){
       for(int i=0;i<p;i++){
           for(int j=0;j<r;j++){
               need[i][j]=maxm[i][j]-allot[i][j];
           }
           System.out.println(Arrays.toString(need[i]));
       }
}


   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("Number of processes");
       int n=in.nextInt();
       int[] p=new int[n];
       int[] bursttime=new int[n];
       int[] turnaroundtime=new int[n];
       int[] waitingtime=new int[n];
       float AvgWaitingTime=0,AvgTurnAroundTime=0;
       for(int i=0;i<n;i++){
          p[i]=i+1;
       }
       System.out.println("Enter the burst time for the given processes");
       for(int i=0;i<n;i++){
         bursttime[i]=in.nextInt() ;
       }
       waitingtime[0]=0;
       for(int i=1;i<n;i++){

           waitingtime[i]=waitingtime[i-1]+bursttime[i-1];
           AvgWaitingTime+=waitingtime[i];
       }
       for(int i=0;i<n;i++){

           turnaroundtime[i]=waitingtime[i]+bursttime[i];
           AvgTurnAroundTime+=turnaroundtime[i];
       }
       System.out.print("Process"+" "+"Bursttime"+" "+ "Waitingtime"+" "+"turnaroundtime"+" ");
       System.out.println();
       for(int i=0;i<n;i++){

           System.out.println(p[i]+"       "+bursttime[i]+"     "+waitingtime[i]+"     "+turnaroundtime[i]+" ");
       }
       System.out.println();
       System.out.println(AvgWaitingTime/n);
       System.out.println(AvgTurnAroundTime/n);
   }


   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("Number of processes");
       int n=in.nextInt();
       int[] p=new int[n];
       int[] bursttime=new int[n];
       int[] turnaroundtime=new int[n];
       int[] waitingtime=new int[n];
       float AvgWaitingTime=0,AvgTurnAroundTime=0;
       for(int i=0;i<n;i++){
           p[i]=i+1;
       }
       System.out.println("Enter the burst time for the given processes");
       for(int i=0;i<n;i++){
           bursttime[i]=in.nextInt() ;
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<n-i-1;j++){
               if(bursttime[j]>bursttime[j+1]){
                   int temp=bursttime[j];
                   bursttime[j]=bursttime[j+1];
                   bursttime[j+1]=temp;
                   temp=p[j];
                   p[j]=p[j+1];
                   p[j+1]=temp;
               }
           }
       }
       waitingtime[0]=0;
       for(int i=1;i<n;i++){

           waitingtime[i]=waitingtime[i-1]+bursttime[i-1];
           AvgWaitingTime+=waitingtime[i];
       }
       for(int i=0;i<n;i++){
           turnaroundtime[i]=waitingtime[i]+bursttime[i];
           AvgTurnAroundTime+=turnaroundtime[i];
       }
       System.out.print("Process"+" "+"Bursttime"+" "+ "Waitingtime"+" "+"turnaroundtime"+" ");
       System.out.println();
       for(int i=0;i<n;i++){

           System.out.println(p[i]+"       "+bursttime[i]+"         "+waitingtime[i]+"        "+turnaroundtime[i]+" ");
       }
       System.out.println();
       System.out.println(AvgWaitingTime/n);
       System.out.println(AvgTurnAroundTime/n);
   }

    */
   public static void main(String[] args) {
       int size=8;
       int head=50;
       int[] arr={176,79,34,60,92,11,41,114};
       FCFS(arr,head);

   }
   static void FCFS(int[] arr,int head){
       int dist;int seekcount=0;int currtrack;
       for(int i=0;i< arr.length;i++){
           currtrack=arr[i];
           dist=Math.abs(currtrack-head);
           seekcount+=dist;
           head=currtrack;
       }
       System.out.println("Total no. of seek operations"+seekcount);
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
   }
   }

