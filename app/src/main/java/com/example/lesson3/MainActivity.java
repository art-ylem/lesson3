package com.example.lesson3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        int s = Car.SCORE;
//        Car sportCar = new Car(){
//            @Override
//            public void startEngine() {
//                Log.d("TAG", "startEngine: OOOOOOOOOOOOOOOOOOO");
//            }
//        };
//
//        Machine mach1 = new Car();
//        Car mach2 = new Car();
//        int y = 0;
//        y++;
//        Machine.Detail mach3 = new Machine.Detail("name");
//
//        Machine[] machines = {new Car(), new Car(), new Airplane(), sportCar};
//        Machine m = mach2;
//
//        for(int i = 0; i < machines.length; i++ ){
//            if(machines[i] instanceof Car){
//                Car c = (Car) machines[i];
//                c.driving();
//            }
//        }
//
//        int f = 1;
//        try {
//            int u =5/f;
//            int[] intArr = {};
//            int b = intArr[1];
//        } catch (ArithmeticException e){
//            Log.e("tag", "Arithmetic:  divide by ZERO");
//        } catch (ArrayIndexOutOfBoundsException e){
//            Log.e("tag", "RT:  divide by ZERO");
//        }
//

    }

    public void err(){
        int i = 2;
        if(i == 2){
            throw new ArithmeticException("arithmeticEx 2!");
        }
    }


}
