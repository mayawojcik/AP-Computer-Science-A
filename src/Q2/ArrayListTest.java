package Q2;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        // Dynamic array/list operations:
        // add(obj), add(index, obj) -- insert, remove(index),
        // get(index), set(index, obj), size()
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<WrapperType> for primitive types

        for (int i = 0; i < 100; i++) {
            int rand = (int)(Math.random() * 100) + 1;
            list.add(rand);
        }

        for (int i = 0; i < list.size(); i += 2)
            System.out.print(list.get(i) + " ");
        System.out.println();

        System.out.println("Does list contain 50? " + list.contains(50));
        System.out.println("Index of 50: " + list.indexOf(50));

        list.add(2, 999);
        list.set(0, 123);

        for (int num : list)
            System.out.println(num);


    }
}
/*
C:\Users\wojcik.m1\.jdks\openjdk-22.0.2\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=51243:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\wojcik.m1\IdeaProjects\AP-Computer Science\out\production\AP-Computer Science;C:\Users\wojcik.m1\IdeaProjects\AP-Computer Science\lib\kotlin-stdlib.jar;C:\Users\wojcik.m1\IdeaProjects\AP-Computer Science\lib\kotlin-reflect.jar;C:\Users\wojcik.m1\IdeaProjects\AP-Computer Science\lib\kotlin-test.jar" Q2.ArrayListTest
77 80 75 30 20 24 95 61 29 23 79 33 92 32 80 54 15 69 51 86 98 78 63 66 16 17 87 39 31 57 61 98 62 94 11 32 92 68 84 28 89 77 24 70 76 22 84 37 70 1
Does list contain 50? false
Index of 50: -1
123
60
999
80
7
75
12
30
63
20
6
24
19
95
23
61
69
29
75
23
94
79
44
33
80
92
68
32
2
80
68
54
40
15
12
69
80
51
87
86
27
98
75
78
73
63
45
66
34
16
26
17
79
87
19
39
80
31
46
57
95
61
2
98
37
62
74
94
57
11
23
32
6
92
41
68
43
84
53
28
94
89
27
77
66
24
42
70
63
76
40
22
77
84
9
37
53
70
12
1
68
 */