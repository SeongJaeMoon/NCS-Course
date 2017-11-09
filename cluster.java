*자바의 메모리 구조*

컴퓨터 프로그램이 실행되기 위해 필요한 메모리를 우리는 '메인 메모리'.
물리적으로 RAM. 이 메인메모리를 관리하는게 OS이고, JVM은 OS로부터 필요한만큼 할당 받는 것.

JVM은 OS로부터 받은 메모리를 용도에 맞게 나누어 관리한다.
Runtime Data Area
1. Class Area(Method Area). -> 클래스 파일의 바이트 코드가 로드 되는 곳.(메인메소드 주 진입점.) 
<어떤 메소드가 호출되려면, 먼저 그 메소드를 갖고 있는 클래스 파일이 메모리에 로딩되어야 한다. *.class 파일을 찾아서 메모레에 로딩.

//클래스 로딩 절차
/*
*어떤 메소드를 호출하는 문장을 만났는데, 그 메소드를 가진 클래스 바이트코드가 아직 로딩된 적이 없다면, 
*곧바로 JVM은 JRE라이브러리 폴더에서 클래스를 찾음.
*클래스가 없다면, CLASSPATH 환경변수에 지정된 폴더에서 클래스를 찾음.
*찾았다면 그 클래스 파일이 올바른지 바이트코드를 검증한다.
*올바른 바이트코드라면 메소드영역으로 파일을 로딩한다.
*클래스 변수를 만들라는 명령어가 있으면 메소드 영역에 그 변수를 준비한다.
*클래스 블록이 있으면 순서대로 그 블록을 실행.
*한번 클래스의 바이트코드가 로딩되면 JVM이 종료될 때까지 유지.
*/
2. Stack Area.
/*
*메소드가 호출될 때마다 그 메소드의 로컬 변수를 준비하고, 
*메소드 호출이 끝나면 그 메소드를 위해 준비했던 모든 변수가 스택에서 제거
*/
//<--STACK TEST-->
public class Stack{
	public static void memory1(int a){
		memory2(++a);
		System.out.println(a);
	}
	public static void memory2(int a){
		memory3(++a);
		System.out.println();
	}
	public static void memory3(int a){
		++a;
		System.out.println(a);
	}
	public static void main(String []args){
		int a = 0;
		memory1(a);
		System.out.println(a);
	}
}
//
3. Heap Area.
/*
* new 명령을 통해 생선된 인스턴스 변수가 놓인다.
* 인스턴스의 소멸방법과 소멸시점이 지역변수와 다르기 때문에 발생.
*/
//<--HEAP TEST-->
public class Heap{
	public static void memory1(int a){
		int[] arr = memory2(a+1);
		arr[2] = a;
		return arr;
	}
	public static void memory2(int a){
		int[] arr = memory3(a+1);
		arr[1] = a;
		return arr;
	}
	public static void memory3(int a){
		int[] arr = new int[3];
		arr[0] = a;
		return arr;
	}
	public static void main(String []args){
		int[] arr = memory1(100);
		for(int i = 0; i < arr.length; i++){
			System.out.println(i+"="+arr[i]);
	}
}
//8가지 원시타입 byte, short, int ,long, float, double, char, boolen을 제외한 그 외의 타입은 모드 참조타입.
//참조변수들은 실행될 때마다 많은 데이터들을 스택메모리 영역에 넣었다 뺐다 하는게 비효율적이므로, 힙 영역에 갑 저장 -> 스택메모리에 주소 값만 저장.
// STACK(주소) <- HEAP(값) CALL BY VALUE
4. Native Method Stack Area.
5. PC Register.

*Queue (배열, 연결리스트)*
/*
*가장 오래전에 입력된 데이터를 front라고 하며 가장 최근에 입력된 데이터를 rear라고 한다.
*데이터의 삽입은 rear에서 이루어지고 삭제는 front에서 이루어진다.
*insert(삽입), remove(삭제), peek(읽기)
*/
//GENERAL QUEUE
public class Queue{
 private int front;
    private int rear;
    private int maxSize;
    private Object[] queueArray;
    
    // 큐 배열 생성
    public Queue(int maxSize){
        
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.queueArray = new Object[maxSize];
    }
    
    // 큐가 비어있는지 확인
    public boolean empty(){
        return (front == rear+1);
    }
    
