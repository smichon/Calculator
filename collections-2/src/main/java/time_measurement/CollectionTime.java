package time_measurement;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class CollectionTime {

    Random generator = new Random();

    public void linkedListTime(List<Book> bookList) {

        long begin = System.nanoTime();
        bookList.remove(0);
        long end = System.nanoTime();
        System.out.println("------------\nRemoving element from the beginning of the collection has taken: "
                + (end - begin) + " ns");

        begin = System.nanoTime();
        bookList.remove(bookList.size() - 1);
        end = System.nanoTime();
        System.out.println("Removing element from the end of the collection has taken: " + (end - begin) + " ns");

        begin = System.nanoTime();
        bookList.add(0, new Book(Integer.toString(generator.nextInt(20)),
                                        Integer.toString(generator.nextInt(50))));
        end = System.nanoTime();
        System.out.println("Adding element at the beginning of the collection has taken: " + (end - begin) + " ns");

        begin = System.nanoTime();
        bookList.add(new Book(Integer.toString(generator.nextInt(20)), Integer.toString(generator.nextInt(50))));
        end = System.nanoTime();
        System.out.println("Adding element at the end of the collection has taken: " + (end - begin) + " ns");
    }

    public void hashMapTime(Map<String, String> bookMap) {

        long begin = System.nanoTime();
        bookMap.get(bookMap.size()-1);
        long end = System.nanoTime();
        System.out.println("------------\nReturns value from bookMap: " + (end - begin) + " in ns");

        begin = System.nanoTime();
        bookMap.put("Author", "Title");
        end = System.nanoTime();
        System.out.println("Adding element to the bookMap: " + (end - begin) + " in ns");

        begin = System.nanoTime();
        bookMap.remove("Author");
        end = System.nanoTime();
        System.out.println("Removing element from the bookMap: " + (end - begin) + " in ns");
    }
}
