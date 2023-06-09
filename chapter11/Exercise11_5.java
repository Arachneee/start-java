package chapter11;

import java.util.*;
class Student1 implements Comparable{
    String name;
    int ban;
    int no;
    int kor, eng, math;
    Student1(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal() {
        return kor+eng+math;
    }
    float getAverage() {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }
    public String toString() {
        return name +","+ban +","+no +","+kor +","+eng +","+math
                +","+getTotal() +","+getAverage();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student){
            Student tmp = (Student) o;

            int result = name.compareTo(tmp.name);

            if (result == 0){
                return tmp.ban-ban;
            } else {
                return result;
            }

        } else {
            return -1;
        }

    }
}
class Exercise11_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student1("김자바",1,1,100,100,100));
        list.add(new Student1("남궁성",1,2,90,70,80));
        list.add(new Student1("김자바",2,3,80,80,90));
        list.add(new Student1("이자바",1,4,70,90,70));
        list.add(new Student1("김자바",3,5,60,100,80));
        Collections.sort(list);
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}

