//package com.example.demo;
//
//import java.beans.PropertyEditorSupport;
//
//public class UserPropertyEditor extends PropertyEditorSupport {
//
//    @Override
//    public String getAsText() {
//        int id = ((User) getValue()).getId();
//        return String.valueOf(id);
//    }
//
//    @Override
//    public void setAsText(String text) throws IllegalArgumentException {
//        setValue(new User(Integer.parseInt(text)));
//    }
//}