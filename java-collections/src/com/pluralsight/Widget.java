package com.pluralsight;

public class Widget<T> {
  private T type;

    public static void main(String[] args) {
        Widget<String> widget1 = new Widget<>();
        widget1.setType("hello");
        Widget widget2 = new Widget<>();

        String[] strings = new String[] {"Hi", "There"};
        System.out.println(Widget.firstArrayElement(strings));
    }
    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
    // <T> tells compiler that this uses generics, then T tells that it will return T
    public static <T> T firstArrayElement(T[] t) {

        return t.length > 0 ? t[0] : null;
    }
}
