import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        tasks1();
        tasks2();
        tasks3();
        tasks4();

        System.out.println();

    }

    public static void tasks1() {
        System.out.println("Задания 1");
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < 10 ; i++) {
            System.out.println(arr[i]);
        }

        double[] a = {1.57,7.654,9.986};
        a[0]= 1.57;
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);

        }



    }
    public static void tasks2(){
        System.out.println("Задания 2");
        double[] b ={1.57,7.654,9.986};
        b[0]= 1.57;
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i!= b.length-1){
                System.out.print(" , ");

            }

        }
}
    public static void tasks3(){
        System.out.println();
        System.out.println("Задания 3");

        double[] c ={9.986,7.654,1.57};
        c[0]=9.986;
        for (int i = 0; i < c.length;i++) {
            System.out.print(c[i]);
            if (i!= c.length-1){
                System.out.print(" , ");}


        }}
        public static void tasks4(){
            System.out.println();
            System.out.println("Задания 4");

            int [] arr= new int[10];
            for (int i = 1; i <= 10; ++i) {
                arr[i-1]=i;}
                System.out.println("Начальный массив: " + Arrays.toString(arr));

            for (int i = 0; i < arr.length ; ++i) {
                if (arr[i] % 2 == 1) {
                    arr[i] = arr[i] + 1;
                }
            }
                System.out.println("Итоговый массив: " + Arrays.toString(arr));




            }



}
