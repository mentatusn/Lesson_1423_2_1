package ru.geekbrains.lesson_1423_2_1;

public class JavaSingleton {
    private JavaSingleton() {
    }

    public String field1 ="";



    private static JavaSingleton INSTANCE =null;

    public static JavaSingleton getInstance(){
        if(INSTANCE==null){
            INSTANCE = new JavaSingleton();
        }
        return INSTANCE;
    }
}
