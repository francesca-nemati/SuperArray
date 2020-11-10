public class SuperTester {
  public static void main(String[] args) {
    SuperArray arr1 = new SuperArray();

    System.out.println("Array 1 Initial size: " + arr1.size());
    System.out.println("Empty?: " + arr1.isEmpty());
    System.out.println();

    arr1.add("Hello");
    System.out.println("Index 0: " + arr1.get(0));
    System.out.println("New size: " + arr1.size());
    System.out.println();

    arr1.add("My");
    arr1.add("Name");
    arr1.add("Is");
    arr1.add("Nobody");
    System.out.println("Index 1: " + arr1.get(1));
    System.out.println("Index 2: " + arr1.get(2));
    System.out.println("Index 3: " + arr1.get(3));
    System.out.println("Index 4: " + arr1.get(4));
    System.out.println("New size: " + arr1.size());
    System.out.println();

    System.out.println("Index 0: " + arr1.get(0));
    System.out.println("Index 1: " + arr1.get(1));
    System.out.println("Index 2: " + arr1.get(2));
    System.out.println("Index 3: " + arr1.get(3));
    System.out.println("Replaced index 4: " + arr1.set(4, "John Cena"));
    System.out.println("Changed index 4: " + arr1.get(4));
    System.out.println("New size: " + arr1.size());
    System.out.println();
    System.out.println();

    SuperArray arr2 = new SuperArray();

    arr2.add("0");
    arr2.add("1");
    arr2.add("2");
    arr2.add("3");
    arr2.add("4");
    arr2.add("5");
    arr2.add("6");
    arr2.add("7");
    arr2.add("8");
    arr2.add("9");
    for (int i = 0; i < arr2.size(); i++) {
      System.out.println(arr2.get(i));
    }

    arr2.add("10");
    arr2.add("11");
    arr2.add("12");
    arr2.add("13");
    arr2.add("14");
    arr2.add("15");
    arr2.add("16");
    arr2.add("17");
    arr2.add("18");
    arr2.add("19");
    for (int i = 10; i < arr2.size(); i++) {
      System.out.println(arr2.get(i));
    }

    System.out.println(arr2.toString());
    arr2.add(4, "break");
    System.out.println(arr2.toString());
    System.out.println("New size: " + arr2.size());
    System.out.println();

    System.out.println("Arr1 Empty?: " + arr1.isEmpty());
    arr1.clear();
    System.out.println("Cleared. Empty?: " + arr1.isEmpty());
    arr1.add("Hi");
    arr1.add("again");
    arr1.add(":)");
    System.out.println("Array contents: " + arr1.toString());
    System.out.println("Contains Hello: " + arr1.contains("Hello"));
    System.out.println("Contains Hi: " + arr1.contains("Hi"));

    arr1.add(3,"!");
    System.out.println(arr1.toString());
    System.out.println("New size: " + arr1.size());
    System.out.println();

    arr1.remove(2);
    System.out.println(arr1.toString());
    System.out.println("New size: " + arr1.size());

    System.out.println();
    System.out.println("Index of Hello: " + arr1.indexOf("Hello"));
    System.out.println("Index of Hi: " + arr1.indexOf("Hi"));

    SuperArray arr3 = new SuperArray();
    arr3.add("0");
    arr3.add("1");
    arr3.add("2");
    arr3.add("3");
    arr3.add("4");
    arr3.add("0");
    arr3.add("1");
    arr3.add("2");
    arr3.add("3");
    arr3.add("4");
    arr3.add("0");
    arr3.add("1");
    arr3.add("2");
    arr3.add("3");
    arr3.add("4");
    arr3.add("0");
    arr3.add("1");
    arr3.add("2");
    arr3.add("3");
    arr3.add("4");
    arr3.remove(19);
    System.out.println(arr3.toString());
    System.out.println();

    try {
      SuperArray arr4 = new SuperArray(-1);
    }
    catch(IllegalArgumentException e) {
      System.out.println("Failed to initialize arr4");
    //  e.printStackTrace();
    }

    try {
      arr3.get(20);
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("Invalid index for get");
    //  e.printStackTrace();
    }

    try {
      arr3.get(-1);
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("Invalid index for get");
      //e.printStackTrace();
    }

    try {
      arr3.set(20, "hi");
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("Invalid index for set");
      //e.printStackTrace();
    }

    try {
      arr3.set(-1, "hi");
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("Invalid index for set");
      //e.printStackTrace();
    }

    try {
      arr3.add(19, "hi");
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("Invalid index for add");
      //e.printStackTrace();
    }

    try {
      arr3.add(-1, "hi");
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("Invalid index for add");
      //e.printStackTrace();
    }

    try {
      arr3.remove(20);
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("Invalid index for remove");
      //e.printStackTrace();
    }

    try {
      arr3.remove(-1);
    }
    catch(IndexOutOfBoundsException e) {
      System.out.println("Invalid index for remove");
      //e.printStackTrace();
    }

  }
}
