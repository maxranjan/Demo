# 1
Whenever we want to share a common object among the multiple thread then we need to synchronized them.

# 2
If any thread want to call synchronized method on a particular object it must be having a lock of that object.

# 3
Synchronization degreds the performance

# 4
At a time only one thread can enter into the synchronized  method if all the threads having same methods.

# 5
If you want to make your class is synchronized then make all the methods of that class is synchronized.

# 6
String buffer is synchronized.
String Builder is not synchronized.

# 7
In java every class mentain own implicit lock on its which is known as monitor and in case of static synchronized method lock is check on class.

# 8 
In case of static synchronized method lock is always check on class hardly matter it is called by the class name or by the object.

# 9 
In java Evert Object Maintain One Implicit Lock on it that is known as Monitor.

# 10 

# Difference Between Synchronized Method and Synchronized Block
In case of synchronized method we make the whole method synchronized But In case of synchronized block we make particular portion of method synchronized rather than whole methods.

In case of synchronized method lock can be achived only on current object but in case of synchronized block lock can be achived on any object.

Via synchronized block we can make object of any class synchronized.

# 11
Whenever we call suspend() method from the synchronized method or synchronized block then one dead lock is created.

# 12 
Suspend() method release the processor cycle but wait() method release both proccessor cycle and object Lock from the thread.





























