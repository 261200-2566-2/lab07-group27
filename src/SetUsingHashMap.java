import java.util.HashMap;

public class SetUsingHashMap<E> implements Set<E> {
    private final Object dummy = new Object();
    private final HashMap<E,Object> hashMap;
    public SetUsingHashMap(){
        hashMap = new HashMap<>();
    }
    @Override
    public int size() {
        return hashMap.size();
    }

    @Override
    public boolean isEmpty() {
        return hashMap.isEmpty();
    }

    @Override
    public boolean contains(Object e) {
        return hashMap.containsKey(e);
    }

    @Override
    public boolean add(E e) {
        if (!hashMap.containsKey(e)) {
            hashMap.put(e,dummy);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean remove(Object e) {
        if (!hashMap.containsKey(e)) {
            return false;
        }else {
            hashMap.remove(e);
            return true;
        }
    }

    @Override
    public boolean containsAll(java.util.Collection<?> c) {
        return hashMap.keySet().containsAll(c);
    }

    @Override
    public boolean addAll(java.util.Collection<? extends E> c) {
        boolean changed = false;
        for(E e : c){
            changed |= add(e);
        }
        return changed;
    }

    @Override
    public boolean removeAll(java.util.Collection<?> c) {
        boolean changed = false;
        changed = remove(c);
        return changed;
    }

    @Override
    public boolean retainAll(java.util.Collection<?> c) {
        return hashMap.keySet().retainAll(c);
    }


    @Override
    public void clear() {
        hashMap.clear();
    }

}
