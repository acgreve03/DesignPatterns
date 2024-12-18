package com.TextFormatter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        /*TEXT FORMATTER*/
        ArrayList<String> data = new ArrayList<>();
        data.add("The first author whose articles were most frequently selected ... with three articles in the sample.");
        data.add("The two institutions with the most articles included in the ... ");
        data.add("The authors of the articles in the selected sample represented ... ");
        data.add("242 institutions, 207 were universities or colleges; 24 were ... ");
        data.add("technology, or polytechnics; and 11 were other types of ... ");

        TextFile file = new TextFile(data);
        int option = 1;
        switch(option){
            case 0:
                file.setFormat(new PlainTextFormat());
                break;
            case 1:
                file.setFormat(new HTMLFormat());
                break;
            case 2:
                file.setFormat(new MarkdownFormat());
                break;
            default:
                file.setFormat(new PlainTextFormat());
        }

        file.printFormatted();
    }
}