    // 큐가 꽉 찼는지 확인
    public boolean full(){
        return (rear == maxSize-1);
    }
    
    // 큐 rear에 데이터 등록
    public void insert(Object item){
        
        if(full()) throw new ArrayIndexOutOfBoundsException();
        
        queueArray[++rear] = item;
    }
    
    // 큐에서 front 데이터 조회
    public Object peek(){
        
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        
        return queueArray[front];
    }
    
    // 큐에서 front 데이터 제거
    public Object remove(){
        
        Object item = peek();
        front++;
        return item;
    }
}

//LIST QUEUE
public class ListQueue {
    
    private class Node{
        
        // 노드는 data와 다음 노드를 가진다.
        private Object data;
        private Node nextNode;
    
        Node(Object data){
            this.data = data;
            this.nextNode = null;
        }
    }
    
    // 큐는 front노드와 rear노드를 가진다.
    private Node front;
    private Node rear;
    
    public ListQueue(){
        this.front = null;
        this.rear = null;
    }
    
    // 큐가 비어있는지 확인
    public boolean empty(){
        return (front==null);
    }
    
    // item을 큐의 rear에 넣는다.
    public void insert(Object item){   
	
        Node node = new Node(item);
        node.nextNode = null;
        
        if(empty()){          
            rear = node;
            front = node;
        }else{
            rear.nextNode = node;
            rear = node;
        }
    }
    
    // front 의 데이터를 반환한다.
    public Object peek(){
		
        if(empty()) throw new ArrayIndexOutOfBoundsException();
		
        return front.data;
    }
    
    // front 를 큐에서 제거한다.
    public Object remove(){
        
        Object item = peek();
        front = front.nextNode;
        
        if(front == null){
            rear = null;
        }
        return item;
    }
}

//CIRCULAR QUEUE
public class CircularQueue {
    
    // 큐 배열은 front와 rear 그리고 maxSize를 가진다.
        private int front;
        private int rear;
        private int maxSize;
        private Object[] queueArray;
        
        // 큐 배열 생성
        public CircularQueue(int maxSize){
            
            this.front = 0;
            this.rear = -1;
            
            // 실제 크기보다 하나 크게 지정한다 (공백과 포화를 막기 위함)
            this.maxSize = maxSize+1;    
            this.queueArray = new Object[this.maxSize];
        }
        
        // 큐가 비어있는지 확인
        public boolean empty(){
            return (front == rear+1) || (front+maxSize-1 == rear);
        }
        
        // 큐가 꽉 찼는지 확인
        public boolean full(){
            return (rear == maxSize-1) || (front+maxSize-2 == rear);
        }
        
        // 큐 rear에 데이터 등록
        public void insert(Object item){
            
            if(full()) throw new ArrayIndexOutOfBoundsException();
            
            // rear 가 배열의 마지막이면 rear 포인터를 앞으로 돌린다.
            if(rear == maxSize-1){
                rear = -1;
            }
            queueArray[++rear] = item;
        }
        
        // 큐에서 front 데이터 조회
        public Object peek(){
            
            if(empty()) throw new ArrayIndexOutOfBoundsException();
            
            return queueArray[front];
        }
        
        // 큐에서 front 데이터 제거
        public Object remove(){
            
            Object item = peek();
            front++;
            
            // front의 다음 index가 배열크기+1 이면 처음으로 돌아간다
            if(front==maxSize){
                front = 0;
            }
            return item;
        }
}

//PRIORITY QUEUE
public class PriorityQueue {

        private int maxSize;
        private long[] queueArray;
        private int count;
            
        // 큐 배열 생성
        public PriorityQueue(int maxSize){
                
            this.maxSize = maxSize;
            this.queueArray = new long[maxSize];
            this.count=0;
                
        }
            
            // 큐가 비어있는지 확인
            public boolean empty(){
                return (count==0);
            }
            
            // 큐가 꽉 찼는지 확인
            public boolean full(){
                return (count==maxSize);
            }
            
