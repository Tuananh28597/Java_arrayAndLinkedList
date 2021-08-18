package arrayList;
import java.util.Arrays;
public class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY =10;
    private Object elements[];

    public MyList(){
        elements=new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        this.size=capacity;
    }



    //Nhan doi do dai mang de luu tru
    private void ensureCapa(){
        int newSize = elements.length*2;
        elements=Arrays.copyOf(elements,newSize);
    }


     public void add(int index,E element){
         if(size == DEFAULT_CAPACITY){
             ensureCapa();
         }
         elements[size++]=element;
     }

     //xay dung ham remove
     public E remove(int index){
        E temp = (E) elements[index];
         for (int i = index; i < size; i++) {
             this.elements[i]=elements[i-1];
         }
         size--;
         return temp;
     }


     public int size(){
        return this.size=size;
     }

     public Object clone(){
        MyList<E> myList=new MyList<E>();
        myList.elements=this.elements;
        myList.size=this.size;
        return myList;
     }


     public boolean contains(E o){
         for (int i = 0; i < size; i++) {
             if((E)this.elements[i]==o){
                 return true;
             }

         }
         return false;
     }

    public Object[] getElements() {
        return elements;
    }
    public E get(int i){
        if(i>=size||i<0){
            throw new IndexOutOfBoundsException("Index: "+i+",Size"+i);
        }
        return (E) elements[i];
    }

}
