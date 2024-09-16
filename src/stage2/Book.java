package stage2;

import java.util.ArrayList;
import java.util.Comparator;

public class Book {

    private Cover cover;
    private Page[] pages;
    private String editor;

    public class Cover {
        //some code here
        private String text;
    }


    public static class Page {

        private static final int DEFAULT_WIDTH = 210;
        private static final int DEFAULT_HEIGHT = 297;


        private final int width;
        private final int height;
        private final String text;


        public Page(String text) {
            this(text, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        }

        public Page(String text, int width, int height) {
            this.text = text;
            this.width = width;
            this.height = height;
        }
    }
}
