public class SuperTester {
  public static void main(String[] args) {
    SuperArray arr1 = new SuperArray();

    System.out.println("Array 1 Initial size: " + arr1.size());
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
  }
}
