import java.util.Scanner;

public class SnapCrackleAndPop
  {
        public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          // use hasNext for each line of integers
          while(sc.hasNext()){
              // take input, parse to Int, match to criteria and output accordinly
              int rice = Integer.parseInt(sc.next());
              if(rice % 3 == 0)
                {
                  System.out.print("Pop ");
                }
              else if(rice % 2 == 0)
                {
                  System.out.print("Crackle ");
                }
              else{
                  System.out.print("Snap ");
                }
              }
          sc.close();
      }
    }
