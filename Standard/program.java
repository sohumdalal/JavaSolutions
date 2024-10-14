package Standard;
public class program

{
    public static void main(String[] args) {
       String [][] myData = Standard.ReadCSVText("stock_data.csv");
       System.out.println(myData[0]);
       System.out.println(myData.length);
       System.out.println(myData[2][2]);
    }
}
