package cts_pyq;

public class bmi {
    public static void main(String[] args) {
        int weight = 42;     // sample weight in kg
        float height = 1.54f; // sample height in meters

        int category = GetBMICategory(weight, height);

        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
        System.out.println("BMI Category: " + category);
    }
    public static int GetBMICategory(int weight, float height) {

        // Implementation to be done
        float bmi=(float)(weight/(height*height));
        if(bmi<18){
            return 0;
        }else if(bmi>=18 && bmi<25){
            return 1;
        }else if(bmi>=25 && bmi<30){
            return 2;
        }else if( bmi>=30 && bmi<40){
            return 3;
        }else {
            return 4;

        }


    }
}
