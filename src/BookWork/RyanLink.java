package BookWork;

import java.util.ArrayList;

public class RyanLink<K extends RyanData> {

    public RyanNode<K> rootNode;

    public RyanLink() {
        rootNode = new RyanNode<>(null);
    }

    public void add(K data) {

        RyanNode<K> newNode = new RyanNode<K>(data);
        RyanNode currentNode = rootNode;
        while (currentNode.hasNext()) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
        newNode.setPrevious(currentNode);

    }


    public boolean remove(K data) {
        RyanNode currentNode = rootNode;
        while (currentNode.hasNext()) {
            currentNode = currentNode.getNext();
            if (currentNode.getData().equals(data)) {
                //找到需要删除的节点
                currentNode.getPrevious().setNext(currentNode.getNext());
                currentNode.getNext().setPrevious(currentNode.getPrevious());
                currentNode = null;
                System.out.println("删除成功");
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        RyanNode currentNode = rootNode;

        sb.append("[").append(currentNode.getData()).append("]");
        while (currentNode.hasNext()) {
            sb.append("[" + currentNode.getNext() + "]");
            currentNode = currentNode.getNext();
        }
        return sb.toString();
    }

    public boolean updata(K k, K newData) {
        RyanNode<K> currentNode = rootNode;
        while (currentNode.hasNext()) {
            currentNode = currentNode.getNext();
            if (currentNode.getData().equals(k)) {
                //找到需要删除的节点
                currentNode.setData(newData);
                return true;
            }

        }
        return false;
    }

    public K getDataFromKey(String key) {
        RyanNode<K> currentNode = rootNode;
        while (currentNode.hasNext()) {
            currentNode = currentNode.getNext();
            if (currentNode.getData().getName().equals(key)) {
                //找到节点
                return currentNode.getData();
            }
        }
        return null;
    }

    public ArrayList<K> getNodesFromKeyLike(String key) {
        ArrayList datas = new ArrayList<K>();
        RyanNode<K> currentNode = rootNode;
        while (currentNode.hasNext()) {
            currentNode = currentNode.getNext();
            if (currentNode.getData().isLike(key)) {
                //找到需要删除的节点
                datas.add(currentNode.getData());
            }
        }
        return datas;
    }

}
