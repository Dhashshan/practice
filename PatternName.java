public class PatternName {
    public static void main(String[] args)throws Exception {
        int n=5;
       for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0 || i==n-1 ||j==n-1 ||j==n-4){
                System.out.print(" * ");
            }
                else{
                System.out.print("   ");
            }
        }
        System.out.print(" " );
        for (int j=0;j<n;j++){
            if(j==0 || j==n-1 ||i==n/2){
            System.out.print(" * ");
        }
            else{
            System.out.print("   ");
    }
    }
    System.out.print(" " );
    for (int j=0;j<n;j++){
        if(i==0 || j==0 || j==n-1 ||i==n/2){
        System.out.print(" * ");
    }
        else{
        System.out.print("   ");
     }
    }
    System.out.print(" " );
    for (int j=0;j<n;j++){
        if(i==0 || i==n-1 ||i==n/2 ||j==0 && i+j<=n/2 || j==n-1 && j+i>=n+1){
        System.out.print(" * ");
    } 
        else{
        System.out.print("   ");
    }
}
System.out.print(" " );
    for (int j=0;j<n;j++){
        if(j==0 || j==n-1 ||i==n/2){
        System.out.print(" * ");
    }
        else{
        System.out.print( "   ");
    }
}
System.out.print(" " );
    for (int j=0;j<n;j++){
        if(i==0 || i==n-1 ||i==n/2 ||j==0 && i+j<=n/2 || j==n-1 && j+i>=n+1){
        System.out.print(" * ");
    }
        else{
        System.out.print("   ");
    }
}
System.out.print(" ");
    for (int j=0;j<n;j++){
        if(j==0 || j==n-1 ||i==n/2){
        System.out.print(" * ");
    }
        else{
        System.out.print("   ");
    }
}
System.out.print(" ");
    for (int j=0;j<n;j++){
        if(i==0 || j==0 || j==n-1 ||i==n/2){
        System.out.print(" * ");
    }
        else{
        System.out.print("   ");
    }
}
System.out.print(" ");
    for (int j=0;j<n;j++){
        if(j==0 ||j==n-1 ||i==j){
        System.out.print(" * ");
    }
        else{
        System.out.print("   ");
        Thread.sleep(1000);
    }
}
System.out.println();
}
}
}

