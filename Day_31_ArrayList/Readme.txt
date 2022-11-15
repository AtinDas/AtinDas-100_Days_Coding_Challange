Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given
lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in position of

line.

Take your input from System.in.

Input Format
The first line has an integer
. In each of the next lines there will be an integer denoting number of integers on that line and then there will be space-separated integers. In the next line there will be an integer denoting number of queries. Each query will consist of two integers and

.

Constraints

Each number will fit in signed integer.
Total number of integers in lines will not cross

.

Output Format
In each line, output the number located in
position of

line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output

74
52
37
ERROR!
ERROR!

Input (stdin)

    8

    7 43 35 26 34 78 99 70

    3 71 11 16

    8 70 19 42 30 84 20 57 45

    0

    1 20

    0

    0

    0

    10

    5 1

    5 7

    1 7

    5 3

    5 2

    4 7

    5 2

    1 2

    4 1

    2 3

Expected Output

    20

    ERROR!

    70

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    35

    ERROR!

    16


Input (stdin)

    20000

    0

    1189 1 68 46 64 11 100 70 22 24 20 54 78 42 26 44 21 79 8 94 13 45 59 35 81 66 80 49 74 62 62 16 14 29 13 77 39 12 99 13 36 70 66 65 64 43 9 36 21 16 30 85 12 40 72 44 5 51 92 31 64 5 46 29 34 58 6 24 22 56 88 9 77 53 73 40 95 33 76 67 100 57 4 11 96 75 54 1 77 98 83 40 2 28 68 87 37 25 63 58 32 50 66 9 55 91 48 1 23 75 20 23 31 23 85 79 49 91 79 25 88 61 64 41 40 83 80 76 8 94 86 39 95 51 47 49 41 47 2 16 73 21 38 56 95 74 34 43 64 64 19 51 76 82 44 15 64 23 42 23 68 79 14 62 82 12 11 74 58 64 89 83 84 78 38 30 52 23 24 15 86 42 18 13 75 61 79 90 35 20 13 54 51 26 15 32 37 77 5 47 40 94 81 75 71 18 4 74 92 79 89 77 20 58 89 94 70 67 84 56 38 48 9 88 25 23 71 13 100 76 59 91 69 39 66 91 8 21 17 99 52 57 27 71 14 67 17 35 85 52 90 75 99 98 62 23 72 85 35 23 60 46 14 80 36 31 22 44 3 38 94 54 94 21 77 59 87 93 93 24 96 34 98 94 31 11 68 55 95 54 29 54 99 94 33 87 24 7 30 79 44 75 84 90 95 60 100 34 4 93 57 99 26 54 44 9 64 11 15 59 17 43 64 67 37 49 53 12 55 34 42 50 9 26 39 55 85 39 40 41 83 48 39 60 1{-truncated-}

Expected Output

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    10

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    68{-truncated-}


Input (stdin)

    20000

    0

    0

    0

    0

    0

    0

    0

    0

    0

    0

    0

    0

    0

    0

    0

    0

    0

    0

    0{-truncated-}

Expected Output

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!

    ERROR!{-truncated-}

