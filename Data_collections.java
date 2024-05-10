import java.util.*;

public class Data_collections {
    public static void main(String[] arg){
        /* data collections in java divided to tow things classes and interfaces
        classes are{ Array, Stack, ArrayList, LinkedList, vector, HashMap, TreeMap, LinkedHashMap,
        HashSet, Treeset, LinkedHashSet,   ArrayDequeue, PriorityQueue}
        interfaces are { List, Set, Queue, Dequeue, Map, SortedMap, SortedSet}
        interfaces implemented with classes
        1-List:- Ordered collection (elements are stored in a specific order),
                 implement with { ArrayList, LinkedList, Vector }.
        2- Set:- Unordered collection (no duplicates allowed).
                 implement with { HashSet, LinkedHashSet, TreeSet }.
        3- Map:- Maps keys to values (no duplicate keys allowed).
                 implement with { HashMap, LinkedHashMap, TreeMap }.
        4-Queue:-Ordered collection for holding elements prior to processing(FIFO).
                 implement with { LinkedList, PriorityQueue }.
        5-Dequeue:-A double-ended queue that supports element insertion and removal at both ends.
                   implement with { ArrayDeque, LinkedList }.
        6-SortedMap:-An ordered set where elements are sorted in their natural order or according
                   to a specified comparator.
                   implement with { TreeMap }.
        7-SortedSet:-A map that maintains its keys in ascending order.
                   implement with { TreeSet }.
        */
        //Array is immutable, Array is class
        int[] x=new int[3];
        //x[i]=0; is a default value I can don't write any index if his value is zero
        x[0]=5;
        x[1]=1;
        x[2]=2;
        x[0]=3;
        for (Integer i :x){
            System.out.println(i);
        }
        for (int i=0;i< x.length ;i++){
            System.out.println(x[i]);
        }
        System.out.println("#############################");
        int[] y={0,1,2};// equal arrayof in kotlin
        System.out.println(y[1]);
        System.out.println(y.length);
        System.out.println(Arrays.toString(y));
        // there are another type int[] x=new int[]{1,2,3,4,5,8}
        //array of 2D
        System.out.println("#############################");
        int[][] x1;
        x1= new int[][]{{1,2,3}
                      , {1,2,3}};
        int[][] y2={{1,2,3}
                   ,{1,2,3}};
        System.out.println(x1[0][1]);
        for (int i=0;i<y2.length;i++){
            System.out.println(Arrays.toString(y2[i]));
            for (int j=0;j<y2[i].length;j++){
                System.out.println(y2[i][j]);
            }
        }
        System.out.println("#############################");
        // Arraylist is mutable, Arraylist is class
        ArrayList<Integer> t=new ArrayList<Integer>(5);
        t.add(2);
        t.add(3);
        t.add(0,6);
        t.add(6);//[6,2,3,6]
        t.remove(2);//[6,2,6]
        t.set(2,5);//[6,2,5]
        System.out.println(t.get(0)+" "+t.size()+" "+t);
        System.out.println("#############################");
        //linkedlist, class
        LinkedList<Integer> g=new LinkedList<>();
        g.addFirst(2);
        g.addLast(8);
        g.set(0,6);
        System.out.println(g+" "+ g.get(0)+" "+g.size());
        System.out.println("#############################");
        // Hashmap is a class
        HashMap<Integer,String> n=new HashMap<>(4);
        n.put(1,"one");
        n.put(2,"tow");
        n.put(3,"three");
        System.out.println(n+" "+n.get(1)+" "+n.size()+" "+n.values()+" "+n.entrySet()+" "+n.keySet());
//        for (Integer i : n.keySet()) {
//            System.out.println(i);
//        }
        for (Map.Entry<Integer, String> i : n.entrySet()){
            System.out.println("key: "+i.getKey()+" value: "+i.getValue());
        }
        System.out.println("#############################");
        //Hashset is a class
        HashSet<Integer> m=new HashSet<>(4);
        m.add(5);
        m.add(1);
        m.add(4);
        m.add(7);
        m.addAll(g);
        System.out.println(m+" "+m.size());
        System.out.println("#############################");
        //stack is a class
        Stack<Integer> q=new Stack<Integer>();
        q.add(5);
        q.add(1,4);
        q.add(9);
        q.add(2,2);
        q.push(7);//add last
        q.add(9);
        q.pop();//remove last
        q.pop();
        System.out.println(q+" "+q.peek());// peek method the top element in stack the last element
        System.out.println("#############################");
        //queue is interface
        ArrayDeque<Integer> qq=new ArrayDeque<>(4);
        qq.add(5);
        qq.addFirst(1);
        qq.addLast(6);
        qq.push(3);// add first
        qq.addFirst(2);
        qq.pop();//remove first
        System.out.println(qq+" "+qq.peek());
        System.out.println("#############################");
        //treeset is a class
        TreeSet<Integer> tt=new TreeSet<>();
        System.out.println("#############################");
        //treemap is a class
        TreeMap<Integer,String> mm=new TreeMap<>();
        System.out.println("#############################");
        Vector<Integer> vv=new Vector<>();
        System.out.println("#############################");
        LinkedHashMap<Integer,Integer> link=new LinkedHashMap<>();
        System.out.println("#############################");
        LinkedHashSet<Integer> lins=new LinkedHashSet<>();
        System.out.println("#############################");
        PriorityQueue<Integer> pri=new PriorityQueue<>();
        System.out.println("#############################");



    }
}
