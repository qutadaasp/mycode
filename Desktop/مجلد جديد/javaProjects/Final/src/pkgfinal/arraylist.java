package pkgfinal;

public class arraylist {

    Integer[] a;
    int size;

    public void add(Integer data) {
        if (a.length == size) {
            ensurecapacity();
        }
        a[size] = data;
        size++;
    }

    private void ensurecapacity() {
        Integer na[] = new Integer[a.length * 2];
        for (int i = 0; i < size; i++) {
            na[i] = a[i];
        }
        a = na;
    }

    Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return a[index];
        }
    }

    public void add(int index, Integer data) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (index == size) {
            add(data);
        } else {
            if (a.length == size) {
                ensurecapacity();
            }
            Integer[] as = new Integer[a.length];
            for (int i = 0; i < index; i++) {
                as[i] = a[i];
            }
            as[index] = data;
            for (int j = index; j < size - 1; j++) {
                as[j + 1] = a[j];
            }
            a = as;
            size++;
        }
    }

    public Integer remove(int index) {
        Integer temp = a[index];
        if (index >= 0 || index < size) {
            for (int i = index; i < size - 1; i++) {
                a[i] = a[i + 1];
            }
            size--;
            return temp;
        }
        throw new ArrayIndexOutOfBoundsException();

    }
    Integer removeFirst(){
        return remove(0);
    }
    Integer removeLast(){
        return remove(size-1);
    }
    void addFirst(Integer data){
        add(0,data);
    }
     void addLast(Integer data){
        add(size,data);
    }
   

}
