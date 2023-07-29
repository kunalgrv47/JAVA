package linkedListImplementation;

public class MyLinkedList<T extends Comparable<T>> {

	private int size = 0;   //maintaining variable for size
	Node<T> head;  			//pointer to first node
	Node<T> tail;  			//pointer to last node


	//Empty Constructor
	public MyLinkedList() {	
	}


	//Find size of the list.  Time Complexity: O(1)
	public int size() {
		return size;
	}

	// Override the toString() method to print the linked list.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node<T> current = head;
		while (current != null) {
			sb.append(current.data);
			if (current.next != null) {
				sb.append(" ");
			}
			current = current.next;
		}
		sb.append("]");
		return sb.toString();
	}


	//Add element at the first of the list. Time Complexity: O(1)
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);
		size++;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

	}


	//Add element at the last of the list. Time Complexity: O(1)
	public void addLast(T data) {
		Node<T> newNode = new Node<>(data);
		size++;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}


	//Add element to list (Just calling addLast function as its same as add function). Time Complexity: O(1)
	public void add(T data) {
		addLast(data);
	}


	//Add element at specified Index
	public void add(int index, T data) {
		if(index > size || index < 0) {
			System.out.println("You are trying to insert new node ouside the list which is not possible, So no changes made to the list.");
			return;
		}
		head = addHelper(head, index, data);  //calling helper function
		size++;
	}
	//Helper function for add(int index, T data)
	private Node<T> addHelper(Node<T> head, int index, T data) {
		if(index == 0) {
			Node<T> newNode = new Node<>(data);
			newNode.next = head;
			return newNode;
		}
		head.next = addHelper(head.next, index-1, data);
		return head;

	}


	//Implementing set function (It replaces the element of specified index with specified data)
	//Time Complexity: O(n)
	public void set(int index, T data) {
		if(size == 0 || index >= size || index <0) {
			System.out.println("You are trying to modify index which is either not available or outside the list, So no changes made to the list.");
			return;
		}
		head = setHelper(head, index, data);
	}
	//Helper function for set(int index, T data)
	private Node<T> setHelper(Node<T> head, int index, T data) {
		if(index == 0) {
			head.data = data;
			return head;
		}
		head.next =  setHelper(head.next, index-1,  data);
		return head;
	}


	//Remove first element from list. Time Complexity: O(1)
	public void removeFirst() {
		if(head == null) {
			System.out.println("Ther is nothing to remove");
			return;
		}
		if(head.next == null) {
			head = tail = null;
			size--;
			return;
		}
		head = head.next;
		size--;
	}


	//Remove last element from list. Time Complexity: O(n)
	public void removeLast() {
		if(head == null) {
			System.out.println("There is nothing to remove");
			return;
		}
		if(head.next == null) {
			head = tail = null;
			size--;
			return;
		}
		removeLastHelper(head);
		size--;
	}
	//Helper function for removeLast
	private Node<T> removeLastHelper(Node<T> head) {
		if(head.next.next == null) {
			head.next = null;
			tail = head;
			return head;
		}
		head.next = removeLastHelper(head.next);
		return head;
	}


	//Search element in list and return index. Time Complexity: O(n)
	public int searchElement(T data) {
		Node<T> temp = head;
		int i=0;
		while(temp != null) {
			if(temp.data == data) {
				return i;
			}
			i++;
			temp = temp.next;
		}
		return -1;
	}

	//Search element using Recursion and return index
	public int searchUsingRecursion(T data) {
		return searchHelper(head, data);
	}
	//Helper function for search using recursion
	private int searchHelper(Node<T> head, T data) {
		if(head == null) {
			return -1;
		}
		if(head.data == data) {
			return 0;
		}
		int index = searchHelper(head.next, data);
		if(index == -1) {
			return -1;
		}
		return index+1;
	}


	//Reverse List using recursion
	public void reverseListRecursion() {
		tail = head;
		head = reverseRecursionHelper(head);
	}
	//Helper function for reverseList
	private Node<T> reverseRecursionHelper(Node<T> head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node<T> revHead = reverseRecursionHelper(head.next);
		Node<T> revTail = head.next;
		head.next = null;
		revTail.next = head;
		return revHead;
	}


	//Delete Nth node from end using Iterative Method
	public void deleteNthFromEnd(int n) {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		int index = size-n;
		if(index >= size || index <0) {
			System.out.println("You are trying to remove outside of the list");
			return;
		}

		if(index == 0) {
			removeFirst();
			return;
		}
		if(index == size-1) {
			removeLast();
			return;
		}
		int i=1;
		Node<T> current = head;
		while(i<index) {
			current = current.next;
			i++;
		}
		current.next = current.next.next;
		size--;
	}


	//Finding Mid Index of List
	public Node<T> findMid(Node<T> head) {
		Node<T> slow = head;
		Node<T> fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}


	//Check if the List is Palindrome
	public boolean checkPalindrome() {
		Node<T> mid = findMid(head);
		Node<T> revHead = reverseRecursionHelper(mid);
		while(revHead != null) {
			if(head.data != revHead.data) {
				return false;
			}
			revHead = revHead.next;
			head = head.next;
		}
		return true;

	}


	//Check if the list contains cycle (Tail is pointing to some node in the list other than null)
	public boolean isCyclePresent() {
		return isCyclePresentHelper(head);
	}
	//Helper function for isCyclePresent
	private boolean isCyclePresentHelper(Node<T> head) {
		Node<T> slow = head;
		Node<T> fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}

	
	//Remove Cycle from list if it is cyclic
	public void removeCycle() {

		//Find if the list contains cycle
		Node<T> slow = head;
		Node<T> fast = head;
		boolean isCyclic = false;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				isCyclic = true;
				break;
			}
		}
		
		//If list doesn't contain cycle then return
		if(!isCyclic) {
			System.out.println("List doesn't contains cycle");
			return;
		}
		
		//IF slow and fast meeting at head only. means last node is pointing to head. In this case if we know tail then just make tail.next = null otherwise follow below steps
		if(slow == head) {
			while(slow.next != head) {
				slow = slow.next;
			}
			slow.next = null;
			return;
		}

		//If list contains cycle then Find meeting point
		Node<T> prev = null;  //slow and fast will be same at meeting point and we have to make prev node's next nullso to keep track of prev we created prev node;
		slow = head;
		while(slow != fast) {
			prev = fast;
			slow = slow.next;
			fast = fast.next;
		}

		//Make the last node(i.e prev in this case) point to null
		prev.next = null;
		return;
	}
	
	
	//Merge two Sorted Linked List
	public Node<T> mergeSortedList(Node<T> n1, Node<T> n2){
		
		//If one list is empty then return head of another list
		if(n1 == null) {
			return n2;
		}
		if(n2 == null) {
			return n1;
		}
		
		Node<T> temp = new Node<>(null);
		Node<T> current = temp;
		
		while(n1 != null && n2 != null) {
			if(n1.data.compareTo(n2.data) <= 0) {
				current.next = n1;
				n1 = n1.next;
			}else {
				current.next = n2;
				n2 = n2.next;
			}
			current = current.next;
		}
		
		// Handle remaining elements in either of the lists
	    if (n1 != null) {
	        current.next = n1;
	    } else {
	    	current.next = n2;
	    }

	    return temp.next;
	}
	
	
	
	/* MergeSort. Sort linkedList using mergesort technique
	 * 		-split list into 2 half
	 * 		-sort both half of list (Will be done by recursion)
	 * 		-merge both the sorted list (will be done by calling mergeSortedList function)
	 * 		-TIME COMPLEXITY   = O(N log N) 
	 * 		-MEMORY COMPLEXITY = O(log N)
	 */
	public Node<T> mergeSort(Node<T> head){
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<T> midNode = findMidForMergeSort(head);
		Node<T> firstHalfHead = head;
		Node<T> secondHalfHead = midNode.next;
		midNode.next = null;
		
		Node<T> firstSortedHead = mergeSort(firstHalfHead);
		Node<T> secondSortedHead = mergeSort(secondHalfHead);
		
		return mergeSortedList(firstSortedHead, secondSortedHead);
	}
	//Helper function to find mid for mergeSort problem
	private Node<T> findMidForMergeSort(Node<T> head) {
		Node<T> slow = head;
		Node<T> fast = head.next;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	
	/* EvenAfterOdd. Arrange the list such that all odd number comes first and then the even numbers but the order must remains same.
	 * 		-TIME COMPLEXITY : O(N)
	 * 		-SPACE COMPLEXITY: O(1)
	 */
	public Node<T> evenAfterOdd(Node<T> head){
		
		if(head == null || head.next == null) {
			return head;
		}
		
		//Pointer for maintaining  Head and Tail of even and odd list
		Node<T> evenHead = null;
		Node<T> evenTail = null;
		Node<T> oddHead = null;
		Node<T> oddTail = null;
		
		//Traversing on list and checking data of list if even or odd. Accordingly adding nodes to even and odd list and maintaining tail pointer for even and odd list.
		while(head != null) {
			boolean isEven = isDataEven((int)head.data);
			Node<T> nextHead = head.next;
			head.next = null;
			if(isEven) {
				if(evenHead == null) {
					evenHead = head;
					evenTail = head;
				}else {
					evenTail.next = head;
					evenTail = evenTail.next;
				}
			}else {
				if(oddHead == null) {
					oddHead = head;
					oddTail = head;
				}else {
					oddTail.next = head;
					oddTail = oddTail.next;
				}
			}
			head = nextHead;
		}
		if(oddHead == null) {
			return evenHead;
		}else {
			oddTail.next = evenHead;
			return oddHead;
		}
		
	}
	//Helper function for checking if data is even or odd used in evenAfterOdd function
	private boolean isDataEven(int data) {
		return data%2 == 0;
	}
	
	
	/*	DELETE N NODE AFTER M NODES
	 * 		-TIME COMPLEXITY  : O(N)
	 * 		-SPACE COMPLEXITY : O(1)
	 */
	public Node<T> deleteNAfterN(Node<T> head, int m, int n) {
		
		if (head == null || m < 0 || n <= 0) {
            // Handle edge cases: empty list, invalid m or n values
            return head;
        }
		if(m == 0 && n > 0) {
			return null;
		}
		
		Node<T> current = head;
		Node<T> prev = head;
		int count = 0;
		
		while(current != null) {
			count++;
			if(count > 0 && count <m) {
				current = current.next;
				prev = current;
			}else if(count >= m && count < m+n+1) {
				current = current.next;
			}else {
				prev.next = current;
				prev = current;
				count = 0;
			}
		}
		if(prev.next != null) {
			prev.next = null;
		}
		
		return head;

	}
	
}

















