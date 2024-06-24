---------------------------------[ 1-D Array ]--------------------------------------------

# 1

<!-- Array Declaration -->

int []a;

-:NOTE:-
int []a, b; Both are 1-D array;
int a[], b; A is 1-D array and B is Only Int type variable.

# 2

<!-- Array creation  -->

a = new int[3];
NOTE:- When we create an array so the default values is 0.

# 3

<!-- Array creation and Declaratoion in one line   -->

int []a = new int[3];
NOTE:- When we create an array so the default values is 0.

# 4

<!-- Array Size is [0] -->

int []a = new int[0];  
Compile - True
Run - True

# 5

<!-- Array size is [-3] or Negative -->

int []a = new int[-3]
Compile - True
Run - Error -> Negative Array size Exception.

# 6

<!-- Initilization of an array -->

int []a = new int[3];
a[0]=10; [10,0,0]
a[1]=20; [0,20,0]
a[2]=30; [0,0,30]

a[3]=40; -> Error Array Index Out Of Bound Exception.

# 7

Decelaration Creation and Initilization All are in One line.
int []a = {10,20,30};
-----------------------OR-----------------------
int []a = new int[]{1,20,30};

# 8

<!-- Retrive an Array -->
<!-- Print the Array value -->

class Array
{
main(){
int []a ={10,20,30};
for(int i=0; i<a.length; i++)
{
System.out.println(a[i]);
}
}
}
Output is :- [10,20,30]

# 9

<!-- For Each Loop -->

class Array
{
main()
{
int []a= {10,20,30};
for(int x:a)
{
System.out.println(x);
}
}
}

---------------------------------[ 2-D Array ]--------------------------------------------

# 1

<!-- Declare 2-D array -->

int[][] a, b; -> A and B both are 2-D arary.
int[] a[], b; -> A is 2-D array and B is 1-D array.
int[] a[], b[]; -> A and B both are 2-D array.
int[][]a,b[];   -> A is 2-D array but B is 3-D Array.
int[][]a,[]b;   -> Compile Time error. We cannot create 2nd array before variable.


# 2 
<!-- Creation of array -->
int[][] a;
a = new int[2][3];  [ 0.0 | 0.1 | 0.2 ]
                    [ 1.0 | 1.1 | 1.2 ]
# 3
<!-- matrix array -->
int[][] a;
a = new int[2][2];  [ 0.0 | 0.1 ]
                    [ 1.0 | 1.1 ]
# 4                  
<!-- Jagged Array -->
int[][] a;
a = new int[2][]; 
a[0] = new int[3];
a[1] = new int[2];

# 4
<!-- Initilazation of an array -->
int[][] a;
a = new int[2][3];

a[0][0]=10;
a[0][1]=20;
a[0][2]=30;

# 4
<!-- Decelaration and creation in one line -->
int[][] a = new[2][3];

# 5
<!-- Decelaration creation and Initilazation -->
int[][] a = {{10,20,30},{40,50,60}};

# 6
<!-- Jagged array -->
int[][] a;
a = new int[2][];
a[0]=new int[4];
a[1]=new int[3];    [ |0|:|1| ]
                    [ 00 | 01 | 02 |03 ]
Initilization       [10 | 11 | 12]
a[0][1] = 20;
a[1][2] = 40;

# 7 
Printin value
int[][] a={{10,20,30,60},{40,50},{70,80,90}};
sop(a); -> [[@Hashcode
sop(a[0]); [[@ClassName
sop(a[0][0]); O/P -> 10
sop(a.lenght); O/P -> 3
sop(a[0].length); O/P -> 4;

for(int i=0; i< a.length ;i++)
{
    for(int j = 0; j< a[i].lenght; j++)
    {
        sop(s[i][j]+" ");
    }
    sop();
}

