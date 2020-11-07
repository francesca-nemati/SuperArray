public class Demo {
  public static void removeDuplicates(SuperArray s) {
    for (int i = 0; i < s.size(); i++) {
      for (int j = i+1; j < s.size(); j++) {
        if (s.get(i).equals(s.get(j))) {
          s.remove(j);
          j = j - 1;
        }
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray intersection = new SuperArray();

    int smallestArr = 0;
    if (a.size() < b.size()) smallestArr = a.size();
    else smallestArr = b.size();

    for (int i = 0; i < smallestArr; i++) {
      if (a.get(i).equals(b.get(i))) {
        if (!intersection.contains(a.get(i))) {
          intersection.add(a.get(i));
        }
      }
    }
    return intersection;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray merge = new SuperArray();
    int shorterArr = 0;
    if (a.size() < b.size()) shorterArr = a.size();
    else shorterArr = b.size();
    for (int i = 0; i < shorterArr; i++) {
      merge.add(a.get(i));
      merge.add(b.get(i));
    }
    if (a.size() > b.size()) {
      for (int i = (shorterArr); i < a.size(); i++) {
        merge.add(a.get(i));
      }
    }
    else {
      for (int i = (
      shorterArr); i < b.size(); i++) {
        merge.add(b.get(i));
      }
    }
    return merge;
  }


  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("una");
    words.add("una");
    words.add("ebi");
    words.add("kani");
    words.add("una");
    words.add("una");
    words.add("ebi");
    words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray one = new SuperArray();
    SuperArray two = new SuperArray();

    one.add("1");
    one.add("2");
    one.add("3");
    one.add("4");
    one.add("5");

    two.add("1");
    two.add("1");
    two.add("3");
    two.add("4");
    two.add("4");
    two.add("5");

    System.out.println(findOverlap(one,two));

    two.clear();
    two.add("one");
    two.add("two");
    two.add("three");
    two.add("four");
    two.add("five");
    two.add("six");

    System.out.println(zip(one,two));

  }

}
