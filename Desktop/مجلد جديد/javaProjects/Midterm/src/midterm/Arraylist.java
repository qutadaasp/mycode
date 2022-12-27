package midterm;

public class Arraylist {

    Integer[] a;
    int size = 5;

    public Arraylist() {
        a = new Integer[size];
    }
    public void addLast(Integer data){
        add(size-1,data);
    }
    public Integer removeLast(){
       return remove(size-1);
    }
    public Integer[] getA() {
        return a;
    }

    public int getSize() {
        return size;
    }

    public void setA(Integer[] a) {
        this.a = a;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(Integer data) {
        if (size == a.length) {
            ensurecapacity();
        }
        a[size] = data;
        size++;
    }

    private void ensurecapacity() {
        Integer newa[] = new Integer[a.length * 2];
        for (int i = 0; i < a.length; i++) {
            newa[i] = a[i];
        }
        a = newa;
    }
      public Integer remove(int index) {
        Integer temp = a[index];
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("");
        }
        for (int i = index; i < size - 1; i++) {
            a[i + 1] = a[i];
        }

        return temp;
    }

    public Integer get(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("");
        }
        return a[index];
    }

    public void add(Integer data, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("");
        }
        if (index >= 0 && index <= size) {
            if (index == size) {
                add(data);
            } else {
                if (size == a.length) {
                    ensurecapacity();
                }
                for (int i = size - 1; i >= index; i--) {
                    a[i + 1] = a[i];
                }

                a[index] = data;
                size++;
            }
        } else {
            System.out.println("Not Available");
        }
    }

    public static void main(String[] args) {
        Arraylist a = new Arraylist();
        a.add(32, 0);
        a.add(33, 0);
        System.out.println(a.get(0) + " " + a.get(1));
    }

}
