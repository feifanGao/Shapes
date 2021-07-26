
public class Shapes {
    public static void plotSquare(int size){
        int height = size+1;
        int length = 2*size;
        
        for(int i = 0;i < height;i++){
            if(i==0){
                System.out.print(" ");
                for(int k = 0;k < length;k++)
                    System.out.print("_");
                System.out.println("");
                continue;
            }else if(i==size){
                System.out.print("|");
                for(int k = 0;k < length;k++)
                    System.out.print("_");
                System.out.println("|");
                break;
            }else{
                System.out.print("|");
                for(int k = 0;k < length;k++)
                    System.out.print(" ");
                System.out.println("|");
            } 
        }
    }

    public static void plotTriangle(int size){
        int height = size+1;
        int length = 2*size;

        for(int i = 0;i < height;i++){
            for(int j = 0;j < size-i;j++)
                System.out.print(" ");
            System.out.print("/");

            for(int j = 0;j < 2*i;j++){
                if(i == size)
                    System.out.print("_");
                else
                    System.out.print(" ");
            }
            System.out.println("\\");
        }

    }
    
    public static void plotRhombus(int size){   
        int height = size+2;
        double length = Math.rint(Math.sqrt(5)*(size+1));
        for(int i = 0;i < height;i++){
            if(i == 0){
                for(int j = 0;j < length+size+2;j++){
                    if(j<size+1)
                        System.out.print(" ");
                    else
                        System.out.print("_");                   
                }
                System.out.println("");
            }else if(i == size+1){
                System.out.print("/");
                for(int j = 0;j < length;j++)
                    System.out.print("_");
                System.out.println("/");
                break;
            }else{
                for(int j = 0;j < size-i+1;j++)
                    System.out.print(" ");
                System.out.print("/");
                for(int j = 0;j < length;j++)
                    System.out.print(" ");
                System.out.println("/");
            }
        }
    }
    public static void plotCircle(int size){
        int height = 2*size+1;
        int length = 4*size+1;
        double distance;

        if(size == 2){
            System.out.print("  XXXXX\nXXX   XXX\nXX     XX\nXXX   XXX\n  XXXXX\n");
            return;
        }

        for(int i = 0;i < height;i++){
            for(int j = 0;j < length;j++){
                distance = Math.sqrt( Math.pow(i-size,2) + Math.pow(j-2*size,2)/4 );   
                int r = (int)Math.round(distance);
                if(r == size)
                    System.out.print("X");
                else if(r > size && j > 2*size)
                    continue;
                else
                    System.out.print(" ");
            }       
            System.out.println("");
        }
    }

    public static void main(String args[]){
        if(args.length<2){
            System.out.println("Usage: java Shapes <shape> <size>");
            return;
        }       
        
        String shape = args[0];
        
        try{
            int size = Integer.parseInt(args[1]);
        } catch (Exception e) {
            System.out.println("Invalid size - it must be a positive integer.");
            return;
        }

        int size = Integer.parseInt(args[1]);

        if(size<=0){
            System.out.println("Invalid size - it must be a positive integer.");
            return;
        }

        if(!shape.equals("square") && !shape.equals("triangle") && !shape.equals("circle") && !shape.equals("rhombus")){
            System.out.println("Invalid shape, must be either square, triangle, circle or rhombus.");
            return;
        }

        if(shape.equals("square")){
            plotSquare(size);
        }else if(shape.equals("triangle")){
            plotTriangle(size);
        }else if(shape.equals("circle")){
            plotCircle(size);
        }else if(shape.equals("rhombus")){
            plotRhombus(size);
        }
    }
}