            // 큐에 데이터 등록
            // 큐가 큰 데이터 순서대로 배열의 앞에서부터 정렬되있기에
            // 배열의 뒤에서부터 탐색하며 item 보다 큰 값이 있는 index 뒤에 삽입한다.
            public void insert(long item){
                
                if(full()) throw new ArrayIndexOutOfBoundsException();
                
                if(empty()){
                    
                    queueArray[count++] = item;
                
                }else{
                    
                    // 데이터의 뒤에서부터 앞으로 탐색한다.
                    int i=0;
                    for(i=count-1; i>=0; i--){
                        
                        // 현재 index의 데이터가 입력받은 데이터(item)보다 작으면 배열의 뒤로 밀어낸다.
                        if(item > queueArray[i]){
                            
                            queueArray[i+1] = queueArray[i];
                            
                        }else{
                            // item이 현재 index의 값보다 작으면 탐색을 멈춘다.
                            // item 삽입 위치 확인
                            break;
                        }
                    }
                    
                    // item 등록
                    queueArray[i+1] = item;
                    count++;
                }
            }
            
            // 큐의 마지막 데이터 조회 (가장작은 데이터)
            public Object peek(){
                
                if(empty()) throw new ArrayIndexOutOfBoundsException();
                
                return queueArray[count-1];
            }
            
            // 큐에서 마지막 데이터 제거 (가장작은 데이터)
            public Object remove(){
                
                Object item = peek();
                count--;
                return item;
            }
}
//HASH TABLE

public class Hash {
    
    // 데이터를 저장할 Entry는 값과 다음 Entry를 가진다.
    private class Entry{
        private int value;
        public Entry next;
    }
    
    private int size;
    private Entry[] hTable;
    
    // Hash Table은 size와 배열 테이블을 생성한다.
    public Hash(int size){
        
        this.size = size;
        this.hTable = new Entry[size];
    }
    
    // key 값으로 HashTable에 저장될 index를 반환한다.
    public int hashMethod(int key){
        return key % size;
    }
    
    // 저장할 데이터로 key를 추출한다.
    // 실제 Hash 에는 특별한 알고리즘이 적용되 hashCode를 얻는다.
    public int getKey(int data){
        return data;
    }
    
    // data를 HashTable에 저장한다.
    public int add(int data){
        
        // data의 hashCode를 key와 저장할 index를 얻는다.
        int key = getKey(data);
        int hashValue = hashMethod(key);
        
        // 저장할 Entry 생성
        Entry entry = new Entry();
        entry.value = data;
        
        
        // HashTable의 저장할 index가 비어있다면,  저장하고 끝낸다.
        if(hTable[hashValue] == null){
            
            hTable[hashValue] = entry;
            return 0;
        }
        
        
        Entry pre = null;
        Entry cur = hTable[hashValue];
        
        // 해당 index의 연결리스트는 값의 크기가 작은 값부터 큰 순서로 정렬되어있다.
        while(true){
            
            if(cur == null){     // Hash Table에 저장할 index가 비어있으면 
                
                hTable[hashValue] =entry;  // 해당 index에 저장
                return 0;
            
            }else if(cur.value < key){    // 해당 index의 커서 노드의 값이 key보다 작으면
                
                // 커서를 하나 뒤로 옮긴다.
                pre = cur;            
                cur = cur.next;
            
            }else{     // 해당 index의 커서 노드의 값이 key 보다 크다.(여기에 저장)
                
                // 커서 노드가 HashTable의 첫번째 노드이면
                if(cur == hTable[hashValue]){
                    
                    // 삽입 노드를 첫번째 노드로 삽입하고 다음 노드를 커서노드로 지정한다.
                    entry.next = cur;
                    hTable[hashValue]= entry;
                    return 0;
                    
                }else{    // 첫번째 노드가 아니면
        
                    // 삽입 노드의 다음 노드로 커서노드를 지정하고
                    // 전 노드의 다음 노드를 삽입노드로 지정한다.
                    entry.next = cur;
                    pre.next = entry;
                    return 0;
                }
            }
        }
    }
    
    
    // data가 있는 위치를 얻는다.
    public int get(int data){
        
        int key = getKey(data);
        int hashValue = hashMethod(key);
        
        // data가 있는 index의 첫번째 노드를 얻는다.
        Entry cur = hTable[hashValue];
        
        while(true){
            
            if(cur == null){    // index 가 비어있다면 -1 반환
            
                return -1;
            
            }else if(cur.value == key){    // 커서의 값과 키가 같으면 0 반환
                
                return hashValue;
            
            }else if(cur.value > key){    // 커서의 값이 키보다 크면 -1 반환
                                                    // 리스트는 작은 값에서 큰 값으로 정렬되어있다.
                return -1;
            
            }else{        // 커서의 값이 키보다 작으면 다음 노드로 커서 이동
                
                cur = cur.next;
            }
        
        }
    }
    
