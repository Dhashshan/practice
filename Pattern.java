public class Pattern {
    public static void main(String[] args) {
        int n=13;
        for(int i=0;i<n-6;i++){
            for (int j=0;j<n;j++){
                if(i==0||i==n-1 ||j==0 ){
                System.out.print(" * ");
            }
                else{
                System.out.print("   ");
            }
        }
        System.out.println( );
    }
    for(int i=0;i<n-7;i++){
        for (int j=0;j<n;j++){
            if(i==5 || j==12){
            System.out.print(" * ");
        }
            else{
            System.out.print("   ");
    }
    }
    System.out.println( );
}
}
}
