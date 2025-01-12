package com.beginsecure;

import org.json.JSONObject;
import java.awt.*;






public class App {







    public static void main(String[] args) {
        System.out.println("he;lo ");

int n=6;
        int i, j;
        // outer loop to handle number of rows
        for (i = n; i >= 1; i--) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing column values upto the row
                // value.
                System.out.print(j + " ");
            }

            // print new line for each row
            System.out.println();
        }



        String mys="{\"name\" : \"mary\"}";
        JSONObject job=new JSONObject(mys);
        System.out.println("name= "+job.get("name"));



        Frame f = new Frame();
        Button btn=new Button("Hello World");
        btn.setBounds(80, 80, 100, 50);
        f.add(btn);         //adding a new Button.
        f.setSize(300, 250);        //setting size.
        f.setTitle("JavaTPoint");  //setting title.
        f.setLayout(null);   //set default layout for frame.
        f.setVisible(true);           //set frame visibility true.



    }
}