    // data가 있는 노드를 반환한다.
    private Entry getEntry(int data){
        
        int key = getKey(data);
        int hashValue = hashMethod(key);
        
        // HashTable의 index의  첫번째 노드와 두번째 노드
        Entry pre = hTable[hashValue];
        Entry cur = pre.next;
        
        while(true){
            
            if(cur == null){    // 커서 노드가 null 이면 null 반환
                
                return null;
            
            }else if(cur.value == key){    // 커서 노드의 값이 키와 같으면 전 노드를 반환
                
                return pre;
                
            }else if(cur.value > key){    // 커서의 값이 키보다 크면 null 반환
                
                return null;
            
            }else{            // 커서의 값이 키보다 작으면 커서를 다음으로 이동
                
                pre = cur;
                cur = cur.next;
            }
        }
    }
    
    // data 를 제거
    public int remove(int data){
        
        Entry pre = null;
        
        // data가 있는 노드의 전노드를 가져오고 null이면 -1 반환
        if((pre=getEntry(data))== null){
            return -1;
        }
        
        // 전 노드가 data의 다음노드를 가리키게 한다.
        // data 노드를 건너뛰게 연결한다 (제거)
        Entry cur = pre.next;
        pre.next = cur.next;
        return 0;
    }
    
    public String toString(){
        
        StringBuffer result = new StringBuffer();
        Entry cur = null;
        
        for(int i=0; i<size; i++){
            
            result.append("[" + i + "]\t");
            cur = hTable[i];
            
            if(cur == null){
                result.append("n ");
            }else{
                
                while(cur!=null){
                    result.append(cur.value + "");
                    cur = cur.next;
                }
            }
            result.append("\n");
        }
        return result.toString();
    }
}

class  diamond
{
   public static void main(String[] args) 
   {
       int i;    //변수 i 지정
       for(i = 12; i < 20; i+=2){
               pprn(20 - i);    //공백을 출력하는 함수 호출
               pprns(i*2);    //*을 출력하는 함수 호출
       System.out.println();     //한줄을 완성하면 줄 내림
       }
       /* 다이아몬드의 머리를 출력하는 For문 종료*/
       for(i = 20; i >= 0; i-=2){
               pprn(20 - i);    //공백 출력 함수 호출
               pprns(i*2);    //*을 출력하는 함수 호출
       System.out.println();     //한줄이 완성되면 줄내림
       }
       /* 다이아몬드의 아랫도리 출력*/
   }
   /*a로 받아들인 int만큼 공백을 출력하는 메소드*/
   static void pprn(int a){
       int j;
       for(j = 0; j < a; j++)
           System.out.print(" ");
   }
   /*a로 받아들인 int만큼 *을 출력하는 메소드*/
   static void pprns(int a){
       int j;
       for(j = 0; j <= a; j++)
           System.out.print("*");
   }
}

class  heart
{
   public static void main(String[] args) 
   {
       int i;   //변수 i 지정
       for(i = 4; i < 10; i+=2){
               pprn(10 - i);    //공백을 출력하는 함수 호출
               pprns(i*2);    //*을 출력하는 함수 호출
               pprn((10 - i)*2); //하트의 갈라지는 부분 공백
               pprns(i*2);    //갈라진 이후에 연결되는 *출력
       System.out.println();     //한줄을 완성하면 줄 내림
       }
       /* 하트의 머리를 출력하는 For문 종료*/
       for(i = 20; i >= 0; i-=2){
               pprn(20 - i);    //공백 출력 함수 호출
               pprns(i*2);    //*을 출력하는 함수 호출
       System.out.println();     //한줄이 완성되면 줄내림
       }
       /* 하트의 아랫도리 출력*/
   }
   /*a로 받아들인 int만큼 공백을 출력하는 메소드*/
   static void pprn(int a){
       int j;
       for(j = 0; j < a; j++)
           System.out.print(" ");
   }
   /*a로 받아들인 int만큼 *을 출력하는 메소드*/
   static void pprns(int a){
       int j;
       for(j = 0; j <= a; j++)
           System.out.print("*");
   }
}
