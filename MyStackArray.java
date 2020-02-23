package stark;


import java.util.Scanner;

public class MyStackArray {
    public int[] data;
    public int top;
    public int size;
    MyStackArray(int s)
    {
        data  = new int[s];
        top=-1;
        size=0;
    }

    public void push(int element)
    {
        if(!isFull())
        {
            top++;
            size++;
            data[top] = element;
        }
        else
        {
            System.out.println("Stack Overflow.");
        }
    }

    public void pop()
    {
        int delElement = 0;
        if(!isEmpty())
        {
            delElement = data[top];
            System.out.println(delElement+" Data poped from stack.");
            top--;
            size--;
        }
        else
        {
            System.out.println("Stack Underflow.");
        }
    }

    public boolean isFull()
    {
        if(size==data.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isEmpty()
    {
        if(size==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void display()
    {
        for(int i=0; i<=top; i++)
        {
            System.out.println(data[i]);
        }
    }
}

class MyStackArrayMain
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Stack: ");
        int size = sc.nextInt();
        MyStackArray obj = new MyStackArray(size);
        while(true)
        {
            System.out.println("Enter 1 to push data into stack: ");
            System.out.println("Enter 2 to pop data from stack: ");
            System.out.println("Enter 3 to display the stack: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the data to push: ");
                    int d = sc.nextInt();
                    obj.push(d);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.display();
                default:
                    System.out.println("Enter correct option.");
            }
        }
    }
}
