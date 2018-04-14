package com.tyler.listview_todo_list_custom_item_view;

/**
 * Created by tylercaldwell on 3/25/18.
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class ToDoItem {
    String text;
    Date created;

    public ToDoItem(String text) {
        this.text = text;
        //Defaults to right now
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

        this.created = new Date();
    }

    public Date getCreated(){
        return created;
    }

    public String getText(){
        return text;
    }
}
