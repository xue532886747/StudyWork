package BookWork;

public class RyanData<T> {
    private String name;
    private T data;

    public boolean isLike(String _name) {
        return name.contains(_name);
    }

    public RyanData setData(T data) {
        this.data = data;
        return this;
    }

    public T getData() {
        return data;
    }

    public String getName() {
        return name;
    }

    public RyanData setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RyanData) {
            return ((RyanData) obj).getName().equals(name);
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
}
