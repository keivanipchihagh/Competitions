import java.text.DecimalFormat;
import java.util.Scanner;

class quera {

    public static float determinant(float[][] matrix){ //method sig. takes a matrix (two dimensional array), returns determinant.
        float sum=0; 
        float s;
        if(matrix.length==1){  //bottom case of recursion. size 1 matrix determinant is itself.
          return(matrix[0][0]);
        }
        for(int i=0;i<matrix.length;i++){ //finds determinant using row-by-row expansion
            float[][]smaller= new float[matrix.length-1][matrix.length-1]; //creates smaller matrix- values not in same row, column
          for(int a=1;a<matrix.length;a++){
            for(int b=0;b<matrix.length;b++){
              if(b<i){
                smaller[a-1][b]=matrix[a][b];
              }
              else if(b>i){
                smaller[a-1][b-1]=matrix[a][b];
              }
            }
          }
          if(i%2==0){ //sign changes based on i
            s=1;
          }
          else{
            s=-1;
          }
          sum+=s*matrix[0][i]*(determinant(smaller));
        }
        return(sum); //returns determinant value. once stack is finished, returns final determinant.
      }

    // Driver code
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        float[][] mat = new float[count][count];

        for (int i = 0 ; i < count ; i++) {
            for (int j = 0 ; j < count ; j++) {
                mat[i][j] = scan.nextFloat();
            }
        }
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println(df.format(determinant(mat)));
    }
}