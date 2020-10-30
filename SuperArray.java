public class SuperArray {
  private String[] data;
  private int size; //the current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size <= data.length) {
      data[size] = element;
      return true;
    }
    else return false;
  }

  

}
