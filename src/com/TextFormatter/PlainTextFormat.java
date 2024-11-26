package com.TextFormatter;
import com.TextFormatter.IFormat;

import java.util.ArrayList;

public class PlainTextFormat implements IFormat {

    @Override
    public void format(ArrayList<String> data) {
        for(int i = 0; i < data.size(); i++){
            System.out.println(data.get(i));
        }
    }
}
