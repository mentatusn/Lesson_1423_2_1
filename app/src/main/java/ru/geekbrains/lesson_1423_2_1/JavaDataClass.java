package ru.geekbrains.lesson_1423_2_1;

import android.view.View;

public class JavaDataClass {
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;


    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        }
    };


    private JavaDataClass copy(JavaDataClass javaDataClass) {
        JavaDataClass newJavaDataClass = new JavaDataClass();
        JavaSingleton.getInstance().field1 = "dfhgdr";
        KotlinSingleton.INSTANCE.setField1("dfhgdr");
        newJavaDataClass.field1 = field1;
        newJavaDataClass.field2 = field2;
        newJavaDataClass.field3 = field3;
        newJavaDataClass.field4 = field4;
        newJavaDataClass.field5 = field5;
        return newJavaDataClass;
    }


    @Override
    public String toString() {
        return "JavaDataClass{" +
                "field1='" + field1 + '\'' + JavaSingleton.getInstance().field1+  KotlinSingleton.INSTANCE.getField1()+
        ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                ", field4='" + field4 + '\'' +
                ", field5='" + field5 + '\'' +
                '}';
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }
}
