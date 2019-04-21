package com.example.vektorel.myapplication;

/**
 * Created by vektorel on 21.04.2019.
 */

public class Utility {
    public enum Names {
        Mert("Mert"),Hasan("Hasan"),Akin("Akin");


        private String stringValue;



        private Names(String toString) {
            stringValue = toString;
        }




        @Override
        public String toString() {
            return stringValue;
        }
    }
}
