package com.garretthendrickson.TomatoApp;

import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;

/**
 * Created by somethingPr0fane on 2/6/14.
 */
public class Parser {
    //This will be used to parse HTML into a map for easier manipulation and use.
    public static void main(String html){
        Document doc = null;
        try {
            doc = Jsoup.connect("http://www.google.com").get();

            String testTitle = doc.title();
            System.out.println("Title: " + testTitle);

        } catch (Exception ex){

        }
    }

}
