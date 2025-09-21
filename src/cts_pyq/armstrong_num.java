package cts_pyq;

public class armstrong_num {
    public static void main(String[] args) {

        //int n = 9474;
        int n;
        for (n = 0; n <= 1000; n++) {
            int orginal = n;
            int temp=orginal;
            int count = 0;
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
            temp= n;
            int x = 0;
            int sum = 0;
            while (temp != 0) {

                x = temp % 10;

                sum += (int) (Math.pow(x, count));
                temp = temp / 10;

            }
            if (orginal == sum) System.out.println(orginal);


        }
        n = 0;


    }

}
