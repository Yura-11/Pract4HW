

public class Main {
    public static void main(String[] args) {

        LinkedList2<Integer> List = new  LinkedList1<>();


        List.addList(100);  //4
        List.addList(18); //3
        List.addList(48); //2
        List.addList(789); //1
        List.addList(1333333); //0
        List.addEndList(100); //5

        System.out.println("Размер " + List.size() + " элементов." );
        System.out.println("Элемент по индексу 3 " + List.searchElementIndex(3));
    }
}