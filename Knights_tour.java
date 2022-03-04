public class HelloWorld{
    public static int[] rr ={-2,-2,-1,1,1,-1,2,2};
    public static int[] cc ={1,-1,-2,-2,2,2,-1,1};
    public static void KnightsTour(int[][] chess,int i,int j,int cnt){
        chess[i][j]=cnt;
        if(cnt==chess.length*chess[0].length){
            for(int[] ar:chess){
            for(int ele=0;ele<ar.length;ele++){
                System.out.print(ar[ele]+"  ");
            }
            System.out.println("");
        }
        System.out.println("=====================");
        }
        
        for(int k=0;k<rr.length;k++){
            int rdir = i+rr[k];
            int cdir = j+cc[k];
            if( rdir>=0 && cdir>=0 && rdir<=chess.length-1 && cdir<=chess[0].length-1 && chess[rdir][cdir]==-1 ){
                //chess[rdir][cdir]=cnt;
                KnightsTour(chess,rdir,cdir,cnt+1);
                chess[rdir][cdir]=-1;
            }
            
        }
    }
    public static void Reset(int[][] chess){
         for(int[] ar:chess){
            for(int i=0;i<ar.length;i++){
                ar[i]=-1;
            }
        }
    }
     public static void main(String []args){
        int[][] chess = new int [5][5];
        Reset(chess);
        
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess[0].length;j++){
                //if(chess[i][j]==-1)
                KnightsTour(chess,i,j,1);
                //Reset(chess);
            }
        }
        
     }
}
