public class SuperTester {
  public static void main(String[] args) {
    SuperArray arr1 = new SuperArray();

    System.out.println("Initial size: " + arr1.size());
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
  }
}
