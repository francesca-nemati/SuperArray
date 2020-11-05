public class SuperArray {
  private String[] data;
  private int size; //the current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity) {
    data = new String[initialCapacity];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size < data.length) {
      data[size] = element;
      size++;
      return true;
    }
    else if (size == data.length) {
      resize();
      data[size] = element;
      size++;
      return true;
    }
    else return false;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String replaced = data[index];
    data[index] = element;
    return replaced;
  }

  private void resize() {
    String[] largerArr = new String[data.length*2]; //increase by 10;
    for (int i = 0; i < data.length; i++) {
      largerArr[i] = data[i];
    }
    data = largerArr;
  }

  public boolean isEmpty() {
    if (size == 0) return true;
    else return false;
  }

  public void clear() {
    for (int i = 0; i < data.length; i++) {
      data[i] = null;
    }
    size = 0;
  }

  public String toString() {
    String str = "[";
    if (size == 0) str = str + "]";
    for (int i = 0; i < size; i++) {
      if (i == size-1) str = str + data[i] + "]";
      else str = str + data[i] + ", ";
    }
    return str;
  }

  public boolean contains(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) return true;
    }
    return false;
  }

  public void add(int index, String element) {
    if (size == data.length) {
      resize();
    }
    if (data[index] == null) {
      data[index] = element;
    }
    else if (data[index] != null) {
      for (int i = size; i > index; i--) {
        data[i] = data[i-1];
      }
      data[index] = element;
    }
    size = size + 1;
  }

  public String remove(int index) {
    String rem = data[index];
    for (int i = index; i < size -1; i++) {
      data[i] = data[i+1];
    }
    size = size - 1;
    return rem;
  }

  public int indexOf(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) return i;
    }
    return -1;
  }

  public String[] toArray() {
    String[] arr = new String[size];
    for (int i = 0; i < size; i++) {
      arr[i] = data[i];
    }
    return arr;
  }

}
