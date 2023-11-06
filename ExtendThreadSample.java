
class MyThread1 extends Thread
{
    // instance variables
    public MyThread1()
    {        
    }
    public void run()
    {
        // piece of code that runs parallel with other threads
         System.out.println(" child thread line at 11");
    }
}

class ExtendThreadSample
{
    public static void main(String args[])
    {
        MyThread1 trobj1 = new MyThread1();
        trobj1.start();
        
        MyThread1 trobj2 = new MyThread1();
        trobj2.start();
        //below are the code of main thread
        
        System.out.println(" main thread line at 25");
        System.out.println(" main thread line at 26");
    }

}