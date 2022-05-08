public abstract class Entry {
    public abstract String getName(); // �̸��� ��´�.
    public abstract int getSize(); // ����� ��´�.
    protected abstract void printList(String prefix); // prefix�� �տ� �ٿ��� �϶��� ǥ���Ѵ�.

    public Entry add(Entry entry) throws FileTreatmentException{ // ��Ʈ���� �߰��Ѵ�.
        throw new FileTreatmentException();
    }

    public void printList() { // �϶��� ǥ���Ѵ�.
        printList("");
    }

    public String toString() { // ���ڿ� ǥ��
        return getName() + " (" + getSize() + ")";
    }
}