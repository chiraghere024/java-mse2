class TestPriority extends Thread
{ 
    
    public void run(){  
        
    System.out.println("thread name & priority is: " + getName() + " & " + getPriority());                      
      
    }      
} 

class ThreadPriority
{
  public static void main(String args[])
  {  
     TestPriority m1=new TestPriority();  
     TestPriority m2=new TestPriority();
     
     m1.setPriority(Thread.MIN_PRIORITY);
     m1.setName("child thread 1");
     
     m2.setPriority(Thread.MAX_PRIORITY);  
     m2.setName("child thread 2");
     
     m1.start();  
     m2.start(); 
     
     System.out.println("Main thread name is:" + Thread.currentThread().getName()); 
     System.out.println("Main thread priority is:" + Thread.currentThread().getPriority());         
}
}