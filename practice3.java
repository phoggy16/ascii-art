import java.util.Scanner;
public class practice3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
       line(size);
        System.out.println();
       upperhalf(size);
       middle(size);
       System.out.println();
       lowerhalf(size);
      line(size);
    }
    public static void line(int size){
        System.out.print("+");
        for(int i=1;i<=2*size;i++){
            System.out.print("-");
        }
        System.out.print("+");
    }
    public static void upperhalf(int size){
        for(int i=1;i<size;i++){
            System.out.print("|");
            for(int j=0;j<(i*-1)+size;j++) {
                System.out.print(" ");
            }
                System.out.print("/");
                if (i == 1) {
                    System.out.print("\\");
                } else if (i % 2 == 0) {
                    //System.out.print("/");
                    for (int k = 0; k < i * 2 - 2; k++) {
                        System.out.print("-");
                    }
                    System.out.print("\\");
                } else if (i % 2 == 1) {
                   // System.out.print("/");
                    for (int f = 0; f < i * 2 - 2; f++) {
                        System.out.print("=");
                    }
                    System.out.print("\\");
                } else {
                    System.out.print(" ");
                }
            //System.out.println();
            for(int q=0;q<(i*-1)+size;q++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static void middle(int size){
        System.out.print("|");
        System.out.print("<");
        if (size%2==0){
            for (int i=0;i<2*size-2;i++){
                System.out.print("-");
            }
            System.out.print(">");
            System.out.print("|");
        }

        else if(size%2==1){
            for (int j=0;j<2*size-2;j++){
                System.out.print("=");
            }
            System.out.print(">");
            System.out.print("|");
        }

    }
    public static void lowerhalf(int size){
        for(int i=size-1;i>0;i--){
            System.out.print("|");
            for(int j=size;j>i;j--) {
                System.out.print(" ");
            }
            System.out.print("\\");
             if (i % 2 == 1) {
                //System.out.print("/");
                for (int k = 0; k < i * 2 - 2; k++) {
                    System.out.print("=");
                }
                System.out.print("/");
            } else if (i % 2 == 0) {
                // System.out.print("/");
                for (int f = 0; f < i * 2 - 2; f++) {
                    System.out.print("-");
                }
                System.out.print("/");
            } else if(i==1) {
                System.out.print("/");
            }
            //System.out.println();
            for(int x=size;x>i;x--) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }

}
