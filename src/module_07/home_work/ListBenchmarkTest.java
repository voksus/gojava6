package module_07.home_work;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListBenchmarkTest {

    public static void main(String[] args) {

        List<Integer> arrayList1000Int = new ArrayList<>();
        List<String> arrayList1000String = new ArrayList<>();
        List<Integer> arrayList10000Int = new ArrayList<>();
        List<String> arrayList10000String = new ArrayList<>();

        List<Integer> linkedList1000Int = new LinkedList<>();
        List<String> linkedList1000String = new LinkedList<>();
        List<Integer> linkedList10000Int = new LinkedList<>();
        List<String> linkedList10000String = new LinkedList<>();

        long start, finish, tStart, tFinish;

        tStart = System.nanoTime();

        //Generating 1000
        System.out.println("Generate Lists with 1'000 elements:");
        System.out.println("Integer:");
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList1000Int.add(i);
        }
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList1000Int.add(i);
        }
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");

        System.out.println("String:");
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList1000String.add("" + i);
        }
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList1000String.add("" + i);
        }
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");
        System.out.println();


        //Generating 10000
        System.out.println("Generate Lists with 10'000 elements:");
        System.out.println("Integer:");
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList10000Int.add(i);
        }
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList10000Int.add(i);
        }
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");

        System.out.println("String:");
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList10000String.add("" + i);
        }
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList10000String.add("" + i);
        }
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");
        System.out.println();

        // Add to 1000
        System.out.println("Using method ADD to Lists with 1'000 elements:");
        System.out.println("Integer:");
        start = System.nanoTime();
        arrayList1000Int.add(0);
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList1000Int.add(0);
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");

        System.out.println("String:");
        start = System.nanoTime();
        arrayList1000String.add("0");
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList1000String.add("0");
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");
        System.out.println();

        // Add to 10000
        System.out.println("Using method ADD to Lists with 10'000 elements:");
        System.out.println("Integer:");
        start = System.nanoTime();
        arrayList10000Int.add(0);
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList10000Int.add(0);
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");

        System.out.println("String:");
        start = System.nanoTime();
        arrayList10000String.add("0");
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList10000String.add("0");
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");
        System.out.println();

// Set to 1000
        System.out.println("Using method SET to Lists with 1'000 elements:");
        System.out.println("Integer:");
        start = System.nanoTime();
        arrayList1000Int.set(500, 0);
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList1000Int.set(500, 0);
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");

        System.out.println("String:");
        start = System.nanoTime();
        arrayList1000String.set(500, "0");
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList1000String.set(500, "0");
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");
        System.out.println();

        // Set to 10000
        System.out.println("Using method SET to Lists with 10'000 elements:");
        System.out.println("Integer:");
        start = System.nanoTime();
        arrayList10000Int.set(5000, 0);
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList10000Int.set(5000, 0);
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");

        System.out.println("String:");
        start = System.nanoTime();
        arrayList10000String.set(5000, "0");
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList10000String.set(5000, "0");
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");
        System.out.println();

// Get of 1000
        System.out.println("Using method GET in Lists with 1'000 elements:");
        System.out.println("Integer:");
        start = System.nanoTime();
        arrayList1000Int.get(500);
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList1000Int.get(500);
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");

        System.out.println("String:");
        start = System.nanoTime();
        arrayList1000String.get(500);
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList1000String.get(500);
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");
        System.out.println();

        // Get of 10000
        System.out.println("Using method GET in Lists with 10'000 elements:");
        System.out.println("Integer:");
        start = System.nanoTime();
        arrayList10000Int.get(5000);
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList10000Int.get(5000);
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");

        System.out.println("String:");
        start = System.nanoTime();
        arrayList10000String.get(5000);
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList10000String.get(5000);
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");
        System.out.println();

        // Remove from 1000
        System.out.println("Using method REMOVE in Lists with 1'000 elements:");
        System.out.println("Integer:");
        start = System.nanoTime();
        arrayList1000Int.remove(500);
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList1000Int.remove(500);
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");

        System.out.println("String:");
        start = System.nanoTime();
        arrayList1000String.remove(500);
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList1000String.remove(500);
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");
        System.out.println();

        // remove from 10000
        System.out.println("Using method REMOVE in Lists with 10'000 elements:");
        System.out.println("Integer:");
        start = System.nanoTime();
        arrayList10000Int.remove(5000);
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList10000Int.remove(5000);
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");

        System.out.println("String:");
        start = System.nanoTime();
        arrayList10000String.remove(5000);
        finish = System.nanoTime();
        System.out.println("\t\t ArrayList = " + (finish - start) + " nanos");

        start = System.nanoTime();
        linkedList10000String.remove(5000);
        finish = System.nanoTime();
        System.out.println("\t\tLinkedList = " + (finish - start) + " nanos");

        System.out.println("\n----------------------------------");
        tFinish = System.nanoTime();
        System.out.println("Totally used " + (tFinish - tStart) + " nanos");
    }
}