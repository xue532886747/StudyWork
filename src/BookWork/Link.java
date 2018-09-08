package BookWork;

/*
 * 用来保存数据
 */
public class Link {
    private class Node<T> {
        private T data;
        private Node node;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

        public void setNode(T data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        public void addNode(Node node) {
            if (this.next == null) {
                this.next = node;
            } else {
                this.next.addNode(node);
            }
        }

        public void printNode() {
            System.out.println(this.getData());
            if (this.next != null) {
                this.next.printNode();
            }
        }

        public boolean containsNode(Object data) {
            if (data.equals(this.getData())) {
                return true;
            } else if (data.equals(this.next.getData())) {
                return true;
            }
            return false;
        }

        public Object getNode(int index) {
            if (Link.this.foot++ == index) {
                return this.getData();
            } else {
                return this.next.getNode(index);
            }
        }

        public void setNode(int index, T data) {
            if (Link.this.foot++ == index) {
                this.data = data;
            } else {
                this.next.setNode(index, data);
            }
        }

        public void removeNode(Node previous, T data) {
            if (data.equals(this.data)) {
                previous.next = this.next;
            } else {
                this.next.removeNode(this, data);
            }
        }

        public void toArrayNode() {
            Link.this.retArray[Link.this.foot++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }

        public void changeNode(Object obj, Object newobj) {
            if (this.next != null) {
                //if(obj.equals(this.next.data)) {
                String data = (String) this.next.data;
                if (((String) obj).contains(data)) {
                    this.next.data = newobj;
                }
            } else {
                this.next.changeNode(obj, newobj);
                //}
            }
        }
    }

    private Node root;
    private int count;
    private int foot = 0;
    private Object[] retArray;

    //增加数据
    public void add(Object data) {
        Node node = new Node(data);
        if (this.root == null) {
            this.root = node;
        } else {
            this.root.addNode(node);
        }
        count++;
    }

    // 打印数据
    public void print() {
        if (this.root != null) {
            this.root.printNode();
        }
    }

    //保存个数
    public int size() {
        return this.count++;
    }

    //判断是否为空链表
    public boolean isEmpty() {
        if (this.count == 0) {
            return false;
        }
        return true;
    }

    //判断某一个数据是否存在
    public boolean contains(Object data) {
        if (data == null || this.root == null) {
            return false;
        } else {
            return this.root.containsNode(data);
        }
    }


    //根据索引取得数据
    public Object get(int index) {
        this.foot = 0;
        if (index > this.count) {
            return null;
        } else {
            return this.root.getNode(index);
        }
    }

    //修改内容
    public void set(int index, Object data) {
        this.foot = 0;
        if (index > this.count) {
            return;
        }
        this.root.setNode(index, data);
    }

    //删除
    public void remove(Object data) {
        if (this.contains(data)) {
            if (data.equals(this.root.data)) {
                this.root = this.root.next;
            } else {
                this.root.next.removeNode(this.root, data);
            }
        }
    }

    //转换为数组
    public Object[] toArray() {
        if (this.root == null) {
            return null;
        }
        this.foot = 0;
        this.retArray = new Object[this.count];
        this.root.toArrayNode();
        return this.retArray;
    }

    //根据参数修改数据
    public void change(Object obj, Object newobj) {
        if (this.root == null || obj == null) {
            return;
        }//else if(obj.equals(this.root.data)){
        else {
            String str = (String) obj;
            String newstr = (String) newobj;
            String data = (String) this.root.data;
            if (str.contains(data)) {
                this.root.data = newobj;

            } else {
                this.root.changeNode(obj, newobj);
            }
        }
    }
}