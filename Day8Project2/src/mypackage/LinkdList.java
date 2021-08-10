package mypackage;

public class LinkdList {
	
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
			
		}
	}
	
	public static LinkdList insert(LinkdList list,int data)
	{
		Node newnode = new Node(data);
		
		if(list.head==null)
		{
			list.head=newnode;
		}
		else
		{
			//travel till u get next as null
			Node last=list.head;
			
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newnode;
		}
		return list;
	}

	public static void printList(LinkdList list)
	{
		Node currNode=list.head;
		System.out.println("Linked List:");
		
		while(currNode!=null)
		{
			System.out.println(currNode.data);
			currNode = currNode.next;
		}
	}
	
	public static void main(String[] args) 
	{
		LinkdList mydata=new LinkdList();
		mydata=insert(mydata,45);
		mydata=insert(mydata,75);
		mydata=insert(mydata,95);
		mydata=insert(mydata,85);
		
		printList(mydata);

	}

}
